import javax.swing.JOptionPane;

public class lab3_4 {
    public static void main(String[] args) {
        boolean result = false;
        int number = 10;
        String color = "red";
        JOptionPane.showMessageDialog(null, "When Number = " + number + ", Color = " + color, "Result", 1);

        result = (number < 10) && (color == "red");
        JOptionPane.showMessageDialog(null, "result =  (number < 10) && (color == \"red\") = " + result, "Result", 1);
        
        result = (number < 10) & (color == "red");
        JOptionPane.showMessageDialog(null, "result =  (number < 10) & (color == \"red\") = " + result, "Result", 1);
        
        result = (number < 10) || (color == "red");
        JOptionPane.showMessageDialog(null, "result =  (number < 10) || (color == \"red\") = " + result, "Result", 1);
        
        result = (number < 10) | (color == "red");
        JOptionPane.showMessageDialog(null, "result =  (number < 10) | (color == \"red\") = " + result, "Result", 1);
        
        result = (number < 10) ^ (color == "red");
        // ^ = xor
        JOptionPane.showMessageDialog(null, "result =  (number < 10) ^ (color == \"red\") = " + result, "Result", 1);
        
        result = !(number < 10);
        JOptionPane.showMessageDialog(null, "result = !(number < 10) = " + result, "Result", 1);

    }
}
