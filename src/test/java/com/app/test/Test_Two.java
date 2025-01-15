package com.app.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test_Two {
	
	public static List<List<String>> groupAnagrams(String[] arr) {
        Map<String, List<String>> anagramMap = new HashMap();

        for (String str : arr) {
            char[] charArray = str.toCharArray();
            // Sort the characters of the string
            java.util.Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            // Add the original string to the corresponding list in the map
            anagramMap.putIfAbsent(sortedStr, new ArrayList<>());
            anagramMap.get(sortedStr).add(str);
        }

        // Return the grouped anagrams as a list of lists
        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(arr);
        System.out.println(result);
    }

}
