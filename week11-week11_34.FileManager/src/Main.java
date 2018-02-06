
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        FileManager t = new FileManager();
        List<String> tekstit = new ArrayList<String>();
        tekstit.add("yy");
        tekstit.add("kaa");
        tekstit.add("koo");
        tekstit.add("nee");
        tekstit.add("vii");
        t.save("test/tmp/tmp84177.txt", tekstit);
    }
}
