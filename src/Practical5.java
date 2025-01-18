public class Practical5 {
	static int i = 0;
	public static void main(String[] args) {

	}

	// task1: Factorial
	// Using for loop
	static int factorial(int num) {
		if(num>=0) {
			if(num < 2) { 
				return 1;
			}
			int fact = 2;
			for(; 2 < num;) {
				fact= fact* num--;
			}
			return fact;
		}
	       	else {
			return -1;
		}
	}

	// Using while loop
	static int factorialW(int num) {
		if(num >= 0) {
			if(num < 2) {
				return 1;
			}
			int fact = 2;
			while(num > 2) {
				fact *= num--;
			}
			return fact;
		}
		else {
			return -1;
		}
	}

	// Using Recursion
	static int factorialR(int num) {
	       if(num >= 0) {
		       if(num < 2) {
			       return 1;
		       }
		       return num * factorialR(num -1);
	       } 
		else {
	 		return -1;
		}
	}	

	// Task 2:
	static int getSum(int [] arr) {
		if(i == arr.length) {
			i = 0;
			return 0;
		}
		int sum = arr[i++];
		return sum + getSum(arr);
	}

}
