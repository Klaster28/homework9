import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1 () {

        int sum = 0;
        int [] arr = generateRandomArray();
        for (int element:arr) {
            sum += element;
        }
        System.out.println ("Сумма за месяц равна - " + sum);
    }
    public static void task2 () {
        int[] arr = generateRandomArray();
        Arrays.sort(arr);
        System.out.println("Минимальная выплата за месяц составила - " + arr[0]);
        System.out.println("Максимальная выплата за месяц составила - " + arr[29] );

    }
    public static void task3 () {
        int sum = 0;
        float averageValue = 0;
        int [] arr = generateRandomArray();
        for (int element:arr) {
            sum += element;
            averageValue = sum / 30;
        }
        System.out.println("Среднее значение выплат в течении месяца составляет - " + averageValue );

    }
    public static void task4 () {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int w = reverseFullName.length - 1; w >= 0; w--) {
            System.out.print(reverseFullName[w]);
            if (w > 0) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}