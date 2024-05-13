class F {
  public static void main(String[] args) {
    int i,j,k;
    for(i=0;i<=11;i++)
      {
        for(j=0;j<2;j++)
          {
            System.out.print("*");
          }
        for(k=1;k<=5;k++)
          {
            if(i>=0 && i<2 || i>4 && i<7 && k>=3 && k<=5 || i>=6 && i<=9 && k==5 || i>9 && i<=11)
            {
              System.out.printf("**");
            }
            else
            {
              System.out.print("  "); //Two Spaces
            }
          }
          System.out.println("\n");
      }
  }
}

