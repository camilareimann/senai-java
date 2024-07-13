package senai.sistemaDeSaude.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import senai.sistemaDeSaude.DTOs.LoginRequest;
import senai.sistemaDeSaude.services.UsuarioService;

@RestController
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping("/cadastro")
    public ResponseEntity<String> cadastraUsuario(
            @RequestBody LoginRequest cadastroRequest
    ) {
        usuarioService.cadastraUsuario(cadastroRequest);
        return ResponseEntity.ok("Usuário cadastrado com sucesso");
    }
}
