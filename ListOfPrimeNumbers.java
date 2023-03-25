class ListOfPrimeNumbers
{
    public static void main(String[] args) 
    {
        int limit = 10;
        String  bag="";
        for (int i =0; i <= limit; i++)
        {
            if(i %2 !=0 && i %3 !=0 && i %5 !=0)
            {
                bag=bag+i;
            }
            else if(i ==2 || i == 3 || i == 5)
            {
                bag=bag+i;
            }
        }
        System.out.println(bag);
      }
 }
