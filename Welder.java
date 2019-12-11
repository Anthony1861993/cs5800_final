package cs5800_final;

public class Welder extends Employee {
	
	public Welder() {
		authorityLevel = WELDER;
	}
	
	public void write(String message) {
		System.out.println(message + " all parts have been welded together");
	}
}
