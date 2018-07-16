package dennis.practice.algorithm;

public class BackTracking {
    boolean[] used = new boolean[5];
    int[] solution = new int[5];

    // From 演算法筆記
    public void backtrack(int n) {
        if (n == 5) {
            for (int i = 0; i < 5; i++) {
                System.out.print(solution[i]);
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < 5; i++) {
            if (!used[i]) {
                used[i] = true;

                solution[n] = i;
                backtrack(n + 1);

                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        BackTracking test = new BackTracking();
        test.backtrack(0);
    }
}
