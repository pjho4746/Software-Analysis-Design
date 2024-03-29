package ch06.Sample;

import ch06.Sample.framework.*;

public class Main {
    public static void main(String[] args) {

        // 준비
        Manager manager = new Manager();

        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

		UnderlinePen upen2 = new UnderlinePen('%');
/*
		upen.use("csh");
		mbox.use("csh");
		sbox.use("csh");

		upen2.use("csh");
*/
		// manager한테 등록
        manager.register("strong message", upen); //key-value
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        //  Prototype으로부터 복제 생성
        // 한번 생성해두면, 필요할 때마다 만들 수 있어 효율적
        Product p1 = manager.create("strong message"); 
        p1.use("Hello, world.");
        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");
        Product p3 = manager.create("slash box");
        p3.use("Hello, world.");

    }
}
