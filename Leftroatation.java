package basicoparations;

public class Leftroatation {
    public static void leftroatation(int[] array, int d, int N) {
        d = d % N;

        int[] temp = new int[N];
        int k = 0;
        for (int i = d; i < N; i++) {
            temp[k] = array[i];
            k++;
        }
        for (int i = 0; i < d; i++) {
            temp[k] = array[i];
            k++;
        }
        for (int i = 0; i < N; i++) {
            array[i] = temp[i];
        }
    }

    public static void printarr(int[] array, int N) {
        for (int i = 0; i < N; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 };

        int N = array.length;
        int d = 2;

        leftroatation(array, d, N);
        printarr(array, N);

    }
}
