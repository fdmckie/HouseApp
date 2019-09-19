public class HouseApp {
    public static void main(String[] args) {


//        int floors = 0;
//        int windows = 0;
//        int doors = 0;
//        int squareFootage = 0;

        House presentHouse = new House(2, 10, 3, 2000, 30000);
        presentHouse.setSalesPrice(35000);
        System.out.println("My present home has " + presentHouse.toString());

        House futureHouse = new House();
        futureHouse.setDoors(1);
        futureHouse.setFloors(1);
        futureHouse.setSalesPrice(90000.599);
        futureHouse.setSquareFootage(1000);
        futureHouse.setWindows(4);

        System.out.println("My future home has " + futureHouse.toString());






    }
}
