package chapter8;

public class ArrayAlg {
    /**
     * Generic method
     * @param a
     * @param <T>
     * @return
     */
    public static <T> T getMiddle(T ... a) {
        return a[a.length / 2];
    }

    public static Pair<String> minmax(String[] a) {
        if (a == null || a.length == 0) {
            return null;
        }

        String min = a[0];
        String max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (min.compareTo(a[i]) < 0) {
                min = a[i];
            } else if (max.compareTo(a[i]) > 0) {
                max = a[i];
            }
        }

        Pair<String> pair = new Pair<String>(min, max);
        return pair;
    }
}
