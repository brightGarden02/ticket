package com.object1.ticket;

// 관람객이 소지품을 보관할 가방 Bag class
public class Bag {

    private Long amount; // 현금
    private Invitation invitation; // 초대장
    private Ticket ticket; // 티켓


    // 초대장 없이 현금만 있는 경우
    public Bag(long amount) {
        this(null, amount);
    }

    // 초대장, 현금이 있는 경우
    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }


    public boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }


}
