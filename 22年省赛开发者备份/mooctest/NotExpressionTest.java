package net.mooctest;


import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import net.mooctest.*;
import org.junit.Test;
import org.junit.runner.RunWith;

public class NotExpressionTest{

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VariableExpression variableExpression0 = new VariableExpression((String) null);
      Token token0 = Token.OR;
      LiteralExpression literalExpression0 = new LiteralExpression(token0);
      AndExpression andExpression0 = new AndExpression(variableExpression0, literalExpression0);
      OrExpression orExpression0 = new OrExpression(andExpression0, variableExpression0);
      NotExpression notExpression0 = new NotExpression(orExpression0);
      HashMap<String, Boolean> hashMap0 = new HashMap<String, Boolean>();
      // Undeclared exception!
      try { 
        notExpression0.evaluate((Map<String, Boolean>) hashMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Variable null not in given assignments
         //
         //verifyException("net.mooctest.VariableExpression", e);
          assertEquals("Variable null not in given assignments",e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      VariableExpression variableExpression0 = new VariableExpression(")q9+q4E");
      NotExpression notExpression0 = new NotExpression(variableExpression0);
      HashMap<String, Boolean> hashMap0 = new HashMap<String, Boolean>();
      Boolean boolean0 = Boolean.TRUE;
      hashMap0.put(")q9+q4E", boolean0);
      boolean boolean1 = notExpression0.evaluate((Map<String, Boolean>) hashMap0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Token token0 = Token.AND;
      LiteralExpression literalExpression0 = new LiteralExpression(token0);
      OrExpression orExpression0 = new OrExpression(literalExpression0, literalExpression0);
      NotExpression notExpression0 = new NotExpression(orExpression0);
      HashMap<String, Boolean> hashMap0 = new HashMap<String, Boolean>();
      boolean boolean0 = notExpression0.evaluate((Map<String, Boolean>) hashMap0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NotExpression notExpression0 = new NotExpression((ExpressionTree) null);
      HashMap<String, Boolean> hashMap0 = new HashMap<String, Boolean>();
      // Undeclared exception!
      try { 
        notExpression0.evaluate((Map<String, Boolean>) hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //verifyException("net.mooctest.NotExpression", e);
          assertNull(e.getMessage());

      }
  }
}
