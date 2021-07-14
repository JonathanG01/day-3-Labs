
public class Ex07 {

	public static void main(String[] args) {
		boolean b = true;
		
		  if (b){  
			  System.out.println("inside the if-statement");  
			   }  
			  
			   System.out.println("Outside of the if-statement");  
			 }  
	//second part of lab
	boolean firstCondition = false; 
    boolean secondCondition = true;//not sure why this remains as an error

    if (firstCondition){
      System.out.println("inside the if-statement");

      if (secondCondition){
        System.out.println("inside the nested if-statement");
      }
    }else if (secondCondition){
      System.out.println(5);
    }else {
      System.out.println("inside the else-statement");
    }

    System.out.println("Outside of the if-statement");

}
}
