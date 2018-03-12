package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	public String toString(){
		return "Geom(" +this.firstValue()+","+commonFactor+")";
	}
	@Override
	public double nextValue() {
		current = current * commonFactor; 
		return current;
	}

}
