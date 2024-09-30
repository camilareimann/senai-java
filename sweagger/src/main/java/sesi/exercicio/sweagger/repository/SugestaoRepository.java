package sesi.exercicio.sweagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sesi.exercicio.sweagger.model.Sugestao;

import java.util.List;

public interface SugestaoRepository extends JpaRepository<Sugestao, Long> {
    List<Sugestao> findByTituloContaining(String titulo);
}
