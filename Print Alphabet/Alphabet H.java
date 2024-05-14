class H {
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
            if(i>4 && i<7)
            {
              System.out.print("**");
            }
            else
            {
              System.out.print("  "); //Two Spaces
            }
          }
        for(j=0;j<2;j++)
          {
            System.out.print("*");
          }
        System.out.print("\n");
      }
  }
}

