class Q {
  public static void main(String[] args) {
    int i,j;
    for(i=0;i<=11;i++)   
      {
        for(j=0;j<=11;j++)
          {
            if(i>=0 && i<2 && j<9 || i>=2 && i<9 && j==0 || j==8 && i<10 || i>7 && i<=9 && j<9 || i>=9 && i<=11 && j==i)
              {
               System.out.printf("**");
              }
            else
            {
              System.out.printf("  ");
            }
          }
          System.out.printf("\n");
      }
  }
}





