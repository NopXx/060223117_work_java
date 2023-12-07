import javax.swing.JOptionPane;

public class lab3_1 {
    public static void main(String[] args) {
        byte varByte;
        short varShort;
        int varInt;
        long varLong;
        float varFloat;
        double varDouble;
        char varChar;

        varByte = (byte) 256;
        varShort = (short) 32800;
        varInt = 200000000;
        varLong = 500000000000L;
        varFloat = 120e10F + 234e10F;
        varDouble = 120e10 + 234e10;
        varChar = 'A';
        JOptionPane.showMessageDialog(null, 
        "Value byte : " + varByte + "\nValue short : " + varShort + "\nValue int : " + varInt + "\nValue long : " + varLong + "\nValue float : " + varFloat + "\nValue double : " + varDouble +
        "\nValue char : " + varChar + "\nValue ascii : " + (byte)varChar, 
        "Result", 1);
    }
}