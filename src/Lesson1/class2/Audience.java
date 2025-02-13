package Lesson1.class2;

public class Audience {
    private Ticket ticket = Ticket.EMPTY;
    private Invitaion invitation = Invitation.EMPTY;
    private Long amount;
    public Audience(Long amount){this.amount = amount;}
    public void buyTicket(TicketSeller seller) {
        ticket = seller.getTicket(this);
    }
    public boolean hasAmount(Long amount){
        return this.amount >= amount;
    }

    public boolean minusAmount(Long amount) {
        if(amount > this.amount) return false;
        this.amount -= amount;
        return true;
    }
    public Invitation getinvitation(){return invitation;}
    public void removeInvitation(){
        invitation = invitation.EMPTY;
    }
    public Ticket getTicket(){return ticket;}
    public void setInvitation(Invitation invitation){
        this.invitation = invitation;
    }
}
