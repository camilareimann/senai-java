package br.senai.petshop.controllers;

import br.senai.petshop.models.Pet;
import br.senai.petshop.services.PetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pets")
public class PetController {

    private PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @PostMapping
    public void cadastra(@RequestBody Pet pet) {
        petService.cadastrar(pet);
    }

    @GetMapping
    public List<Pet> lista() {
        var pets = petService.listarPets();
        if(pets.isEmpty()){
            throw new RuntimeException("Nenhum pet cadastrado");
        } else {
            return pets;
        }
    }

    @GetMapping(value = "/{id}")
    public Pet busca(@PathVariable int id) {
        Pet pet = petService.buscaPetPorId(id);
        if (pet != null) {
            return pet;
        } else {
            throw new RuntimeException("Pet não encontrado");
        }
    }

    @DeleteMapping("/{id}")
    public String excluir(@PathVariable int id) {
        return petService.excluir(id)
                ? "Excluído com sucesso."
                : String.format("Pet não encontrado para id: %d.", id);
    }

    @PutMapping
    public void atualizar(@RequestBody Pet pet) {
        petService.atualizar(pet);
    }

}
