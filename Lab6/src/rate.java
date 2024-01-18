import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class rate {
    public static void main(String[] args) {
        double rate5 = 0, rate10 = 0, rate15 = 0, rate20 = 0, total_rate = 0;
        int salary[] = { 50000, 250000, 1500000, 8000000 };
        DecimalFormat number = new DecimalFormat("#,###,###.##");
        String output = "";

        for (int i = 0; i < salary.length; i++) {
            output += "Salary: " +  number.format(salary[i]) + "\n";
            if (salary[i] > 0) {
                output += "Rate 0 - 100000 = 0 \n";
            }
            if (salary[i] > 100000) {
                rate5 =  (100000) * 0.05;
                total_rate += rate5;
                output += "Rate 100001 - 500000 =  " + number.format(rate5) + "\n";
            }
            if (salary[i] > 500000) {
                rate10 = (400000) * 0.1;
                total_rate += rate10;
                output += "Rate 500001 - 1000000 =  " + number.format(rate10) + "\n";
            }
            if (salary[i] > 1000000) {
                rate15 = (3000000) * 0.15;
                total_rate += rate15;
                output += "Rate 1000001 - 4000000 =  " + number.format(rate15) + "\n";
            }
            if (salary[i] > 4000000) {
                rate20 = (4000000) * 0.2;
                total_rate += rate20;
                output += "Rate 4000001 =  " + number.format(rate20) + "\n";
            }
            output += "Total Rate: " + number.format(total_rate) + "\n\n";
            rate5 = 0; 
            rate10 = 0;
            rate15 = 0;
            rate20 = 0;
            total_rate = 0;
        }
        JOptionPane.showMessageDialog(null, output, "Result", 1);

    }
}
