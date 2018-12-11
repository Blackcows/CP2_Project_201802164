package Movie;

public class Movie {
	
	/**
	 * �̷������� ����� ��. extends�� �̿��ؼ� ī�װ� ���� ���� Ŭ���� �����ؼ� ����ϸ� ������
	 * �ʿ��ϸ� �ʵ� �� �߰��ؼ� �ᵵ ��. ��� �� ��濡 �˷��ּ���~!
	 * get set �޼ҵ� ���� �� ȭ�� ��ܿ� Source > Generate Getters and Setters ���� ����
	 */
	
	private String title; // ����
	private String releasedate; // ������
	private String director; // ����
	private String range; // ������� (All, 12+, 15+, 19+(R))
	private String category; // ī�װ�
	private String runtime; // �󿵽ð�
	
	//Getter, Setter (������, ������)
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
