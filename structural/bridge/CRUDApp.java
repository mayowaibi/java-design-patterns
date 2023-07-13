package bridge;

public class CRUDApp {

	public static void main(String[] args) {
		
		CRUDImplementor<String, Student> memImp =
		    new MemoryCRUDImplementation<>();
		CRUDImplementor<String, Student> dbImp =
			    new DbCRUDImplementation<>("localhost", "user",
			    		"123456");
		CRUDInterface<String, Student> crudAPI =
				new CRUDImplementation<>(memImp);
		
		String s1ID = "123";
		Student s1 = new Student(s1ID, "ilir", "dema");
		crudAPI.create(s1, s1ID); // save in memory
		
		// we are able to switch to a different implementation at runtime
		crudAPI.setImp(dbImp);
		crudAPI.create(s1, s1ID); // save in database

	}

}
