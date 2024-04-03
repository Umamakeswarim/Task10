package task10OOPS;
public class Tea {
    private boolean isMilkAdded;
    private boolean isSugarAdded;

    public Tea() {
        this.isMilkAdded = false;
        this.isSugarAdded = false;
    }

    public void prepareTea() {
        System.out.println("Preparing basic tea with hot water and tea leaves...");
    }

    public void addMilk() {
        isMilkAdded = true;
        System.out.println("Milk added to the tea.");
    }

    public void addSugar() {
        isSugarAdded = true;
        System.out.println("Sugar added to the tea.");
    }

    public void serveTea() {
        System.out.println("Tea is served!");
        String additions = "";
        if (isMilkAdded) {
            additions += "milk, ";
        }
        if (isSugarAdded) {
            additions += "sugar, ";
        }
        if (!additions.isEmpty()) {
            additions = additions.substring(0, additions.length() - 2); // remove the last comma and space
            System.out.println("With: " + additions);
        }
    }

    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareTea();
        tea.addMilk();
        tea.addSugar();
        tea.serveTea();
    }
}
