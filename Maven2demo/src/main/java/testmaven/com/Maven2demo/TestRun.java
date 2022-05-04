package testmaven.com.Maven2demo;


import org.testng.annotations.Test;
import testmaven.com.Maven2demo.baseclass.Baseclass;

public class TestRun extends Baseclass{
    @Test	
	public void runtest() 
	{
     //	AmazonLowestPrice amazonlowestprice = new AmazonLowestPrice();
     //	amazonlowestprice.Example(driver);
    	AmazonLowestPrice.Example(driver);
	}
    
}
