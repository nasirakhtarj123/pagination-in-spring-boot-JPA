package com.pagination.pagination;

import com.pagination.pagination.domain.Student;
import com.pagination.pagination.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class PaginationApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(PaginationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Student> students = new ArrayList<>();
		students.add(Student.builder().name("nasir").city("Dubai").build());
		students.add(Student.builder().name("akhtar").city("Riyadh").build());
		students.add(Student.builder().name("jamali").city("Doha").build());
		students.add(Student.builder().name("zahra").city("Jakarta").build());
		students.add(Student.builder().name("aulia").city("Shenzhen").build());
		students.add(Student.builder().name("fiantri").city("Shanghai").build());
		students.add(Student.builder().name("wilda").city("Bankok").build());
		students.add(Student.builder().name("kilmi").city("Scotland").build());
		students.add(Student.builder().name("kaifaa").city("China").build());
		students.add(Student.builder().name("chayani").city("US").build());
		students.add(Student.builder().name("alia").city("US").build());
		students.add(Student.builder().name("rizvi").city("China").build());
		students.add(Student.builder().name("navedh").city("China").build());
		students.add(Student.builder().name("nazmeen").city("China").build());
		students.add(Student.builder().name("zoro").city("US").build());
		students.add(Student.builder().name("Tom").city("India").build());
		students.add(Student.builder().name("Jerry").city("India").build());
		students.add(Student.builder().name("luffy").city("Thailand").build());
		students.add(Student.builder().name("nami").city("Thailand").build());

		studentRepository.saveAll(students);
	}
}
