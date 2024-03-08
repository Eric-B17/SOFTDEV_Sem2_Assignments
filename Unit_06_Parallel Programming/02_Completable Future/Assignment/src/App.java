<<<<<<< HEAD
import java.util.function.BiFunction;
import java.util.concurrent.CompletableFuture;
=======
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
>>>>>>> 1de715d5244a9cf685c2d47bcb6bb19f56ed0fb4

public class App {
    public static void main(String[] args) throws Exception {

        BiFunction<Integer, Integer, Integer> randoGenerator = (min, max) -> {
<<<<<<< HEAD
            int size = max - min;
=======
            int size = max - min + 1;
>>>>>>> 1de715d5244a9cf685c2d47bcb6bb19f56ed0fb4
            double rando = size * Math.random();
            return (int) Math.floor(rando);
        };

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> randoGenerator.apply(0, 10));

        System.out.println(future.get());
    }

}
