package spring.di;

import spring.di.entity.Exam;
import spring.di.entity.HakoExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.InlineExamConsole;

public class program {

	public static void main(String[] args) {
			
		Exam exam = new HakoExam();
		ExamConsole console = new InlineExamConsole(exam);
		console.print();
	}
}
