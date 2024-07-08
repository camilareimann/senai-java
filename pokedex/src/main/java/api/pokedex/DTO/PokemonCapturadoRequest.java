package api.pokedex.DTO;

import api.pokedex.enums.TipoEnum;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class PokemonCapturadoRequest {
    @NotNull
    private Integer numero;
    @NotBlank
    private String nome;
    @NotBlank
    private String descricao;
    @NotBlank
    private String imagemUrl;
    @NotNull
    @Enumerated(EnumType.STRING)
    private TipoEnum tipo;
    @NotBlank
    private String categoria;
    @NotBlank
    private String areaHabitat;
    @NotNull
    private Double altura;
    @NotNull
    private Double peso;

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

    public @NotBlank String getDescricao() {
        return descricao;
    }

    public void setDescricao(@NotBlank String descricao) {
        this.descricao = descricao;
    }

    public @NotBlank String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(@NotBlank String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }

    public TipoEnum getTipo() {
        return tipo;
    }

    public void setTipo(@NotNull TipoEnum tipo) {
        this.tipo = tipo;
    }

    public @NotBlank String getCategoria() {
        return categoria;
    }

    public void setCategoria(@NotNull String categoria) {
        this.categoria = categoria;
    }

    public @NotBlank String getAreaHabitat() {
        return areaHabitat;
    }

    public void setAreaHabitat(@NotBlank String areaHabitat) {
        this.areaHabitat = areaHabitat;
    }

    public @NotNull Double getAltura() {
        return altura;
    }

    public void setAltura(@NotNull Double altura) {
        this.altura = altura;
    }

    public @NotNull Double getPeso() {
        return peso;
    }

    public void setPeso(@NotNull Double peso) {
        this.peso = peso;
    }

}