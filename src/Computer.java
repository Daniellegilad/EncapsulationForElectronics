import java.util.Scanner;

public class Computer { //super = must state in each.
    String maker;
    int price;
    float screenSize;
    String resolution;
    int storageInGB;
    int year;
    String color;
    boolean doYouLikeIt;

    @Override //prints input instead of location
    public String toString() {
        return "Computer{" +
                "maker='" + maker + '\'' +
                ", price=" + price +
                ", screenSize=" + screenSize +
                ", resolution='" + resolution + '\'' +
                ", storageInGB=" + storageInGB +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", doYouLikeIt=" + doYouLikeIt +
                '}';
    }

    public Computer(String maker, int price, float screenSize, String resolution, int storageInGB, int year, String color, boolean doYouLikeIt) {
        this.maker = maker;
        this.price = price;
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.storageInGB = storageInGB;
        this.year = year;
        this.color = color;
        this.doYouLikeIt = doYouLikeIt;


    }
}

