package hw10.ex2.network;

public class HW10Ex2NetWork {

    public static void main(String[] args) {
        NetWork net = new NetWork();
        Time justDoIt = new Time(net);
        justDoIt.start();
    }
}
