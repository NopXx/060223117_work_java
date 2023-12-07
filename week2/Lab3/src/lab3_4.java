public class lab3_4 {
    public static void main(String[] args) {
        boolean result = false;
        int number = 10;
        String color = "red";
        System.out.println("When Number = " + number + ", Color = " + color);

        result = (number < 10) && (color == "red");
        System.out.println("result =  (number < 10) && (color == \"red\") = " + result);

        result = (number < 10) & (color == "red");
        System.out.println("result =  (number < 10) & (color == \"red\") = " + result);

        result = (number < 10) || (color == "red");
        System.out.println("result =  (number < 10) || (color == \"red\") = " + result);

        result = (number < 10) | (color == "red");
        System.out.println("result =  (number < 10) | (color == \"red\") = " + result);

        result = (number < 10) ^ (color == "red");
        // ^ = xor
        System.out.println("result =  (number < 10) ^ (color == \"red\") = " + result);

        result = !(number < 10);
        System.out.println("result = !(number < 10) = " + result);

    }
}
