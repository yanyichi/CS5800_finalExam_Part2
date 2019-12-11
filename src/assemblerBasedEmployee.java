
public class assemblerBasedEmployee extends Employee {
	public assemblerBasedEmployee(int authorityLevel) {
		this.authorityLevel = authorityLevel;
	}
	
	@Override
	protected void write(String message) {
		System.out.println("Assembler - message: all parts have been put together");
	}
}
