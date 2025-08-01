package dev.java.CadastroDePessoas.Pessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService service;

    @GetMapping
    public List<PessoaModel> listar() {
        return service.listarTodas();
    }

    @GetMapping("/{id}")
    public PessoaModel buscar(@PathVariable Long id) {
        return service.buscarPorId(id).orElse(null);
    }

    @PostMapping
    public PessoaModel salvar(@RequestBody PessoaModel pessoa) {
        return service.salvar(pessoa);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
