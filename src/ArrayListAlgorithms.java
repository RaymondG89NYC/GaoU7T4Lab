import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListAlgorithms {
    /**
     * Returns true if any of the elements in stringList contain
     * target as a substring; false otherwise.  Use indexOf instead of contains
     * for AP practice! (although in reality, contains is preferred)
     * <p>
     * Does NOT mutate (modify) elements of stringList.
     * PRECONDITION: stringList.size() > 0
     *
     * @param stringList original arraylist of Strings
     * @return true if target is found in any of the strings, false otherwise
     */
    public static boolean containsTarget(ArrayList<String> stringList, String target) {
        for(String str: stringList){
            if(str.indexOf(target)!=-1){
                return true;
            }
        }
        return false;
    }
    /** Returns number of elements in intList that are less than the
     *  average of all elements.
     *
     *  Does NOT mutate (modify) elements of intList.
     *  PRECONDITION: intList.size() > 0
     *
     *  @param intList  original arraylist of Integers
     *  @return  the number of ints in intList that are less than the average
     */
    public static int belowAverage(ArrayList<Integer> intList)
    {
        double avg = 0;
        int count = 0;
        for(int num: intList){
            avg += num;
        }
        avg/=intList.size();
        for(int num: intList){
            if(num < avg){
                count++;
            }
        }
        return count;
    }
    /** Replaces all words in wordList that end in "s" with the all-uppercase
     *  version of the word.  For example, "apples" should be replaced with "APPLES".
     *  Assume all letters of all words in wordList are lowercase initially (no need
     *  to worry about checking for case or converting first to lowercase)
     *
     *  DOES mutate (modify) elements of wordList.
     *  PRECONDITION: wordList.size() > 0
     *
     *  @param wordList  original arraylist of words
     */
    public static void replaceWithCaps(ArrayList<String> wordList)
    {
        for(int i =0 ; i < wordList.size(); i++){
            if(wordList.get(i).indexOf("s") == wordList.get(i).length()-1){
                wordList.set(i,wordList.get(i).toUpperCase());
            }
        }
    }
    /** Returns the index at which the minimum value of all integers in
     *  intList appears; if the minimum value appears more than once in
     *  the arraylist, return the index of the first occurrence
     *
     *  Does NOT mutate (modify) elements in intList.
     *  PRECONDITION: intList.size() > 0
     *
     *  @param intList  original arraylist of Integers
     *  @return  the index at which the minimum value occurs
     */
    public static int indexOfMinimum(ArrayList<Integer> intList)
    {
        int smallest = intList.get(0);
        int index = 0;
        for(int i = 0; i < intList.size(); i++){
            if(intList.get(i) < smallest){
                smallest = intList.get(i);
                index = i;
            }
        }
        return index;
    }
    /** Returns true if two array lists of the same length contain the exact
     *  same elements in the same order (i.e. the two arraylists are identical).
     *  Returns false otherwise.
     *
     *  Does NOT mutate (modify) elements in either arraylist
     *  PRECONDITION: numList1.size() == numList2.size()
     *
     *  @param numList1  first arraylist of Integers
     *  @param numList2  second arraylist of Integers, has the same size a first
     *  @return  true if both arraylists are identical, element for element
     */
    public static boolean areIdentical(ArrayList<Integer> numList1, ArrayList<Integer> numList2)
    {
        for(int i = 0; i < numList1.size(); i++){
            if(numList1.get(i)!=numList2.get(i)){
                return false;
            }
        }
        return true;
    }

    /** Removes all elements from numList that are ODD Integers.
     *
     *  DOES mutate (modify) elements in numList
     *  PRECONDITION: numList1.size() > 0
     *
     *  @param numList arraylist of Integers
     */
    public static void removeOdds(ArrayList<Integer> numList) {
        for (int i = 0; i < numList.size(); i++) {
            if(numList.get(i)%2==1) {
                numList.remove(i);
                i--;
            }
        }
    }

    /** Removes all elements from wordList that contain an a, e, i , and/or o.
     *  All other words (i.e. those that have u and/or y as the vowel
     *  such as "ugh" or "sly", or no vowels, like "psh"), add a duplicate of
     *  that element to wordList at an adjacent index.
     *
     *  Assume all words have lowercase letters (i.e. no need to check for case)
     *
     *  DOES mutate (modify) elements in wordList
     *  PRECONDITION: wordList.size() > 0
     *
     *  @param wordList  arraylist of Strings
     */
    public static void wackyVowels(ArrayList<String> wordList)
    {
        for (int i = 0; i < wordList.size(); i++) {
            if(wordList.get(i).contains("a") || wordList.get(i).contains("e") || wordList.get(i).contains("i") || wordList.get(i).contains("o")) {
                wordList.remove(i);
                i--;
            }
            else {
                wordList.add(i, wordList.get(i));
                i++;
            }
        }
    }

    /** Adds an uppercase version of each string directly AFTER the string
     *  in wordList; for example, if wordList is ["hello", "my", "best", "friend"]
     *  this this method modifies wordList to be:
     *  ["hello", "HELLO", "my", "MY", "best", "BEST", "friend", "FRIEND"]
     *
     *  Assume all words have lowercase letters originally
     *
     *  DOES mutate (modify) elements in wordList
     *  PRECONDITION: wordList.size() > 0
     *
     *  @param wordList  arraylist of Strings
     */
    public static void duplicateUpperAfter(ArrayList<String> wordList)
    {
        for(int i = 0; i < wordList.size(); i++){
            wordList.add(i+1, wordList.get(i).toUpperCase());
            i++;
        }
    }

    /** Appends an uppercase version of each string to the END of of wordList;
     *  the uppercase versions appear in the same order as the lowercase versions
     *  for example, if wordList is ["hello", "my", "best", "friend"]
     *  this this method modifies wordList to be:
     *  ["hello", "my", "best", "friend", "HELLO", "MY", "BEST", "FRIEND"]
     *
     *  Assume all words have lowercase letters originally
     *
     *  DOES mutate (modify) elements in wordList
     *  PRECONDITION: wordList.size() > 0
     *
     *  @param wordList  arraylist of Strings
     */
    public static void duplicateUpperEnd(ArrayList<String> wordList)
    {
        for(int i = 0; i < wordList.size(); i++){
            wordList.add(wordList.get(i).toUpperCase());
            i++;
        }
    }
    /** Returns an arraylist of Strings that represents the input sentence parsed
     *  into separate words (using a space: " " as the delimiter) and REVERSED
     *  For example, if sentence = "This is my sentence!"
     *  this method return [sentence!, my, is, This]
     *
     *  PRECONDITION: sentence does not end with a space
     *
     *  @param sentence  the input String that represents one or more words
    separated by spaces
     *  @return  new arraylist of Strings containing the words of sentence reversed
     */
    public static ArrayList<String> parseWordsAndReverse(String sentence)
    {
        ArrayList<String> words = new ArrayList<String>();
        int firstIndex = 0;
        int secondIndex = 0;
        while (sentence.indexOf(" ") > -1){
            secondIndex = sentence.indexOf(" ");
            words.add(0, sentence.substring(firstIndex,secondIndex));
            firstIndex = sentence.indexOf(" ");
            sentence = sentence.substring(0, firstIndex) + sentence.substring(secondIndex+1);
        }
        words.add(0, sentence.substring(secondIndex));
        return words;
    }
    /** Removes all duplicate values from an intList, leaving only the first
     *  occurrence in the arrayList; for example, this method will modify
     *  [1, 2, 5, 4, 2, 2, 1, 6, 4, 4, 8, 1, 7, 4, 2] --> [1, 2, 5, 4, 6, 8, 7]
     *
     *  DOES mutate (modify) elements in intList
     *  PRECONDITION: intList.size() > 0
     *
     *  @param intList  intList of Integers
     */
    public static void removeDuplicates(ArrayList<Integer> intList)
    {
        for(int i = 0; i < intList.size(); i++){
            for(int x = i+1; x < intList.size(); x++){
                if(intList.get(i)==intList.get(x)){
                    intList.remove(x);
                    x--;
                }
            }
        }
    }
    /** Moves all words in wordList that begin with "b" to the front of
     *  wordList; all "b" words that are moved should appear in the same order
     *  in the modified arrayList as they did before being moved
     *
     *  For example, this method will take a wordList:
     *  ["apple", "banana", "cherry", "donut", "bagel", "danish", "berry", "baguette", "soda"]
     *  and modify it to
     *  ["banana", "bagel", "berry", "baguette", "apple", "cherry", "donut", "danish", "soda"]
     *
     *  DOES mutate (modify) elements in wordList
     *  PRECONDITIONS: - wordList.size() > 0
     *                 - all strings in wordList have length >= 1
     *
     *  @param wordList  arraylist of words
     */
    public static void moveBWords(ArrayList<String> wordList)
    {
        int count = 0;
        for(int i=0; i <wordList.size(); i++){
            if(wordList.get(i).indexOf("b") == 0) {
                wordList.add(count, wordList.get(i));
                wordList.remove(i + 1);
                count++;
            }
        }
    }
    /** Returns an arraylist of Integers that contain all mode(s) of the array numList.
     *  The mode of a list is the value that appears the greatest number of times.
     *  A list can have one mode, multiple mode, or no mode.
     *
     *  If all elements in the list appear the exact same number of times, there is no
     *  mode and this method should return an empty arraylist.
     *
     *  For example, if numList is: [1, 2, 6, 2, 3, 4, 6, 5, 5, 6, 7],
     *  then numList contains one mode: 6
     *  and this method returns an arrayList containing 6
     *
     *  If numList is: [1, 2, 3, 2, 4, 5, 5, 6],
     *  then numList contains two modes: 2, 5
     *  and this method returns an arraylist containing 2 and 5 (in any order)
     *
     *  If numList is: [1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6],
     *  then numList contains no mode because all values appear the same number of times
     *  and this method returns an empty arrayList: []
     *
     *  Does NOT mutate (modify) elements in numList
     *  PRECONDITIONS: numList.length > 0
     *
     *  @param numList  numList of ints
     */
    public static ArrayList<Integer> modes(int[] numList)
    {
        ArrayList<Integer> list = new ArrayList(Arrays.asList(numList));
        removeDuplicates(list);
        int[] lengthList = new int[numList.length];

        int count = 0;
        int maxCount = 0;
        int lowestCount = Integer.MAX_VALUE;

        for(int i = 0; i < list.toArray().length; i++){
            for(int x = i; x < numList.length; x++){
                if(numList[i] == numList[x]){
                    count++;
                }
            }
            System.out.println("TIMES");
            System.out.println(maxCount<count);
            if(maxCount<count){
                maxCount = count;
                System.out.println(maxCount);
            }
            if(lowestCount>count){
                lowestCount = count;
            }

            lengthList[i] = count;
            count = 0;
        }
        System.out.println("count: " + count);
        System.out.println("max: " + maxCount);
        System.out.println("lowest: " + lowestCount);
        if(maxCount == lowestCount){
            list.clear();
            return list;
        }
        ArrayList<Integer> returnList = new ArrayList<Integer>();
        for(int i = 0 ; i <lengthList.length; i++){
            if(lengthList[i]==maxCount){
                returnList.add(list.get(i));
            }
        }
        return returnList;
    }
}