package sesi.exercicio.sweagger.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sesi.exercicio.sweagger.model.Comentario;
import sesi.exercicio.sweagger.model.Sugestao;
import sesi.exercicio.sweagger.repository.SugestaoRepository;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/sugestoes")
public class SugestaoController {

    private static final Logger logger = LoggerFactory.getLogger(SugestaoController.class);

    @Autowired
    private SugestaoRepository sugestaoRepository;

    @PostMapping
    public ResponseEntity<Sugestao> criarSugestao(@RequestBody Sugestao sugestao) {
        sugestao.setDataEnvio(LocalDateTime.now());
        sugestao.setDataAtualizacao(LocalDateTime.now());
        Sugestao novaSugestao = sugestaoRepository.save(sugestao);
        logger.info("Sugestão criada: {}", novaSugestao);
        return new ResponseEntity<>(novaSugestao, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Sugestao>> consultarSugestoes(@RequestParam(required = false) String titulo) {
        List<Sugestao> sugestoes = (titulo != null) ? sugestaoRepository.findByTituloContaining(titulo) : sugestaoRepository.findAll();
        logger.info("Consultando sugestões: {}", sugestoes.size());
        return new ResponseEntity<>(sugestoes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sugestao> consultarSugestaoPorId(@PathVariable Long id) {
        return sugestaoRepository.findById(id)
                .map(sugestao -> {
                    logger.info("Sugestão encontrada: {}", sugestao);
                    return new ResponseEntity<>(sugestao, HttpStatus.OK);
                })
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/{id}/comentarios")
    public ResponseEntity<Comentario> adicionarComentario(@PathVariable Long id, @RequestBody Comentario comentario) {
        return sugestaoRepository.findById(id)
                .map(sugestao -> {
                    comentario.setSugestao(sugestao);
                    comentario.setDataEnvio(LocalDateTime.now());
                    sugestao.setDataAtualizacao(LocalDateTime.now());
                    sugestaoRepository.save(sugestao);
                    logger.info("Comentário adicionado à sugestão ID {}: {}", id, comentario);
                    return new ResponseEntity<>(comentario, HttpStatus.CREATED);
                })
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}