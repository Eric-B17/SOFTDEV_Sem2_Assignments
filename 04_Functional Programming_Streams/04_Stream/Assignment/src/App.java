import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Integer> myList = List.of(1, 2, 3);

        Integer cumulativeSum = myList.stream().reduce(0, (a, b) -> a + b );
        System.out.println(cumulativeSum);
        
        Integer cumulativeProduct = myList.stream().reduce(1, (a, b) -> a * b);

        //create  a list of strings.  
        //fill that list with your daily school schedule
<<<<<<< HEAD
         List<String> myStringList = List.of(
                 "US History",
                 "WEB DEV",
                 "American Literature",
                 "SOFT DEV",
                 "Algebra 2",
                 "Spanish 3",
                 "Physics",
        "");
=======
>>>>>>> 48b240cdfbbd77b77838595862bad0bf0ee1622d
        //write a Function<String, String> toLowerCase
        //the function will equal (s) -> s.toLowerCase();
        //map your list of strings to another list of strings using 
        //.stream().map(toLowerCase).toList(); and set to a variable called lowerCaseSchedule
        //System.out.println(your lower cased list)


    }
}