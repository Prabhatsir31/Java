public class A {
public static void main(String[] args) {
{
int i, j, k, l;

for(i=0;i (smaller then) =11;i++)//here is mistake change 1  as 11
{
 
for(j=10;j (greater than) =i;j--)
{
 System.out.println(" ");//add space between " "
}

for(k=0;k (smaller than) =2;k++)
{
System.out.println("*"); 
}

for(l=1;l (smaller than) =i;l++)
{
 //this is the middle portion of character ' A '
 
if(i (greater than) 4 && i (smaller than) 7)
 {
  System.out.println("**");
 }
 else
 {
  System.out.println("  ");//add two space  
 }
 
}

for(k=0;k (smaller than) =2;k++)
{
System.out.println("*"); 
}

//this loop is optional

for(j=10;j (greater than) =i;j--)
{
System.out.println(" ");//add space here 
}


System.out.println("\n");
}
}


}
}