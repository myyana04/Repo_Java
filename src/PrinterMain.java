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
        p.print(11,":john");
        p.printerSummary();
        p.print(10);
        p.printerSummary();
        p.print(10,"Rasel");
        p.printerSummary();
        p.print(10,"lo");
        p.printerSummary();
        p.addToner(27);
        p.addPages(26);
        p.printerSummary();
        p.addToner(15);
        p.printerSummary();
        p.print(11,"lo");
        p.printerSummary();
        p.addPages(20);
        p.addToner(55);

    }


}
