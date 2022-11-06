public class Vergleich {

    // Dekleration und Initialisierung der Variablen sameSize und equal.
    private boolean sameSize;

    private boolean equal = true;

    public boolean isEqual(int[] a, int[] b) {


        // Die Sortiermethode wird aufgerufen.
        sort(a);
        sort(b);

        // Hier wird die Überpürft, ob beide Arrays die selbe Länge haben.

        if (a.length == b.length) {
            sameSize = true;

        }

        // Überprüft, ob die Elemente im Array gleich sind, ansonsten wird equal auf false gesetzt.

        for (int i = 0; i < a.length; i++) {
            
                if (a[i] != b[i])
                {
                    equal = false;
                }
        }

        // Nur wenn beide Bedingungen true sind, gibt die Methode "isEqual()" ein true zurück.
        
        if (equal && sameSize)
        {
            return true;
        }
        else
        {
            return false;
        }
    }



    // Methode, um ein Array nach aufsteigender größer zu sortieren.

    public int[] sort(int[] unsorted) {

        for (int i = 1; i < unsorted.length; i++) {

            for (int j = 0; j < unsorted.length - i; j++) {
                int temp;

                if (unsorted[j] > unsorted[j + 1]) {
                    temp = unsorted[j];
                    unsorted[j] = unsorted[j + 1];
                    unsorted[j + 1] = temp;
                }
            }
        }

        return unsorted;
    }
}
