import java.util.function.Function;

public class App {
    public static void main(String[] args) throws Exception {

        StringProperty stringProperty = StringProperty.of("HI");
        Function<StringProperty, StringProperty> addToDoubleProperty = (str) -> {
            stringProperty.addToEnd(str);
            return stringProperty;
        };
        
        stringProperty.addToEnd(StringProperty.of(" World"));
        System.out.println(stringProperty);
    }

    DoubleProperty doubleProperty = DoubleProperty.of(" 10");
    Function<DoubleProperty, DoubleProperty> minusToDoubleProperty = (str) -> {
        doubleProperty.minus(str);
        return doubleProperty;
    };
        
    doubleProperty.plus(DoubleProperty.of(50.0));
    System.out.println(doubleProperty);

}
