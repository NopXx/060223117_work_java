import javax.swing.*;

/**
 * TestParcelTerry
 */
public class ParcelTerry {
    private double paymoney;
    private double weight;
    private int typeservice;

    public void ParcelTerry() {
        
    }
    public void ParcelTerry(double paymoney,int typeservice) {

    }

    public void Setpaymoney(double m) {
        paymoney = m;
    }

    public void Setweight(double m) {
        weight = m;
    }

    public void Settypeservice(int t) {
        typeservice = t;
    }

    public double Getpaymoney(double m) {
        return paymoney;
    }

    public double Getweight() {
        return weight;
    }

    public int Gettypeservice(int t) {
        return typeservice;
    }

    public double ParcelCalator(int typeservice, double weight) {

        double moneyPay = 0;
        switch (typeservice) {
            case 1:
                if (weight <= 1000) {
                    moneyPay = 50;
                } else {
                    double w2 = weight - 1000;
                    moneyPay = 50 + (w2 / 20);
                }
                break;
            case 2:
                if (weight <= 1000) {
                    moneyPay = 75;
                } else {
                    double w2 = weight - 1000;
                    moneyPay = 75 + (w2 / 10);
                }
                break;
            case 3:
                if (weight <= 500) {
                    moneyPay = 100;
                } else {
                    double w2 = weight - 500;
                    moneyPay = 100 + (w2 / 6.6);
                }
                break;
            default:
                break;
        }
        return moneyPay;
    }
    
}