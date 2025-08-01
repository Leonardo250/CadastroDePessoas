package dev.java.CadastroDePessoas.Trabalhos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarrosService {

    @Autowired
    private CarrosRepository repository;

    public List<CarrosModel> listarTodos() {
        return repository.findAll();
    }

    public Optional<CarrosModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public CarrosModel salvar(CarrosModel carro) {
        return repository.save(carro);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

