package Lesson3;

public class HomeWork3 {

    public static void main (String[] args){
        First();
        Second(100);
        Third();

    }

    public static void First() {

        int [] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 1){
                System.out.print("1 |");
            }else{
                System.out.print("0 |");
            }
        }
    }

    public static void Second(int hundred){
        System.out.println("\n");
        int [] arr = new int[hundred];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " | ");
        }

    }

    public static void Third(){
        System.out.println("\n");
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
                System.out.print(arr[i] + " | ");
            }else {
                System.out.print(arr[i] + " | ");
            }
        }
    }
}
