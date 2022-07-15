package com.object1.ticket;

// 관람객 개념을 구현하는 Audience class
public class Audience {

    private  Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }


}
