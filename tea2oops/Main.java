package tea2oops;

public class Main {
    public static void main(String[] args) {
        // Creating an array of Tea objects
        Tea[] teas = new Tea[3];
        teas[0] = new Tea("Regular");
        teas[1] = new GreenTea("Matcha");
        teas[2] = new BlackTea("Earl Grey");

        // Polymorphic behavior
        for (Tea tea : teas) {
            tea.prepare();
        }
    }
}