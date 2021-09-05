
package com.java.pattern.behavioral.observer;

public interface IObservable {
    void sum(IObserver iObserver);
    void delete(IObserver iObserver);
    void callObservers(String Text);
}
