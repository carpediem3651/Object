package Lesson1.class2;

import java.util.ArrayList;
import java.util.List;

public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();
    public TicketOffice(Long amount) {this.amount = amount;}
    public void addTIcket(Ticket ticket){
        this.tickets.add(ticket);
    }
    public Ticket getTicketWithFee(){
        if(tickets.size() == 0) return Ticket.EMPTY;
        else {
            Ticket ticket = tickets.remove(0);
            amount += ticket.getFee();
            return ticket;
        }
    }
    public Ticket getTicketWithoutFee(){
        if(tickets.size() == 0) return Ticket.EMPTY;
        else return tickets.remove(0);
    }
    public Long getTicketPrice(){
        if(tickets.size() == 0) return 0L;
        else return tickets.get(0).getFee();
    }
}
