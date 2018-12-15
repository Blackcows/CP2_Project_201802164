package Theater;

public class MyPage {
	private String name;  // 고객 아이디
	private String Auditorium;   //지역,상영관
	private String change;  //비밀번호 변경
	private String seat;  //자리 정보


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuditorium() {
		return Auditorium;
	}
	public void setAuditorium(String auditorium) {
		Auditorium = auditorium;
	}
	public String getChange() {
		return change;
	}
	public void setChange(String change) {
		this.change = change;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}

}
