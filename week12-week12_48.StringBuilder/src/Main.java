
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4};
        System.out.println(build(t));

    }

    public static String build(int[] t) {
        String s = "";
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < t.length - 1; i++) {
            if ((i + 1) % 4 == 0) {
                sb.append(" ").append(t[i]).append(",\n");
            } else {
                sb.append(" ").append(t[i]).append(",");
            }

        }
        sb.append(" "+t[t.length - 1]);
        return "{\n" + sb + "\n}";
    }
}
