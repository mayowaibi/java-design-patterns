package visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Order implements IVisitable {

	private String name;
	
	private List<Item> items = new ArrayList<>();
	
	public Order(String name)
	{
		this.name = name;
	}
	
	public Order(String name, String itemName)
	{
		this.name = name;
		this.addItem(new Item(itemName));
	}	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void accept(IVisitor visitor)
	{
		visitor.visit(this);
		
		for (Iterator<Item> it=items.iterator(); it.hasNext();)
		{
			((Item)it.next()).accept(visitor);
		}
	}
	
	
	public void addItem(Item item)
	{
		items.add(item);
	}
}
