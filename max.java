//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 5, 6};
////                 0  1  2  3  4  5
        int max = arr[0];
        for (int i = 1; i < arr.length-1; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}