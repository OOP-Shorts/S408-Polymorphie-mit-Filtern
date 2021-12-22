public class Cat extends Animal {

    private boolean hasLongFur;

    public Cat(String name, int age, boolean hasLongFur) {
        super(name, age);
        this.hasLongFur = hasLongFur;
    }

    public boolean isHasLongFur() {
        return hasLongFur;
    }

    public void setHasLongFur(boolean hasLongFur) {
        this.hasLongFur = hasLongFur;
    }
}
