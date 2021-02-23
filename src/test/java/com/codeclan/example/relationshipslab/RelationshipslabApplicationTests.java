package com.codeclan.example.relationshipslab;

import com.codeclan.example.relationshipslab.models.Department;
import com.codeclan.example.relationshipslab.models.Employee;
import com.codeclan.example.relationshipslab.repositories.DepartmentRepository;
import com.codeclan.example.relationshipslab.repositories.EmployeeRepository;
import com.codeclan.example.relationshipslab.repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RelationshipslabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment(){
		Department department = new Department("Software Development");
		departmentRepository.save(department);

		Employee employee1 = new Employee("Bob", "Smith", "1234");
		employeeRepository.save(employee1);
	}
}
