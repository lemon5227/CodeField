package test05;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Set;

/**
 * @author 闫文博
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
        System.out.println("货物运输车辆保养完毕！");
    }

    @Override
    void transport(){
        System.out.println("货物运输车辆运输完毕！");
    }
}
