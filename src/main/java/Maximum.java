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

    public T find_max(){
        Collections.sort(list);
        int index = list.size();
        return list.get(index-1);
    }


}
