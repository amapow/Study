package chap16_package_and_static.com.java.main;

import chap16_package_and_static.com.java.accountBook.AccountBook;

public class main {
    public static void main(String[] args) {
        AccountBook account = new AccountBook("가계부");
        account.addAmount(500);
        account.addAmount(400);
        account.delAmount(500);
    }
}
