package dev.java.CadastroDePessoas.Trabalhos;

import dev.java.CadastroDePessoas.Pessoa.PessoaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_carros")
@Data
@NoArgsConstructor
@AllArgsConstructor
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