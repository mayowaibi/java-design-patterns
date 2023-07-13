package builder;

public class PizzaChain extends Pizza {

	public PizzaChain(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
		public PizzaChain setChainPepperoni(boolean pepperoni) {
			this.setPepperoni(pepperoni);
			return this;
		}

		public PizzaChain setChainTomatoes(boolean tomatoes) {
			this.setTomatoes(tomatoes);
			return this;
		}
	
}
