package com.trello.mini_projeto02.service;

import com.trello.mini_projeto02.dto.MedicoDTO;
import com.trello.mini_projeto02.exception.ResourceNotFoundException;
import com.trello.mini_projeto02.model.Especialidade;
import com.trello.mini_projeto02.model.Medico;
import com.trello.mini_projeto02.repository.MedicoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MedicoService {

    private final MedicoRepository medicoRepository;

    @Transactional
    public MedicoDTO criarMedico(MedicoDTO medicoDTO) {
        Medico medico = new Medico();
        medico.setNome(medicoDTO.getNome());
        medico.setCrm(medicoDTO.getCrm());
        medico.setDataNascimento(medicoDTO.getDataNascimento());
        medico.setTelefone(medicoDTO.getTelefone());
        medico.setEspecialidade(medicoDTO.getEspecialidade());

        medico = medicoRepository.save(medico);
        medicoDTO.setId(medico.getId());
        return medicoDTO;
    }

    @Transactional
    public MedicoDTO atualizarMedico(Long id, MedicoDTO medicoDTO) {
        Medico medico = medicoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Médico não encontrado com ID: " + id));

        medico.setNome(medicoDTO.getNome());
        medico.setCrm(medicoDTO.getCrm());
        medico.setDataNascimento(medicoDTO.getDataNascimento());
        medico.setTelefone(medicoDTO.getTelefone());
        medico.setEspecialidade(medicoDTO.getEspecialidade());

        medico = medicoRepository.save(medico);
        return medicoDTO;
    }

    public List<MedicoDTO> listarMedicos(String nome, Especialidade especialidade, LocalDate dataNascimento) {
        List<Medico> medicos = medicoRepository.findAll();

        return medicos.stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    public MedicoDTO buscarMedico(Long id) {
        Medico medico = medicoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Médico não encontrado com ID: " + id));
        return mapToDTO(medico);
    }

    @Transactional
    public void deletarMedico(Long id) {
        if (!medicoRepository.existsById(id)) {
            throw new ResourceNotFoundException("Médico não encontrado com ID: " + id);
        }
        medicoRepository.deleteById(id);
    }

    private MedicoDTO mapToDTO(Medico medico) {
        return new MedicoDTO(
                medico.getId(),
                medico.getNome(),
                medico.getCrm(),
                medico.getDataNascimento(),
                medico.getTelefone(),
                medico.getEspecialidade()
        );
    }
}