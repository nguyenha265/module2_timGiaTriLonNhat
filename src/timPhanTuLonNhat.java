import java.util.Scanner;

public class timPhanTuLonNhat {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20 || size < 1)
                System.out.println("phần tủ không quá 20 hoặc nhỏ hơn 1");
        } while (size > 20 || size < 1);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("nhập phần tủ cho mảng " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
