package test05;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Set;

/**
 * @author ���Ĳ�
 */
public class SFTran extends Transportation implements CarCare {
    public SFTran(){

    }
    public SFTran(String No,String model,String admin){
        setNo(No);
        setAdmin(admin);
        setModel(model);
    }
    /**
     *
     */
    @Override
    public void upKeep() {
        System.out.println("�������䳵��������ϣ�");
    }

    @Override
    void transport(){
        System.out.println("�������䳵��������ϣ�");
    }
}
