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
    public static Float find_max(Float x, Float y, Float z){
        Float max = x;
        if(y.compareTo(max)>0){
            max = y;
        }
        if(z.compareTo(max)>0){
            max = z;
        }
        return max;
    }
    public static String find_max(String x, String y, String z){
        String max = x;
        if(y.compareTo(max)>0){
            max = y;
        }
        if(z.compareTo(max)>0){
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        String x = "Orange";
        String y = "Peach";
        String z = "Banana";

        System.out.println("The max out of the three strings lexicographically is "+find_max(x,y,z));
    }
}
