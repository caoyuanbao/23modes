package com.cj.Observer;

import java.util.ArrayList;
import java.util.List;

import com.cj.Ptoxy.mode.Subject;

public class Boss implements com.cj.Observer.Subject{

	private List<Observer> observers = new ArrayList<Observer>();
	private String action;
	
	//notify
	public void Notify(){
		for (Observer observer : observers) {
			observer.update();
		}
	}

	// frontend status
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}



	
}
