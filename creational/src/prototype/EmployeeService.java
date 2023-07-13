package prototype;

public class EmployeeService {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		MailingList fullTime = new MailingList();
		fullTime.addEmployee(new Employee("jim", "beam", "jim@yorku.ca"));
		// may be more employees added ...
		// send them an email ..
		// now we hired urgently a new employee for this week only
		Employee newEmp = new Employee("joe", "bloggs", "joe@yorku.ca");
		MailingList allEmployees = (MailingList)fullTime.clone();
		allEmployees.addEmployee(newEmp);
		// now we can email everyone without polluting the original 
		// mailing list
		System.out.println("Emailing permanent employees:");
		fullTime.sendMail("This msg is for permanent employees");
		System.out.println("Emailing everyone:");
		allEmployees.sendMail("This msg is for everyone");
	}

}
