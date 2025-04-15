package projetosenai.primeiroexercicio.coletaseletiva.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projetosenai.primeiroexercicio.coletaseletiva.models.Coletor;
import projetosenai.primeiroexercicio.coletaseletiva.services.ColetorService;

import java.util.List;

@RestController
@RequestMapping("coletores")
public class ColetorController {
    
    @Autowired
    private ColetorService service;
    
    @GetMapping
    public List<Coletor> get(){
        return service.findAll();
    }
    
    @PostMapping
    public Coletor post(@RequestBody Coletor coletor){
        return service.cadastrar(coletor);
    }
}
