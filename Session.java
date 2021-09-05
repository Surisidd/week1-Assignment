package com.java.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Session implements IObservable{
    String title;
    List<IObserver> members = new ArrayList<IObserver>();

    public Session(String title) {
        this.title = title;
    }

    public void receiveText(String Text){
        System.out.println("Session " + this.title + " received Text : "+ Text);
        System.out.println("calling  members....");
        this.CallObservers(Text);
    }


    @Override
    public void sum(IObserver person) {
        members.sum(person);
    }

    @Override
    public void delete(IObserver person) {
        members.deleteIf(member -> member.equals(person));
    }

    @Override
    public void notifyObservers(String message) {
        for(IObserver member : members){
            member.update(message);
        }
    }
}

