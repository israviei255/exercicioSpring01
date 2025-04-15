package projetosenai.primeiroexercicio.coletaseletiva.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projetosenai.primeiroexercicio.coletaseletiva.models.Contrato;
import projetosenai.primeiroexercicio.coletaseletiva.models.Coletor;
import projetosenai.primeiroexercicio.coletaseletiva.models.Rota;
import java.util.ArrayList;
import java.util.List;

@Service
public class ContratoService {

    @Autowired
    private RotaService rotaService;

    @Autowired
    private ColetorService coletorService;

    public Contrato cadastrar(Contrato contrato){
        Coletor coletor = coletorService.findById(contrato.getColetor().getId());
        if (coletor == null){
            return null;
        }else{
            contrato.setColetor(coletor);
        }

        List<Rota> rotas = new ArrayList();
        for(Rota rota : contrato.getRotas()){
            Rota foundRota = rotaService.findById(rota.getId());
            if (rota == null) { return null; }
            else{   rotas.add(foundRota);   }
        }
        contrato.setRotas(rotas);

        return contrato.addContrato(contrato);
    }

    public List<Contrato> findAll(){
        return Contrato.getContratos();
    }

}
