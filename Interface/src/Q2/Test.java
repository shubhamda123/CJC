package Q2;

public class Test {

	public static void main(String[] args) {
	
		RBI r=new SBI();
		  int i= r.getRateOfinterest();
		  System.out.println("SBI rate of interest= "+i);
		    
		RBI r1=new ICICI();
		   int i1= r1.getRateOfinterest();
        System.out.println("ICICI rate of interest= "+i1);
		    
		RBI r2=new AXIS();
		  int i2= r2.getRateOfinterest();
		System.out.println("AXIS rate of interest= "+i2);
			
			

	}

}
