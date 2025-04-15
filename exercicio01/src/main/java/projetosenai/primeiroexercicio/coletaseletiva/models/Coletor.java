package projetosenai.primeiroexercicio.coletaseletiva.models;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Coletor {

    @Getter
    private static final List<Coletor> coletores = new ArrayList<>();
    private static Long sequence = 1L;

    @Setter(AccessLevel.NONE)
    private Long id;
    private String nome;
    private String descricao;

    public Coletor() {
        this.id = sequence++;
    }

    public static Coletor addColetor(Coletor coletor){
        coletores.add(coletor);
        return coletor;
    }
}