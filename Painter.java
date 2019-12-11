package cs5800_final;

public class Painter extends Employee {
	
	public Painter() {
		authorityLevel = PAINTER;
	}
	
	public void write(String message) {
		System.out.println(message + " car complete");
	}

}
