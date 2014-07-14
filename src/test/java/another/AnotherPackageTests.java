package another;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import demo.Application;
import demo.Target;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class AnotherPackageTests {

	@Autowired Target target;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void testAop() {
//    	Assert.assertEquals( "from the proxy", target.privateMethod());		//	Does not compile (package)
//    	Assert.assertEquals( "from the proxy", target.friendlyMethod());	//	Does not compile (package)
//    	Assert.assertEquals( "from the proxy", target.protectedMethod());	//  Does not compile (package)
    	Assert.assertEquals( "from the proxy", target.publicMethod());
    }
}
