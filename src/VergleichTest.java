public class VergleichTest {

    public static void main(String[] args) {

        int [] a = {3,5,1,3};
        int [] b = {1,5,3,3};
        boolean isEqual;

        Vergleich vergleich = new Vergleich();
        isEqual = vergleich.isEqual(a,b);

        System.out.println("Output: " + isEqual);




    }
}
