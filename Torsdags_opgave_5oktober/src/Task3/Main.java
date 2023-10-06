package Task3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Room room1 = new Room(1, 1, 1);
        Room room2 = new Room(2, 2, 2);
        Room room3 = new Room(3, 3, 3);

        ArrayList<Room> listOfRooms = new ArrayList<Room>();

        listOfRooms.add(room1);
        listOfRooms.add(room2);
        listOfRooms.add(room3);

        Building building = new Building(listOfRooms, 2, 2, true);

        countLampsInBuilding(building);

        isNormal(building);

    }

    public static void countLampsInBuilding(Building building) {
        int total = 0;
        for (Room s : building.getRooms()) {
            total = total + s.getNumberOfLamps();
        }
        System.out.println(total);
    }
   public static boolean isNormal(Building building) {
    if(building.getNumberOfFloors() > building.getRooms().size()){
        System.out.println("this is not an odd Building");
        return true;
    }else {
        System.out.println("this is and odd building");
        return false;
    }
    }
}
