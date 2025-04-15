package projetosenai.primeiroexercicio.coletaseletiva.models;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Contrato {

    @Getter
    private static final List<Contrato> contratos = new ArrayList<>();
    private static Long sequence = 1L;

    @Setter(AccessLevel.NONE)
    private Long id;
    private Coletor coletor;
    private List<Rota> rotas = new ArrayList<>();

    public Contrato() {
        this.id = sequence++;
    }

    public static Contrato addContrato(Contrato contrato){
        contratos.add(contrato);
        return contrato;
    }
}