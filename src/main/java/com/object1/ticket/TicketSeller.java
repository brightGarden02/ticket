package com.object1.ticket;

// 티켓 판매원 TicketSeller
// 역할: 매표소에서 초대장을 티켓으로 교환 및 티켓을 판매
// 본인이 일하는 매표소(TicketOffice)를 알고 있어야함
public class TicketSeller {

    private TicketOffice ticketOffice;
    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }

    public void sellTo(Audience audience) {


//        // 관객이 invitation을 갖고 있으면
//        // audience에게 ticket을 교환해줌
//        if(audience.getBag().hasInvitation()) {
//            Ticket ticket = getTicketOffice().getTicket();
//            audience.buy();
//            audience.getBag().setTicket(ticket);
//        }
//        else{ // 관객이 invitation이 없으면
//            // ticket을 audience에게 판매함
//
//            Ticket ticket = getTicketOffice().getTicket();
//            audience.getBag().minusAmount(ticket.getFee());
//            ticketOffice.plusAmount(ticket.getFee());
//
//            audience.getBag().setTicket(ticket);
//        }


//        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));

        ticketOffice.sellTicketTo(audience);
    }

}
