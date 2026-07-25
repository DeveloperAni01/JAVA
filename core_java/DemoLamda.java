
@FunctionalInterface
interface A {
    int add(int x, int y);
}

// class B implements A {
//     public int add(int x, int y){
//         return x + y;
//     }
// }


public class DemoLamda {

    public static void main(String[] args) {
        // A n = new A(){
        //     public int add(int x, int y){
        //         return x + y;
        //     }
        // };

        A n = (x,y) ->  x + y;
        
        System.out.println(n.add(10, 5));
    }
    
}
