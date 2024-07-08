package api.pokedex.exception.dtos;

import org.springframework.validation.FieldError;

public class ResponseErrorDTO {
    private String campo;
    private String mensagem;

    public ResponseErrorDTO() {}

    public ResponseErrorDTO(FieldError fieldError){
        this.campo = fieldError.getField();
        this.mensagem = fieldError.getDefaultMessage();
    }


    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
