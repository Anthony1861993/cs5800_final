package cs5800_final;

public class Assembler extends Employee {
	
	public Assembler() {
		authorityLevel = ASSEMBLER;
	}
	
	public void write(String message) {
		System.out.println(message + " all parts have been put together");
	}

}
