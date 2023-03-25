class ReverseString{
    public static void main(String[] args) {
        
        String x="Bhavana";
        String bag="";
        for(int i=x.length()-1;i>=0;i--){
           bag=bag+x.charAt(i);
        }
        System.out.println(bag);
    }
}
