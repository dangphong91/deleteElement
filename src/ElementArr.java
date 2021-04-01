import java.util.Scanner;

public class ElementArr {
    public static int[] creatArr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập size của mảng:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i< size; i++) {
            array[i] = (int) (Math.random()*2+10);
        }
        return array;
    }
    public static void printArr(int[] arr) {
        for (int i =0; i<arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
    public static void deleteElement(int x, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                if(i==arr.length-1){
                    arr[i] = arr[i-1];
                }
                else{
                    arr[i] = arr[i+1];
                }
                continue;
            }
            System.out.print(arr[i] + "  ");
        }
    }
    public static void main(String[] args) {
        int[] arr = creatArr();
        printArr(arr);
        System.out.println();
        deleteElement(10, arr);
    }
}
