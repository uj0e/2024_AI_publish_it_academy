package HandGameMain;

public class ComHandP implements Hand {
    int comHandCount = (int)(Math.random() * 3);
    public String ComHandP(){
        String comHand = hand[comHandCount];
        return comHand;
    }
}
