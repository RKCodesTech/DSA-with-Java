public class Enumm{
    enum Reels{
        VIDEO,
        IMAGE,
        PHOTO,
        STORY
    }
    public static void main(String[] args) {
        Reels myReels=Reels.IMAGE;
        System.out.println("Selected  reel  " + myReels);
    }
}