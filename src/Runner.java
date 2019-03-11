import java.util.Random;

public class Runner {

    public static void main(String[] args) {

        BubbleSort b = new BubbleSort();

        Random r = new Random();

        int a[] = {r.nextInt(2000), r.nextInt(70), r.nextInt(40), r.nextInt(10), r.nextInt(500), r.nextInt(20), r.nextInt(200)};
        //int a[]=null;

        b.bubbleSort(a);
        b.display(a);

    }


}

