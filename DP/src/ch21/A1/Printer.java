package ch21.A1;

public class Printer implements Printable {
    private String name;
    public Printer() {
    	// 생성을 오래 걸리게 함
        heavyJob("Printer의 인스턴스를 생성중");
    }
    public Printer(String name) {                   // 생성자
        this.name = name;
        heavyJob("Printer의 인스턴스(" + name + ")를 생성중"); //본인을 생성할 때는 시간이 오래 걸림
    }
    public void setPrinterName(String name) {       // 이름의 설정
        this.name = name;
    }
    public String getPrinterName() {                // 이름의 취득
        return name;
    }
    public void print(String string) {              // 이름을 붙여서 표시
        System.out.println("=== " + name + " ===");
        System.out.println(string);
    }
    private void heavyJob(String msg) {             // 무거운 작업
        System.out.print(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.print(".");
        }
        System.out.println("완료");
    }
}
