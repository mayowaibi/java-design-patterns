package bridge;

public class DbCRUDImplementation<ID, DATA> 
           implements CRUDImplementor<ID, DATA>{
	
	// private dbInstance = ...
	
	public DbCRUDImplementation(String URL, String username,
			String password) {
		// generate dbInstance ...
	}

	@Override
	public void postResource(DATA record, ID idInfo) {
		throw new UnsupportedOperationException("TODO");	
	}

	@Override
	public DATA getResource(ID idInfo) {
		throw new UnsupportedOperationException("TODO");
	}

	@Override
	public void putResource(DATA record, ID idInfo) {
		throw new UnsupportedOperationException("TODO");	
	}

	@Override
	public void deleteResource(ID idInfo) {
		throw new UnsupportedOperationException("Method not supported");	
	}
	
	

}
