package OracleMysqlInterface;

public class Test {

	public static void main(String[] args) {
		
		Connection con=new Mysql();
			
			con.commit();
		    con.rollback();
		    
       Connection con1=new Oracle();			
			con1.commit();
		    con1.rollback();
		
	}

}
