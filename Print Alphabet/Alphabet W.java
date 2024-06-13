class W
  {
    public static void main(String[] args)
    {
      int i,j,k,l,m;
      for(i=0;i<=11;i++)
        {
          for(j=0;j<=2;j++)
            {
              System.out.printf("*");
            }
          for(k=10;k>=i;k--)
            {
              System.out.printf(" ");//single space
            }
          for(j=0;j<=2;j++)
            {
              System.out.printf("*");
            }
          for(l=1;l<=i;l++)
            {
              System.out.printf("  ");//two space
            }
           for(j=0;j<=2;j++)
            {
              System.out.printf("*");
            }
          for(k=10;k>=i;k--)
            {
              System.out.printf(" ");//single space
            }
          for(j=0;j<=2;j++)
            {
              System.out.printf("*");
            }
          System.out.printf("\n");
        }
    }
  }
