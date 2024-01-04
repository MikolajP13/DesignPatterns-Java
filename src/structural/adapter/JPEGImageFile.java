package structural.adapter;

public class JPEGImageFile {
    private String fileName;

    public JPEGImageFile(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public String converter() {
        return this.fileName;
    }
}
