public class Main {

    public static void main(String[] args) {

        KioskProgram kioskProgram = new KioskProgram();
        kioskProgram.initKiosk();
        kioskProgram.welcomeMessage();
//        kioskProgram.collectMenuNumber();
//        kioskProgram.setQuantity();
        kioskProgram.setTotalPrice(kioskProgram.collectMenuNumber(), kioskProgram.setQuantity());
    }
}