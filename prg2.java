public class prg2 {

    
    public static void main(String args[])
    {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);

        while(b!=0)
        {
            int carry=a&b;
            a=a^b;
            b=carry<<1;
        }
        System.out.println(a);
        
    }
}
