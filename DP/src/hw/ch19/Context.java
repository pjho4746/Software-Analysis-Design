package hw.ch19;

public interface Context {

    public abstract void setClock(int hour);                // �ð��� ����
    public abstract void changeState(State state);          // ���º�ȭ
    public abstract void callSecurityCenter(String msg);    // ����� ȣ��
    public abstract void recordLog(String msg);             // ����� ���
}