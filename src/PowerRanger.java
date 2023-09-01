class PowerRanger {
    // Attributes
    String color;
    String helmet;
    String weapon;

    // Constructor
    public PowerRanger(String color, String helmet, String weapon) {
        this.color = color;
        this.helmet = helmet;
        this.weapon = weapon;
    }

    // Method
    public void usePower() {
        System.out.println("The " + color + " Power Ranger use is power to save people!");
    }
}