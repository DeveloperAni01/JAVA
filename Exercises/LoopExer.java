

public class LoopExer {
    public static void main(String[] args) {
        int[] numbers = {45, 22, 89, 6, 90, 33};

        int largest = numbers[0];
        int smallest = numbers[0];

        for(int i : numbers){
            if (i >= largest) {
                largest = i;

            }
            
            if(smallest >=  i){
                smallest = i;
            }

           
        }

        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}
