/*
1����̰���ʵ������ֻ�����ӳ���һ����׼��Phone��������һ��������PhoneDemo����Phone��Ĺ��ܡ��������£�
	��1�������ֻ���Phone�����³�Ա������
			Ʒ�ƣ�String  brand;
			�۸�int    price;
			��ɫ��String  color;
	��2�����ÿһ����Ա����������Ӧ��getXxx()/setXxx()�����Լ���ʾ��Ա����ֵ��toString()������
	��3������һ��������PhoneDemo���Թ��ܣ��������£�����һ��������ͨ��getXxx()���������Ա������ֵ,��ͨ��setXxx()�������ö���ĳ�Ա������ֵ������toString()������ʾ����ĳ�Ա������ֵ�����Խ�����£�
 */
package cn.num01;
public class PhoneDemo {

	public static void main(String[] args) {
		Phone p=new Phone();
		System.out.println(p.getBrand()+"---"+p.getPrice()+"---"+p.getColor());
		System.out.println("----------------------");
		p.setBrand("��Ϊ");
		p.setPrice(3888);
		p.setColor("������");
//		System.out.println(p.toString());
		System.out.println(p);

	}

}
