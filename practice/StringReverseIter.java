

/**
 * Write a description of class StringReverseIter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringReverseIter
{
    /**
     * Default constructor for objects of class StringReverseIter
     */
    public static String reverse(String text)
    {
        if(text.length() <= 1)
        {
            return text;
        }
        String reverseText = "";
        for(int i = text.length() - 1; i >=0; i--)
        {
            char c = text.charAt(i);
            reverseText += c;
        }
        return reverseText;
    }
        
    public static void main(String[] args)
    {
        System.out.println(reverse("Martin and the Dragon!"));
    }
}
