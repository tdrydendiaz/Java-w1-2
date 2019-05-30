package com.bae.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Test;

import org.junit.Before;
import org.junit.BeforeClass;

import com.bae.blackjack.main.Blackjackmain;


public class UnitTestTwist {
	static Blackjackmain blackjack;
	ArrayList<Integer>list = new ArrayList<Integer>();

	@BeforeClass
	public static void setup() {
		blackjack = new Blackjackmain();
	}

	@Before
	public void init() {

		for (int i = 0; i < 100; i++) {
			list.add(blackjack.twist());
		}
	}
	
	@Test
	public void testTwist() {
		for (int a : list) {
			if(a>0 && a<12) {
				continue;
			}else {
				fail("expected value between 1 and 11 but got "+ a);
			}
		}
		assertTrue(true);
	}

	@Test
	public void test1() {
		assertEquals(1, blackjack.twist());
	}

	@Test
	public void test2() {
		assertEquals(2, blackjack.twist());
	}

	@Test
	public void test3() {
		assertEquals(3, blackjack.twist());
	}

	@Test
	public void test4() {
		assertEquals(4, blackjack.twist());
	}

	@Test
	public void test5() {
		assertEquals(5, blackjack.twist());
	}

	@Test
	public void test6() {
		assertEquals(6, blackjack.twist());
	}

	@Test
	public void test7() {
		assertEquals(7, blackjack.twist());
	}

	@Test
	public void test8() {
		assertEquals(8, blackjack.twist());
	}

	@Test
	public void test9() {
		assertEquals(9, blackjack.twist());
	}

	@Test
	public void test10() {
		assertEquals(10, blackjack.twist());
	}

	@Test
	public void test11() {
		assertEquals(11, blackjack.twist());
	}

}