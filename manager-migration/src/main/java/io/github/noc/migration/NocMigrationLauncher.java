package io.github.noc.migration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NocMigrationLauncher {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(NocMigrationLauncher.class);
		application.run(args);
	}
}
