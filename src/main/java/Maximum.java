public class Maximum <T extends Comparable<T>>{

    private T x, y, z;

    public Maximum(T x, T y, T z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T testMaximum (){
        T res = Maximum.find_max(x,y,z);
        return res;
    }

    public static <T extends Comparable<T>> T find_max(T x, T y, T z){
        T max = x;
        if(y.compareTo(max)>0){
            max = y;
        }
        if(z.compareTo(y)>0){
            max = z;
        }
        return max;
    }

}
