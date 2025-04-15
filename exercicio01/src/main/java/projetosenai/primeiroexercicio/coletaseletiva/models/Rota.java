package projetosenai.primeiroexercicio.coletaseletiva.models;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rota {

    @Getter
    private static final List<Rota> rotas = new ArrayList<>();
    private static Long sequence = 1L;

    @Setter(AccessLevel.NONE)
    private Long id;
    private String descricao;
    private String regiao;
    private BigDecimal percEfic;

    public Rota() {
        this.id = sequence++;
    }

    public static Rota addRota(Rota rota){
        rotas.add(rota);
        return rota;
    }
}
