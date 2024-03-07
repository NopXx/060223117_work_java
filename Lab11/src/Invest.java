import java.awt.*;

public class Invest {
    private float interestRate;
    private float oldAmount, newAmount;
    private float dollars, cents;
    private int years = 1, year_count = 0;

    public Invest() {

    }

    public void setAmount(float amount) {
        oldAmount = amount;
    }

    public void setRate(float rate) {
        interestRate = rate;
    }

    public void setYear(int year) {
        years = year;
    }

    public void anotherYear() {
        for (int i = 0; i < years; i++) {
            newAmount = oldAmount + (oldAmount * interestRate / 100.0f);
            dollars = (int) newAmount;
            cents = Math.round(100.0f * (newAmount - dollars));
            oldAmount = newAmount;
            year_count++;
        }
    }

    public void displayInterest(Graphics g) {
        g.drawString("Amount " + oldAmount, 10, 120);
        g.drawString("Interest " + interestRate, 10, 140);
        g.drawString("Years " + year_count, 10, 160);
        g.drawString("Your money at the end of the year is ",
                10, 180);
        g.drawString(dollars + " dollars " + cents + " cents",
                10, 200);
    }
}
