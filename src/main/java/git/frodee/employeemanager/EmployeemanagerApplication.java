package git.frodee.employeemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
//@ComponentScan(basePackages = {"git.frodee.employeemanager"})
//@EntityScan("git.frodee.employeemanager.model.*")
//@EnableJpaRepositories(basePackages = {"git.frodee.employeemanager.repo"})
public class EmployeemanagerApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmployeemanagerApplication.class, args);
		System.out.println();
	}
}
