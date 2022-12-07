package net.mooctest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import net.mooctest.GraphWriter;
import org.junit.Test;

public class GraphWriterTest {

	protected static ExecutorService executor;

	@BeforeClass
	public static void initGraphWriterTest() {
		executor = Executors.newCachedThreadPool();
	}

	@AfterClass
	public static void clearGraphWriterTest() {
		executor.shutdownNow();
	}

	@Test(timeout = 4000)
	public void test0() throws Throwable {
		Future<?> future = executor.submit(new Runnable() {
			@Override
			public void run() {
				GraphWriter graphWriter0 = new GraphWriter();
				boolean boolean0 = graphWriter0.writeGraphToFile("");
				assertFalse(boolean0);
			}
		});
//		future.get(4000, TimeUnit.MILLISECONDS);
	}

	@Test(timeout = 4000)
	public void test1() throws Throwable {
		GraphWriter graphWriter0 = new GraphWriter();
		graphWriter0.addln((String) null);
	}

	@Test(timeout = 4000)
	public void test2() throws Throwable {
		GraphWriter graphWriter0 = new GraphWriter();
		graphWriter0.addHeader();
	}

	@Test(timeout = 4000)
	public void test3() throws Throwable {
		GraphWriter graphWriter0 = new GraphWriter();
		graphWriter0.endGraph();
	}

	@Test(timeout = 4000)
	public void test4() throws Throwable {
		GraphWriter graphWriter0 = new GraphWriter();
		graphWriter0.startGraph();
	}
}
