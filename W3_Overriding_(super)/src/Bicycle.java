
public class Bicycle {
	
	public int cadence;
	public int gear;
	public int speed;

	public Bicycle(int startCadence, int startSpeed, int startGear) {
		gear = startGear;
		cadence = startCadence;
		speed = startSpeed;
	}
	
	public void setCadence(int newValue) {  //setter
		cadence = newValue;
	}
	
	public void setGear(int newValue) {  // setter
		gear = newValue; 
	}
	
	public void applyBrake(int decrement) {  // speed down
		speed -= decrement;
	}
	
	public void speedUp(int increment) {  // speed up
		speed += increment;
	}
	
}
