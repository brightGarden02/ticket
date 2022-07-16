package com.object1.ticket;

// 소극장
public class Theater {

    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }



    public void enter(Audience audience) {

        // 관객이 invitation을 갖고 있으면
        // ticketSeller가 audience에게 ticket을 교환해줌
        if(audience.getBag().hasInvitation()) {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        }
        else{ // 관객이 invitation이 없으면
            // ticketSeller가 ticket을 audience에게 판매함

            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }

}
