package net.mooctest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import net.mooctest.LiteralExpression;
import net.mooctest.Token;

import org.junit.Test;
import org.junit.runner.RunWith;

public class LiteralExpressionTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Token token0 = Token.TRUE;
      LiteralExpression literalExpression0 = new LiteralExpression(token0);
      HashMap<String, Boolean> hashMap0 = new HashMap<String, Boolean>();
      boolean boolean0 = literalExpression0.evaluate((Map<String, Boolean>) hashMap0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Token token0 = Token.LEFT_PAREN;
      LiteralExpression literalExpression0 = new LiteralExpression(token0);
      HashMap<String, Boolean> hashMap0 = new HashMap<String, Boolean>();
      boolean boolean0 = literalExpression0.evaluate((Map<String, Boolean>) hashMap0);
      assertFalse(boolean0);
  }
}
