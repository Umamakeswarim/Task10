package tea2oops;

// Tea class
class Tea {
    private String name;

    public Tea(String name) {
        this.name = name;
    }

    public void prepare() {
        System.out.println("Preparing " + name + " tea");
    }
}
