package dev.java.CadastroDePessoas.Pessoa;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class PessoaController {

    @GetMapping("/BoasVindas")
    /*
    @PostMapping
    @PutMapping
    @PatchMapping
    @DeleteMapping
    */
    public String BoasVindas(){
        return "Essa é minha primeira mensagem";
    }
}
