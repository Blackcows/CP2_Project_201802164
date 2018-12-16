package Movie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// 영화 list를 관리하는 클래스
// list를 읽고 쓰는 메소드도 포함

public class MovieAdd {
	private ArrayList<Movie> list;
	
	public MovieAdd() {
		// TODO Auto-generated constructor stub
		readMovie();
	}
	
	public static void main(String[] args) {
		MovieAdd movieAdd = new MovieAdd();
		
		movieAdd.list.add(new Movie("보헤미안 랩소디", "Bohemian Rhapsody", "2018.10.31", "브라이언 싱어  ", "20.8", "12세 이상", "Drama", "134", "보헤미안랩소디.jpg"));
		movieAdd.list.add(new Movie("어벤져스: 인피니티 워", "Avengers: Infinity War", "2018.04.25", "안소니 루소, 조 루소", "9.08", "12세 이상", "Action, Advanture, Fantasy, SF", "149분", "avengers3.jpg"));
		movieAdd.list.add(new Movie("신비한 동물들과 그린델왈드의 범죄", "Fantastic Beasts: The Crimes of Grindelwald", "2018.11.14", "데이빗 예이츠", "7.49", "12세 이상", "Adventure, Fantasy", "134", "신동사2.jpg"));
		movieAdd.list.add(new Movie("해리 포터와 마법사의 돌", "Harry Potter And The Sorcerer's Stone", "2001.12.14", "크리스 콜롬버스", "9.23", "전체", "Fantasy, Adventure, Action", "152", "해리포터1.jpg"));
		movieAdd.list.add(new Movie("국가부도의 날", "2018.11.28", "최국희", "9.4", "12세 이상", "Drama", "114", "국가부도의날.jpg"));
		
		/*
		영화 추가하는 메소드)
		- 한국 영화일 경우 (영어 제목이 필요가 없어서 띠로 생성)
			movieAdd.list.add(new Movie(title, releaseDate, director, rating, range, category, runtime, filename))
		- 외국 영화일 경우
			movieAdd.list.add(new Movie(title, engtitle, releaseDate, director, rating, range, category, runtime, filename))
		*/
		
		movieAdd.saveMovie();
	}
	
	public void readMovie() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("MovieObject.dat")); // object.dat 에 연결된 (리스트)객체 입력 스트림 생성
			list = (ArrayList<Movie>) ois.readObject(); // 읽어온 리스트 객체를 list 변수에 지정
		} catch (IOException e) {
			list = new ArrayList<>();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void saveMovie() {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("MovieObject.dat")); // object.dat 에 연결된 (리스트)객체 출력 스트림 생성
			oos.writeObject(this.list); // 회원 리스트 저장
			oos.flush(); // 버퍼를 수동으로 비우는 메소드
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
