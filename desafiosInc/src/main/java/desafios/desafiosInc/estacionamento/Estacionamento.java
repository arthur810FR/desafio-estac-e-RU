package desafios.desafiosInc.estacionamento;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    List<Ticket> listagemTickets;

    public Estacionamento() {
        this.listagemTickets = new ArrayList<>();
    }

    public void geracaoTicket(int numeroTicket) {
        Ticket novoTicket = new Ticket(numeroTicket, 20.0);
        listagemTickets.add(novoTicket);
        System.out.println("\nTicket gerado: Número " + numeroTicket);
        System.out.println("Valor inicial: R$ 20.0");
    }

    public boolean verificacaoTicket(int numeroTicket) {
        for (Ticket ticket : listagemTickets) {
            if (ticket.getNumeroTicket() == numeroTicket) {
                return true;
            }
        }
        return false;
    }

    public void calcularHorasAdc(int numeroTicket, int horas) {
        for (Ticket ticket : listagemTickets) {
            if (ticket.getNumeroTicket() == numeroTicket) {
                double valorFinal = 20.0;
                if (horas > 1) {
                    valorFinal += (horas - 1) * 5;
                }
                ticket.setValorTicket(valorFinal);
                System.out.println("O valor total para o ticket " + numeroTicket + " é: R$ " + valorFinal);
                return;
            }
        }
        System.out.println("Ticket não encontrado.");
    }

    public boolean pagarTicket(int numeroTicket) {
        for (Ticket ticket : listagemTickets) {
            if (ticket.getNumeroTicket() == numeroTicket) {
                if (ticket.isStatusTicket()) {
                    System.out.println("O ticket " + numeroTicket + " já foi pago!");
                    return false;
                } else {
                    ticket.ticketPago();
                    System.out.println("Pagamento feito para o ticket: " + numeroTicket);
                    return true;
                }
            }
        }
        System.out.println("Ticket não foi encontrado!");
        return false;
    }
}