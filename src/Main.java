public class Main {
    static void TOH(int n, char initial_rod, char target_rod, char medium_rod){
        if (n == 0){
            return;
        }
        TOH(n-1, initial_rod, medium_rod, target_rod);
        System.out.println("Move disk "+n+" from rod "+initial_rod+" to rod "+target_rod);
        TOH(n-1, medium_rod, target_rod, initial_rod);
    }

    public static void main(String[] args) {
        int N = 3;
        TOH(N,'A','C','B');
    }
}
