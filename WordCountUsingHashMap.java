//Q3:Write a Java Program to count the number of words in a string using HashMap.

import java.util.HashMap;
import java.util.Map;

public class WordCountUsingHashMap
{
    public static void main(String[] args)
    {
        String text = "i am vaishnavi kailas kale";
        Map<String, Integer> wordCountMap = countWords(text);
        System.out.println("Word count:");
        wordCountMap.forEach((word, count) -> System.out.println(word + " : " + count));
    }

    public static Map<String, Integer> countWords(String text)
    {
        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] words = text.split("\\s+");
        for (String word : words)
        {
            word = word.toLowerCase();
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        return wordCountMap;
    }
}
