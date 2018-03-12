package orderedStructures;

public class Arithmetic extends Progression {
	private double commonDifference; 
	String name;
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
		
	}
	public String toString(){
		return "Arith(" +this.firstValue()+","+commonDifference+")";
		
	}
	@Override
	public double nextValue() {
		current = current + commonDifference; 
		return current;
	}

}
