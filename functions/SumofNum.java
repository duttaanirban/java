import java.util.Scanner;
public class SumofNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // create scanner object
        System.out.print("Enter the first number: ");
        int num1=sc.nextInt();
        //this method reads value for num1 providing by user
        System.out.print("Enter the second number: ");
        int num2=sc.nextInt();
        //this method reads value for num2 providing by user
        sc.close();//closing the scanner class
        sumNum(num1,num2); //calling the method
        }
        //sum method
        public static void sumNum(int num_A,int num_B){
        int sum=0;
        sum=num_A+num_B;
        System.out.println("Sum of two numbers  "+sum);
        }
}
