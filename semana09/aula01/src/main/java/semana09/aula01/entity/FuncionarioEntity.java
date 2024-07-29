package semana09.aula01.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "funcionario")
public class FuncionarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cargo;
    private Double salario;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
