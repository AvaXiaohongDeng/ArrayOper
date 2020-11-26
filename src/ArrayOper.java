public class ArrayOper {
    public static void main(String[] args) {
        String[] names = {"Henry", "Ava", "Yoyo", "Andy"};
        int[] ages = {44, 44, 15, 6};
        float[] highs = {1.71f, 1.56f, 1.60f, 1.20f};
        display(names);
        display(ages);
        display(highs);
    }

    public static void display(String[] arr){
        System.out.println("\nString array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + (i+1) + " is " + arr[i]);
        }
    }

    //overloading method
    public static void display(int[] arr){
        System.out.println("\nInteger array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + (i+1) + " is " + arr[i]);
        }
    }

    //overloading method
    public static void display(float[] arr){
        System.out.println("\nInteger array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + (i+1) + " is " + arr[i]);
        }
    }
}
