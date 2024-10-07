package desafios.desafiosInc.ru;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class CardapioSemanal {
    private List<Menu> menus;

    public CardapioSemanal() {
        this.menus = new ArrayList<>();
    }

    public void adicionarMenu(Menu menu) {
        menus.add(menu);
    }

    public void exibirCardapioSemanal() {
        if (menus.isEmpty()) {
            System.out.println("O cardápio semanal ainda não foi criado!");
        } else {
            for (Menu menu : menus) {
                System.out.println(menu.receberMenu());
                System.out.println("===============================");
            }
        }
    }
}
