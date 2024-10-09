package org.example;

// Fig. 17.12: ArraysAndStreams2.java
// Demonstrating lambdas and streams with an array of Strings.
import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysAndStreams2 {
   public static void main(String[] args) {
      String[] strings = 
         {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};

      // display original strings
      System.out.printf("Original strings: %s%n", Arrays.asList(strings));
/*
      // strings in uppercase
      System.out.printf("strings in uppercase: %s%n",
         Arrays.stream(strings)             
               .map(String::toUpperCase)   
               .collect(Collectors.toList()));

      // strings less than "n" (case insensitive) sorted ascending
      System.out.printf("strings less than n sorted ascending: %s%n",
         Arrays.stream(strings)                            
               .filter(s -> s.compareToIgnoreCase("n") < 0)
               .sorted(String.CASE_INSENSITIVE_ORDER)
               .collect(Collectors.toList()));             

      // strings less than "n" (case insensitive) sorted descending
      System.out.printf("strings less than n sorted descending: %s%n",
         Arrays.stream(strings)
               .filter(s -> s.compareToIgnoreCase("n") < 0)
               .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
               .collect(Collectors.toList()));
*/

      //Use a stream to filter strings that start with a vowel (case-insensitive).
      // Collect and display these strings.
      System.out.printf("%nStrings that start with a vowel, case-insensitive: %s%n",
       Arrays.stream(strings)
              .filter(s -> s.compareToIgnoreCase("a") == 0
                      || s.compareToIgnoreCase("e") == 0
                        || s.compareToIgnoreCase("i") >= 0
                          || s.compareToIgnoreCase("o") == 0
                            || s.compareToIgnoreCase("u") == 0
                              || s.compareToIgnoreCase("y") == 0 )
               .collect(Collectors.toList()));

//      Use a stream to concatenate all the strings into a single string,
//       separated by a comma, and display the result.
      System.out.printf("%nConcatenation of all strings delimited by a ',': %s%n",
              Arrays.stream(strings)
                      .collect(Collectors.joining(",")));

      //Use a stream to count the number of strings that contain more than
      // 5 characters (case-insensitive) and display the count.

      System.out.printf("%nAll strings that contain more than 5 characters case-insensitive: %d%n",
              Arrays.stream(strings)
              .filter(s -> s.length() > 5)
                      .count());
   }
} 
