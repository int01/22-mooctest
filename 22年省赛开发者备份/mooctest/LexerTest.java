package net.mooctest;


import static org.junit.Assert.*;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

import net.mooctest.Lexer;
import net.mooctest.Token;
import org.junit.Test;

public class LexerTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[4] = (byte)65;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Lexer lexer0 = new Lexer(byteArrayInputStream0);
      lexer0.nextToken();
      String string0 = lexer0.getVariable();
      assertEquals("A", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      Lexer lexer0 = new Lexer(dataInputStream0);
      // Undeclared exception!
      try { 
        lexer0.nextToken();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //verifyException("java.io.DataInputStream", e);
          assertNull(e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-1), (byte)1);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, (byte)1);
      Lexer lexer0 = new Lexer(bufferedInputStream0);
      // Undeclared exception!
      try { 
        lexer0.nextToken();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
          assertNull(e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Lexer lexer0 = null;
      try {
        lexer0 = new Lexer((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //verifyException("java.io.Reader", e);
          assertNull(e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte)124;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      Lexer lexer0 = new Lexer(bufferedInputStream0);
      Token token0 = lexer0.nextToken();
      assertEquals(Token.OR, token0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte)41;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      Lexer lexer0 = new Lexer(bufferedInputStream0);
      Token token0 = lexer0.nextToken();
      assertEquals(Token.RIGHT_PAREN, token0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte)40;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Lexer lexer0 = new Lexer(byteArrayInputStream0);
      Token token0 = lexer0.nextToken();
      assertEquals(Token.LEFT_PAREN, token0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte)38;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Lexer lexer0 = new Lexer(byteArrayInputStream0);
      Token token0 = lexer0.nextToken();
      assertEquals(Token.AND, token0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)33;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Lexer lexer0 = new Lexer(byteArrayInputStream0);
      Token token0 = lexer0.nextToken();
      assertEquals(Token.NOT, token0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Lexer lexer0 = new Lexer(byteArrayInputStream0);
      Token token0 = lexer0.nextToken();
      assertEquals(Token.INVALID, token0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Lexer lexer0 = new Lexer(byteArrayInputStream0);
      lexer0.saveToken();
      assertNull(lexer0.getVariable());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Lexer lexer0 = new Lexer(byteArrayInputStream0);
      String string0 = lexer0.getVariable();
      assertNull(string0);
  }
}
