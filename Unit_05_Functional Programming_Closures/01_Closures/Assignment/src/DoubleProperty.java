public class DoubleProperty {

    public static DoubleProperty of(int value){
        return new DoubleProperty(value);
    }

    private int value;

    private DoubleProperty(int value) {
        this.value = value;
    }

    public int get() {
        return value;
    }

    public void set(int value) {
        this.value = value;
    }

    public DoubleProperty plus(DoubleProperty value) {
        this.value += value.get();
        return this;
    }

    public DoubleProperty minus(DoubleProperty value) {
        this.value -= value.get();
        return this;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DoubleProperty of(String string) {
        return null;
    }

}