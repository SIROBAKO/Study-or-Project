package spring.di.ui;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {

	private Exam exam;
	
	
	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}

	public InlineExamConsole() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void print() {
		System.out.printf("출력");
	}
}
