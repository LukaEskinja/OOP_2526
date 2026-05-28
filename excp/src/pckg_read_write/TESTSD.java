package pckg_read_write;

import java.util.ArrayList;
import java.util.List;

public class TESTSD {
    public static void main(String[] args) {
        SpaceShip sp1 = new SpaceShip("Enterprise");
        SpaceShip sp2 = new SpaceShip("Voyager");
        SpaceShip sp3 = new SpaceShip("MilleniumFalcon");
        List<SpaceShip> spaceShipList = new ArrayList<>();
        spaceShipList.add(sp1);
        spaceShipList.add(sp2);
        spaceShipList.add(sp3);
        listElements(spaceShipList);
        String filePath = "./EXCP/src/pckg_read_write/spaceShipData_1.bin";
        AUX_SER_DESER.saveShips(spaceShipList, filePath);
        print()
    }

        private static <E> void listElements(List<E> lista){
            if(lista.size()!=0) {
                for (E element : lista) {
                    System.out.println(element);
                    System.out.println(element);
                }
            }else {
                System.out.println("Lista je prazna");
            }


    }
}
