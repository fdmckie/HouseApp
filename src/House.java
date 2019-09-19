import java.text.DecimalFormat;

public class House {



    private int floors = 0;
    private int windows = 0;
    private int doors = 0;
    private int squareFootage = 0;
    private double salesPrice = 0;


    public House() {
    }


    public House(int floors, int windows, int doors, int squareFootage, double salesPrice) {
        this.floors = floors;
        this.windows = windows;
        this.doors = doors;
        this.squareFootage = squareFootage;
        this.salesPrice = salesPrice;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    public String getSalesPrice() {
        DecimalFormat df2 = new DecimalFormat("#.00");
        return df2.format(salesPrice);
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    @Override
    public String toString() {
        return getFloors() + " floors " +
                getWindows() + " windows " +
                getDoors() + " doors " +
                getSquareFootage() + " square feet and worth $" +
                getSalesPrice();
    }

}
