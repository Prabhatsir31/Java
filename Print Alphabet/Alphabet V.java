class V {
  public static void main(String[] args) {
    int i, j, k, l;
    for(i = 0; i <= 11; i++) 
    {
      for(j = 1; j <= i; j++) 
      {
        System.out.print(" "); // one space
      }
      
      for(l = 1; l <= 3; l++) 
      {
        System.out.print("*");
      }
      
      for(k = 10; k >= i; k--) 
      {
        System.out.print("  "); // two spaces
      }
      
      for(l = 1; l <= 3; l++) 
      {
        System.out.print("*");
      }
      
      System.out.print("\n");
    }
  }
}
