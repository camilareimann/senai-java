package sesi.exercicio.sweagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sesi.exercicio.sweagger.model.Comentario;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {
}
