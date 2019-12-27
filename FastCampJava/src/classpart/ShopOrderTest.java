package classpart;
import java.util.Date;

public class ShopOrderTest {
    public static void main(String[] args) {
        ShopOrder orderTest = new ShopOrder();

        orderTest.orderNumber = "201907210001";
        orderTest.orderCustomId = "abc123";
        orderTest.orderDate = "2019-12-21";
        orderTest.customName = "홍길순";
        orderTest.orderItemNumber = "PD0345-12";
        orderTest.customAdrres = "서울";

        orderTest.showOrderInfo();
    }
}
