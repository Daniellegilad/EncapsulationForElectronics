public class PC extends Computer {
    //private to PC
    int operatingSystem;
    String graphicsCard;
    int processor;


    public PC(String maker, int price, float screenSize, String resolution, int storageInGB, int year, String color, boolean doYouLikeIt, int operatingSystem, String graphicsCard, int processor) {
        super(maker, price, screenSize, resolution, storageInGB, year, color, doYouLikeIt);
        this.operatingSystem = operatingSystem;
        this.graphicsCard = graphicsCard;
        this.processor = processor;
    }
}
