package desafios.desafiosInc.ru;

import java.util.Scanner;

public class RUTeste {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        CardapioSemanal cardapio = new CardapioSemanal();
        boolean continuar = true;

        Refeicao prato = null;

        while (continuar) {
            System.out.println("\n-------- CARDAPIO RU --------");
            System.out.println("1. Cadastrar Alimentos e Criar Prato");
            System.out.println("2. Criar Menu para um Dia da Semana");
            System.out.println("3. Exibir Cardápio Semanal");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Informe qual a salada: ");
                    String saladaNome = entrada.nextLine();
                    Alimento salada = new Alimento(saladaNome);

                    System.out.print("Informe qual o prato principal: ");
                    String pratoNome = entrada.nextLine();
                    Alimento pratoPrincipal = new Alimento(pratoNome);

                    System.out.print("Informe o nome do acompanhamento: ");
                    String acompanhamentoNome = entrada.nextLine();
                    Alimento acompanhamento = new Alimento(acompanhamentoNome);

                    prato = new Refeicao(salada, pratoPrincipal, acompanhamento);
                    break;

                case 2:
                    if (prato != null) {
                        System.out.print("Informe o dia da semana: ");
                        String dia = entrada.nextLine();

                        System.out.print("Informe o horario (Almoço/Jantar): ");
                        String turno = entrada.nextLine();

                        Menu menu = new Menu(dia, turno, prato);
                        cardapio.adicionarMenu(menu);
                        System.out.println("Menu adicionado ao cardápio!");
                    } else {
                        System.out.println("Por favor! Crie um prato antes de adicionar ao menu!");
                    }
                    break;

                case 3:
                    System.out.println("Exibindo o cardápio da semana:");
                    cardapio.exibirCardapioSemanal();
                    break;

                case 4:
                    continuar = false;
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida! Escolha uma opcao valida!");
                    break;
            }
        }

        entrada.close();
    }
}
