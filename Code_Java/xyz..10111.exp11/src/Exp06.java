/**
 * �ַ����Ľ�ȡ�ͷָ�
 */
public class Exp06 {
    public static void main(String[] args) {
        String str = "2018-01-24";
        System.out.println("�ӵ������ַ���ȡ��ĩβ�Ľ����"+str.substring(5));
        System.out.println("�ӵ������ַ���ȡ�����߸��ַ��Ľ����"+str.substring(5,7));
        System.out.println("�ָ����ַ��������е�Ԫ������Ϊ��");
        String [] strArray = str.split("-");
        for(int i=0;i< strArray.length;i++){
            if(i!= strArray.length-1){
                System.out.print(strArray[i]+"��");
            }else {
                System.out.println(strArray[i]);
            }
        }
    }
}
