package org.home.hometask.m3.adapter;

public class MainAdapter {
    public static void main(String[] args) {
        USB cardReaderToUSB = new CardReader(new MemoryCard());
        cardReaderToUSB.connect();
    }

}
