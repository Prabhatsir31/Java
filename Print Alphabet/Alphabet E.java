class E {
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
            if(i>=0 && i<2 || i>4 && i<7 || i>9 && i<=11)
            {
              System.out.print("**");
            }
            else
            {
              System.out.printf("  ");//Two Space
            }
          }
        System.out.println();
      }
  }
}
 
 
