package com.trello.mini_projeto02.dto;

import com.trello.mini_projeto02.model.Especialidade;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicoDTO {
    private Long id;
    private String nome;
    private String crm;
    private LocalDate dataNascimento;
    private String telefone;
    private Especialidade especialidade;
}