package br.senai.petshop.repositories;

import br.senai.petshop.models.Pet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class PetRepository {

    private static int ultimoId;

    private static List<Pet> pets = new ArrayList<>();

    public  List<Pet> listarPets() {
        return pets;
    }

    public  void adicionaPet(Pet pet) {
        pet.setId(++ultimoId);
        pets.add(pet);
    }

    public  void removePet(Pet pet) {
        pets.remove(pet);
    }

    public  Pet buscaPetPorId(int id) {
        return pets.stream().filter(pet -> pet.getId() == id).findFirst().orElse(null);
    }

}
