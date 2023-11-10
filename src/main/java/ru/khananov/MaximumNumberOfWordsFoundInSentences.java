package ru.khananov;

public class MaximumNumberOfWordsFoundInSentences {
    public static void main(String[] args) {
        System.out.println(new MaximumNumberOfWordsFoundInSentences().mostWordsFound(new String[] {
                "alice and bob love leetcode", "i think so too", "this is great thanks very much"
        }));
    }

    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for (int i = 0; i < sentences.length; i++) {
            int currentWords = sentences[i].split(" ").length;
            maxWords = currentWords > maxWords ? currentWords : maxWords;
        }

        return maxWords;
    }
}
