package br.senai.petshop.services;

import br.senai.petshop.models.Pet;
import br.senai.petshop.repositories.PetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PetService {
    private PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public void cadastrar(Pet pet) {
        petRepository.adicionaPet(pet);
    }

    public List<Pet> listarPets() {
        return petRepository.listarPets();
    }

    public Pet buscaPetPorId(int id) {
        return petRepository.buscaPetPorId(id);
    }

    public boolean excluir(int id) {
        Pet pet = petRepository.buscaPetPorId(id);
        if (pet != null) {
            petRepository.removePet(pet);
            return true;
        } else {
            return false;
        }
    }

    public boolean atualizar(Pet pet) {
    var petAtual = petRepository.buscaPetPorId(pet.getId());
    if (petAtual != null) {
        petAtual.setNome(pet.getNome());
        petAtual.setRaca(pet.getRaca());
        petAtual.setIdade(pet.getIdade());
        petAtual.setPeso(pet.getPeso());
        petAtual.setAltura(pet.getAltura());
        return true;
    }
    return false;
    }
}

