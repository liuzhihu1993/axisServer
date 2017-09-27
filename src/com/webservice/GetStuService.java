package com.webservice;

import java.util.ArrayList;
import java.util.List;

public class GetStuService {

	public Student getStudentById(int stuId) {

		Student student = new Student();

		student.setStuId(stuId);

		student.setStuName("Ğ¡½Ü");

		student.setStuAge("23");

		return student;
	}

	public Student readOnlyStudent(Student student) {
		Student stud = new Student();
		stud.setStuId(student.getStuId());
		stud.setStuName(student.getStuName());
		stud.setStuAge(student.getStuAge());

		return stud;
	}

	public List<Student> getStudentList(String[] obj) {
		List<Student> list = new ArrayList<Student>();
		if (obj.length > 0) {

			for (int i = 0; i < obj.length; i++) {
				Student stu = new Student();
				stu.setStuId(i + 1);
				stu.setStuAge("24");
				stu.setStuName(obj[i]);
				list.add(stu);
			}
		}

		return list;
	}
}
