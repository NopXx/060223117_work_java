import javax.swing.JOptionPane;

public class test1 {
    public static void main(String[] args) {
        int n;
        double totalScore; 
        n = Integer.parseInt(JOptionPane.showInputDialog("Enter number of score : "));
        totalScore = getScore(n);
        JOptionPane.showMessageDialog(null, "Average Score is " + average(totalScore, n), "Result", 1);

    }

    public static double getScore(int n) {
        int totalScore = 0;

        for (int i = 1; i <= n; i++) {
            totalScore += Integer.parseInt(JOptionPane.showInputDialog("Enter Score " + i));
        }
        return totalScore;
    }

    public static double average(double score, int n) {
        return score / (double) n;

    }
}
