package creational.builder;

import creational.builder.*;

public class Main {
    public static void main(String[] args) {
        //======== BUILDER ========
        LenovoTSeriesBuilder lenovoBuilder = new LenovoTSeriesBuilder();
        lenovoBuilder.setProcessor("Intel i5");
        lenovoBuilder.setMemory("8GB");
        lenovoBuilder.setStorage("256GB SSD");
        lenovoBuilder.setGraphicCard("NVIDIA GTX 1050");
        lenovoBuilder.setPrice(1999.99);

        Computer lenovoComputer = lenovoBuilder.build();

        System.out.println("1.\n" + lenovoComputer);

        DellBuilder dellBuilder = new DellBuilder();
        dellBuilder.setProcessor("Intel i7");
        dellBuilder.setMemory("16GB");
        dellBuilder.setStorage("512GB SSD");
        dellBuilder.setPrice(1199.99);

        Computer dellComputer = dellBuilder.build();
        System.out.println("2.\n" + dellComputer);

    }
}