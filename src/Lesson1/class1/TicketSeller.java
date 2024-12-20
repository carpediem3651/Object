package Lesson1.class1;

public class TicketSeller {
    private TicketOffice ticketOffice;
    public void setTicketOffice(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }
    public Ticket getTicket(Audience audience) {
        Ticket ticket = Ticket.EMPTY;
        ticket = ticketOffice.getTicketwithNoFee();
        if(ticket != Ticket.EMPTY) audience.removeInvitation();
    } else if(audience.hasAmount(ticketOffice.getTicketPrice())){
        ticket = ticketOffce.getTicketWithFee();
        if(ticket != Ticket.EMPTY) audience.minusAmount(ticketOffice.getTicketPrice());
    }
    return ticket;

}
