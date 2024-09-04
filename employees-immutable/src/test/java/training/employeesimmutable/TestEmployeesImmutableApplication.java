package training.employeesimmutable;

import org.springframework.boot.SpringApplication;

public class TestEmployeesImmutableApplication {

    public static void main(String[] args) {
        SpringApplication.from(EmployeesImmutableApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
