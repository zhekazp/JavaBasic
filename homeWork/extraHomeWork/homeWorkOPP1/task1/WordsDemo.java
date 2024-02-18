package homeWorkOPP1.task1;
/*We learn to break a task into subtasks.

Given a line of text.
Write a method that finds a word
which occurs most times in the text.

If several words in the text appear the same
maximum number of times, then return the word
which appears first in the text.*/
public class WordsDemo {
    public static void main(String[] args) {
        SearchWord searchWord=new SearchWord("str1 str1 str str str2 str str2 str str2 str2");
        searchWord.printWord();
    }
}
