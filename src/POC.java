public class POC {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int a = 10;
        float b = 20.0F;
        if ((float)a < b) {
            System.out.println("a is less than b");
        }

        for(int i = 10; i < 20; ++i) {
            System.out.println(i);
        }
        System.out.println("First Commit in master");
        System.out.println("Second Commit in master");
        System.out.println("Third Commit in master");
        System.out.println("First Commit in feature2");
        System.out.println("Second Commit in feature2");
    }
}