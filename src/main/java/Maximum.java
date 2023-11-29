public class Maximum {

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



    public static void main(String[] args) {

        System.out.println("The max out of the three integer type number is "+find_max(75, 50, 55));
        System.out.println("The max out of the three float type number is "+find_max(50.45f, 50.75f, 50.5f));
        System.out.println("The max out of the three strings lexicographically is "+find_max("Orange", "Peach", "PineApple"));
    }
}
