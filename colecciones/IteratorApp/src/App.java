import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Integer> numeros = new ArrayList<>(Arrays.asList(5, 12, 8, 20, 3,15));

        // List<Integer> numeros2 = new ArrayList<>();
        // numeros2.add(5);
        // numeros2.add(12);

        System.out.println("********* TODOS LOS NÚMEROS *********");
        numeros.forEach(System.out::println);

        System.out.println("********* NÚMEROS MAYORES QUE 10 *********");
        // java.util.ConcurrentModificationException
        // for (Integer num : numeros) {
        //     if(num <= 10)
        //         numeros.remove(num);
        // }
        // numeros.forEach(System.out::println);

        Iterator<Integer> iter = numeros.iterator();

        while(iter.hasNext()){
            Integer numero = iter.next();
            System.out.println("\t* número:"+numero);

            if (numero <= 10){
                iter.remove();
                System.out.println("\t* borrado "+numero+" por ser menor o igual que 10!!");
            }

        }
        System.out.println(" Lista actualizada:");
        numeros.forEach(System.out::println);

    }
}
