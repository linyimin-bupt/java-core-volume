package chapter8;

public class BoundForTypeVAR {
    public static <T> T min(T[] a) {
        if (a == null || a.length == 0) {
            return null;
        }
        // The variable smallest has type T,which means that it could be an object of an arbitrary
        // class. We can not know the class to which T belongs whether has a compareTo method
        T smallest = a[0];
        for (T var : a) {
            if (var.compareTo(smallest) < 0) {
                smallest = var;
            }
        }

        return smallest;
    }

    /**
     * The solution is to restrict T to a class that implements the Comparable interface -- a standard interface
     * with a single method, compareTo. Achieve this by giving a bound for the type variable T
     * <T extends Comparable>
     * @param a
     * @param <T>
     * @return
     */
    public static <T extends Comparable> T min(T[] a) {
        if (a == null || a.length == 0) {
            return null;
        }
        T smallest = a[0];
        for (T var : a) {
            if (var.compareTo(smallest) < 0) {
                smallest = var;
            }
        }

        return smallest;
    }
}
