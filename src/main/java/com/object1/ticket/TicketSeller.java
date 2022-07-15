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

}
