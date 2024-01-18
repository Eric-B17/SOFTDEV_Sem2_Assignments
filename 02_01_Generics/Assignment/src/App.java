public class App {
    public static void main(String[] args) throws Exception {

        Property<String> myStringProperty = new Property<String>();
        myStringProperty.set("Hi");
        System.out.println(myStringProperty.get());
        myStringProperty.set("Hello");
        System.out.println(myStringProperty.get());

        Property<Integer> myInteger = new Property<Integer>();
        myInteger.set(3);
        System.out.println(myInteger.get());
        myInteger.set(2);
        System.out.println(myInteger.get());

        Property<Long> myLong = new Property<Long>();
        myLong.set(349877389L);
        System.out.println(myLong.get());
        myLong.set(905665901L);
        System.out.println(myLong.get());

        Property<Boolean> myBoo = new Property<Boolean>();
        myBoo.set(true);
        System.out.println(myBoo.get());
        myBoo.set(false);
        System.out.println(myBoo.get());
    }
}
