class Y
  {
    public static void main(String[] args)
    {
      int i,j,c1=1,c2=10;
      for(i=0;i<=11;i++)
        {
          for(j=0;j<=11;j++)
            {
              if(j==c1 || j==c2 && i<5)
              {
                System.out.printf("***");      
              }
              else
              {
                System.out.printf("  ");//two spaces
              }
            }
          if(i<=4)
          {
            c1++;
            c2--;
          }
          else if(i<=11)
          {
            c2++;
          }
          System.out.printf("\n");
        }
    }
  }
