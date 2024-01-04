public class stdRandom {
    public int random(int start, int end) {
        int result;
        do {
            result = 1 + (int) (Math.random() * end);
        } while (result < start);
        return result;
    }

    public int randomStartx100(int start) {
        int result;
         do {
            result = 1 + (int) (Math.random() * (start + 100));
        } while (result < start);
        return result;
    }

    public int random0(int end) {
        int result;
         do {
            result = (int) (Math.random() * end);
        } while (result > end);
        return result;
    }

    public int random1(int end) {
        int result;
         do {
            result = 1 + (int) (Math.random() * end);
        } while (result < 1);
        return result;
    }

    public static void main(String[] args) {
        stdRandom rand = new stdRandom();
        for (int i = 1; i <= 20; i++) {
            System.out.println(rand.random(20, 50));
        }
    }

}
