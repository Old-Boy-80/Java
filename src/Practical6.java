public class Practical6 {
        public static void main(String [] args) {
        }

        static void displayPattern1(int size) {
                for(int ln = 1; ln < 2*size; ln++) {
                        if(ln <=size) {
                                for(int space = size - ln; space > 0; space--) {
                                        System.out.print(" ");
                                }
                                for(int plus = 2*ln-1; plus > 0; plus--) {
                                        if(plus % 2 == 0) {
                                                System.out.print(" ");

                                        }
                                        else {
                                                System.out.print("+");
                                        }
                                }
                                System.out.println("");
                        }else {
                                for(int space = 1; space <=(ln-size);space++) {
                                       System.out.print(" ");
                                }
                                for(int stars = 2*(size-(ln-size))-1; stars > 0; stars--) {
                                        if(stars % 2 == 0) {
                                                System.out.print(" ");
                                        }
                                        else {
                                                System.out.print("*");
                                        }
                                }
                                System.out.println("");
                        }
                }
        }

        static void displayPattern2(int size) {
                for(int ln = 1; ln < 2*size; ln++) {
                        if(ln <=size) {
                                for(int space = size - ln; space > 0; space--) {
                                        System.out.print(" ");
                                }
                                for(int plus = 2*ln-1; plus > 0; plus--) {
                                                System.out.print("+");
                                }
                                System.out.println("");
                        }else {
                                for(int space = 1; space <=(ln-size);space++) {
                                       System.out.print(" ");
                                }
                                for(int stars = 2*(size-(ln-size))-1; stars > 0; stars--) {
                                                System.out.print("+");
                                }
                                System.out.println("");
                        }
                }
        }

        static void displayPattern3(int size) {
                for(int ln = 1; ln <= 2*size; ln++) {
                        if(ln <=size) {
                                for(int space = size - ln; space > 0; space--) {
                                        System.out.print(" ");
                                }
                                for(int plus = 2*ln-1; plus > 0; plus--) {
                                        if((ln+plus) % 2 == 0) {
                                                System.out.print("*");

                                        }
                                        else {
                                                System.out.print("+");
                                        }
                                }
                                System.out.println("");
                        }else {
                                for(int space = 1; space <(ln-size);space++) {
                                       System.out.print(" ");
                                }
                                for(int stars = 2*(size-(ln-size)+1)-1; stars > 0; stars--) {
                                        if((ln+stars) % 2 == 0) {
                                                System.out.print("*");
                                        }
                                        else {
                                                System.out.print("+");
                                        }
                                }
                                System.out.println("");
                        }
                }
        }


}

