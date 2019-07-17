import java.util.Scanner;


public class MyMath {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input First Number: ");

        int num1 = in.nextInt();

        System.out.print("Input Second Number: ");

        int num2 = in.nextInt();

        

        int answer = AddNums(num1, num2);

        System.out.println(answer);

        int answer2 = SubNums(num1, num2);

        System.out.println(answer2);

        
    }
        static int AddNums(int x, int y) {
            return x + y;
      }

        static int SubNums(int x, int y) {
            return x -  y;
      }

      
    
    
    


    
}