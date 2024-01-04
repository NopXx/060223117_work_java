import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class TestStrandom {
    public static void main(String[] args) {
        stdRandom rand = new stdRandom();
        String message1 = "", message2 = "", message3 = "", message4 = "";
        int row = 0;
        for (int i = 1; i <= 20; i++) {
                message1 += rand.random(20, 50) + "\t";
                message2 += rand.randomStartx100(20) + "\t";
                message3 += rand.random0(2) + "\t";
                message4 += rand.random1(2) + "\t";
                row++;
            if (row % 5 == 0) {
                message1 += "\n";
                message2 += "\n";
                message3 += "\n";
                message4 += "\n";
                row = 0;
            }
        }

        String output = "";
        for (int n = 1; n <= 55; n++)
            output += "=";
        output += "\n \tRandom Start 20 - End 50\n";
        for (int n = 1; n <= 55; n++)
            output += "=";
        output += "\n" + message1;
        // 
        for (int n = 1; n <= 55; n++)
            output += "=";
        output += "\n \tRandomStart + 100 Start 20\n";
        for (int n = 1; n <= 55; n++)
            output += "=";
        output += "\n" + message2;
        // 
        for (int n = 1; n <= 55; n++)
            output += "=";
        output += "\n \tRandom0 End 20\n";
        for (int n = 1; n <= 55; n++)
            output += "=";
        output += "\n" + message3;
        // 
        for (int n = 1; n <= 55; n++)
            output += "=";
        output += "\n \tRandom1 End 50\n";
        for (int n = 1; n <= 55; n++)
            output += "=";
        output += "\n" + message4;

         JOptionPane.showMessageDialog(null, new JTextArea(output),
                "StdRandom",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
