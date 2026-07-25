
public class Oop1{
    //instance variable
    private double accBal;
    
   
    
    public double getAccBal() {
        return accBal;
    }
    
    public void setBal(double bal) {
        if (bal < 0) {
            System.err.println("Balance can not be negative!");
            return;
        }

        this.accBal += bal;
    }
    

    public static void main(String[] args) {
        Oop1 a = new Oop1();
    }

}