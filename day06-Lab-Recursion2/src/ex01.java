
public class ex01 {

	    public static void main(String[] args) {
	        //create some dummy data for our method
	        int input = 5;

	        ex01 eo = new ex01();

	        //call the method here
	        System.out.println(eo.factorial(input));
	    }

	    //create your first method here
	    public int factorial(int num) {
	        if (num <= 0) return 0;
	        if (num == 1) return 1;

	        return num * factorial(num-1);
	    }
	}

