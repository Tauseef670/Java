
package Java;
import java.util.*;
public class ArraysElementClassMethod {
    public static void main(String[] args) {
        String a[] = {"Tauseef","jamal","Broadway","Infotech"};
        System.out.println("to string()" +Arrays.toString(a)); // used in Single dimensional Array
        System.out.println("to string()" +Arrays.asList(a));  // used in Single dimensional Array

        int arr[][]={{10,20},{30,40}};  // used in Multi Dimensional Array
        System.out.println("deepToString()" + Arrays.deepToString(arr));
    }
    
}
