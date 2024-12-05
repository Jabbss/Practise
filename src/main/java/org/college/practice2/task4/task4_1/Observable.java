package org.college.practice2.task4.task4_1;

import java.util.ArrayList;

public abstract class Observable {
private ArrayList<Observer> _observers = new ArrayList<>();

public void subscribe(Observer obs) {
    _observers.add(obs);
}

public void unSubscribe(Observer obs) {
    _observers.remove(obs);
}

public void informAll(StudentPortfolio student, Project project, int grade) {
    for (Observer obs : _observers) {
        obs.inform();
    }
}
}

