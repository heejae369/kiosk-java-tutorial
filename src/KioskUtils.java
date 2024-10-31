import java.util.Map;

public class KioskUtils {

    private static final int MAX_QUANTITY = 99;
    private static final int MIN_QUANTITY = 1;

    public static Integer calculateTotalPrice(Integer price, Integer count) {
        return price * count;
    }

    public static boolean isValidMenuOption(int option, int maxOption) {
        return (0 < option & option < maxOption);
    }

    public static boolean isValidQuantity(int quantity) {
        // 리턴을 조건식만 반환해도됨
        return (MIN_QUANTITY <= quantity & quantity <= MAX_QUANTITY);
    }

    public static int maxOptionCalculater(Map map) {
        return map.size() + 1;
    }

    public static boolean isNumeric(String input) {
        // 정규식, 남발하면 성능이 떨어진다
//        return input.matches("[0-9]+");
        String number = "0123456789";
        for (int i = 0; i < input.length(); i++) {
            if (number.indexOf(input.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }

//    public static int stringToInt(
//        String input) { // static 안에 같은 클래스 메서드 쓰려면 마찬가지로 static 써야함, new 를 안해도 쓰기 위해서, static 이 없으면 감지를 못함 static 메서드를 다른 클래스에서 쓸 때에
//        if (isNumeric(input)) {
//
//        }
//    }

}
