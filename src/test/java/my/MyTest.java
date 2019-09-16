package my;


import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({"classpath:application-my-test-1.xml"})
public class MyTest{

	@Test
	public void test(){
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:application-my-test-1.xml","classpath:application-my-test-2.xml");
		A bean = ac.getBean(A.class);
		System.out.println(bean);
	}



}
