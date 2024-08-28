public class Bai4 {
    import java.util.Arrays;
import java.util.Scanner;

    public class BaiTap {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Nhập số lượng phần tử của mảng: ");
            int n = scanner.nextInt();


            int[] array = new int[n];

            System.out.println("Nhập các phần tử của mảng:");
            for (int i = 0; i < n; i++) {
                System.out.print("Phần tử thứ " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            }


            Arrays.sort(array);


            System.out.println("Mảng sau khi sắp xếp theo thứ tự tăng dần là:");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();


            scanner.close();
        }
    }

}
