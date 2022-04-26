public class Student {
	static Integer N = 3;
	Integer sid;
	String sname;
	Integer[] scores = new Integer[N];

	Student() {
		sid = 0;
		sname = "";
	}

	Student(Integer id, String name, Integer[] sc) {
		sid = id;
		sname = name;
		for (int i = 0; i < N; i++)
			scores[i] = sc[i];

	}

	Integer getSid() {
		return sid;
	}

	String getSname() {
		return sname;
	}

	Integer[] getScores() {
		return scores;
	}

	public String toString() {
		String str = "ID " + Integer.toString(sid) + "\t";
		str += "Name: " + sname + "\t";
		str += "Scores ";
		for (int i = 0; i < N; i++)
			str += Integer.toString(scores[i]) + "\t";
		str += "\n";
		return str;
	}
}
