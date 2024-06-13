class X
  {
    public static void main(String[] args)
    {
      int i,j,count1=1,count2=10;
      for(i=0;i<=11;i++)
        {
          for(j=0;j<=11;j++)
            {
              if(j==count1 || j==count2)
              {
                System.out.printf("***");
              }
              else
              {
                System.out.printf("  "); //two space
              }
            }
          if(i<=4)
          {
            count1++;
            count2--;
          }
          else if(i<=11)
          {
            count1--;
            count2++;
          }
          System.out.printf("\n");
        }
    }
  }
