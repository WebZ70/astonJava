package org.home.hometask.m3.adapter;

public class CardReader implements USB{
    private MemoryCard mc;

    public CardReader(MemoryCard mc){
        this.mc = mc;
    }

    @Override
    public void connect() {
        this.mc.insert();
    }
}
