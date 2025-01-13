public class Practical4 {
	public static void main(String[] args) {
		// try Methods here
	}
	
	static int getByte(int num) {
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

	static int getShort(int num) {
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
	
	static int getNumber(int num, String type) {
		switch(type.trim().toLowerCase()) {
			case "byte":
				return getByte(num);
			case "short":
				return getShort(num);
			default :
				return num;
		}
	}

	static String toXXString(String num, String XX) {
             num = num.toLowerCase();
             int base;
             if(num.startsWith("0b") || num.startsWith("0B")) {
                 base = 2;
             }else if(num.matches("^0[xX]?[0-9a-fA-F]+$")) {
                 base = 16;
             }else if(num.startsWith("0o") || num.startsWith("0")) {
                 base = 8;
             } else {
                 base = 10;
             }
             if(num.startsWith("0x") || num.startsWith("0b") || num.startsWith("0o") ) {
                 num = num.substring(2);
             }

             int decimal = converttoDecimal(num, base);
        
             switch(XX.toLowerCase()) {
                case "b": return convertDecimaltoXX(decimal, 2);
                case "o": return convertDecimaltoXX(decimal, 8);
                case "h": return convertDecimaltoXX(decimal, 16);
                default : return convertDecimaltoXX(decimal, 10); }
        }

	static String convertDecimaltoXX(int num, int base) {
		String xx = "";
		while(num > 0) {
			int remainder = num % base;
			String s = ""; 
			if(remainder >= 10) {
				int val = 97 + remainder - 10;
				s = Character.toString(val);
			} else {
				s = String.valueOf(remainder);
			}
			xx = s + xx;

			num /= base;
		}
		return xx;
	}


	static int converttoDecimal(String num, int base) {
		int decimal = 0;
		for(int i = 0; i < num.length(); i++) {
			char character = num.charAt(i);
			int value = 0 ;
			if(character >= '0' && character  <= '9') {
				value = character - '0';
			} else if(character >= 'A' && character <= 'F') {
				value = character - 'A' + 10;
			} else if(character >= 'a' && character <= 'f') {
				value = character - 'a' + 10;
			} 
			decimal = decimal*base + value;
		}
		return decimal;
		
	}


}                     
