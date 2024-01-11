package ExPractice;
 
public class Mobile {

    String mobileModel;
    float mobileWeight;

    boolean isFullCharged;
    int mobileCost;

    // Method to make a call
    public void makeCall() {
        mobileModel = "XYZ123";
        mobileWeight = 150.5f;
        System.out.println("Making a call with mobile model " + mobileModel + " and weight " + mobileWeight + " grams.");
    }

    public void sendMsg() {
        isFullCharged = true;
        mobileCost = 500;
        System.out.println("Sending a message with a fully charged mobile. The cost of the mobile is $" + mobileCost + ".");
    }

    public static void main(String[] args) {
        
        Mobile myMobile = new Mobile();
        
        myMobile.makeCall();
        myMobile.sendMsg();

        System.out.println("This is my mobile");
    }
}