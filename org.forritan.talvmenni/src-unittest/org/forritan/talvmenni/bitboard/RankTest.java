/*
 * Created on 04-04-2004
 * 
 * TODO To change the template for this generated file go to Window -
 * Preferences - Java - Code Generation - Code and Comments
 */
package org.forritan.talvmenni.bitboard;

import junit.framework.Assert;
import junit.framework.TestCase;

public class RankTest extends TestCase {

	private final String[] zeroPrefix = new String[64];

	public RankTest() {
		for (int i = 0, j = 64; i < zeroPrefix.length; i++, j--) {
			StringBuffer zeroes = new StringBuffer();
			for (int k = 1; k < j; k++) {
				zeroes.append('0');
			}
			zeroPrefix[i] = zeroes.toString();
		}
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void test1() {
		Assert.assertEquals(
            "00000000" + // A8-H8
				"00000000" + // A7-H7
				"00000000" + // A6-H6
				"00000000" + // A5-H5
				"00000000" + // A4-H4
				"00000000" + // A3-H3
				"00000000" + // B2-H2
				"11111111" // A1-H1
		, (this.zeroPrefix[Long.toBinaryString(Rank._1).length() - 1] + Long
				.toBinaryString(Rank._1)));
	}

	public void test2() {
		Assert.assertEquals(
            "00000000" + // A8-H8
				"00000000" + // A7-H7
				"00000000" + // A6-H6
				"00000000" + // A5-H5
				"00000000" + // A4-H4
				"00000000" + // A3-H3
				"11111111" + // A2-H2
				"00000000" // A1-A8
		, (this.zeroPrefix[Long.toBinaryString(Rank._2).length() - 1] + Long
				.toBinaryString(Rank._2)));
	}

	public void test3() {
		Assert.assertEquals(
            "00000000" + // A8-H8
				"00000000" + // A7-H7
				"00000000" + // A6-H6
				"00000000" + // A5-H5
				"00000000" + // A4-H4
				"11111111" + // A3-H3
				"00000000" + // A2-H2
				"00000000" // A1-A8
		, (this.zeroPrefix[Long.toBinaryString(Rank._3).length() - 1] + Long
				.toBinaryString(Rank._3)));
	}

	public void test4() {
		Assert.assertEquals(
            "00000000" + // A8-H8
				"00000000" + // A7-H7
				"00000000" + // A6-H6
				"00000000" + // A5-H5
				"11111111" + // A4-H4
				"00000000" + // A3-H3
				"00000000" + // A2-H2
				"00000000" // A1-A8
		, (this.zeroPrefix[Long.toBinaryString(Rank._4).length() - 1] + Long
				.toBinaryString(Rank._4)));
	}

	public void test5() {
		Assert.assertEquals(
            "00000000" + // A8-H8
				"00000000" + // A7-H7
				"00000000" + // A6-H6
				"11111111" + // A5-H5
				"00000000" + // A4-H4
				"00000000" + // A3-H3
				"00000000" + // A2-H2
				"00000000" // A1-A8
		, (this.zeroPrefix[Long.toBinaryString(Rank._5).length() - 1] + Long
				.toBinaryString(Rank._5)));
	}

	public void test6() {
		Assert.assertEquals(
            "00000000" + // A8-H8
				"00000000" + // A7-H7
				"11111111" + // A6-H6
				"00000000" + // A5-H5
				"00000000" + // A4-H4
				"00000000" + // A3-H3
				"00000000" + // A2-H2
				"00000000" // A1-A8
		, (this.zeroPrefix[Long.toBinaryString(Rank._6).length() - 1] + Long
				.toBinaryString(Rank._6)));
	}

	public void test7() {
		Assert.assertEquals(
            "00000000" + // A8-H8
				"11111111" + // A7-H7
				"00000000" + // A6-H6
				"00000000" + // A5-H5
				"00000000" + // A4-H4
				"00000000" + // A3-H3
				"00000000" + // A2-H2
				"00000000" // A1-A8
		, (this.zeroPrefix[Long.toBinaryString(Rank._7).length() - 1] + Long
				.toBinaryString(Rank._7)));
	}

	public void test8() {
		Assert.assertEquals(
            "11111111" + // A8-H8
				"00000000" + // A7-H7
				"00000000" + // A6-H6
				"00000000" + // A5-H5
				"00000000" + // A4-H4
				"00000000" + // A3-H3
				"00000000" + // A2-H2
				"00000000" // A1-A8
		, (this.zeroPrefix[Long.toBinaryString(Rank._8).length() - 1] + Long
				.toBinaryString(Rank._8)));
	}
}