package chapter11.generic;

public class GenericPrinterTest {

    public static void main(String[] args) {

        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        Powder powder = new Powder();
        powderPrinter.setMaterial(powder);
        System.out.println(powderPrinter.toString());

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        Plastic platic = new Plastic();
        plasticPrinter.setMaterial(platic);
        System.out.println(plasticPrinter.toString());

        powderPrinter.printing();
        plasticPrinter.printing();
    }
}
