public class Main
{
    public static void main(String[] args) 
    {
        String  string = "BeezLabs is into Automation";
        int count = 0;
        //to count the character except space 
        for(int i=0;i<string.length();i++)
        {
            if(string.charAt(i)!=' ')
            count++;
        }
        System.out.println("Number of Characters: " + count);
    }
}