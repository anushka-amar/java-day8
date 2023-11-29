import java.util.*;

public class Maximum <T extends Comparable<T>>{

    private List<T> list;

    public Maximum(T... list){
        this.list = Arrays.asList(list);
    }
    public T testMaximum (){
        T res = find_max();
        return res;
    }

<<<<<<< HEAD
    public static <T extends Comparable<T>> T find_max(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(y) > 0) {
            max = z;
        }
        return max;
=======
    public T find_max(){
        Collections.sort(list);
        int index = list.size();
        return list.get(index-1);
>>>>>>> UC4
    }
   


}
