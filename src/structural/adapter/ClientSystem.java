package structural.adapter;

public class ClientSystem {
    public void displayImageFile(JPEGImageFile jpeg) {
        if (jpeg.getFileName().contains(".png"))
            System.out.println("Conversion " + jpeg.getFileName() + " to " + jpeg.converter());
        System.out.println("Display: " + jpeg.converter());
    }
}
