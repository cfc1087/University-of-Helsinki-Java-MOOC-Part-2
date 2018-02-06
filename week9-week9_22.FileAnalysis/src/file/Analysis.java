/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Christopher
 */
public class Analysis {

    private File file;

    public Analysis(File file) {
        this.file = file;
    }

    public int lines() throws FileNotFoundException {
        int lines = 0;
        Scanner reader = new Scanner(this.file);
        while (reader.hasNextLine()) {

            lines++;
            reader.nextLine();
        }
        return lines;
    }

    public int characters() throws FileNotFoundException {
        int chars = 0;
        Scanner reader = new Scanner(this.file);
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            chars += line.length()+1;
        }
        return chars;
    }
}
