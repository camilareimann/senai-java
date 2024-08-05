package com.trello.mini_projeto02.controller;

import com.trello.mini_projeto02.dto.MedicoDTO;
import com.trello.mini_projeto02.model.Especialidade;
import com.trello.mini_projeto02.service.MedicoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/medicos")
@RequiredArgsConstructor
public class MedicoController {

    private final MedicoService medicoService;

    @PostMapping
    public ResponseEntity<MedicoDTO> criarMedico(@Valid @RequestBody MedicoDTO medicoDTO) {
        MedicoDTO medicoCriado = medicoService.criarMedico(medicoDTO);
        return ResponseEntity.status(201).body(medicoCriado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MedicoDTO> atualizarMedico(@PathVariable Long id, @Valid @RequestBody MedicoDTO medicoDTO) {
        MedicoDTO medicoAtualizado = medicoService.atualizarMedico(id, medicoDTO);
        return ResponseEntity.ok(medicoAtualizado);
    }

    @GetMapping
    public ResponseEntity<List<MedicoDTO>> listarMedicos(
            @RequestParam(required = false) String nome,
            @RequestParam(required = false) Especialidade especialidade,
            @RequestParam(required = false) LocalDate dataNascimento) {
        List<MedicoDTO> medicos = medicoService.listarMedicos(nome, especialidade, dataNascimento);
        return ResponseEntity.ok(medicos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MedicoDTO> buscarMedico(@PathVariable Long id) {
        MedicoDTO medico = medicoService.buscarMedico(id);
        return ResponseEntity.ok(medico);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarMedico(@PathVariable Long id) {
        medicoService.deletarMedico(id);
        return ResponseEntity.noContent().build();
    }
}