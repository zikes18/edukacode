package br.com.edukacode.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lead")
public class LeadController {
    
    @PostMapping
    public String criarLead(@RequestBody DadosCadastroLead dados) {
        // Implementação do método para criar um lead
        System.out.println("Lead criado com os dados: " + dados);
        return "Lead criado com sucesso!";
    }
    @GetMapping
    public void listarLeads() {
        // Implementação do método para listar todos os leads
    }
    @PutMapping
    public void atualizarLead() {
        // Implementação do método para atualizar um lead existente
    }
    @DeleteMapping
    public void excluirLead() {
        // Implementação do método para excluir um lead
    }

}
