package net.mooctest;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import net.mooctest.*;
import org.junit.Test;

public class AndExpressionTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VariableExpression variableExpression0 = new VariableExpression("");
      AndExpression andExpression0 = new AndExpression(variableExpression0, variableExpression0);
      HashMap<String, Boolean> hashMap0 = new HashMap<String, Boolean>();
      // Undeclared exception!
      try { 
        andExpression0.evaluate((Map<String, Boolean>) hashMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
          assertEquals("Variable  not in given assignments",e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Token token0 = Token.TRUE;
      LiteralExpression literalExpression0 = new LiteralExpression(token0);
      AndExpression andExpression0 = new AndExpression(literalExpression0, literalExpression0);
      HashMap<String, Boolean> hashMap0 = new HashMap<String, Boolean>();
      boolean boolean0 = andExpression0.evaluate((Map<String, Boolean>) hashMap0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Token token0 = Token.VARIABLE;
      LiteralExpression literalExpression0 = new LiteralExpression(token0);
      AndExpression andExpression0 = new AndExpression(literalExpression0, literalExpression0);
      HashMap<String, Boolean> hashMap0 = new HashMap<String, Boolean>();
      NotExpression notExpression0 = new NotExpression(andExpression0);
      AndExpression andExpression1 = new AndExpression(notExpression0, literalExpression0);
      boolean boolean0 = andExpression1.evaluate((Map<String, Boolean>) hashMap0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Token token0 = Token.FALSE;
      LiteralExpression literalExpression0 = new LiteralExpression(token0);
      AndExpression andExpression0 = new AndExpression(literalExpression0, literalExpression0);
      boolean boolean0 = andExpression0.evaluate();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OrExpression orExpression0 = new OrExpression((ExpressionTree) null, (ExpressionTree) null);
      AndExpression andExpression0 = new AndExpression(orExpression0, (ExpressionTree) null);
      HashMap<String, Boolean> hashMap0 = new HashMap<String, Boolean>();
      // Undeclared exception!
      try { 
        andExpression0.evaluate((Map<String, Boolean>) hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
          assertNull(e.getMessage());
      }
  }
}
