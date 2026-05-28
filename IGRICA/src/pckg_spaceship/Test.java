package pckg_spaceship;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        SpaceShip sp1 = new SpaceShip("Enterprize");
        SpaceShip sp2 = new SpaceShip("Millenium Falcon");
        SpaceShip sp3 = new SpaceShip("Discovery");

        List<SpaceShip> spaceShipList = List.of(sp1,sp2,sp3);
        listAllSpaceShips(spaceShipList);
        String filePath = "./DATA/SpaceShipData.bin";
        saveSpaceShips(spaceShipList, filePath);
        SpaceShip sp4 = new SpaceShip("1234567");
        SpaceShip sp5 = new SpaceShip("876543");
        ArrayList<SpaceShip> spsl = new ArrayList<>(spaceShipList);
        spsl. add(sp4);
        spsl. add(sp5);
        saveSpaceShips(spsl, filePath);
        SpaceShip sp8 = new SpaceShip("EFE-34");
        String filePath2 = "./DATA/spaceShipDataFile.dat";
        addSpaceShip(sp8, filePath2);
    }

    private static void listAllSpaceShips(List<SpaceShip> spl){
        for(SpaceShip sp : spl){
            System.out.println(sp);
        }
    }

    private static void saveSpaceShips(List<SpaceShip> ships, String filePath){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(filePath)))){
            oos.writeObject(ships);
            System.out.println("Finished writing to file");
        }catch (FileNotFoundException e){
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("File not found");

        }
    }

    private static void  addSpaceShip(SpaceShip spaceShip, String filePath){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(filePath)))){
            oos.writeObject(spaceShip);
            System.out.println("Finished writing one spaceship to file");
        }catch (FileNotFoundException e){
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("File not found");


        }

    }
}
