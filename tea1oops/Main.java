package tea1oops;
// Main.java

import tea1oops.Tea1;

public class Main {
    public static void main(String[] args) {
        Tea1 blackTea = new BlackTea();
        Tea1 greenTea = new GreenTea();
        Tea1 herbalTea = new HerbalTea();

        blackTea.prepareTea();
        greenTea.prepareTea();
        herbalTea.prepareTea();
    }
}
