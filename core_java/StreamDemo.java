import java.util.Arrays;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
         List<String> products = Arrays.asList("Laptop", "Pen", "Notebook", "Headphones", "Smartphone");

         // TODO: Print the original list
         System.out.println("Original list: " + products);
        
       List<String> newList = products.stream()
                 .filter((pro) -> pro.length() > 5)
                 .map((pro) -> pro.toUpperCase())
                 .sorted()
               .toList();
                 

        System.out.println("New Product List: " + newList);
    }
}


