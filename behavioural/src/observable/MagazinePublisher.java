package observable;

import java.util.ArrayList;
import java.util.List;

public class MagazinePublisher extends Observable{
	
	private List<Observer> buyers;
	
	public MagazinePublisher() {
		super();
		this.buyers = new ArrayList<>();
	}

	@Override
	public void register(Observer o) {
		// TODO Auto-generated method stub
		buyers.add(o);	
	}

	@Override
	public void unregister(Observer o) {
		// TODO Auto-generated method stub
		buyers.remove(o);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer b: buyers) b.update();
	}

}
