package api.pokedex.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class PokemonVistoRequest {
    @NotNull
    private Integer numero;
    @NotBlank
    private String nome;
    @NotBlank
    private String imagemUrl;
    @NotBlank
    private String areaHabitat;

    @NotNull
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(@NotNull Integer numero) {
        this.numero = numero;
    }

    public @NotBlank String getNome() {
        return nome;
    }

    public void setNome(@NotBlank String nome) {
        this.nome = nome;
    }

    public @NotBlank String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(@NotBlank String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }

    public @NotBlank String getAreaHabitat() {
        return areaHabitat;
    }

    public void setAreaHabitat(@NotBlank String areaHabitat) {
        this.areaHabitat = areaHabitat;
    }
}
