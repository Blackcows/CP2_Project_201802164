package Theater;

public class Theater {
	private String theater;  // 영화관
	private String area;  //지역
	private String seat;  //좌석      예매 할 때 상영관에서 좌석 받아오기 
	private String ticket; 


	public String getTheater() {
		return theater;
	}
	public void setTheater(String theater) {
		this.theater = theater;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}

}
