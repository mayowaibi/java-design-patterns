package prototype;

import java.util.ArrayList;
import java.util.List;

public class MailingList implements Cloneable{
	
	protected List<Employee> mailingList;
	
	public MailingList() {
		mailingList = new ArrayList<>();
	}

	protected void addEmployee(Employee e) {
		this.mailingList.add(e);
	}
	
	protected void sendMail(String msg) {
		for(Employee e: mailingList)
			System.out.println(e.email + " -> " + msg);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		MailingList ml = (MailingList) super.clone();
		ml.mailingList = new ArrayList<>();
		for (Employee e: this.mailingList)
			ml.mailingList.add((Employee) e.clone());
		return ml;
		
	}
}
