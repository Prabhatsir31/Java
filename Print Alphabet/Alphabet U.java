class U {
  public static void main(String[] args) {
    int i,j;
    for(i=0;i<=11;i++)   
      {
        for(j=0;j<=6;j++)
          {
            if(i>=0 && i<2 || i>=2 && i<=11 && j==3)
            {
              System.out.printf("***");
            }
            else
            {
              System.out.printf("  "); // two spaces
            }
          }
        System.out.printf("\n");
      }
  }
}
