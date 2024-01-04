package creational.builder;

public class LenovoTSeriesBuilder implements ComputerBuilder {
    private String processor;
    private String memory;
    private String storage;
    private String graphicsCard;
    private double price;

    @Override
    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public void setMemory(String memory) {
        this.memory = memory;
    }

    @Override
    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public void setGraphicCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public Computer build() {
        return new Computer(processor, memory, storage, graphicsCard, price);
    }

}
