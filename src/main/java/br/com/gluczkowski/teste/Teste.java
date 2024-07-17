package br.com.gluczkowski.teste;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "teste/")
public class Teste {
    

    @GetMapping
    public String testeDaAplicação(){
        return "APP FUNCIONANDO";
    }
}
