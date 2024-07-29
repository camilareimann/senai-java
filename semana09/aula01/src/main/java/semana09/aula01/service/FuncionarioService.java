package semana09.aula01.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import semana09.aula01.entity.FuncionarioEntity;
import semana09.aula01.repository.FuncionarioRepository;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class FuncionarioService {

 private final FuncionarioRepository funcionarioRepository;

 public List<FuncionarioEntity> listaFuncionarios() {
     return funcionarioRepository.findAll()
             .stream().map(FuncionarioEntity -> new FuncionarioEntity())
             .collect(Collectors.toList());
 }


}
