class A {
    public static void main(String[] args) {
    {
    int i, j, k, l;
    
    for(i=0;i<=11;i++)//here is mistake change 1  as 11
    {
     
        for(j=10;j>=i;j--)
        {
            System.out.printf(" ");//add space between " "
        }
    
        for(k=0;k<=2;k++)
        {
            System.out.printf("*"); 
        }
    
        for(l=1;l<=i;l++)
        {
        //this is the middle portion of character ' A '
        
        if(i>4 && i<7)
        {
            System.out.printf("**");
        }
        else
        {
            System.out.printf("  ");//add two space  
        }
        
    }
    
        for(k=0;k<=2;k++)
        {
            System.out.printf("*"); 
        }
    
        //this loop is optional
        
        for(j=10;j>=i;j--)
        {
            System.out.printf(" ");//add space here 
        }
    
    
    System.out.printf("\n");
    }
    }
}
} 
    
    
