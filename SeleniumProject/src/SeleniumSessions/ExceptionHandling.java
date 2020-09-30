package SeleniumSessions;

public class ExceptionHandling {

	public static void main(String[] args) {
	
		//1. try- catch block:
		try {			
		int i = 9/0;
		System.out.println(i);
		} catch(Exception e) {
		System.out.println(e.getMessage());
		}
		System.out.println("ABC");
				
		//2. Throwable:
		try {
		int i = 9/0;
		System.out.println(i);
		} catch(Throwable e) {
		//e.printStackTrace();
		System.out.println(e.getMessage());
		}
		System.out.println("ABC");
		System.out.println("DEF");
		
         //3.Throw : used to create Exception delibrately
		try {
		throw new Exception("suchen personal exception");
		} catch(Exception e) {
		e.printStackTrace();
		}
		System.out.println("ABC");
		
        //Real world Example
		String Excec_flag = " ";
		if(Excec_flag.equals(" ")) {
			try {
				throw new Exception("Exec flag is Blank Exception");
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	
		
	}

}
