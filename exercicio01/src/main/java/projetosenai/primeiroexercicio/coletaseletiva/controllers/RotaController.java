package projetosenai.primeiroexercicio.coletaseletiva.controllers;

import org.springframework.web.bind.annotation.*;
import projetosenai.primeiroexercicio.coletaseletiva.models.Rota;
import projetosenai.primeiroexercicio.coletaseletiva.services.RotaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("rotas")
public class RotaController {

    @Autowired
    private RotaService service;

    @GetMapping
    public List<Rota> get(){
        return service.findAll();
    }

    @PostMapping
    public Rota post(@RequestBody Rota rota){
        return service.cadastrar(rota);
    }
}
