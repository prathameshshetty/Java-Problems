


public class prg3 {

    public static void checkEven(int num)  throws Exception
    {
        
        if(num%2==0)
        {
            throw new Exception("This is error huys");
        }
        else{
            System.out.println("Number is odd");
        }
    }
    public static void main(String[] args)
    {
        int num=5;
        try{
            checkEven(num);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
