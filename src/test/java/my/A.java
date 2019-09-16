package my;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class A {

	@Autowired
	B b;

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
}
