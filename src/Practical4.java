public class Practical4 {
	public static void main(String[] args) {
		// try Methods here		
	}
	
	public static int getByte(int num) {
		int rem = num % 256;
		if(rem > 0) {
			if(rem > 127) {
				return rem - 256;
			}
			return rem;
		}

		if(rem < -128) {
			return rem + 256;
		}
		return rem;
	}

	public static int getShort(int num) {
		int remainder = num % 65536;
		if(remainder > 0) {
			if(remainder > 32767) {
				return remainder - 65536;
			}
			return remainder;
		}
		if(remainder < -32768) {
			return remainder + 65536;
		}
		return remainder;
	}
	
	public static int getNumber(int num, String type) {
		switch(type.trim().toLowerCase()) {
			case "byte":
				return getByte(num);
			case "short":
				return getShort(num);
			default :
				return num;
		}
	}

	public static String toXXString(String num, String XX) {
             num = num.toLowerCase();
             int givenRadix;
             if(num.startsWith("0b") || num.startsWith("0B")) {
                 givenRadix = 2;
             }else if(num.matches("^0[xX]?[0-9a-fA-F]+$")) {
                 givenRadix = 16;
             }else if(num.startsWith("0o") || num.startsWith("0")) {
                 givenRadix = 8;
             } else {
                 givenRadix = 10;
             }
             if(num.startsWith("0x") || num.startsWith("0b") || num.startsWith("0o") ) {
                 num = num.substring(2);
             }

             Integer i = Integer.parseInt(num, givenRadix);
        
             switch(XX.toLowerCase()) {
                case "b": return getBinary(i);
                case "o": return getOctal(i);
                case "h": return getHexadecimal(i);
                default : return getDecimal(i); }
        }

        public static String getBinary(Integer i) {
                return Integer.toBinaryString(i);
        }
            
        public static String getHexadecimal(Integer i) {
                 return Integer.toHexString(i);
        }
        
        public static String getOctal(Integer i) {
                return Integer.toOctalString(i);
       	}

        public static String getDecimal(Integer i) {
                return i.toString();
        }

}
