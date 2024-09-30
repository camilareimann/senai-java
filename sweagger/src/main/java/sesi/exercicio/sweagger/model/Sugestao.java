package sesi.exercicio.sweagger.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Sugestao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;

    private LocalDateTime dataEnvio;
    private LocalDateTime dataAtualizacao;

    @OneToMany(mappedBy = "sugestao", cascade = CascadeType.ALL)
    private List<Comentario> comentarios;
}