package tea2oops;
// Subclass BlackTea
class BlackTea extends Tea {
    public BlackTea(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Black " + " tea");
    }
}

