package Program5;

/**
 * @author kush
 */
public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer("HP", "Intel Core i7", 16, 3.4);
        Computer computer2 = new Computer("Dell", "AMD Ryzen 5", 8, 2.6);
        Computer computer3 = new Computer("Dell", "AMD Ryzen 5", 8, 2.6);

        System.out.println("Are computer1 and computer2 equal? " + computer1.equals(computer2));

        System.out.println("Hash code for computer1: " + computer1.hashCode());
        System.out.println("Hash code for computer2: " + computer2.hashCode());
        System.out.println("Are the hash codes equal? " + (computer1.hashCode() == computer2.hashCode()));

        System.out.println("Are computer2 and computer3 equal? " + computer2.equals(computer3));

        System.out.println("Hash code for computer2: " + computer2.hashCode());
        System.out.println("Hash code for computer3: " + computer3.hashCode());
        System.out.println("Are the hash codes equal? " + (computer2.hashCode() == computer3.hashCode()));


    }

}
