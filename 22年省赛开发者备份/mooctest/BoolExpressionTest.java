package net.mooctest;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.HashMap;

import net.mooctest.BoolExpression;
import org.junit.Test;

public class BoolExpressionTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BoolExpression boolExpression0 = new BoolExpression("false");
      ArrayList<String> arrayList0 = boolExpression0.getVariables();
      assertTrue(arrayList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BoolExpression boolExpression0 = new BoolExpression("l");
      ArrayList<String> arrayList0 = boolExpression0.getVariables();
      assertTrue(arrayList0.contains("l"));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BoolExpression boolExpression0 = new BoolExpression("TRUE");
      HashMap<String, Boolean> hashMap0 = new HashMap<String, Boolean>(0, 0.9920013F);
      boolean boolean0 = boolExpression0.evaluate(hashMap0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BoolExpression boolExpression0 = new BoolExpression("false");
      HashMap<String, Boolean> hashMap0 = new HashMap<String, Boolean>();
      boolean boolean0 = boolExpression0.evaluate(hashMap0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BoolExpression boolExpression0 = new BoolExpression("p");
      HashMap<String, Boolean> hashMap0 = new HashMap<String, Boolean>();
      // Undeclared exception!
      try { 
        boolExpression0.evaluate(hashMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Variable p not in given assignments
         //
         //verifyException("net.mooctest.VariableExpression", e);
          assertEquals("Variable p not in given assignments",e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BoolExpression boolExpression0 = null;
      try {
        boolExpression0 = new BoolExpression((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //verifyException("net.mooctest.BoolExpression", e);
          assertNull(e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BoolExpression boolExpression0 = new BoolExpression("");
      ArrayList<String> arrayList0 = boolExpression0.getVariables();
      assertNull(arrayList0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BoolExpression boolExpression0 = new BoolExpression("");
      HashMap<String, Boolean> hashMap0 = new HashMap<String, Boolean>();
      // Undeclared exception!
      try { 
        boolExpression0.evaluate(hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //verifyException("net.mooctest.BoolExpression", e);
          assertNull(e.getMessage());
      }
  }
}
