package desafios.desafiosInc.estacionamento;

import java.util.Random;
import java.util.Scanner;

public class EstacionamentoTeste {

    public static void main(String[] args) {

        Estacionamento estacionamento = new Estacionamento();
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        boolean sair = false;

        while (!sair) {
            System.out.println("\n-------- PAINEL DE TICKET --------");
            System.out.println("1--> Solicitar ticket;");
            System.out.println("2--> Consultar valor para pagar;");
            System.out.println("3--> Pagar ticket;");
            System.out.println("4--> Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    int numeroAleatorioTicket = aleatorio.nextInt(999) + 1;
                    estacionamento.geracaoTicket(numeroAleatorioTicket);
                    break;

                case 2:
                    int numeroTicketHoras = solicitarNumeroTicketValido(entrada, estacionamento);
                    System.out.print("Quantas horas você passou no estacionamento? ");
                    int horas = entrada.nextInt();
                    estacionamento.calcularHorasAdc(numeroTicketHoras, horas);
                    break;

                case 3:
                    int numeroTicketParaPagar = solicitarNumeroTicketValido(entrada, estacionamento);
                    estacionamento.pagarTicket(numeroTicketParaPagar);
                    break;

                case 4:
                    sair = true;
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente!");
                    break;
            }
        }

        entrada.close();
    }

    public static int solicitarNumeroTicketValido(Scanner entrada, Estacionamento estacionamento) {
        int numeroTicket;
        boolean ticketValido = false;

        do {
            System.out.print("Digite o número do ticket: ");
            numeroTicket = entrada.nextInt();
            ticketValido = estacionamento.verificacaoTicket(numeroTicket);

            if (!ticketValido) {
                System.out.println("Ticket não encontrado! Tente novamente!");
            }

        } while (!ticketValido);

        return numeroTicket;
    }
}