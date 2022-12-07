package net.mooctest;

import net.mooctest.ProblemSolver;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

public class ProblemSolverTest{

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ProblemSolver problemSolver0 = new ProblemSolver();
      assertEquals("net.mooctest.ProblemSolver",problemSolver0.getClass().getName());
  }
}
