public class HomeWork8 {


    public void tonerCount(int num) {


        int max = 100;
        for (int i = 0; i <= 100; i++) {
            int tonerLeft = max - num;
            if (tonerLeft == max) {
                System.out.println("The toner level is full");
                break;

            } else


                System.out.println("Printer has " + tonerLeft + " toner left ");
            break;

        }


    }

    public void pagesCount(int num) {
        int max = 100;

        for (int i = 0; i <= 100; i++) {
            int pagesLeft = max - num;
            if (pagesLeft == max) {
                System.out.println("Pages are full ");
                break;

            } else
                System.out.println("There are " + pagesLeft + " pages left in the printer ");
            break;


        }


    }

    public void singleSidedPages(int num) {

        int p=100;
        int t=100;
        for (int i = 0; i <= 100; i++) {

            p = p -num;
            t=t-num;
            System.out.println("print " + num + " single sided pages");
            System.out.println(p+" pages and "+ t + " toner left");
            break;





        }


    }
}



