package net.mooctest;


import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import net.mooctest.*;
import org.junit.Test;

public class ExpressionTreeTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Token token0 = Token.TRUE;
      LiteralExpression literalExpression0 = new LiteralExpression(token0);
      OrExpression orExpression0 = new OrExpression(literalExpression0, literalExpression0);
      AndExpression andExpression0 = new AndExpression(orExpression0, literalExpression0);
      HashMap<String, Boolean> hashMap0 = new HashMap<String, Boolean>();
      boolean boolean0 = andExpression0.evaluate((Map<String, Boolean>) hashMap0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Token token0 = Token.AND;
      LiteralExpression literalExpression0 = new LiteralExpression(token0);
      HashMap<String, Boolean> hashMap0 = new HashMap<String, Boolean>();
      boolean boolean0 = literalExpression0.evaluate((Map<String, Boolean>) hashMap0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Token token0 = Token.AND;
      LiteralExpression literalExpression0 = new LiteralExpression(token0);
      NotExpression notExpression0 = new NotExpression(literalExpression0);
      boolean boolean0 = notExpression0.evaluate();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Token token0 = Token.AND;
      LiteralExpression literalExpression0 = new LiteralExpression(token0);
      boolean boolean0 = literalExpression0.evaluate();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      VariableExpression variableExpression0 = new VariableExpression("");
      HashMap<String, Boolean> hashMap0 = new HashMap<String, Boolean>();
      // Undeclared exception!
      try { 
        variableExpression0.evaluate((Map<String, Boolean>) hashMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Variable  not in given assignments
         //
         //verifyException("net.mooctest.VariableExpression", e);
          assertEquals("Variable  not in given assignments",e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AndExpression andExpression0 = new AndExpression((ExpressionTree) null, (ExpressionTree) null);
      NotExpression notExpression0 = new NotExpression(andExpression0);
      HashMap<String, Boolean> hashMap0 = new HashMap<String, Boolean>();
      // Undeclared exception!
      try { 
        notExpression0.evaluate((Map<String, Boolean>) hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //verifyException("net.mooctest.AndExpression", e);
          assertNull(e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      VariableExpression variableExpression0 = new VariableExpression("");
      AndExpression andExpression0 = new AndExpression(variableExpression0, variableExpression0);
      // Undeclared exception!
      try { 
        andExpression0.evaluate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Variable  not in given assignments
         //
         //verifyException("net.mooctest.VariableExpression", e);
          assertEquals("Variable  not in given assignments",e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NotExpression notExpression0 = new NotExpression((ExpressionTree) null);
      // Undeclared exception!
      try { 
        notExpression0.evaluate();
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
