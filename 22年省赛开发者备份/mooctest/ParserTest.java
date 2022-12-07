package net.mooctest;


import static org.junit.Assert.*;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;

import net.mooctest.Lexer;
import net.mooctest.Parser;

import org.junit.Test;
import org.junit.runner.RunWith;

public class ParserTest  {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Parser parser0 = new Parser((Lexer) null);
      // Undeclared exception!
      try { 
        parser0.buildExprTree();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //verifyException("net.mooctest.Parser", e);
          assertNull(e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1), (byte)1);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, 1);
      Lexer lexer0 = new Lexer(bufferedInputStream0);
      Parser parser0 = new Parser(lexer0);
      // Undeclared exception!
      try { 
        parser0.buildExprTree();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
          assertNull(e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)65;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Lexer lexer0 = new Lexer(byteArrayInputStream0);
      Parser parser0 = new Parser(lexer0);
      parser0.buildExprTree();
      ArrayList<String> arrayList0 = parser0.getVariables();
      assertEquals(1, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Lexer lexer0 = new Lexer(byteArrayInputStream0);
      Parser parser0 = new Parser(lexer0);
      ArrayList<String> arrayList0 = parser0.getVariables();
      assertTrue(arrayList0.isEmpty());
  }

}
