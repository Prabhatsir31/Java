class I {
  public static void main(String[] args) {
    int i,j,k;
    for(i=0;i<=11;i++)
      {
        for(j=0;j<=6;j++)
          {
            if(i>=0 && i<2 || i>=2 && i<=9 && j==3 || i>9 && i<=11)
            {
              System.out.print("***");
            }
            else
            {
              System.out.print("   "); //Three Spaces
            }
          }
        System.out.print("\n");
      }
  }
} 
