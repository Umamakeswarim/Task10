package tea2oops;

// Subclass GreenTea
class GreenTea extends Tea {
    public GreenTea(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Green " + " tea");
    }
}
