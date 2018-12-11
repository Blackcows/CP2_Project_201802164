package Movie;

public class Movie {
	
	/**
	 * 이런식으로 만들면 됨. extends를 이용해서 카테고리 별로 따로 클래스 정의해서 사용하면 좋을듯
	 * 필요하면 필드 더 추가해서 써도 됨. 대신 꼭 톡방에 알려주세요~!
	 * get set 메소드 만들 때 화면 상단에 Source > Generate Getters and Setters 쓰면 편함
	 */
	
	private String title; // 제목
	private String releasedate; // 개봉일
	private String director; // 감독
	private String range; // 관람등급 (All, 12+, 15+, 19+(R))
	private String category; // 카테고리
	private String runtime; // 상영시간
	
	//Getter, Setter (접근자, 설정자)
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getReleasedate() {
		return releasedate;
	}
	public void setReleasedate(String releasedate) {
		this.releasedate = releasedate;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getRange() {
		return range;
	}
	public void setRange(String range) {
		this.range = range;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getRuntime() {
		return runtime;
	}
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	
}
