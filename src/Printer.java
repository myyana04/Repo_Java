public class Printer {
    final int maxPages = 100;
    final int maxToner = 100;
    int currentPagesCount=100;
    int currentTonerCount=100;

    public void print(int paperToPrint) {
        if (paperToPrint <= currentPagesCount && paperToPrint <= currentTonerCount) {
            currentPagesCount = currentPagesCount - paperToPrint;
            currentTonerCount = currentTonerCount - paperToPrint;
            System.out.println("Pages print successfully");

        } else {
            System.out.println("Not enough paper or Toner");
        }

    }

    public void print(int paperToPrint, String names) {
        int toner=paperToPrint;

        if (paperToPrint % 2 == 0) {
            paperToPrint = paperToPrint / 2;


        } else {
            paperToPrint = (paperToPrint / 2) + 1;
        }
        if (paperToPrint <= currentPagesCount && toner <= currentTonerCount) {
            currentPagesCount = currentPagesCount - paperToPrint;
            currentTonerCount = currentTonerCount - toner;
            System.out.println("Pages print successfully");

        } else {
            System.out.println("Not enough paper or Toner");

        }


    }

    public void addPages(int pages) {
        int paperNeeeded = maxPages - currentPagesCount;
        if (pages <= paperNeeeded) {
            currentPagesCount = currentPagesCount + paperNeeeded;
            System.out.println("Pages added successfully");
        } else {
            System.out.println("Can't add paper at this time");

        }
    }


    public void addToner(int toner) {

        int tonerNeeded = maxToner - currentTonerCount;
        if (toner <= tonerNeeded) {
            currentTonerCount = currentTonerCount + toner;
            System.out.println("Toner added successfully");
        } else {
            System.out.println("can't add "+toner+" toner at this time");

        }
    }


    public void printerSummary(){
        System.out.println("Toner level: "+currentTonerCount+
                "\n Paper level: "+currentPagesCount);

    }
}
