package bridge;

public interface CRUDImplementor<ID, DATA> {

	void postResource(DATA record, ID idInfo);
	DATA getResource(ID idInfo);
	void putResource(DATA record, ID idInfo);
	void deleteResource(ID idInfo);
}
