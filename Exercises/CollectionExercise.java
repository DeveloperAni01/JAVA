
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CollectionExercise {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Alice");
        list.add("Bob");
        list.add("Alice");
        list.add("David");
        list.add("Bob");

        System.out.println("Original List: " + list);

        Set<String> newList = new LinkedHashSet<>();

        for (String s : list) {
            newList.add(s);
        }

        System.out.println("Unique Names: " + newList);

    }
}
