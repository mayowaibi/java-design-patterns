package bridge;

public interface CRUDInterface<ID, DATA> {
	
	void create(DATA record, ID idInfo);
	DATA read(ID idInfo);
	void update(DATA record, ID idInfo);
	void delete(ID idInfo);
	void setImp(CRUDImplementor<ID, DATA> imp);

}
