public class VergleichTest {

    public static void main(String[] args) {

        int [] a = {3,5,1,3};
        int [] b = {1,5,3,3};

        int [] a1 = {1,2,3,4};
        int [] b1 = {3,1,6,2};

        boolean isEqual;

        Vergleich vergleich = new Vergleich();
        isEqual = vergleich.isEqual(a,b);

        System.out.println("Output: " + isEqual);


        isEqual = vergleich.isEqual(a1,b1);

        System.out.println("Output1: " + isEqual);




    }
}
