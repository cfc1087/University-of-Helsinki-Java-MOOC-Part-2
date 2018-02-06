/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Christopher
 */
public class MindfulDictionary {

    private HashMap<String, String> dict;
    private String file;

    public MindfulDictionary() {
        dict = new HashMap<String, String>();

    }

    public MindfulDictionary(String file) {
        dict = new HashMap<String, String>();
        this.file = file;
    }

    public boolean load() {

        Scanner fileReader;
        try {
            fileReader = new Scanner(new FileReader(this.file));
        } catch (FileNotFoundException ex) {
            return false;
        }
        while (fileReader.hasNext()) {
            String line = fileReader.nextLine();
            String[] lines = line.split(":");
            add(lines[0], lines[1]);
        }

        return true;
    }

    public boolean save() {
        try {
            FileWriter writer = new FileWriter(this.file);
            for (String s : dict.keySet()) {
                writer.write(s + ":" + translate(s) + "\n");
            }
            writer.close();
        } catch (IOException e) {
            return false;
        }

        return true;
    }

    public void add(String word, String translation) {
        if (dict.containsKey(word)) {
            return;
        }
        dict.put(word, translation);
    }

    public String translate(String word) {
        if (dict.containsKey(word)) {
            return dict.get(word);
        }
        for (String s : dict.keySet()) {
            if (dict.get(s).equals(word)) {
                return s;
            }
        }
        return null;
    }

    public void remove(String word) {
        if (dict.containsKey(word)) {
            dict.remove(word);
            return;
        }
        for (String s : dict.keySet()) {
            if (dict.get(s).equals(word)) {
                dict.remove(s);
                return;
            }
        }
    }

}
