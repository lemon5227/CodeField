package test05;

public class Demo {
    public static void main(String[] args) {
        SendTask st = new SendTask("123546","50");
        st.sendBefore();
        SFTran t = new SFTran("yuA","x5","ะกร๗");
        phone p = new phone();
        st.send(t,p);
        st.sendAfter(t);
        t.upKeep();
    }
}
