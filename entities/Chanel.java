package entities;

public class Chanel {
	private int chanelNumber;
	private String chanelName;
	
	public Chanel() {
		
	}
	
	public Chanel(int chanelNumber, String chanelName) {
		this.chanelNumber = chanelNumber;
		this.chanelName = chanelName;
	}

	public int getChanelNumber() {
		return chanelNumber;
	}

	public String getChanelName() {
		return chanelName;
	}
	
	
	
}
