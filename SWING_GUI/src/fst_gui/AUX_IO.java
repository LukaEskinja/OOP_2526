package fst_gui;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AUX_IO {
    public static void saveTXTDataFromArea(String data, String filepath) {
        try(BufferedWriter bw =  new BufferedWriter(new FileWriter(filepath)) {
        bw.write(data);

    }
    {
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
}