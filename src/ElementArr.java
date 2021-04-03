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
    public static int[] deleteElement(int x, int[] arr) {
        for (int i = 0; i < arr.length;) {
            if(arr[i] == x) {
                for (int j = i; j < arr.length; j++) {
                    if(j == arr.length-1) {
                        arr[j] = 0;
                    } else {
                        arr[j] = arr[j+1];
                    }
                }
            } else {
                i++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = creatArr();
        printArr(arr);
        System.out.println();
        deleteElement(10, arr);
        printArr(arr);
    }
}
