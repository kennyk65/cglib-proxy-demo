package demo;

import org.springframework.stereotype.Component;

@Component
public class Target {

	public String publicMethod() {
		return "My public method.";
	}
	protected String protectedMethod() {
		return "My protected method.";
	}
	String friendlyMethod() {
		return "My friendly method.";
	}
	private String privateMethod() {
		return "My private method.";
	}

}
