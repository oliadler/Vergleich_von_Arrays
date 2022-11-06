public class Vergleich {

    // Dekleration und Initialisierung der Variablen sameSize und equal.
    private boolean sameSize;

    private boolean equal = true;

    public boolean isEqual(int[] a, int[] b) {

        // a und b werden ueberprueft, ob sie eventuell leer sind. Falls ja wird das Programm beendet.
        if (a == null || a.length == 0)
        {
            System.out.println("Das Array ist leer.");
            System.exit(0);
        }

        if (b == null || b.length == 0)
        {
            System.out.println("Das Array ist leer.");
            System.exit(0);
        }

        // Die Sortiermethode wird aufgerufen.
        sort(a);
        sort(b);

        // Hier wird die ueberprueft, ob beide Arrays dieselbe Länge haben.

        if (a.length == b.length) {
            sameSize = true;

        }

        // ueberprueft, ob die Elemente im Array gleich sind, ansonsten wird equal auf false gesetzt.

        for (int i = 0; i < a.length; i++) {
            
                if (a[i] != b[i])
                {
                    equal = false;
                }
        }

        // Nur wenn beide Bedingungen true sind, gibt die Methode "isEqual()" ein true zurueck.
        
        if (equal && sameSize)
        {
            return true;
        }
        else
        {
            return false;
        }
    }



    // Methode, um ein Array nach aufsteigender groeßer zu sortieren.

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
