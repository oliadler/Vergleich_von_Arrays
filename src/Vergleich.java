public class Vergleich {

    private boolean sameSize;

    private boolean equal = true;

    public boolean isEqual(int[] a, int[] b) {

        sort(a);
        sort(b);

        if (a.length == b.length) {
            sameSize = true;

        }

        for (int i = 0; i < a.length; i++) {
            
                if (a[i] != b[i])
                {
                    equal = false;
                }
        }

        
        if (equal && sameSize)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


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
