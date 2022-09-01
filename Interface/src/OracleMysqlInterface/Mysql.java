package OracleMysqlInterface;

public class Mysql implements Connection{

	
	public void commit() {
		System.out.println("commit--MySQL");
		
	}

	
	public void rollback() {
	System.out.println("rollback--Mysql");
		
	}
	
	

}
