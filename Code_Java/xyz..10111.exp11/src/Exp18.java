public class Exp18 {
    public static void main(String[] args) {
        int num = 123;
        //1.ͨ��String.valueOf()����������������ת��Ϊ�ַ���
        String string = String.valueOf(num);
        System.out.println("int--->�ַ�����"+string);
        //2.ͨ����װ���valueOf()��̬�����������������ͺ��ַ���ת��Ϊ��װ��
        String str = "998";
        Integer integer = Integer.valueOf(num);
        Integer integer2 = Integer.valueOf(str);
        System.out.println("int--->��װ��"+integer);
        System.out.println("�ַ���---->��װ��"+integer2);
        //3.ͨ����װ���вι��췽���������������ͺ��ַ���ת��Ϊ��װ��
        Integer integer3 = new Integer(num);
        Integer integer4 = new Integer(str);
        System.out.println("������int--->��װ��"+integer3);
        System.out.println("�������ַ���--->��װ��"+integer4);
        //4.ͨ����װ���parseXXX()��̬�������ַ���ת��Ϊ������������
        int parseInt = Integer.parseInt(str);
        System.out.println("�ַ���ת��Ϊ������������"+parseInt);
        //5.ͨ����װ���toString()��������װ��ת��Ϊ�ַ���
        String string2 = integer.toString();
        System.out.println("��װ��ת��Ϊ�ַ���"+string2);
    }
}
