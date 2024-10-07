package desafios.desafiosInc.ru;

import lombok.Data;

@Data
public class Alimento {
    private String nome;

    public Alimento(String nome) {
        this.nome = nome;
    }
}
