
public class Practical7{
	public static void main(String [] args) {
		
		int size = 5;
		for(int  i = 0 ; i < size+2; i++) {
			System.out.println(patternP(size, i) + patternR(size, i) + patternA(size, i) + patternS(size, i) + patternA(size, i) + patternD(size, i) );
		}
	
	}

	static String patternP(int size, int ln) {
	int rows = size+2;
	String ans = "";
	int i = ln;	  
   	for(int j = 0; j < size; j++) {
		       if(i == 0 && j == size - 1) {
			       ans += " ";
		       }
		       else if(i == 0 ) {
			       ans += "*";
		       }
		       else if(((j == 0) || (j == size - 1)) && (i < rows/2)) {
			     ans +="*";
		       }
		       else if( i == (rows/2) && j < size -1) {
			       ans += "*";
		       }else if(j == 0) {
			       ans += "*";
		       }else {
			       ans += " ";
		       }
	       }
	       ans += " ";
	return ans;

	}
	static String patternR(int size, int ln) {
	int rows = size+2;
        String ans = "";
        int i = ln;   
    	for(int j = 0; j < size; j++) {
                       if(i == 0 && j == size - 1) {
                              ans += " ";
                       }
                       else if(i == 0 ) {
			       ans += "*";
                       }
                       else if(((j == 0) || (j == size - 1)) && (i < rows/2)) {
                             ans += "*";
                       }
                       else if( i == (rows/2) && j < size -1) {
                             ans += "*";
                       }
		       else if(i > (rows/2) && i - j == rows/2) {
			       ans += "*"; 
		       }
		       else if(j == 0) {
			       ans += "*";
                       }else {
			       ans += " ";
                       }
               }
	       ans += " ";
	return ans;
}
	static String patternS(int size, int ln) {
		int rows = size + 2;
		String ans =  "";
		int i = ln;	
		for(int j = 0; j < size; j++) {
				if(i == 0 && j >= 1 && j < size - 1) {
					ans += "*";
				} else if(i == 1 && j == size - 1 || i == rows - 2 && j == 0) {
					ans += "*";				
				} 
				else if(i < rows/2 && j == 0 && i != 0) {
					ans += "*";
				} else if( i == rows/2 && j > 0 && j < size - 1) {
					ans += "*";
				}else if(i > rows/2 && j == size - 1 && i != rows-1) {
					ans += "*";
				}else if(i== rows - 1 && j < size - 1 && j!= size - 1 && j != 0) {
					ans += "*";
				}else {
					ans += " ";
				}
			}
		ans += " ";
		return ans;
	}

	static String patternA(int size, int ln) {
		String ans = "";
		int rows = size + 2;
		if(size % 2 == 0) size += 1;
		int i = ln;
			for(int j = 0; j < size; j++) {
				if(i == 0 && j == size/2) {
					ans+= "*";
				}else if( (i > 0 && (j == size/2-i) || (j == size/2 + i)) && i < rows / 2 ) {
				  ans += "*";
				} 
				else if(i == rows/2) {
					ans += "*";
				} else if((i > rows/2 )&& (j == 0 || j == size - 1) ) {
					ans += "*";
				} else {
					ans += " ";
				}
			}
			ans += " ";
		return ans;
	}

	static String patternD(int size, int ln) {
		String ans = "";
		int rows = size + 2;
		int i = ln;
			for(int j = 0; j < size; j++) {
				if(i == 0 && j < size - 2) {
					ans += "*";
				} else if(i > 0 && (j == size - 1 || j == 0) && i != rows-1) {
					ans += "*";

				} else if(i == rows - 1 && j < size - 2) {
					ans += "*";

				} else {
					ans += " ";
				}
			}
			ans += " ";
		return ans;
	}

}
