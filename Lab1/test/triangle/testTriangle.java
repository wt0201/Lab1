package triangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class testTriangle {

	private Triangle triangle;

	@Test
	public void test(){
		triangle=new Triangle(1,1,1);
		assertEquals(true,triangle.isValid());
		assertEquals(true,triangle.isEquilateral());
		assertEquals(true,triangle.isIsosceles());
		assertEquals(false,triangle.isScalene());
		
		triangle=new Triangle(2,2,3);
		assertEquals(true,triangle.isValid());
		assertEquals(false,triangle.isEquilateral());
		assertEquals(true,triangle.isIsosceles());
		assertEquals(true,triangle.isScalene());
		
		triangle=new Triangle(3,4,5);
		assertEquals(true,triangle.isValid());
		assertEquals(false,triangle.isEquilateral());
		assertEquals(false,triangle.isIsosceles());
		assertEquals(true,triangle.isScalene());
		
		triangle=new Triangle(-1,1,1);
		assertEquals(false,triangle.isValid());
		assertEquals(false,triangle.isEquilateral());
		assertEquals(false,triangle.isIsosceles());
		assertEquals(false,triangle.isScalene());
		
		triangle=new Triangle(1,1,6);
		assertEquals(false,triangle.isValid());
		assertEquals(false,triangle.isEquilateral());
		assertEquals(false,triangle.isIsosceles());
		assertEquals(false,triangle.isScalene());
	}

}
