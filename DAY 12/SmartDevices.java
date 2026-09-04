interface InternetEnabled {

    void connectWiFi();
}

abstract class SmartDevice {

    public void powerOn() {
        System.out.println("Power On");
    }

    public abstract void operate();

    public static void main(String[] args) {

        SmartTV tv = new SmartTV();

        System.out.println("== SMART TV ==");
        tv.powerOn();
        tv.connectWiFi();
        tv.operate();

        System.out.println();

        SmartSpeaker speaker = new SmartSpeaker();

        System.out.println("== SMART SPEAKER ==");
        speaker.powerOn();
        speaker.connectWiFi();
        speaker.operate();
    }
}

class SmartTV extends SmartDevice {

    public void connectWiFi() {
        System.out.println("Connected to WiFi");
    }

    public void operate() {
        System.out.println("Playing Television");
    }
}

class SmartSpeaker extends SmartDevice {

    public void connectWiFi() {
        System.out.println("Connected to WiFi");
    }

    public void operate() {
        System.out.println("Playing Music");
    }
}
