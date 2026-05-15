public class Phone {
    private String os;
    private int battery_level;
    private boolean battery_low;

    public void phone_info(String os, int battery_level, boolean battery_low) {
        this.os = "Android";
        this.battery_level = 100;

        if (this.battery_level <= 19) {
            this.battery_low = true;
        }
        else {
            this.battery_low = false;
        }
    }
}