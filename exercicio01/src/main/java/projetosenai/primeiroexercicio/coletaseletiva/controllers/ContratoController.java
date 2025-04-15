package projetosenai.primeiroexercicio.coletaseletiva.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projetosenai.primeiroexercicio.coletaseletiva.models.Contrato;
import projetosenai.primeiroexercicio.coletaseletiva.services.ContratoService;

import java.util.List;

@RestController
@RequestMapping("contratos")
public class ContratoController {
    
    @Autowired
    private ContratoService service;
    
    @GetMapping
    public List<Contrato> get(){
        return service.findAll();
    }
    
    @PostMapping
    public Contrato post(@RequestBody Contrato contrato){
        return service.cadastrar(contrato);
    }
}
