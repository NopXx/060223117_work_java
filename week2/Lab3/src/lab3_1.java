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
        System.out.println("Value byte : " + varByte);
        System.out.println("Value short : "+ varShort);
        System.out.println("Value int : " + varInt);
        System.out.println("Value long : " + varLong);
        System.out.println("Value float : " + varFloat);
        System.out.println("Value double : " + varDouble);
        System.out.print("Value char : " + varChar);
        System.out.println(", Value ascii : " + (byte)varChar);
    }
}