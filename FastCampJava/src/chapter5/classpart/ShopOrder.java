package chapter5.classpart;

import java.util.Date;

public class ShopOrder {
    String orderNumber;
    String orderCustomId;
    String orderDate;
    String customName;
    String orderItemNumber;
    String customAdrres;

    public void showOrderInfo() {
        System.out.println("주문 번호 : " + orderNumber);
        System.out.println("주문자 아이디 : " + orderCustomId);
        System.out.println("주문 날짜 : " + orderDate);
        System.out.println("주문자 이름 : " + customName);
        System.out.println("주문 상품 번호 : " + orderItemNumber);
        System.out.println("배송 주소 : " + customAdrres);
        }
}
