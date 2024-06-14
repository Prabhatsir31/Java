class Z
  {
    public static void main(String[] args)
    {
      int i,j,c=11;
      for(i=0;i<=11;i++)
        {
          for(j=0;j<=11;j++)
            {
              if(i>=0 && i<2 || i>9 && i<=11 || i>=2 && i<=9 && j==c)
              {
                System.out.printf("***");      
              }
              else
              {
                System.out.printf("  ");
              }
            }
          c=c-1;
          System.out.printf("\n");
        }
    }
  }
