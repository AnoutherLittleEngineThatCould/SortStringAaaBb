import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String text = "AabBA";

        char[] notSorted = text.toCharArray();
        // Arrays.sort(notSorted);

        char[] ignoreCase = text.toLowerCase().toCharArray();
        Arrays.sort(ignoreCase);

        for (int i = 0; i < notSorted.length; i++) {
            for (int j = 0; j < ignoreCase.length; j++) {
                if (ignoreCase[j] == notSorted[i] + 32) {
                    ignoreCase[j] -= 32;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(ignoreCase));
        System.out.println(Arrays.toString(notSorted));
        String str =  String.valueOf(ignoreCase);
        System.out.println(str);
    }
}