import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;
        String firstName;
        String favouriteFood;
        System.out.println("Enter Your Age: ");
        age = scan.nextInt();
        System.out.println("Enter Your Name: ");
        firstName = scan.next();
        System.out.println("Enter Your Favourite Food: ");
        favouriteFood = scan.next();
        System.out.println("First Name: " + firstName);
        System.out.println("Age " + age);
        System.out.println("Favourite Food: " + favouriteFood);




    }

}