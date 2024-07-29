package api.pokedex.service;

import api.pokedex.DTO.PokemonCapturadoRequest;
import api.pokedex.DTO.PokemonResponse;
import api.pokedex.DTO.PokemonSummary;
import api.pokedex.DTO.PokemonVistoRequest;
import api.pokedex.model.Pokemon;
import api.pokedex.repository.PokemonRepository;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import static api.pokedex.mapper.PokemonMapper.map;
import static api.pokedex.mapper.PokemonMapper.mapSummary;

@Service
public class PokemonService {

    private static final Logger LOGGER = LogManager.getLogger(PokemonService.class);

    private final PokemonRepository repository;

    public PokemonService(PokemonRepository pokemonRepository){
        this.repository = pokemonRepository;
    }

    public void cadastraVisto(PokemonVistoRequest pokemonVistoRequest){
        if(repository.existsById(pokemonVistoRequest.getNumero())){;
            throw new DuplicateKeyException("Já exite um pokemon com ese numero");
        }
        repository.save(map(pokemonVistoRequest));
    }


    public void atualizaPokemon(PokemonCapturadoRequest pokemonAtualizadoRequest) {
        if (!repository.existsById(pokemonAtualizadoRequest.getNumero())) {
            throw new EntityNotFoundException("Not found");
        }
        repository.save(map(pokemonAtualizadoRequest));
        LOGGER.info(
                "Pokémon capturado! Nome: {}, número: {}",
                pokemonAtualizadoRequest.getNome(),
                pokemonAtualizadoRequest.getNumero());

    }

    public void atualizaVisto(PokemonVistoRequest pokemonVistoRequest) {
        Pokemon pokemon = repository.findById(pokemonVistoRequest.getNumero()).orElseThrow(EntityNotFoundException::new);

        pokemon.setNome(pokemonVistoRequest.getNome());
        pokemon.setImagemUrl(pokemonVistoRequest.getImagemUrl());
        pokemon.setAreaHabitat(pokemonVistoRequest.getAreaHabitat());

        repository.save(pokemon);
    }

    public void deletaPokemon(Integer numero) {
        if (repository.existsById(numero)) {
            repository.deleteById(numero);
        } else {
            throw new EntityNotFoundException();
        }
    }

    public PokemonResponse busca(Integer numero) {
        Pokemon pokemon = repository.findById(numero).orElseThrow(EntityNotFoundException::new);
        return map(pokemon);
    }

    public List<PokemonSummary> lista(){
        return mapSummary(repository.findAll());
    }
}
