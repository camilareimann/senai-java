package senai.sistemaDeSaude.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import senai.sistemaDeSaude.DTOs.PerfilRequest;
import senai.sistemaDeSaude.services.PerfilService;
@RestController
@RequiredArgsConstructor
public class PerfilController {
    private final PerfilService perfilService;

    @PostMapping("/perfil")
    public ResponseEntity<String> cadastraPerfil(
            @RequestBody PerfilRequest perfilRequest
    ) {
        perfilService.cadastraPerfil(perfilRequest);
        return ResponseEntity.ok("Perfil criado com sucesso");
    }
}
