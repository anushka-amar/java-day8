public class Maximum {
    public static Integer find_max(Integer x, Integer y, Integer z){
        Integer max = x;
        if(y.compareTo(max)>0){
            max = y;
        }
        if(z.compareTo(max)>0){
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        Integer x = 50;
        Integer y = 75;
        Integer z = 600;

        System.out.println("The maximum out of the three integer is "+find_max(x,y,z));
    }
}
