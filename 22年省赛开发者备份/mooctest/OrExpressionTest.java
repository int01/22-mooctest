package net.mooctest;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import net.mooctest.*;

import org.junit.Test;
import org.junit.runner.RunWith;

public class OrExpressionTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VariableExpression variableExpression0 = new VariableExpression("");
      NotExpression notExpression0 = new NotExpression(variableExpression0);
      OrExpression orExpression0 = new OrExpression(notExpression0, variableExpression0);
      HashMap<String, Boolean> hashMap0 = new HashMap<String, Boolean>();
      // Undeclared exception!
      try { 
        orExpression0.evaluate((Map<String, Boolean>) hashMap0);
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
  public void test1()  throws Throwable  {
      VariableExpression variableExpression0 = new VariableExpression("/<&TNA:*vt`qk");
      NotExpression notExpression0 = new NotExpression(variableExpression0);
      OrExpression orExpression0 = new OrExpression(notExpression0, variableExpression0);
      HashMap<String, Boolean> hashMap0 = new HashMap<String, Boolean>();
      Boolean boolean0 = Boolean.TRUE;
      hashMap0.put("/<&TNA:*vt`qk", boolean0);
      boolean boolean1 = orExpression0.evaluate((Map<String, Boolean>) hashMap0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Token token0 = Token.RIGHT_PAREN;
      LiteralExpression literalExpression0 = new LiteralExpression(token0);
      OrExpression orExpression0 = new OrExpression(literalExpression0, literalExpression0);
      HashMap<String, Boolean> hashMap0 = new HashMap<String, Boolean>();
      boolean boolean0 = orExpression0.evaluate((Map<String, Boolean>) hashMap0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Token token0 = Token.AND;
      LiteralExpression literalExpression0 = new LiteralExpression(token0);
      NotExpression notExpression0 = new NotExpression(literalExpression0);
      AndExpression andExpression0 = new AndExpression(literalExpression0, notExpression0);
      OrExpression orExpression0 = new OrExpression(notExpression0, andExpression0);
      HashMap<String, Boolean> hashMap0 = new HashMap<String, Boolean>();
      boolean boolean0 = orExpression0.evaluate((Map<String, Boolean>) hashMap0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OrExpression orExpression0 = new OrExpression((ExpressionTree) null, (ExpressionTree) null);
      HashMap<String, Boolean> hashMap0 = new HashMap<String, Boolean>();
      // Undeclared exception!
      try { 
        orExpression0.evaluate((Map<String, Boolean>) hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //verifyException("net.mooctest.OrExpression", e);
          assertNull(e.getMessage());
      }
  }
}
