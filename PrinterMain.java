public class PrinterMain {
    public static void main(String[] args) {

        Printer p=new Printer();
        p.print(10);
        p.printerSummary();
        p.addPages(3);
        p.printerSummary();
        p.addPages(6);
        p.printerSummary();
        p.addToner(9);
        p.printerSummary();

    }


}
