package testmaven.com.Maven2demo;

import java.io.IOException;
import org.testng.annotations.Test;
import testmaven.com.Maven2demo.baseclass.Baseclass1;

public class TestRun2 extends Baseclass1 {
	 
	    @Test	
		public void runtest() throws IOException 
		{
	    	Tools1 tools = new Tools1();
	    	tools.Examplerun(driver);
		}
	    
	
}
