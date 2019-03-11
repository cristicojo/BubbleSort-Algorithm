public class BubbleSort {

    public void bubbleSort(int a[]) {


        if (a != null) {

            for (int z : a)
                System.out.print(z + " ");

            System.out.println();
            for (int i = 0; i < a.length; i++) {

                for (int j = i; j < a.length; j++) {

                    if (a[i] > a[j]) {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
        } else
            System.out.println("dati array diferit de null");
    }

    public void display(int a[]) {

        if (a != null) {

            for (int x : a)
                System.out.print(x + " ");

        }
    }
}

