package Exception.TryCatch;

public class TryCatchExcercise01 {
    public static int method() {
        int i = 1;
        try {
            i = i+1;
            String[] names = new String[3];
            if (names[1].equals("tom")) {
                System.out.println(names[1]);
            } else {
                names[3] = "qf";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {
            i = i+1;
            return i;
        } finally {
            i = i+1;
            System.out.println("i="+i);
        }
    }

    public static void main(String[] args) {
        System.out.println(method());
    }
}
