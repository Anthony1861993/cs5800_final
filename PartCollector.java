package cs5800_final;

public class PartCollector extends Employee {
	
	public PartCollector() {
		authorityLevel = PART_COLLECTOR;
	}
	
	public void write(String message) {
		System.out.println(message + " all parts have been gathered");
	}

}
