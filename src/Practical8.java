public class Practical8 {
    public static void main(String[] args) {
        // pattern1(5, 1);
        // pattern2(5, 1);
        // pattern3(8, 1);
        //  pattern4(6, 1);
    }
    
    static void printStars(int size, char c) {
        if(size == 0) {
            return;
        }
        System.out.print(c);
        printStars(size - 1, c);
    }

    static void pattern1(int size, int row) {
        if(row > size+1) {
            return;
        }
        printStars(row, '*');
        System.out.println("");
        pattern1(size, row + 1);
        printStars(row-1, '*');
        System.out.println("");

    }

    static void pattern2(int size, int row) {
        if(row >= size + 1) {
            printStars(row, '+');
            System.out.println("");
            return;
        }
        printStars(size - row + 1, ' ');
        printStars(row, '*');
        System.out.println("");
        pattern2(size, row + 1);
        printStars(size - row + 1, ' ');
        printStars(row , '/');
        System.out.println("");

    }

    static void pattern3(int size, int row) {
        if(row > size) {
            return;
        }

        if(size%2==1) {
            if(row <= size/2+1) {
                printStars((size/2+1) - row, ' ');
                printStars(2*row-1, '*');
                System.out.println("");
            } else if(row > size/2+1) {
                printStars((row - size/2 - 1), ' ');
                printStars(2*(size - row +1)-1, '*');
                System.out.println("");
    
            }
        } else {
            if(row <= size/2) {
                printStars((size/2) - row, ' ');
                printStars(2*row-1, '*');
                System.out.println("");
            } else if(row > size/2) {
                printStars((row - size/2 - 1), ' ');
                printStars(2*(size - row +1)-1, '*');
                System.out.println("");
                
            }
            
        }
        pattern3(size, row+1);
        if(size % 2 == 1) {
            printStars(size/2, ' ');
        }
        else {
            printStars(size/2 - 1, ' ');
        }
        System.out.println("+");
    }

    static void pattern4(int size, int row) {
        if(row == size) {
            return;
        }
        printStars(size - 1- row,' ');
        if(row%2 == 0) {
            printStars(2*row-1, '/');
        } else {
            printStars(2*row-1, '*');
        }
        System.out.println("");
        pattern4(size, row+1);
        printStars(size - row-1, ' ');
        if(row%2 == 0) {
            printStars(2*row-1, '*');
        } else {
            printStars(2*row-1, '/');
        }
        System.out.println("");
    }

}
