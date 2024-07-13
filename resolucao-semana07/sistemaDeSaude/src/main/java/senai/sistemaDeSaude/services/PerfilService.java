package senai.sistemaDeSaude.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import senai.sistemaDeSaude.DTOs.PerfilRequest;
import senai.sistemaDeSaude.entities.Perfil;
import senai.sistemaDeSaude.repositories.PerfilRepository;

@Service
@RequiredArgsConstructor
public class PerfilService {

    private final PerfilRepository perfilRepository;

    public void cadastraPerfil(PerfilRequest perfilRequest) {
        if(perfilRepository.findByNomePerfil(perfilRequest.nomePerfil()).isPresent()) {
            throw new RuntimeException("Perfil já cadastrado");
        }
        Perfil perfil = new Perfil();
        perfil.setNomePerfil(perfilRequest.nomePerfil());
        perfilRepository.save(perfil);
    }

    public Perfil validaPerfil(String nomePerfil){
        Perfil perfil = perfilRepository.findByNomePerfil(nomePerfil)
                .orElseThrow(
                        () -> new RuntimeException("Perfil não encontrado")
                );
        return perfil;
    }
}
