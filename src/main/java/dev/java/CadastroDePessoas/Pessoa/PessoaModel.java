package dev.java.CadastroDePessoas.Pessoa;

import dev.java.CadastroDePessoas.Trabalhos.CarrosModel;
import jakarta.persistence.*;

import java.util.List;

// Entity ele tranforma uma classe em uma entidade do bancode dados
// JPA = java Persistence API
@Entity
@Table(name = "tb_cadastro")
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    // @ManyToOne uma pessoa tem um carro
    @ManyToOne
    @JoinColumn(name = "Carros_id") // chave estrangeira para conectar as tabelas
    private CarrosModel Carros;

    public PessoaModel() {

    }

    public PessoaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
