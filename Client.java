package cs5800_final;

public class Client {
	
	public static void main(String[] args) {
		
		Employee myPartCollector = new PartCollector();
		Employee myAssembler = new Assembler();
		Employee myWelder = new Welder();
		Employee myPainter = new Painter();
		
		myPartCollector.setNextEmployee(myAssembler);
		myAssembler.setNextEmployee(myWelder);
		myWelder.setNextEmployee(myPainter);
		myPainter.setNextEmployee(null);
		
		myPartCollector.doWork(4, "Build Prius 2019:");
		
	}
}
