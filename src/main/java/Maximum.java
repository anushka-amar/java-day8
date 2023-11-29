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

    public static void main(String[] args) {
        Float a = 50.20f;
        Float b = 50.35f;
        Float c = 50.75f;

        System.out.println("The maximum out of the three float type is "+find_max(a,b,c));
    }
}
