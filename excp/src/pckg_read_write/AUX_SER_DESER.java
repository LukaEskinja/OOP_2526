package pckg_read_write;

import java.io.*;
import java.util.List;

public class AUX_SER_DESER {

    public static void saveSpaceShipOne(SpaceShip spaceShip, String filePath){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath, true))) {
            oos.writeObject(spaceShip);
            System.out.println("SpaceShiip added to a file!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void saveShips(List<SpaceShip> ships, String filePath){
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