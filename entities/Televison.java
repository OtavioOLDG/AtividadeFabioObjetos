package entities;

import java.util.ArrayList;
import java.util.List;

import entitiesEnum.Status;

public class Televison {
	private Status status;
	int chanelNumberTV;
	private int volume;
	private final static int MAX = 20;
	private final static int MIN = 0;
	
	private List<Chanel> chanels = new ArrayList<>();
	
	public Televison() {
		status = Status.DESLIGADO;
		volume = 0;
	}
	
	public void turnOnTV(){
		status = Status.LIGADO;
	}
	
	public void turnOffTV(){
		status = Status.DESLIGADO;
	}

	public Status getStatus() {
		return status;
	}

	public List<Chanel> getChanels() {
		return chanels;
	}

	public int getVolume() {
		return volume;
	}
	
	public void addChanel(Chanel chanel) {
		chanels.add(chanel);
	}
	
	public void removeChanel(Chanel chanel) {
		chanels.remove(chanel);
	}
	
	public void changeChanel (int number) {
		for(Chanel x : chanels) {
			if(x.getChanelNumber() == number) {
				chanelNumberTV = number;
			} else {
				chanelNumberTV = 0;
			}
		}
	}
	
	public void increaseVolume() {
		this.volume = Math.min(MAX, volume+1);
	}
	
	public void decreaseVolume() {
		this.volume = Math.max(MIN, volume-1);
	}

	public String toString() {
		String chanalName = "Out of Signal";
		for (Chanel x : chanels) {
			if (x.getChanelNumber() == chanelNumberTV) {
				chanalName = x.getChanelName();
			}
		}
		if (this.status == status.LIGADO) {
			return "Status: " + status + "; Chanel: " + chanalName + ", Chanel Number: " + chanelNumberTV
					+ "; Volume: " + volume + ";";
		} else {
			return "Televisão desligada";
		}
	}
	
	
	
}
