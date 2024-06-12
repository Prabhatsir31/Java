class U {
  public static void main(String[] args) {
    int i, j, k, l;
    for(i = 0; i <= 11; i++) 
    {
      for(j = 0; j <= 2; j++) 
      {
        System.out.print("*");
      }
      
      for(k = 1; k <= 6; k++) 
      {
        if(i > 9 && i <= 11) 
        {
          System.out.print("**");
        } 
        else 
        {
          System.out.print("  "); //two spaces
        }
      }
      
      for(l = 0; l <= 2; l++) 
      {
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}
