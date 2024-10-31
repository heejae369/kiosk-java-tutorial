import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class KioskProgram {

    private final Map<Integer, FoodItem> menu = new HashMap();

    private final static Scanner sc = new Scanner(System.in);

    private Integer menuNumber = -1;
    private Integer menuQuantity = 0;
    private Integer totalPrice = 0;

    public void initKiosk() {
        menu.put(1, new FoodItem("김밥", 1000));
        menu.put(2, new FoodItem("계란 김밥", 1500));
        menu.put(3, new FoodItem("충무 김밥", 1000));
        menu.put(4, new FoodItem("떡볶이", 2000));
    }


    public void welcomeMessage() {
        System.out.println("[안내]안녕하세요. 분식점에 오신 것을 환영합니다.");
        printLine();
    }

    public Integer collectMenuNumber() {
        //welcomeMessage();
        do {
            System.out.println("[안내]원하시는 메뉴의 번호를 입력하여 주세요");
            System.out.println("1) 김밥(1000원) 2) 계란 김밥(1500원) 3) 충무 김밥(1000원) 4) 떡볶이(2000원)");

            try {
                menuNumber = sc.nextInt();

                if (1 > menuNumber || menuNumber > 4) {
                    System.out.println("[안내]메뉴에 포함된 번호를 입력하여 주세요.");
                }

            } catch (InputMismatchException e) {
                System.out.println("잘못된 타입 입력 : " + e.getCause());
                sc.nextLine();
            }
        } while (1 > menuNumber || menuNumber > 4);
        printLine();
        return menuNumber;
    }

    public Integer setQuantity() {
        do {
            System.out.println("[안내]선택하신 메뉴의 수량을 입력하여 주세요.");
            System.out.println("(※ 최대 주문 가능 수량 : 99)");
            menuQuantity = 0;
            try {
                menuQuantity = sc.nextInt();

                if (menuQuantity > 99 || menuQuantity < 1) {
                    System.out.println("[경고] " + menuQuantity + "개는 입력하실 수 없습니다.");
                    System.out.println("[경고]수량 선택 화면으로 돌아갑니다.");
                    printLine();
                }
            } catch (InputMismatchException e) {
                //InputMismatchException 이 발생하면 sc 가 읽고 있던 위치에서 멈추 남아있는 값이 그대로 유지된다
                //따라서 sc 버퍼를 비워둬야한다
                System.out.println("잘못된 타입 입력 : " + e);
                sc.nextLine();
                //continue;

            }
        } while (menuQuantity > 99 || menuQuantity < 1);
        return menuQuantity;
    }

    public void setTotalPrice(Integer menuNumber, Integer menuQuantity) {
        totalPrice = menu.get(menuNumber).getPrice() * menuQuantity;
        System.out.println("[안내]주문하신 메뉴의 총 금액은 " + totalPrice + "원 입니다.");
    }

    private void printLine() {
        System.out.println("------------------------------");
    }

}


