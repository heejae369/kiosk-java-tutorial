public class Main {

    public static void main(String[] args) {

        KioskProgram kioskProgram = new KioskProgram();
        kioskProgram.initKiosk();
        kioskProgram.printTotalPrice(kioskProgram.collectMenuNumber(), kioskProgram.setQuantity());
    }
}