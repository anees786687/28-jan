import java.util.Scanner;

public class swapnotemp {

    public static void main(String[] args){
        int x,y;

       //Scanner scan = new Scanner(System.in);

        //System.out.println("Enter first  number");
        x = Integer.parseInt(args[0]);
       
        //System.out.println("Enter second number");
        y = Integer.parseInt(args[1]);

        System.out.println("x is "+x+" y is "+y);
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("x is "+x+" y is "+y);


    }
    
}
