public class Main {
    public static void main(String[] args) {

        //Test-case1
        Maximum <Integer> obj1 = new Maximum<>(75,60,45);
        obj1.testMaximum();

        //Test-case2
        Maximum <Float> obj2 = new Maximum<>(50.25f, 50.35f, 50.15f );
        obj2.testMaximum();

        //Test-case3
        Maximum <String> obj3 = new Maximum<>("Apple", "Peach", "Pineapple" );
        obj3.testMaximum();
    }
}
