package senai.sistemaDeSaude.services;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import senai.sistemaDeSaude.DTOs.LoginRequest;
import senai.sistemaDeSaude.entities.Perfil;
import senai.sistemaDeSaude.entities.Usuario;
import senai.sistemaDeSaude.repositories.UsuarioRepository;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    private final PerfilService perfilService;

    public Usuario validaUsuario(LoginRequest loginRequest) {
                Usuario usuario = usuarioRepository
                .findByUsername(loginRequest.username())
                .orElseThrow(
                        () -> new RuntimeException("Usuário não encontrado"
                                + loginRequest.username())
                );
        if (!passwordEncoder.matches(loginRequest.password(), usuario.getPassword())) {
            throw new RuntimeException("Senha inválida para "
                    + loginRequest.username());
        }
        return usuario;
    }

    public void cadastraUsuario(LoginRequest cadastroRequest) {

        if(usuarioRepository.findByUsername(cadastroRequest.username()).isPresent()) {
            throw new RuntimeException("Usuário já cadastrado");
        }

        Perfil perfil = perfilService.validaPerfil(cadastroRequest.nomePerfil());

        Usuario usuario = new Usuario();
            usuario.setUsername(cadastroRequest.username());
            usuario.setPassword(passwordEncoder.encode(cadastroRequest.password()));
            usuario.setPerfilList(Set.of(perfil));
            usuarioRepository.save(usuario);
    }
}

