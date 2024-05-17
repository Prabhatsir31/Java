class N {
  public static void main(String[] args) {
    int i,j,k,l;
    for(i=0;i<=11;i++)
      {
        for(j=0;j<=2;j++)
          {
            System.out.printf("*");
          }
         for(k=1;k<=i;k++)
           {
             System.out.printf(" ");
           }
          for(j=0;j<=2;j++)
            {
              System.out.printf("*");
            }
          for(l=10;l>=i;l--)
            {
              System.out.printf(" ");
            }
          for(j=0;j<=2;j++)
            {
              System.out.printf("*");
            }
        System.out.printf("\n");
      }
  }
}


