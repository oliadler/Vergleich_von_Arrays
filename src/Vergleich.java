public class Vergleich {

    private boolean sameSize;
    private boolean samePairs;
    private boolean equal;

    public boolean isEqual(int[] a, int[] b) {

        sort(a);
        sort(b);

        if (a.length == b.length) {
            sameSize = true;

        }


        //{1,3,3,5};
        //{1,3,3,5};


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[i]) {
                    samePairs = true;
                    break;

                } else {
                    samePairs = false;
                    break;
                }
            }

        }

        if (sameSize && samePairs) {
            equal = true;
        }
        return equal;
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
