package com.object1.ticket;

// 관람객 개념을 구현하는 Audience class
public class Audience {

    private  Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

//    public Bag getBag() {
//        return bag;
//    }

    public Long buy(Ticket ticket){

        if(bag.hasInvitation()) {
//            Ticket ticket = getTicketOffice().getTicket();
//            audience.buy();
            bag.setTicket(ticket);
            return 0L;
        }
        else{
//            ticketOffice.plusAmount(ticket.getFee());
//            audience.getBag().setTicket(ticket);

            bag.setTicket(ticket);
            bag.minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }


}
