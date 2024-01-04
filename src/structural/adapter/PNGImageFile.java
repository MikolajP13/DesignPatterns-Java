package structural.adapter;

public class PNGImageFile {
    private String fileName;

    public PNGImageFile(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String converter() {
        return this.fileName.replace(".png", ".jpeg");
    }
}
