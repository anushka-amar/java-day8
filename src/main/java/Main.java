public class Main {
    public static void main(String[] args) {

        //Test-case1
        Maximum <Integer> obj1 = new Maximum<>(75,60,45);
        System.out.println("The max Integer type of the three is "+obj1.testMaximum());

        //Test-case2
        Maximum <Float> obj2 = new Maximum<>(50.25f, 50.35f, 50.15f );
        System.out.println("The max float type of the three is "+obj2.testMaximum());

        //Test-case3
        Maximum <String> obj3 = new Maximum<>("Apple", "Peach", "Pineapple" );
        System.out.println("The max String type lexicographically of the three is "+obj3.testMaximum());

    }
}
