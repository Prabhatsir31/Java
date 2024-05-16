public class Main {
  public static void main(String[] args) {
    int i,j,k,l,m;
    for(i=0;i<=11;i++)
      {
        for(j=0;j<=2;j++)
          {
            System.out.printf("*"); //line
          }
          for(k=1;k<=i;k++)
            {
              System.out.printf(" "); //bottom right
            }
          for(j=0;j<=2;j++)
            {
              System.out.printf("*"); //line
            }
            for(m=10;m>=i;m--)//middle portion
              {
                System.out.printf("  "); //two spaces
              }
            for(j=0;j<=2;j++)
              {
                System.out.printf("*"); //line
              }
            for(k=1;k<=i;k++)
              {
                System.out.printf("*"); //line
              }
            for(j=0;j<=2;j++)
              {
                System.out.printf("*"); //line
              }
        System.out.printf("\n");
      }
  }
}

