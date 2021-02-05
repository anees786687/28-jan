import java.util.Scanner;

public class swapwtemp {
    public static void main(String[] args){
        int x,y,temp;
        //Scanner scan = new Scanner(System.in);
        //System.out.println("Enter two number x and y");
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);
        System.out.println("x is "+x+" y is "+y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("x is "+x+" y is "+y);
    }
}
