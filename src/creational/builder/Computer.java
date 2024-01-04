package creational.builder;

public class Computer {
    private String processor;
    private String memory;
    private String storage;
    private String graphicsCard;
    private double price;

    public Computer(String processor, String memory, String storage, String graphicsCard, double price) {
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
        this.price = price;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("processor=").append(processor).append('\n');
        sb.append("memory=").append(memory).append('\n');
        sb.append("storage=").append(storage).append('\n');
        sb.append("graphicsCard=").append(graphicsCard).append('\n');
        sb.append("price=").append(price);

        return sb.toString();
    }
}
