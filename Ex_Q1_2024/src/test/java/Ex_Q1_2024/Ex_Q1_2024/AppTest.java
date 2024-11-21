package Ex_Q1_2024.Ex_Q1_2024;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
/**
 * Unit test for simple App.
 */
public class AppTest {
	question4 tester = new question4();	
    /**
     * Rigorous Test :-)
     */
		@Test
	    public void test_1() {
	      String Expected_result="B";
	      int a=20, b =35;
	      String mod="regular";
	      String actual_result=tester.compare(a, b,mod);
	      assertEquals(Expected_result,actual_result);
	    }		
		@Test
	    public void test_2() {
	      String Expected_result="A";
	      int a=-2 , b=-11;
	      String mod="regular";
	      String actual_result=tester.compare(a, b,mod);
	      assertEquals(Expected_result,actual_result);
	    }		
		@Test
	    public void test_3() {
	      String Expected_result="Error";
	      int a=55;
	      String b = "h";
	      String mod="regular";
	      String actual_result=tester.compare(a, b,mod);
	      assertEquals(Expected_result,actual_result);
	    }		
		@Test
	    public void test_4() {
	      String Expected_result="A";
	      int a=33 ,b =100;
	      String mod="negative";
	      String actual_result=tester.compare(a, b,mod);
	      assertEquals(Expected_result,actual_result);
	    }
		@Test
	    public void test_5() {
	      String Expected_result="B";
	      int a=44 ,b =-17;
	      String mod="negative";
	      String actual_result=tester.compare(a, b,mod);
	      assertEquals(Expected_result,actual_result);
	    }
		@Test
	    public void test_6() {
	      String Expected_result="Error";
	      int a=-88;
	      String b = "W";
	      String mod="negative";
	      String actual_result=tester.compare(a, b,mod);
	      assertEquals(Expected_result,actual_result);
	    }
		@Test
	    public void test_7() {
	      String Expected_result="A";
	      float a=4 ,b =6;
	      String mod="inverse";
	      String actual_result=tester.compare(a, b, mod);    	
	      assertEquals(Expected_result,actual_result);
	    }
		@Test
	    public void test_8() {
	      String Expected_result="B";
	      float a=-1 ,b =-3;
	      String mod="inverse";
	      String actual_result=tester.compare(a, b, mod);
	      assertEquals(Expected_result,actual_result);
	    }
		@Test
	    public void test_9() {
	      String Expected_result="Error";
	      float a=44;
	      String b = "r";
	      String mod="inverse";
	      String actual_result=tester.compare(a, b,mod);
	      assertEquals(Expected_result,actual_result);
	    }		  
}
