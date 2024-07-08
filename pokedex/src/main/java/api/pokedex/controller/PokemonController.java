package api.pokedex.controller;

import api.pokedex.DTO.PokemonCapturadoRequest;
import api.pokedex.DTO.PokemonResponse;
import api.pokedex.DTO.PokemonSummary;
import api.pokedex.DTO.PokemonVistoRequest;
import api.pokedex.service.PokemonService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    private final PokemonService service;

    public PokemonController(PokemonService pokemonService){
        this.service = pokemonService;
    }

    @PostMapping("/visto")
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastraVisto(@Valid @RequestBody PokemonVistoRequest pokemonVistoRequest){
        service.cadastraVisto(pokemonVistoRequest);
    }

    @PutMapping("/capturado")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void atualizaCapturado(@Valid @RequestBody PokemonCapturadoRequest pokemonCapturadoRequest){
        service.atualizaPokemon(pokemonCapturadoRequest);
    }

    @PutMapping("/visto")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void atualizaVisto(@Valid @RequestBody PokemonVistoRequest pokemonVistoRequest){
        service.atualizaVisto(pokemonVistoRequest);
    }

    @DeleteMapping("/{numero}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletaPokemon(@PathVariable Integer numero){
        service.deletaPokemon(numero);
    }

    @GetMapping("/{numero}")
    @ResponseStatus(HttpStatus.OK)
    public PokemonResponse busca(@PathVariable Integer numero){
        return service.busca(numero);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<PokemonSummary> lista(){
        return service.lista();
    }


}
