package Movie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// ��ȭ list�� �����ϴ� Ŭ����
// list�� �а� ���� �޼ҵ嵵 ����

public class MovieAdd {
	private ArrayList<Movie> list;
	
	public MovieAdd() {
		// TODO Auto-generated constructor stub
		readMovie();
	}
	
	public static void main(String[] args) {
		MovieAdd movieAdd = new MovieAdd();
		
		movieAdd.list.add(new Movie("����̾� ���ҵ�", "Bohemian Rhapsody", "2018.10.31", "����̾� �̾�  ", "20.8", "12�� �̻�", "Drama", "134", "����̾ȷ��ҵ�.jpg"));
		movieAdd.list.add(new Movie("�����: ���Ǵ�Ƽ ��", "Avengers: Infinity War", "2018.04.25", "�ȼҴ� ���, �� ���", "9.08", "12�� �̻�", "Action, Advanture, Fantasy, SF", "149��", "avengers3.jpg"));
		movieAdd.list.add(new Movie("�ź��� ������� �׸����е��� ����", "Fantastic Beasts: The Crimes of Grindelwald", "2018.11.14", "���̺� ������", "7.49", "12�� �̻�", "Adventure, Fantasy", "134", "�ŵ���2.jpg"));
		movieAdd.list.add(new Movie("�ظ� ���Ϳ� �������� ��", "Harry Potter And The Sorcerer's Stone", "2001.12.14", "ũ���� �ݷҹ���", "9.23", "��ü", "Fantasy, Adventure, Action", "152", "�ظ�����1.jpg"));
		movieAdd.list.add(new Movie("�����ε��� ��", "2018.11.28", "�ֱ���", "9.4", "12�� �̻�", "Drama", "114", "�����ε��ǳ�.jpg"));
		
		/*
		��ȭ �߰��ϴ� �޼ҵ�)
		- �ѱ� ��ȭ�� ��� (���� ������ �ʿ䰡 ��� ��� ����)
			movieAdd.list.add(new Movie(title, releaseDate, director, rating, range, category, runtime, filename))
		- �ܱ� ��ȭ�� ���
			movieAdd.list.add(new Movie(title, engtitle, releaseDate, director, rating, range, category, runtime, filename))
		*/
		
		movieAdd.saveMovie();
	}
	
	public void readMovie() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("MovieObject.dat")); // object.dat �� ����� (����Ʈ)��ü �Է� ��Ʈ�� ����
			list = (ArrayList<Movie>) ois.readObject(); // �о�� ����Ʈ ��ü�� list ������ ����
		} catch (IOException e) {
			list = new ArrayList<>();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void saveMovie() {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("MovieObject.dat")); // object.dat �� ����� (����Ʈ)��ü ��� ��Ʈ�� ����
			oos.writeObject(this.list); // ȸ�� ����Ʈ ����
			oos.flush(); // ���۸� �������� ���� �޼ҵ�
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
