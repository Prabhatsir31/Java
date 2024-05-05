import java.util.Scanner;
class prime{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);

System.out.print("Enter any Number an integer:");
int number = input.nextInt();
int flag=0;
 for(int i=2;i<=number/2;i++)
   {
    if(number%i==0){
     flag=1;
     break;
     }
    }
    if(flag==0){
      System.out.println(number+"NUMBER IS PRIME");
    }
   else{
     System.out.println(number+"NUMBER IS NOT PRIME");
   }
 }
}
