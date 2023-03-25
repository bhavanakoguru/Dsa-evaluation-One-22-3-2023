class AmstrongNumber
{
    public static void main(String[] args) 
    {
        int num =153;
        int armstrong=0;
        
        String str= "" + num;
        
        for (int i =0;i <str.length(); i++ )
        {
            int y= str.charAt(i) - '0';
            armstrong+= java.lang.Math.pow(y,str.length()); 
        }
        
        if(num == armstrong)
        {
            System.out.println("armstrong Number");
        }
        else
        {
            System.out.println("Not an Armstrong Number");
        }
    }
}
