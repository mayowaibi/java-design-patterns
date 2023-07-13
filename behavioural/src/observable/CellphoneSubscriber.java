package observable;

public class CellphoneSubscriber implements Observer {

	private String cellphone;
	private Observable magazine;
	
	public CellphoneSubscriber(String num, Observable mag) {
		this.cellphone = num;
		this.magazine = mag;
		mag.register(this);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		// use the cellphone to get a pdf copy
	}

}
