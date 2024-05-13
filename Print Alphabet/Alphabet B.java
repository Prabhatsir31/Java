class B {
    public static void main(String[] args) {
        {
            int i,j,k;

            for(i=0;i<=11;i++)
            {

            for(j=0;j<=2;j++)
            {
            System.out.printf("*"); 
            }

            for(k=1;k<=5;k++)
            {
            //middle body of B
            if(i>=0 && i<2 || i>4 && i<7 || i>9 && i<=11)
            {
            System.out.printf("**");
            }
            else
            {
            System.out.printf("  ");//two Space
            }
            
            }

            //last line of B
            //copy the j loop

            for(j=0;j<=2;j++)
            {
            //delete & copy the if else of k loop
            if(i>=0 && i<2 || i>4 && i<7 || i>9 && i<=11)
            {
            System.out.printf(" ");//one space
            }
            else
            {
            System.out.printf("*");
            }
            }

            System.out.printf("\n"); 
            }
            //compile and run

            }
        }
    }
