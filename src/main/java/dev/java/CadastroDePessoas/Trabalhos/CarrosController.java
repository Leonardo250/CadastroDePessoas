package dev.java.CadastroDePessoas.Trabalhos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarrosController {

    @Autowired
    private CarrosService service;

    @GetMapping
    public List<CarrosModel> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public CarrosModel buscar(@PathVariable Long id) {
        return service.buscarPorId(id).orElse(null);
    }

    @PostMapping
    public CarrosModel salvar(@RequestBody CarrosModel carro) {
        return service.salvar(carro);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}

