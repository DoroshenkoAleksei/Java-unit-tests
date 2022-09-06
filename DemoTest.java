/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both
 * {@link Demo#main(String[])} and
 * {@link Demo#isTriangle(double, double, double)}).
 */

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class DemoTest {

    @Test
    public void triangle_test_1() {
        assertTrue(Demo.isTriangle(3,2,4));
    }

    @Test
    public void triangle_test_2() {
        assertTrue(Demo.isTriangle(4,3,5));
    }
    
    @Test
    public void triangle_test_3() {
        assertTrue(Demo.isTriangle(5,3,5));
    }
    	
    @Test
    public void triangle_test_4() {
        assertTrue(Demo.isTriangle(6,4,5));
    }
    
    @Test
    public void triangle_test_5() {
        assertTrue(Demo.isTriangle(7,5,6));
    }
    
    @Test
    public void triangle_test_6() {
        assertFalse(Demo.isTriangle(13,2,4));
    
    }
    
    @Test
    public void triangle_test_7() {
        assertFalse(Demo.isTriangle(4,3,15));
    }
    
    @Test
    public void triangle_test_8() {
        assertFalse(Demo.isTriangle(3,22,4));
    }
    
    @Test
    public void triangle_test_9() {
        assertFalse(Demo.isTriangle(24,2,5));
    }
    
    @Test
    public void triangle_test_10() {
        assertFalse(Demo.isTriangle(34,2,4));
    }

    @Test
    public void triangle_test_11() {
        assertFalse(Demo.isTriangle(2,10,4));
    }

    @Test
    public void triangle_test_13() {
    	assertFalse(Demo.isTriangle(1,2,3));
    }

	@Test
	public void test_main_program_1() {
		ByteArrayInputStream in = new ByteArrayInputStream("5\n12\n13\n".getBytes());
		System.setIn(in);

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		Demo.main(new String[]{"5", "12", "13"});

		String consoleOutput = "Enter side 1: \r\n";
		consoleOutput += "Enter side 2: \r\n";
		consoleOutput += "Enter side 3: \r\n";
		consoleOutput += "This is a triangle.\r\n";

 		assertEquals(consoleOutput, out.toString());
	}

	@Test
	public void test_main_program_2() {
		ByteArrayInputStream in = new ByteArrayInputStream("5\n20\n13\n".getBytes());
		System.setIn(in);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		Demo.main(new String[]{"5", "20", "13"});

		String consoleOutput = " ";
		assertThat(consoleOutput, not(out));
	}

	@Test
	public void test_main_program_3() {
		ByteArrayInputStream in = new ByteArrayInputStream("1\n1\n1\n".getBytes());
		System.setIn(in);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		Demo.main(new String[]{"1", "1", "1"});

		String consoleOutput = " ";
		assertThat(consoleOutput, not(out));
	}

	@Test
	public void test_main_program_4() {
		ByteArrayInputStream in = new ByteArrayInputStream("2\n2\n2\n".getBytes());
		System.setIn(in);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		Demo.main(new String[]{"2", "2", "2"});

		String consoleOutput = " ";
		assertThat(consoleOutput, not(out));
	}

	@Test
	public void test_main_program_5() {
		ByteArrayInputStream in = new ByteArrayInputStream("3\n3\n3\n".getBytes());
		System.setIn(in);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		Demo.main(new String[]{"3", "3", "3"});

		String consoleOutput = " ";
		assertThat(consoleOutput, not(out));
	}

	@Test
	public void test_main_program_6() {
		ByteArrayInputStream in = new ByteArrayInputStream("4\n4\n4\n".getBytes());
		System.setIn(in);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		Demo.main(new String[]{"4", "4", "4"});

		String consoleOutput = " ";
		assertThat(consoleOutput, not(out));
	}

}