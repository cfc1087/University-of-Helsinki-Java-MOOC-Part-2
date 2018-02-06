/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Christopher
 */
public class WordInspection {

    private File file;

    public WordInspection(File file) {

        this.file = file;
    }

    public int wordCount() throws FileNotFoundException {
        int words = 0;
        Scanner reader = new Scanner(this.file);
        while (reader.hasNext()) {
            words++;
            reader.next();
        }
        return words;
    }

    public List<String> wordsContainingZ() throws FileNotFoundException {
        List<String> list = new ArrayList<String>();
        Scanner reader = new Scanner(this.file, "UTF-8");
        while (reader.hasNext()) {
            String word = reader.next();
            if (word.contains("z")) {
                list.add(word);
            }
        }
        return list;
    }

    public List<String> wordsEndingInL() throws FileNotFoundException {
        List<String> list = new ArrayList<String>();
        Scanner reader = new Scanner(this.file, "UTF-8");
        while (reader.hasNext()) {
            String word = reader.next();
            if (word.endsWith("l")) {
                list.add(word);

            }
        }
        return list;
    }

    public List<String> palindromes() throws FileNotFoundException {
        List<String> list = new ArrayList<String>();
        Scanner reader = new Scanner(this.file, "UTF-8");

        while (reader.hasNext()) {

            String word = reader.next();
            StringBuilder s = new StringBuilder(word);
            String reverse = s.reverse().toString();
            if (word.equals(reverse)) {
                list.add(word);
            }
        }
        return list;
    }

    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException {
        List<String> list = new ArrayList<String>();

        Scanner reader = new Scanner(this.file, "UTF-8");
        while (reader.hasNext()) {
            String word = reader.next();
            if (word.contains("a") && word.contains("e") && word.contains("i") && word.contains("o") && word.contains("u") && word.contains("y") && word.contains("ä") && word.contains("ö")) {
                list.add(word);
            }
        }
        return list;
    }
}
