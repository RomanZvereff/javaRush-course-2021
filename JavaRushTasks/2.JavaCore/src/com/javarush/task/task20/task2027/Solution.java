package com.javarush.task.task20.task2027;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* 
Кроссворд
*/

public class Solution {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };

        int[][] crossword2 = new int[][] {
                {'r', 'm', 'a', 'r', 'r', 'e'},
                {'m', 'e', 'a', 'e', 'e', 'm'},
                {'s', 'a', 'm', 'e', 's', 'o'},
                {'m', 'o', 'p', 'o', 'o', 'h'},
                {'h', 'r', 'e', 'm', 'h', 'h'}
        };
        detectAllWords(crossword2, "home", "same", "homer").forEach(System.out::println);
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        List<Word> wordList = new ArrayList<>();
        Word detectedWord;

        for (String word : words) {
            char[] letters = word.toCharArray();
            for (int i = 0; i < crossword.length; i++) {
                for (int j = 0; j < crossword[0].length; j++) {
                    if (crossword[i][j] == letters[0]) {
                        if (letters.length == 1) {
                            detectedWord = new Word(String.valueOf(letters[0]));
                            detectedWord.setStartPoint(j, i);
                            detectedWord.setEndPoint(j, i);
                            wordList.add(detectedWord);
                        } else {
                            wordList.add(checkWord(crossword, i, j, letters, 0, 1));
                            wordList.add(checkWord(crossword, i, j, letters, 1, 0));
                            wordList.add(checkWord(crossword, i, j, letters, 0, -1));
                            wordList.add(checkWord(crossword, i, j, letters, -1, 0));
                            wordList.add(checkWord(crossword, i, j, letters, 1, 1));
                            wordList.add(checkWord(crossword, i, j, letters, 1, -1));
                            wordList.add(checkWord(crossword, i, j, letters, -1, 1));
                            wordList.add(checkWord(crossword, i, j, letters, -1, -1));
//                            wordList.removeIf(Objects::isNull);
                            wordList.removeAll(Collections.singleton(null));
                        }
                    }
                }
            }
        }

        return wordList;
    }

    public static Word checkWord(int[][] crossword, int startY, int startX, char[] letters, int offsetY, int offsetX) {
        boolean isFounded = false;
        int endY = startY, endX = startX;
        Word word = null;

        try {
            for (int i = 1; i < letters.length; i++) {
                endY = endY + offsetY;
                endX = endX + offsetX;
                isFounded = crossword[endY][endX] == letters[i];
                if (!isFounded) break;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return word;
        }

        if (isFounded) {
            word = new Word(new String(letters));
            word.setStartPoint(startX, startY);
            word.setEndPoint(endX, endY);
        }

        return word;
    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }

}
