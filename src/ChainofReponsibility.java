
public class ChainofReponsibility {
	private static void doChaining() {
		collectorBasedEmployee employee1 = new collectorBasedEmployee(Employee.PART_COLLECTOR);
		assemblerBasedEmployee employee2 = new assemblerBasedEmployee(Employee.ASSEMBLER);
		welderBasedEmployee employee3 = new welderBasedEmployee(Employee.WELDER);
		painterBasedEmployee employee4 = new painterBasedEmployee(Employee.PAINTER);
		//link element together
		employee1.setNextEmployee(employee2);
		employee2.setNextEmployee((employee3));
		employee3.setNextEmployee(employee4);

//		employee1-> employee2 -> employee3 -> employee4
//		collector->assembler->welder->painter
	// passing first element collector into doWork()
		employee1.doWork(Employee.PART_COLLECTOR, "");

	}

	public static void main(String args[]) {
		doChaining();
	}
}
