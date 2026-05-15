public class Phone {
    private String os;           // ОС Телефона
    private int battery_level;   // Рівень зарядки.
    private boolean battery_low; // Чи малий заряд?

    public Phone() {
        // Конструктор
    }

    public void set_phone_info(String os, int battery_level) {
        this.os = os;
        this.battery_level = battery_level;

        if (this.battery_level <= 19) {
            battery_low = true;
        }
        else {
            battery_low = false;
        }
    }

    public static void main(String[] args) {
        Phone phone = new Phone();
        Phone phone_2 = new Phone();

        phone.set_phone_info("Android", 100);
        phone_2.set_phone_info("iOS", 12);

        System.out.println("1) ОС: " + phone.os);
        System.out.println("1) Рівень зарядки: " + phone.battery_level);
        System.out.println("1) Низький рівень зарядки: " + phone.battery_low);

        System.out.println("2) ОС: " + phone_2.os);
        System.out.println("2) Рівень зарядки: " + phone_2.battery_level);
        System.out.println("2) Низький рівень зарядки: " + phone_2.battery_low);
    }
}