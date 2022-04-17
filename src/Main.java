import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phone daniellePhone = new Phone("iphone",3000,0,"HD", 250,2021,"black",false,"iphone",8);
        System.out.println(daniellePhone);

        TV danielleTV = new TV("LG",9000,60,"oled",500,2019,"black",true,true);
        System.out.println(danielleTV);

        PC daniellePC = new PC("dell",5500, 15.4f,"HD",1000,2021,"silver",true,11,"Nvidia",7);
        System.out.println(daniellePC);

        Phone johnPhone = new Phone("android",2000,3,"HD",256,2020,"white",true,"typeC",4000);
        System.out.println(johnPhone);

    Scanner yourTV = new Scanner(System.in);

    }
}

