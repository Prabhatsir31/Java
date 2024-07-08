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
    
    
    static void midl() // middle part of L
    {
    	for(l=1;l<=5;l++)
        {
        	if(i<9 && i<=11)
            {
            	System.out.printf("**");
            }
            else
            {
            	System.out.printf("  ");
            }
        }
    }
    
    
    static void midv() //middle part of V
    {
    	for(j=10;j>=i;j--)
        {
        	System.out.printf("  ");
        }
    }
    
    
    static void mido() //creates O
    {
    	for(k=0;k<=2;k++)
        {
        	if(i==0 && k<2 || i==1 && k<1 || i==11 && k<2 || i==10 && k<1)
            {
            	System.out.printf(" ");
            }
            else
            {
            	System.out.printf("*");
            }
        }
        
        for(l=1;l<=6;l++)
        {
        	if(i>=0 && i<2 || i>9 && i<=11)
            {
            	System.out.printf("**");
            }
            else
            {
            	System.out.printf("  "); //two spaces
            }
        }
        
        for(k=0;k<=2;k++)
        {
        	if(i==0 && k>0 || i==1 && k>1 || i==11 && k>0 || i==10 && k>1)
            {
            	System.out.printf(" ");
            }
            else
            {
            	System.out.printf("*"); 
            }
        }
    }
    
    
    
    static void midp() //middle part of P
    {
    	for(l=1;l<=5;l++)
        {
        	if(i>=0 && i<2 || i>4 && i<7 || i>=2 && i<=4 && l==5)
            {
            	System.out.printf("**");
            }
            else
            {
            	System.out.printf("  ");
            }
        }
    }
    
    
    
    static void spq() //creates Q
    {
    	for(l=0;l<=11;l++)
        {
        	if(i>=0 && i<2 && l<9 || i>=2 && i<9 && l==0 || l==8 && i<10 || i>7 && i<=9 && l<9 || i>=9 && i<=11 && l==i)
            {
            	System.out.printf("**");
            }
            else 
            {
            	System.out.printf("  ");//two spaces
            }
        }
    }
    
    
  
    static void midr() //middle part of R
    {
    	for(l=1;l<=5;l++)
        {
        	if(i>=0 && i<2 || i>4 && i<7 || i>=2 && i<=4 && l==5 || i>=7 && i<=11 && l==c4)
            {
            	System.out.printf("**");
            }
            else
            {
            	System.out.printf("  ");
            }
        }
        
        if(i>6)
        {
        	c4++;
        }
        else
        {
        	c4=1;
        }
    }
    
    
    
    static void sps() //creates S
    {
    	for(l=1;l<=8;l++)
        {
        	if(i>=0 && i<2 || i>4 && i<7 || i>=2 && i<=4 && l==1 || i>6 && i<=9 && l==8 || i>9 && i<=11)
            {
            	System.out.printf("**");
            }
            else
            {
            	System.out.printf("  ");
            }
        }
    }
    
    
    static void spt() // creates T
    {
    	for(l=0;l<=6;l++)
        {
        	if(i>=0 && i<2 || i>=2 && i<=11 && l==3)
            {
            	System.out.printf("***");
            }
            else
            {
            	System.out.printf("   ");
            }
        }
    }
    
    static void midu() // middle part of U
    {
    	for(l=1;l<=6;l++)
        {
        	if(i>9 && i<=11)
            {
            	System.out.printf("**");
            }
            else
            {
            	System.out.printf("  ");
            }
        }
    }
    
    
    static void midw() //middle part of W
    {
    	for(j=1;j<=i;j++)
        {
        	System.out.printf("  ");
        }
    }
    
    static void spx() // creates X
    {
    	for(l=0;l<=11;l++)
        {
        	if(l==c || l==c1)
            {
            	System.out.printf("***");
            }
            else
            {
            	System.out.printf("  ");
            }
        }
        
        if(i<=4)
        {
        	c++;
            c1--;
        }
        else if(i<=11)
        {
        	c1++;
            c--;
        }
    }
    
    
    static void spy() // creates Y
    {
    	for(l=0;l<=11;l++)
        {
        	if(l==c2 || l==c3 && i<5)
            {
            	System.out.printf("***");
            }
            else
            {
            	System.out.printf("  ");
            }
        }
        
        if(i<=4)
        {
        	c2++;
            c3--;
        }
        else if(i<=11)
        {
        	c3++;
        }
        if(i>=5)
        {
        	System.out.printf(" ");
        }
    }
    
    
    static void spz() // creates Z
    {
    	for(l=0;l<=11;l++)
        {
        	if(i>=0 && i<2 || i>9 && i<=11 || i>=2 && i<=9 && l==c4)
            {
            	System.out.printf("**");
            }
            else
            {
            	System.out.printf("  ");
            }
        }
        c4=c4-1;
    }
    
    
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
        c=1;c1=10;c2=1;c3=10;c4=11;
        String aa;
        System.out.print("----------------\n(-: By SMB Corporation  :-)\n------------------\n");
        System.out.print("Enter Name [In Lower Case]: ");
        aa=sc.nextLine();
        char[] cc=aa.toCharArray();
        System.out.print("\n");
        for(i=0;i<=11;i++)
        {
        	for(a=0;a<cc.length;a++)
            {
            	if(cc[a]=='a')
                {
    				crosstr();line();mida();line();crosstl();gap();            	
                }
                else if(cc[a]=='b')
                {
                	line();midb();gap();
                }
                else if(cc[a]=='c')
                {
                	line();midc();gap();
                }
                else if(cc[a]=='d')
                {
                	line();midd();gap();
                }
                else if(cc[a]=='e')
                {
                	line();mide();gap();
                }
				else if(cc[a]=='f')
                {
                	line();midf();gap();
                }
                else if(cc[a]=='g')
                {
                	line();midg();gap();
                }
                else if(cc[a]=='h')
                {
                	line();midh();line();gap();
                }
                else if(cc[a]=='i')
                {
                	spi();gap();
                }
                else if(cc[a]=='j')
                {
                	spj();gap();
                }
                else if(cc[a]=='k')
                {
                	line();midk();gap();
                }
                else if(cc[a]=='l')
                {
                	line();midl();gap();
                }
                else if(cc[a]=='m')
                {
                	line();crossbr();line();midv();line();crossbl();line();gap();
                }
                else if(cc[a]=='n')
                {
                	line();crossbr();line();crosstl();line();gap();
                }
                else if(cc[a]=='o')
                {
                	mido();gap();
                }
                else if(cc[a]=='p')
                {
                	line();midp();gap();
                }
                else if(cc[a]=='q')
                {
                	spq();gap();
                }
                else if(cc[a]=='r')
                {
                	line();midr();gap();
                }
                else if(cc[a]=='s')
                {
                	sps();gap();
                }
                else if(cc[a]=='t')
                {
                	spt();gap();
                }
                else if(cc[a]=='u')
                {
                	line();midu();line();gap();
                }
                else if(cc[a]=='v')
                {
                	crossbr();line();midv();line();crossbl();gap();
                }
                else if(cc[a]=='w')
                {
                	line();crosstr();line();midw();line();crosstl();line();gap();
                }
                else if(cc[a]=='x')
                {
                	spx();gap();
                }
                else if(cc[a]=='y')
                {
                	spy();gap();
                }
                else if(cc[a]=='z')
                {
                	spz();gap();
                }
                else if(cc[a]==' ')
                {
                	gap();gap();
                }
            }
            System.out.print("\n");
        }
        
        System.out.println("\n\n-----------------------------------------------------\nLooping Sucessfull \n");
        java1.main(args);// calling main function
    }    
    
}    






    
