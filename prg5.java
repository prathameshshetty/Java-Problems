class NoVowelException extends Exception{
    public NoVowelException(String message)
    {
        super(message);
    }
}
public class prg5 {
    public static void checkVowel(String input) throws NoVowelException{

        // boolean flag=false;
        // for(int i=0;i<input.length();i++)
        // {
        //     char ch=input.charAt(i);
        //     if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
        //     {
        //         flag=true;
        //     }
        // }

        if(!input.matches(".*[AEIOUaeiou].*"))
        {
            throw new NoVowelException("Error: No Vowels here!!");
        }
        else{
            System.out.println("Contains Vowels");
        }
    }


    public static void main(String args[])
    {
        String test1="AIET";
        String test2="NTP";
        try{
            checkVowel(test2);
        }catch(NoVowelException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
