package structural.adapter;

public class PNGImageFileAdapter extends JPEGImageFile {
    private final PNGImageFile png;

    public PNGImageFileAdapter(PNGImageFile png) {
        super(png.getFileName());
        this.png = png;
    }

    @Override
    public String converter() {
        return this.png.converter();
    }
}
