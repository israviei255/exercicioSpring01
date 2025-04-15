package projetosenai.primeiroexercicio.coletaseletiva.services;

import org.springframework.stereotype.Service;
import projetosenai.primeiroexercicio.coletaseletiva.models.Rota;
import java.util.List;

@Service
public class RotaService {

    public Rota cadastrar(Rota rota){
        return Rota.addRota(rota);
    }

    public List<Rota> findAll(){
        return Rota.getRotas();
    }

    public Rota findById(Long id){
        for(Rota rota : Rota.getRotas()){
            if (rota.getId().equals(id)){
                return rota;
            }
        }
        return null;
    }
}
