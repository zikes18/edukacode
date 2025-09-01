package br.com.edukacode.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/generos")
public class GeneroController {

    @GetMapping
    public String listar() {
        return "listando generos cadastrados";
    }

}
