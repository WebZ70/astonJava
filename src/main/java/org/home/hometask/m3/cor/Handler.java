package org.home.hometask.m3.cor;

public abstract class Handler {
    protected Handler next;

    public void setNext(Handler next){
        this.next = next;
    }

    public abstract void handlerRequest(int i);
}
