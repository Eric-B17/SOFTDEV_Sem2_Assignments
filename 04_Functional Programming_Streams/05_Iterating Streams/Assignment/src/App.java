import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
        // use streams to generate a list of numbers from 0 to 10
        // use streams and Functions with lambdas to make a list with 5 added to each numbers in the ints list
        // use streams and foreach to print out the values
        List<Double> myStringStream = Stream.of(0.0 ,1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0).toList();
        Function<Double, Double> add5 = (number) -> number + 5;
        List<Double> myDoubleAdded5 = myStringStream.stream().map(add5).toList();
        System.out.println(myStringStream);
        System.out.println(myDoubleAdded5);
        //What else you need to do.  
        //TODO:  repeate the mapping wtih an extra div2Function and map the list of intsPlus5 to make
        // a list intsPlus5Div2.  
        //TODO:  use foreach to print intsPlus5Div2


        List<Integer> myIntStream = IntStream.rangeClosed(0, 10).boxed().toList();
        Function<Integer, Integer> div2Func = (number) -> number / 2;  //TODO:  acutally implement the lambda correctly
        List<Integer> intsPlus5 = myIntStream.stream().map(div2Func).toList();
        System.out.println(myIntStream);
        System.out.println(intsPlus5);


        //TODO:  write a div2Func Function like I did with add5Func
        //TODO:  apply div2Func to intsPlus5 with map
        //TODO:  print with foreach.  

    }
}
