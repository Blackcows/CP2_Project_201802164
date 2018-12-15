package Theater;

public class Ticket {
	private String adult;  //어른
	private String child;  //청소년
	private String seat;  //좌석
	private String price;  //가격
	private String type;  //결제수단


	public String getAdult() {
		return adult;
	}
	public void setAdult(String adult) {
		this.adult = adult;
	}
	public String getChild() {
		return child;
	}
	public void setChild(String child) {
		this.child = child;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	/* 함수에서 예매, 상영관 객체에서 좌석, 인원은 여기서 입력, 합쳐서 티켓 정보 생성 */

}
