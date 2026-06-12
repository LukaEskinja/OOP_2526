package fst_gui;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AUX_IO {

    private static final BrowseFileChooser fileChooser = new BrowseFileChooser();
}
    public static void saveTXTDataFromArea(String data, String filepath) {
        try(BufferedWriter bw =  new BufferedWriter(new FileWriter(filepath)) {
        bw.write(data);

    }
    {
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    public static void saveTxtDataWithFileChooser(String data) {
            int returnVal = fileChooser.showOpenDialog(null);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                System.out.println("You chose to save data to this file: "+
                        fileChooser.getSelectedFile().);
            }
        }
}