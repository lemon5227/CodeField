public class SeasonDemo {
	public static void main(String[] args) {
		Season.SPRING
	}
}
class Season{
	private final String seasonName;
	private final String seasonDesc;

	private Season(String seasonName, String seasonDesc){
		this.seasonName = seasonName;
		this.seasonDesc = seasonDesc;
	}

	public static final Season SPRING = new Season("春天","春暖花开");
	public static final Season SUMMER = new Season("夏天","夏日炎炎");
	public static final Season AUTUMN = new Season("秋天","秋高气爽");
	public static final Season WINTER = new Season("冬天","冰天雪地");

	//获取枚举对象属性


	public String getSeasonName() {
		return seasonName;
	}

	public String getSeasonDesc() {
		return seasonDesc;

	}

	@Override
	public String toString() {
		return "Season{" +
				"seasonName='" + seasonName + '\'' +
				", seasonDesc='" + seasonDesc + '\'' +
				'}';
	}
}