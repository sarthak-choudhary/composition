package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("2208", "Dell", "240", dimensions);

        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("83-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, monitor, motherboard);
        thePC.powerUp();
    }
}
