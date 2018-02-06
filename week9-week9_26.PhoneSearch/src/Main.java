
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        // Start your program here
        // ATTENTION: In your program, you can create only one instance of class Scanner!
        Scanner reader = new Scanner(System.in);
        phoneBook book = new phoneBook();
        System.out.println("phone search");
        System.out.println("Available operations:");
        System.out.println("1 add a number");
        System.out.println("2 search for a number");
        System.out.println("3 search for a person by phone number");
        System.out.println("4 add an address");
        System.out.println("5 search for personal information");
        System.out.println("6 delete personal information");
        System.out.println("7 filtered listing");
        System.out.println("x quit");
        String choice = "";
        String name = "";
        String number = "";
        do {
            System.out.print("command: ");
            choice = reader.nextLine();
            
            switch (choice) {
                case "1":
                    System.out.print("whose number: ");
                    name = reader.nextLine();
                    System.out.print("number: ");
                    number = reader.nextLine();
                    book.addNumber(name, number);
                    break;
                case "2":
                    System.out.print("whose number: ");
                    name = reader.nextLine();
                    book.searchByName(name);
                    break;
                case "3":
                    System.out.print("number: ");
                    number = reader.nextLine();
                    book.searchByNumber(number);
                    break;
                case "4":
                    System.out.print("whose address: ");
                    name = reader.nextLine();
                    System.out.print("street: ");
                    String street = reader.nextLine();
                    System.out.print("city: ");
                    String city = reader.nextLine();
                    book.addAddress(name, street, city);
                    break;
                case "5":
                    System.out.print("whose information: ");
                    name = reader.nextLine();
                    book.searchInformation(name);
                    break;
                case "6":
                    System.out.print("whose information: ");
                    name = reader.nextLine();
                    book.deleteInformation(name);
                    break;
                case "7":
                    System.out.print("keyword (if empty, all listed): ");
                    String keyword = reader.nextLine();
                    book.filteredSearch(keyword);
                    break;
                
            }
            
        } while (!choice.equals("x"));
        
    }
}
