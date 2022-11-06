public class VergleichTest {

    public static void main(String[] args) {


        // Testarrays a und b 
        int [] a = {3,5,1,3};
        int [] b = {1,5,3,3};
        

        // Testarrays a1 und b1
        int [] a1 = {1,2,3,4};
        int [] b1 = {3,1,6,2};


        boolean isEqual;

        // Ein Objekt von Typ Vergleich wird erstellt.
        Vergleich vergleich = new Vergleich();
        // Aufruf der Methode isEqual mit den Parametern a und b
        isEqual = vergleich.isEqual(a,b);

        System.out.println("Output: " + isEqual);

        // Aufruf der Methode isEqual mit den Parametern a1 und b1
        isEqual = vergleich.isEqual(a1,b1);

        System.out.println("Output1: " + isEqual);




    }
}
