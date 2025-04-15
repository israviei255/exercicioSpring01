package projetosenai.primeiroexercicio.coletaseletiva.services;

import org.springframework.stereotype.Service;
import projetosenai.primeiroexercicio.coletaseletiva.models.Coletor;
import java.util.List;

@Service
public class ColetorService {

    public Coletor cadastrar(Coletor Coletor){
        return Coletor.addColetor(Coletor);
    }

    public List<Coletor> findAll(){
        return Coletor.getColetores();
    }

    public Coletor findById(Long id){
        for(Coletor coletor : Coletor.getColetores()){
            if (coletor.getId().equals(id)){
                return coletor;
            }
        }
        return null;
    }
}
