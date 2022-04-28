package com.sample.gitops;

import java.time.LocalTime;
import java.util.concurrent.ThreadLocalRandom;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitopsApi {

	@GetMapping("/eight")
	public String eight() {
		var random = ThreadLocalRandom.current().nextBoolean();
		return "Gradle Eightfixagain" + LocalTime.now() + " " + random;
	}

	@GetMapping("/five")
	public String five() {
		var random = ThreadLocalRandom.current().nextBoolean();
		return "Gradle Five " + LocalTime.now() + " " + random;
	}

	@GetMapping("/four")
	public String four() {
		var random = ThreadLocalRandom.current().nextBoolean();
		return "Gradle Four " + LocalTime.now() + " " + random;
	}

	@GetMapping("/nine")
	public String nine() {
		var random = ThreadLocalRandom.current().nextBoolean();
		return "Gradle Nine fix " + LocalTime.now() + " " + random;
	}

	@GetMapping("/one")
	public String one() {
		var random = ThreadLocalRandom.current().nextBoolean();
		return "Gradle One " + LocalTime.now() + " " + random;
	}

	@GetMapping("/seven")
	public String seven() {
		var random = ThreadLocalRandom.current().nextBoolean();
		return "Gradle Seven " + LocalTime.now() + " " + random;
	}

	@GetMapping("/six")
	public String six() {
		var random = ThreadLocalRandom.current().nextBoolean();
		return "Gradle Six minor " + LocalTime.now() + " " + random;
	}

	@GetMapping("/test")
	public String test() {
		return "Just a test again";
	}

	@GetMapping("/three")
	public String three() {
		var random = ThreadLocalRandom.current().nextBoolean();
		return "Gradle Three " + LocalTime.now() + " " + random;
	}

	@GetMapping("/two")
	public String two() {
		var random = ThreadLocalRandom.current().nextBoolean();
		return "Gradle Two " + LocalTime.now() + " " + random;
	}
}
