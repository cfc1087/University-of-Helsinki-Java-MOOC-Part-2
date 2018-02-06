
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following

        printWithSmileys("Mikael");
        System.out.println("");
        printWithSmileys("Arto");
        printWithSmileys("Matti");
    }

    private static void printWithSmileys(String characterString) {
        String a = ":)";
        String s = a + " " + characterString + " " + a;
        int length = s.length();
        if (characterString.length() % 2 == 1) {
            s = a + " " + characterString + "  " + a;
            length++;
        }
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < length/2; j++) {
                if (i == 1) {

                    System.out.print(s);
                    break;
                } else {
                    System.out.print(a);
                }
            }
            System.out.println("");
        }

    }
}
