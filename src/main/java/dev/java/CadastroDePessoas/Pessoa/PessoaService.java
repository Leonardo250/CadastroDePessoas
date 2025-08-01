package dev.java.CadastroDePessoas.Pessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    public List<PessoaModel> listarTodas() {
        return repository.findAll();
    }

    public Optional<PessoaModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public PessoaModel salvar(PessoaModel pessoa) {
        return repository.save(pessoa);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
