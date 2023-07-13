package bridge;

import java.util.HashMap;
import java.util.Map;

public class MemoryCRUDImplementation<ID, DATA> 
						implements CRUDImplementor<ID, DATA> {
	
	private Map<ID, DATA> dataStore;
	
	public MemoryCRUDImplementation() {
		this.dataStore = new HashMap<ID, DATA>();
	}

	@Override
	public void postResource(DATA record, ID idInfo) {
		this.dataStore.put(idInfo, record);
	}

	@Override
	public DATA getResource(ID idInfo) {
		return dataStore.getOrDefault(idInfo, null);
	}

	@Override
	public void putResource(DATA record, ID idInfo) {
		this.dataStore.put(idInfo, record);
		
	}

	@Override
	public void deleteResource(ID idInfo) {
		this.dataStore.remove(idInfo);
	}
	
	

}
