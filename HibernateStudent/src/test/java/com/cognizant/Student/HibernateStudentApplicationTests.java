package com.cognizant.Student;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.Student.entities.Student;
import com.cognizant.Student.repos.StudentRepository;

@SpringBootTest
class HibernateStudentApplicationTests {
	@Autowired
	StudentRepository repo;
	
	@Test
	void contextLoads() {
	}
	@Test
	public void input()
	{
		Student st=new Student();
		st.setId(2393);
		st.setName("Romio Ranjan Sahoo");
		st.setBranch("CSE");
		st.setCgpa(8.5);
		repo.save(st);
	}
	
	@Test
	public void read()
	{
		Optional<Student> st1=repo.findById(2393);
		if(st1.isPresent())
		{
			Student st=st1.get();
			System.out.println("Student details:"+st.getId()+"\n"+st.getName()+"\n"+st.getBranch()+"\n"+st.getCgpa());
			assertEquals(2393, st.getId());
		}
		
	}
	
	@Test
	public void update()
	{
		Optional<Student> st1=repo.findById(2393);
		if(st1.isPresent())
		{
			Student st=st1.get();
			st.setCgpa(8.4);
			repo.save(st);
		}
	}
	
	@Test
	public void delete()
	{
		if(repo.existsById(2393))
			repo.deleteById(2393);
	}

}
