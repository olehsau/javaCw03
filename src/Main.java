import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/imiona.txt"));
        List<Name> names = new ArrayList<Name>();
        String line;
        while((line=reader.readLine())!=null){
            names.add(new Name(line));
        }
        Collections.sort(names, new NameComparator());
        names.forEach((name)-> {System.out.println(name.getName());});
    }
}
