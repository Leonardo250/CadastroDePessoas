package dev.java.CadastroDePessoas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {

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
