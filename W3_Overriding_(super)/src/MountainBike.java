
public class MountainBike  extends Bicycle{
	
	public int seatHeight;

	public MountainBike(int startHeight,int startCadence, int startSpeed, int startGear) {
		
		//A method in the parent class can be invoked explicitly using the super reference

		super(startCadence, startSpeed, startGear);  //we can use constructor of extented class via super
		seatHeight = startHeight;
	}
	

	public void setHeight(int newValue) {   
		seatHeight = newValue;
	}
}
