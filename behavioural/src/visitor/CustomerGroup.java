package visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerGroup {
	
	private List<Customer> customers = new ArrayList<>();

	public void accept(IVisitor visitor)
	{
		for (Iterator<Customer> it=customers.iterator(); it.hasNext();)
		{
			((Customer)it.next()).accept(visitor);
		}		
	}

	public void addCustomer(Customer customer)
	{
		customers.add(customer);
	}	
	
}
