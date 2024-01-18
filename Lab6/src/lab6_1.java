import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * lab6_1
 */
public class lab6_1 {
    public static void main(String[] args) {
        int X[] = new int[10];
        int Y[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        final int Array_Size = 10;
        String output = "";
        int Z[]; 
        Z = new int[Array_Size]; 
        
        for (int i = 0; i < X.length; i++)
            X[i] = i;
        for (int i = 0; i < Z.length; i++)
            Z[i] += X[i] * 5 + Y[i];
        
        output += "\tIndex \tArray X \tArray Y \tArray Z\n";
        for (int i = 0; i < X.length; i++) {
            output += "\t" + X[i] + " \t\t" + X[i] + "\n";
            output += " \t\t" + Y[i] + " \t\t" + Z[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, new JTextArea(output), "Result", 1);
    }
}