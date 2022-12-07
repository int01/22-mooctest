package net.mooctest;

import static org.junit.Assert.*;

import java.util.*;

import net.mooctest.BDD;
import net.mooctest.BoolExpression;
import org.junit.Test;

public class BDDTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BoolExpression boolExpression0 = new BoolExpression("k");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("");
      linkedList0.add("");
      // Undeclared exception!
      try { 
        BDD.of(boolExpression0, (List<String>) linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
          assertEquals("Variables missing from given variable ordering",e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BoolExpression boolExpression0 = new BoolExpression("false");
      BDD bDD0 = BDD.of(boolExpression0);
      final ArrayList<String> variables = bDD0.getVariables();
      String[] a = new String[]{};
      for (int i = 0; i < variables.size(); i++) {
          a[i] = variables.get(i);
      }
      String [] b = new String[]{};
      assertArrayEquals(b,a);
      //  // Unstable assertion: assertEquals(6, bDD0.getNumNodes());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BoolExpression boolExpression0 = new BoolExpression("false");
      BDD bDD0 = BDD.of(boolExpression0);
      double double0 = bDD0.getNumSolutions();
      assertEquals(0.0,double0,0.0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BoolExpression boolExpression0 = new BoolExpression("false");
      BDD bDD0 = BDD.of(boolExpression0);
      assertEquals("[]",bDD0.getAllSolutions().toString());
      //  // Unstable assertion: assertEquals(22, bDD0.getNumNodes());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BoolExpression boolExpression0 = new BoolExpression("true");
      ArrayList<String> arrayList0 = boolExpression0.getVariables();
      BDD bDD0 = BDD.of(boolExpression0, (List<String>) arrayList0);
      System.out.println( bDD0.anySat().toString());
      //  // Unstable assertion: assertEquals((-23), bDD0.getNumNodes());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BoolExpression boolExpression0 = new BoolExpression("p");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("");
      // Undeclared exception!
      try { 
        BDD.of(boolExpression0, (List<String>) linkedList0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
          assertEquals("Variable p not in given assignments",e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BoolExpression boolExpression0 = new BoolExpression("");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        BDD.of(boolExpression0, (List<String>) linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
          assertNull(e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BoolExpression boolExpression0 = new BoolExpression("");
      // Undeclared exception!
      try { 
        BDD.of(boolExpression0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
          assertNull(e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BoolExpression boolExpression0 = new BoolExpression("y");
      BDD bDD0 = BDD.of(boolExpression0);
      bDD0.getAllSolutions();
      //  // Unstable assertion: assertEquals(101, bDD0.getNumNodes());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BoolExpression boolExpression0 = new BoolExpression("Y");
      BDD bDD0 = BDD.of(boolExpression0);
      double double0 = bDD0.getNumSolutions();
      //  // Unstable assertion: assertEquals(138, bDD0.getNumNodes());
      //  // Unstable assertion: assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BoolExpression boolExpression0 = new BoolExpression("K");
      BDD bDD0 = BDD.of(boolExpression0);
      bDD0.anySat();
      //  // Unstable assertion: assertEquals(21, bDD0.getNumNodes());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BoolExpression boolExpression0 = new BoolExpression("y|E");
      BDD bDD0 = BDD.of(boolExpression0);
      bDD0.getAllSolutions();
      //  // Unstable assertion: assertEquals(601, bDD0.getNumNodes());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BoolExpression boolExpression0 = new BoolExpression("y|E");
      BDD bDD0 = BDD.of(boolExpression0);
      double double0 = bDD0.getNumSolutions();
      //  // Unstable assertion: assertEquals(168, bDD0.getNumNodes());
      //  // Unstable assertion: assertEquals(3.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BoolExpression boolExpression0 = new BoolExpression("q");
      BDD bDD0 = BDD.ofRandomOrder(boolExpression0);
      bDD0.getNumSolutions();
      double double0 = bDD0.getNumSolutions();
      //  // Unstable assertion: assertEquals((-19), bDD0.getNumNodes());
      //  // Unstable assertion: assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BoolExpression boolExpression0 = new BoolExpression("y|E");
      BDD bDD0 = BDD.of(boolExpression0);
      bDD0.anySat();
      //  // Unstable assertion: assertEquals(9, bDD0.getNumNodes());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BoolExpression boolExpression0 = new BoolExpression("false");
      BDD bDD0 = BDD.of(boolExpression0);
      // Undeclared exception!
      try { 
        bDD0.anySat();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
          assertEquals("No satisfying assignment exists.",e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BoolExpression boolExpression0 = new BoolExpression("N");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        BDD.of(boolExpression0, (List<String>) linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
          assertEquals("Variables missing from given variable ordering",e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BoolExpression boolExpression0 = new BoolExpression("N&D#");
      BDD bDD0 = BDD.ofRandomOrder(boolExpression0);
      //  // Unstable assertion: assertEquals(87, bDD0.getNumNodes());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BoolExpression boolExpression0 = new BoolExpression("N&C");
      BDD bDD0 = BDD.of(boolExpression0);
      double double0 = bDD0.getNumSolutions();
      //  // Unstable assertion: assertEquals(119, bDD0.getNumNodes());
      //  // Unstable assertion: assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = BDD.getNumNodes();
      //  // Unstable assertion: assertEquals(30, int0);
      
      BoolExpression boolExpression0 = new BoolExpression("N&D#c");
      BDD.of(boolExpression0);
      BDD bDD0 = BDD.ofRandomOrder(boolExpression0);
      //  // Unstable assertion: assertEquals(38, bDD0.getNumNodes());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BoolExpression boolExpression0 = new BoolExpression("Y");
      BDD bDD0 = BDD.of(boolExpression0);
      bDD0.getVariables();
      //  // Unstable assertion: assertEquals(3, bDD0.getNumNodes());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BoolExpression boolExpression0 = new BoolExpression("");
      // Undeclared exception!
      try { 
        BDD.ofRandomOrder(boolExpression0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
          assertNull(e.getMessage());
      }
  }
}
