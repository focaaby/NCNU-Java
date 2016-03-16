public class OLEDTV extends TV {
    public void fun() {
        currentChannel = 50; // error
        price = 20000; // ok
    }

    // override method defined in super class TV
    public void increaseChannel() {
        super.increaseChannel();
        if (currentChannel & 2 == 0) {
            bright = 100;
        }
        else {
            bright = 50;
        }
    }
}
