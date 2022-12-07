package net.mooctest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import net.mooctest.VariableExpression;
import org.junit.Test;
import org.junit.runner.RunWith;

public class VariableExpressionTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VariableExpression variableExpression0 = new VariableExpression("qJ,b.&@fD*P");
      HashMap<String, Boolean> hashMap0 = new HashMap<String, Boolean>();
      Boolean boolean0 = new Boolean(true);
      hashMap0.put("qJ,b.&@fD*P", boolean0);
      boolean boolean1 = variableExpression0.evaluate((Map<String, Boolean>) hashMap0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      VariableExpression variableExpression0 = new VariableExpression("");
      try { 
        variableExpression0.evaluate((Map<String, Boolean>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         assertNull(e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      VariableExpression variableExpression0 = new VariableExpression("");
      HashMap<String, Boolean> hashMap0 = new HashMap<String, Boolean>(0, 1);
      // Undeclared exception!
      try { 
        variableExpression0.evaluate((Map<String, Boolean>) hashMap0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
          assertEquals("Variable  not in given assignments",e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      VariableExpression variableExpression0 = new VariableExpression("");
      HashMap<String, Boolean> hashMap0 = new HashMap<String, Boolean>(0, 1);
      Boolean boolean0 = Boolean.FALSE;
      hashMap0.put("", boolean0);
      boolean boolean1 = variableExpression0.evaluate((Map<String, Boolean>) hashMap0);
      assertFalse(boolean1);
  }
}
