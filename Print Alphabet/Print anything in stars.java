import java.util.*;
import java.lang.*;
class anyname 
  {
    static int i,j,k,l,count=6,c=1,c1=10,c2=1,c3=10,c4=11,c5=0,c6=8,a=0;

    static void line() //create a line
    {
      for(k=0;k<=2;k++)
        {
          System.out.printf("*");
        }
    }


    static void gap() //create space
    {
      for(k=0;k<=2;k++)
        {
          System.out.printf(" ");
        }
    }


    static void crosstr() //cross triangle top (right)
    {
      for(j=10;j>=i;j--)
        {
          System.out.printf(" ");
        }
    }


    static void crosstl() //cross triangle (left)
    {
      for(j=10;j>=i;j--)
        {
          System.out.printf(" ");
        }
    }


    static void crossbr() //cross triangle bottom (right)
    {
      for(l=1;l<=i;l++)
        {
          System.out.printf(" ");
        }
    }


    static void crossbl() //cross triangle bottom (left)
    {
      for(j=1;j<=i;j++)
        {
          System.out.printf(" ");
        }
    }

  
	static void mida() //middle part of A
    {
      for(l=1;l<=i;l++)
        {
          if(i>4 && i<7)
          {
          	System.out.printf("**");
          }
          else
          {
          	System.out.printf("  ");
          }
        }
    }



	static void midb() //creates B
    {
      for(l=1;l<=5;l++)
        {
        	//middle body of B
          if(i>=0 && i<2 || i>4 && i<7 || i>9 && i<=11)
          {
          	System.out.printf("**");
          }
          else
          {
          	System.out.printf("  "); // two spaces
          }
        }
        
        for(k=0;k<=2;k++)
        {
        	// copy the if else of above loop
            if(i>=0 && i<2 || i>4 && i<7 || i>9 && i<=11)
            {
            	System.out.printf(" ");// one space
            }
            else
            {
            	System.out.printf("*");
            }
        }
    }

	
    static void midc() //middle part of C
    {
    	for(l=1;l<=5;l++)
        {
        	if(i>=0 && i<2 || i>9 && i<=11)
            {
            	System.out.printf("**");
            }
            else
            {
            	System.out.printf("  ");
            }
        }
    }

	
    static void midh() // middle part of H
    {
    	for(l=1;l<=5;l++)
        {
        	if(i>4 && i<7)
            {
            	System.out.printf("**");
            }
            else 
            {
            	System.out.printf("  ");
            }
        }
    }



	static void mide() //middle part of E
    {
    	for(l=1;l<=5;l++)
        {
        	if(i>=0 && i<2 || i>4 && i<7 || i>9 && i<=11)
            {
            	System.out.printf("**");
            }
            else
            {
            	System.out.printf("  ");
            }
        }
    }


	static void midd() //creates D
    {
    	for(l=1;l<=5;l++)
        {
        	if(i>=0 && i<2 || i>9 && i<=11 || l==5)
            {
            	System.out.printf("**");
            }
            else
            {
            	System.out.printf("  "); //two spaces
            }
        }
        for(k=0;k<2;k++)
        {
        	if(i>=0 && i<2 || i>9 && i<=11)
            {
            	System.out.printf(" ");//one spaces
            }
            else
            {
            	System.out.printf("*");
            }
        }
    }

 	
    
    static void midf() // middle part of F
    {
    	for(l=1;l<=5;l++)
        {
        	if(i>=0 && i<2 || i>4 && i<7)
            {
            	System.out.printf("**");
            }
            else
            {
            	System.out.printf("  ");
            }
        }
    }
    
    
    static void midg() //middle part of G
    {
    	for(l=1;l<=5;l++)
        {
        	if(i>=0 && i<2 || i>4 && i<7 && l>=3 && l<=5 || i>=6 && i<=9 && l==5 || i>9 && i<=11)
            {
            	System.out.printf("**");
            }
            else
            {
            	System.out.printf("  ");
            }
        }
    }
        
       
    static void spi() //creates I
    {
    	for(l=0;l<=6;l++)
        {
        	if(i>=0 && i<2 || i>=2 && i<=9 && l==3 || i>9 && i<=11)
            {
            	System.out.printf("***");
            }
            else
            {
            	System.out.printf("   ");
            }
        }
    }
    
    
    static void spj() //creates J
    {
    	for(l=0;l<=6;l++)
        {
        	if(i>=0 && i<2 || i>=2 && i<=9 && l==3 || i>=7 && i<=9 && l==0 || i>9 && i<=11 && l<=3)
            {
            	System.out.printf("***");
            }
            else
            {
            	System.out.printf("   ");
            }
        } 
    }
    
    
    
    static void midk() //middle of k
    {
    	for(l=0;l<=6;l++)
        {
        	if(l==count)
            {
            	System.out.printf("***");
            }
            else
            {
            	System.out.printf("   ");
            }
        }
        
        if(i<=5)
        {
        	count--;
        }
        else if(i<=11)
        {
        	count++;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	}        
    
    
    
   
