import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static ArrayList<Student> ConstructStudentList() throws java.lang.Exception {
		ArrayList<Student> list = new ArrayList<Student>();

		Scanner scnr = new Scanner(new File("student.txt"));

		while (scnr.hasNextLine()) {
			Integer id = scnr.nextInt();
			String name = scnr.next();
			Integer[] sc = new Integer[Student.N];
			for (int i = 0; i < Student.N; i++) {
				sc[i] = scnr.nextInt();
			}
			Student s = new Student(id, name, sc);
			list.add(s);
		}
		scnr.close();

		return list;
	}

	static void addOneStudent(ArrayList<Student> list) {
		Scanner scnr = new Scanner(System.in);
		Integer id;
		String name;
		Integer[] sc = new Integer[Student.N];
		int i;

		System.out.println("Enter the Student information: ID Name Score1 Score2 Score3 \n");
		id = scnr.nextInt();
		name = scnr.next();
		for (i = 0; i < Student.N; i++)
			sc[i] = scnr.nextInt();
		Student t = new Student(id, name, sc);

		for (i = 0; i < list.size(); i++) {
			if (id < list.get(i).getSid())
				break;
		}
		list.add(i, t);
		scnr.close();
	}

	public static void main(String[] args) throws Exception {
		ArrayList<Student> list = ConstructStudentList();
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i).getSname());

		addOneStudent(list);
		for (Student v : list)
			System.out.println(v);

	}

}
