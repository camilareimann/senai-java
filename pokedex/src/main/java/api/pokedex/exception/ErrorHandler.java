package api.pokedex.exception;

import api.pokedex.exception.dtos.ResponseErrorDTO;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorHandler {

    private static final Logger LOGGER = LogManager.getLogger(ErrorHandler.class);

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<Void> trataEntidadeNaoEncontrada(EntityNotFoundException e) {
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(DuplicateKeyException.class)
    public ResponseEntity<ResponseErrorDTO> trataChaveDuplicada(DuplicateKeyException e) {
         ResponseErrorDTO erro = new ResponseErrorDTO();

         erro.setCampo("numero");
         erro.setMensagem(e.getMessage());

        LOGGER.error("Chave duplicada.", e);

         return ResponseEntity.status(HttpStatus.CONFLICT).body(erro);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<ResponseErrorDTO>> trataErroValidacao(
            MethodArgumentNotValidException exception) {
        List<FieldError> fieldErrors = exception.getFieldErrors();

        List<ResponseErrorDTO> responseList = fieldErrors.stream().map(ResponseErrorDTO::new).toList();

        responseList.forEach(
                errorResponse -> LOGGER.warn("campo obrigatório faltando: {} ", errorResponse.getCampo()));

        return ResponseEntity.badRequest().body(responseList);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<ResponseErrorDTO> trataEnumInvalido(HttpMessageNotReadableException exception) {
        ResponseErrorDTO response = new ResponseErrorDTO();
        response.setCampo("tipo");
        response.setMensagem(exception.getLocalizedMessage());

        return ResponseEntity.badRequest().body(response);
    }

}
