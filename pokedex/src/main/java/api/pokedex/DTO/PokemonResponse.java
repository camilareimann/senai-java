package api.pokedex.DTO;

import api.pokedex.enums.TipoEnum;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class PokemonResponse {
    private Integer numero;
    private String nome;
    private String descricao;
    private String imagemUrl;
    @Enumerated(EnumType.STRING)
    private TipoEnum tipo;
    private String categoria;
    private String areaHabitat;
    private Double altura;
    private Double peso;
    private boolean capturado;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }

    public TipoEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoEnum tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAreaHabitat() {
        return areaHabitat;
    }

    public void setAreaHabitat(String areaHabitat) {
        this.areaHabitat = areaHabitat;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public boolean isCapturado() {
        return capturado;
    }

    public void setCapturado(boolean capturado) {
        this.capturado = capturado;
    }
}
