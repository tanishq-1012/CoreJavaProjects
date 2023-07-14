interface Printer {
    void print(String document);
}

// Class representing a Laser Printer
class LaserPrinter implements Printer {
    @Override
    public void print(String document) {
        System.out.println("Printing document using a Laser Printer: " + document);
    }
}

// Class representing an Inkjet Printer
class InkjetPrinter implements Printer {
    @Override
    public void print(String document) {
        System.out.println("Printing document using an Inkjet Printer: " + document);
    }
}

// Class representing a Document Manager
class DocumentManager {
    private Printer printer;

    public DocumentManager(Printer printer) {
        this.printer = printer;
    }

    public void printDocument(String document) {
        printer.print(document);
    }
}
public class Ques5 {

	public static void main(String[] args) {
		 Printer laserPrinter = new LaserPrinter();

	        // Create an InkjetPrinter object
	        Printer inkjetPrinter = new InkjetPrinter();

	        // Create a DocumentManager with LaserPrinter
	        DocumentManager documentManager1 = new DocumentManager(laserPrinter);
	        documentManager1.printDocument("Sample Document 1");

	        // Create a DocumentManager with InkjetPrinter
	        DocumentManager documentManager2 = new DocumentManager(inkjetPrinter);
	        documentManager2.printDocument("Sample Document 2");
	}

}
