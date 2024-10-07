package desafios.desafiosInc.ru;

import lombok.Data;

@Data
public class Menu {
    private String dia;
    private String turno;
    private Refeicao refeicao;

    public Menu(String dia, String turno, Refeicao refeicao) {
        this.dia = dia;
        this.turno = turno;
        this.refeicao = refeicao;
    }

    public String receberMenu() {
        return "Dia: " + dia + ", Turno: " + turno + "\n" + refeicao.receberRefeicao();
    }
}
