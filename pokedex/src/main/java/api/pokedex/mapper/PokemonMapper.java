package api.pokedex.mapper;

import api.pokedex.DTO.PokemonCapturadoRequest;
import api.pokedex.DTO.PokemonResponse;
import api.pokedex.DTO.PokemonSummary;
import api.pokedex.DTO.PokemonVistoRequest;
import api.pokedex.model.Pokemon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PokemonMapper {

    private PokemonMapper() {

    }

    public static Pokemon map(PokemonVistoRequest pokemonVistoRequest) {
        if (pokemonVistoRequest == null) {
            return null;
        }

        Pokemon target = new Pokemon();
        target.setNumero(pokemonVistoRequest.getNumero());
        target.setNome(pokemonVistoRequest.getNome());
        target.setImagemUrl(pokemonVistoRequest.getImagemUrl());
        target.setAreaHabitat(pokemonVistoRequest.getAreaHabitat());
        return target;
    }

    public static Pokemon map(PokemonCapturadoRequest pokemonCapturadoRequest) {
        if (pokemonCapturadoRequest == null) {
            return null;
        }

        Pokemon target = new Pokemon();
        target.setNumero(pokemonCapturadoRequest.getNumero());
        target.setNome(pokemonCapturadoRequest.getNome());
        target.setDescricao(pokemonCapturadoRequest.getDescricao());
        target.setImagemUrl(pokemonCapturadoRequest.getImagemUrl());
        target.setTipo(pokemonCapturadoRequest.getTipo());
        target.setCategoria(pokemonCapturadoRequest.getCategoria());
        target.setAreaHabitat(pokemonCapturadoRequest.getAreaHabitat());
        target.setAltura(pokemonCapturadoRequest.getAltura());
        target.setPeso(pokemonCapturadoRequest.getPeso());
        target.setCapturado(true);
        return target;
    }

    public static PokemonResponse map(Pokemon pokemon) {
        if (pokemon == null) {
            return null;
        }

        PokemonResponse target = new PokemonResponse();
        target.setNumero(pokemon.getNumero());
        target.setNome(pokemon.getNome());
        target.setDescricao(pokemon.getDescricao());
        target.setImagemUrl(pokemon.getImagemUrl());
        target.setTipo(pokemon.getTipo());
        target.setCategoria(pokemon.getCategoria());
        target.setAreaHabitat(pokemon.getAreaHabitat());
        target.setAltura(pokemon.getAltura());
        target.setPeso(pokemon.getPeso());
        target.setCapturado(pokemon.isCapturado());
        return target;
    }

    public static PokemonSummary mapSummary(Pokemon source) {
        if (source == null) {
            return null;
        }

        PokemonSummary target = new PokemonSummary();
        target.setNumero(source.getNumero());
        target.setNome(source.getNome());
        target.setCapturado(source.isCapturado());
        return target;
    }

    public static List<PokemonSummary> mapSummary(List<Pokemon> source) {
        if(source == null) {
            return Collections.emptyList();
        }
        List<PokemonSummary> target = new ArrayList<>();

        for(Pokemon pokemon : source) {
            target.add(mapSummary(pokemon));
        }

        return target;
    }


}
