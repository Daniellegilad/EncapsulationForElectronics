public class Phone extends Computer{
    //private for Phone
    String chargerType;
    int cameraResolution;
    int storageInGB;


    public Phone(String maker, int price, float screenSize, String resolution, int storageInGB, int year, String color, boolean doYouLikeIt, String chargerType, int cameraResolution) {
        super(maker, price, screenSize, resolution, storageInGB, year, color, doYouLikeIt);
        this.chargerType = chargerType;
        this.cameraResolution = cameraResolution;
    }
}

