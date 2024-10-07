package desafios.desafiosInc.ru;

import lombok.Data;

@Data
public class Refeicao {
    private Alimento salada;
    private Alimento pratoPrincipal;
    private Alimento acompanhamento;

    public Refeicao(Alimento salada, Alimento pratoPrincipal, Alimento acompanhamento) {
        this.salada = salada;
        this.pratoPrincipal = pratoPrincipal;
        this.acompanhamento = acompanhamento;
    }

    public String receberRefeicao() {
        return "Salada: " + salada.getNome() + ", Prato Principal: " + pratoPrincipal.getNome() + ", Acompanhamento: " + acompanhamento.getNome();
    }
}
