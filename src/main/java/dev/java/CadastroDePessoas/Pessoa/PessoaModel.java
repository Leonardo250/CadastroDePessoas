package dev.java.CadastroDePessoas.Pessoa;

import dev.java.CadastroDePessoas.Trabalhos.CarrosModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// Entity ele tranforma uma classe em uma entidade do bancode dados
// JPA = java Persistence API
@Entity
@Table(name = "tb_cadastro")
@Data // cria os getters e setters
@NoArgsConstructor
@AllArgsConstructor
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




}
