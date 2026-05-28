package pckg_read_write;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SpaceShip implements Serializable {
    private String name;

    private int id;

    private static int cntID = 1;

    SpaceShip(String name) {
        this.name = name;
        this.id = cntID++;
    }

    public static List<SpaceShip> fromCSV(String filePath) throws IOException {
        List<SpaceShip> ships = new ArrayList<>();


        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean firstLine = true;

            while ((line = br.readLine()) != null) {
                if (firstLine) { firstLine = false; continue; }
                line = line.trim();
                if (!line.isEmpty()) {
                    ships.add(new SpaceShip(line));
                }
            }
        }
        return ships;
    }

}


