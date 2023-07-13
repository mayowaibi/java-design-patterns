package prototype;

public class Employee implements Cloneable {
	
	protected String first, last, email;
	
	public Employee(String first, String last, String email) {
		
		this.first = first;
		this.last = last;
		this.email = email;
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException  {
		Employee e = (Employee)super.clone();
		e.first = new String(this.first);
		e.last = new String(this.last);
		e.email = new String(this.email);
		return e;
	}

}
