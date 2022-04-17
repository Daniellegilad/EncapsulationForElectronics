public class TV extends Computer {
    //private to TV
    boolean isSmartTV;


    public TV(String maker, int price, float screenSize, String resolution, int storageInGB, int year, String color, boolean doYouLikeIt, boolean isSmartTV) {
        super(maker, price, screenSize, resolution, storageInGB, year, color, doYouLikeIt);
        this.isSmartTV = isSmartTV;
    }

}

