package dev.java.CadastroDePessoas.Trabalhos;

import dev.java.CadastroDePessoas.Pessoa.PessoaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_carros")
public class CarrosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;
    private String nome;
    private String temp;

    // um carro pode ter muitas pessoa
    @OneToMany(mappedBy = "Carros")
    private List<PessoaModel> Pessoas;

}