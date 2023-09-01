public class Main {
    public static void main(String[] args) {
        // Creating Power Ranger objects using the constructor
        PowerRanger redRanger = new PowerRanger("Red", "Red Helmet", "Fire Sword");
        PowerRanger blueRanger = new PowerRanger("Blue", "Blue Helmet", "Water Gun");

        // Using the Power Ranger objects and their methods
        System.out.println("The " +redRanger.color + " Power Ranger wears a " + redRanger.helmet + " and uses a " + redRanger.weapon + ".");
        System.out.println( redRanger.color + " power ranger can save students");


       blueRanger.usePower();

        System.out.println("The " + blueRanger.color + " Power Ranger wears a " + blueRanger.helmet + " and uses a " + blueRanger.weapon + ".");

    }
}