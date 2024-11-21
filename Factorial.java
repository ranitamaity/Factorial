import java.util.Scanner;
public class Factorial {
   public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number: ");
   int number=sc.nextInt();
   long factorial=calculateFactorial(number);
   System.out.println("The factorial of" + number + "is: " + factorial);
}
public static long calculateFactorial(int num) {
    if (num<0) {
        System.out.println("Factorial is not defined for negative numbers.");
        return -1;
}
long result = 1;
for (int i=1;i<=num;i++) {
result *= i;
}
return result;
}
}