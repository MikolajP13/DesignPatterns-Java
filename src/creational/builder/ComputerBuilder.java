package creational.builder;

public interface ComputerBuilder {
    void setProcessor(String processor);
    void setMemory(String memory);
    void setStorage(String storage);
    void setGraphicCard(String graphicCard);
    void setPrice(double price);
}
