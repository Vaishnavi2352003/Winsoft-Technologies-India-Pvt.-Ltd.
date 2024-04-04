//Q4:Write a Java Program to find the duplicate characters in a string.

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersFinder
{

    public static void main(String[] args)
    {
        String inputString = "vaishnavi kale";
        Map<Character, Integer> charCountMap = new HashMap<>();
        inputString.chars().forEach(c -> charCountMap.put((char)c, charCountMap.getOrDefault((char)c, 0) + 1));
        charCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }
}
