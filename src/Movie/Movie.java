package Movie;

import java.io.Serializable;

public class Movie implements Serializable {

	/**
	 * �̷������� ����� ��. extends�� �̿��ؼ� ī�װ� ���� ���� Ŭ���� �����ؼ� ����ϸ� ������
	 * �ʿ��ϸ� �ʵ� �� �߰��ؼ� �ᵵ ��. ��� �� ��濡 �˷��ּ���~!
	 * get set �޼ҵ� ���� �� ȭ�� ��ܿ� Source > Generate Getters and Setters ���� ����
	 */

	private String title; // ����
	private String engtitle;
	private String releasedate; // ������
	private String director; // ����
	private String rating;  //����
	private String range; // ������� (All, 12+, 15+, 19+(R))
	private String category; // ī�װ�
	private String runtime; // �󿵽ð�
	private String filename; // ���� ���� �̸�

	public Movie(String title, String engtitle, String releaseDate, String director, String rating, String range, String category, String runtime, String filename) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.engtitle = engtitle;
		this.releasedate = releaseDate;
		this.director = director;
		this.rating = rating;
		this.range = range;
		this.category = category;
		this.runtime = runtime;
		this.filename = filename;
	}
	
	public Movie(String title, String releaseDate, String director, String rating, String range, String category, String runtime, String filename) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.engtitle = "";
		this.releasedate = releaseDate;
		this.director = director;
		this.rating = rating;
		this.range = range;
		this.category = category;
		this.runtime = runtime;
		this.filename = filename;
	}
	
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
	
	public String getRating() {
		return rating;
	}
	
	public void setRating(String rating) {
		this.rating = rating;
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
	
	public String getEngtitle() {
		return engtitle;
	}
	
	public void setEngtitle(String engtitle) {
		this.engtitle = engtitle;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}


}
