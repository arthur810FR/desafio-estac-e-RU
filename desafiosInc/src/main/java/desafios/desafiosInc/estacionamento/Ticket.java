package desafios.desafiosInc.estacionamento;

import lombok.Data;

@Data
public class Ticket {

    private int numeroTicket;
    private double valorTicket;
    private boolean statusTicket;

    public Ticket(int numeroTicket, double valorTicket){
        this.numeroTicket = numeroTicket;
        this.valorTicket = valorTicket;
        this.statusTicket = false; //status do ticket ja começara como não pago
    }

    public void ticketPago(){
        this.statusTicket = true;
    }
}