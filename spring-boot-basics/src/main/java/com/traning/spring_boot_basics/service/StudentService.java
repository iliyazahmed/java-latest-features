package com.traning.spring_boot_basics.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.traning.spring_boot_basics.dto.GetStudentDataResponse;
import com.traning.spring_boot_basics.dto.StandardResponse;
import com.traning.spring_boot_basics.dto.Student;

@Service
public class StudentService {

	List<Student> studentInfo = new ArrayList<>();

	public StandardResponse addStudentService(Student student) {
		StandardResponse response = new StandardResponse();
		if (student != null) {
			Student studentTwo = new Student();
			studentTwo.setStudentName(student.getStudentName());
			studentTwo.setRollNo(student.getRollNo());
			studentTwo.setSubjects(student.getSubjects());
			studentTwo.setCourseFee(student.getCourseFee());

			studentInfo.add(studentTwo);

			response.setResponseDescription("Added Successfully");
			response.setStatus(true);
			response.setStatusCode(201);

		} else {
			response.setResponseDescription("Not Added Successfully");
			response.setStatus(false);
			response.setStatusCode(500);
		}
		return response;
	}

	public StandardResponse getStudentData(Integer rollNo) {
		GetStudentDataResponse dataResponse = new GetStudentDataResponse();
		StandardResponse standardResponse = new StandardResponse();
		List<String> subjectList = Arrays.asList("Telugu", "Hindi", "English");

		Student student2_0 = new Student();
		student2_0.setStudentName("Sagar");
		student2_0.setRollNo(10);
		student2_0.setSubjects(subjectList);
		student2_0.setCourseFee(10.00);

		Student student3_0 = new Student();
		student3_0.setStudentName("Krishna");
		student3_0.setRollNo(12);
		student3_0.setSubjects(subjectList);
		student3_0.setCourseFee(10.00);

		Student student4_0 = new Student();
		student4_0.setStudentName("Prasad");
		student4_0.setRollNo(13);
		student4_0.setSubjects(subjectList);
		student4_0.setCourseFee(10.00);

		studentInfo.add(student2_0);
		studentInfo.add(student3_0);
		studentInfo.add(student4_0);

		for (Student list : studentInfo) {
			if (list.getRollNo().equals(rollNo)) {
				dataResponse.setStudentName("Prasad");
				dataResponse.setSubjects(subjectList);
				dataResponse.setCourseFees(10.00);
			}
		}

		if (dataResponse.getSubjects() != null) {
			standardResponse.setResponseDescription("Successfully Retrived");
			standardResponse.setStatus(true);
			standardResponse.setStatusCode(200);
			standardResponse.setGetStudentDataResponse(dataResponse);
			return standardResponse;
		} else {
			standardResponse.setResponseDescription("Not Found ");
			standardResponse.setStatus(false);
			standardResponse.setStatusCode(400);
			return standardResponse;
		}
	}
}
