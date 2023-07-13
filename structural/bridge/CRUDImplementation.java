package bridge;

public class CRUDImplementation<ID, DATA> 
              implements CRUDInterface<ID, DATA>{

	private CRUDImplementor<ID, DATA> imp;
	
	public CRUDImplementation(CRUDImplementor<ID, DATA> imp) {
		this.imp = imp;
	}
	
	public void setImp(CRUDImplementor<ID, DATA> imp) {
		this.imp = imp;
	}
	
	@Override
	public void create(DATA record, ID idInfo) {
		// TODO Auto-generated method stub
		imp.postResource(record, idInfo);
	}

	@Override
	public DATA read(ID idInfo) {
		// TODO Auto-generated method stub
		return imp.getResource(idInfo);
	}

	@Override
	public void update(DATA record, ID idInfo) {
		// TODO Auto-generated method stub
		imp.putResource(record, idInfo);
	}

	@Override
	public void delete(ID idInfo) {
		// TODO Auto-generated method stub
		imp.deleteResource(idInfo);
	}
	

}
