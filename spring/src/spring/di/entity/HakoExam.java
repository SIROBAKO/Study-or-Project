package spring.di.entity;

public class HakoExam implements Exam {

	int kor;
	int eng;
	
	@Override
	public float avg() {
		// TODO Auto-generated method stub
		return total()/2;
	}

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return eng + kor;
	}

}
