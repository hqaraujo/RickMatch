package br.com.hq.rickmatch;

import br.com.hq.rickmatch.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AplicacaoSpringSemWebApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AplicacaoSpringSemWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();

	}
}
