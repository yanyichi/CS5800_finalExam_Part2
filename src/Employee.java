
public abstract class Employee {
	public static int PART_COLLECTOR = 4;
	public static int ASSEMBLER = 3;
	public static int WELDER = 2;
	public static int PAINTER = 1;

	protected int authorityLevel;

	protected Employee nextEmployee;

	public void setNextEmployee(Employee nextEmployee) {
		this.nextEmployee = nextEmployee;
	}


//	PART_COLLECTOR.dowork(4,"4");
//		ASSEMBLER.dowork(4,"4");
//			WELDER.dowork(4,"4");
//				PAINTER.dowork(4,"4");
//					null
	public void doWork(int authorityLevel, String message) {
		if(this.authorityLevel <= authorityLevel) {
//			4						4
//			3						4
//			2						4
//			1						4
			write(message);
		}

		if(nextEmployee != null) {
//			employee3			(	4,     "4")
//			employee2			(	4,     "4")
//			employee1			(	4,     "4")
			nextEmployee.doWork(authorityLevel, message);
		}
	}

	abstract protected void write(String message);
}