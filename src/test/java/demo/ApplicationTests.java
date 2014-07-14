package demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration.CglibAutoProxyConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class ApplicationTests {

	@Autowired Target target;


	@Test
	public void testAop() {
		
		//	Because this test is in the 'demo' package, just like "Target", you can
		//	access protected and friendly methods (obviously not private).  If Spring's
		//  Cglib proxies wrap protected and friendly methods, these tests will pass:
		
//    	Assert.assertEquals( "from the proxy", target.privateMethod());		//	Does not compile (private)
    	Assert.assertEquals( "from the proxy", target.friendlyMethod());
    	Assert.assertEquals( "from the proxy", target.protectedMethod());
    	Assert.assertEquals( "from the proxy", target.publicMethod());
    }
}
