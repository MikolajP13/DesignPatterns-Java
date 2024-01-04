package structural.adapter;

public class Main {
    public static void main(String[] args) {
        //======== ADAPTER ========
        PNGImageFile png = new PNGImageFile("test.png");
        JPEGImageFile jpeg = new JPEGImageFile("test2.jpeg");
        ClientSystem clientSystem = new ClientSystem();
        PNGImageFileAdapter adapter = new PNGImageFileAdapter(png);

        clientSystem.displayImageFile(adapter);
        System.out.println("=".repeat(30));
        clientSystem.displayImageFile(jpeg);

    }
}