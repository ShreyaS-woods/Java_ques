
import java.util.Scanner;
 publicclass Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number to check ");
    int n = sc.nextInt();
int temp = n;
int rev = 0;
while(n>0){
    int rem = n % 10 ;
    rev = rev*10 + rem;
    n=n/10;
} 
if (temp == rev){
    System.out.println("it is a palindrome number");
}
else{
    System.out.println("it is not the number");
   } 
  }
}

