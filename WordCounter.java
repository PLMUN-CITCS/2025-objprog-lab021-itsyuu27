import java.util.Scanner;

public class WordCounter {

    public static String getSentenceInput()
    {
        Scanner input = new Scanner (System.in);
        String sentence;

        System.out.print("Enter a sentence: ");
        sentence = input.nextLine();

        return sentence;
    }

    public static int countWords(String sentece)
    {
        int wordCount = 0;
        String regex = "[,\\.\\s]";

        String[] wordArray = sentece.split(regex);

        if(sentece == null || sentece.isEmpty())
        {
            return 0;
        }

        for(int i = 0; i < wordArray.length; i++)
        {
            wordCount++;
        }

        return wordCount;
    }
    public static void main(String[] args)
    {
        for(int i = 0; i < 2; i++)
        {
            System.out.println("The sentence has " + countWords(getSentenceInput()) + " words.");
        }

    }    
}
