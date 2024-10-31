public class Main {

    public static void main(String[] args) {

        KioskProgram kioskProgram = new KioskProgram();
        kioskProgram.startKiosk();
        kioskProgram.collectMenuNumber();
        kioskProgram.selectQuantity();
    }
}