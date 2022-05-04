package testmaven.com.Maven2demo;

import org.testng.annotations.Test;
import testmaven.com.Maven2demo.baseclass.Baseclass;

public class TestRun1 extends Baseclass{
    @Test	
	public void runtest() 
	{
    	Tools tools = new Tools();
    	tools.Working(driver);
	}
    
}