/*
 * Created on 04-04-2004
 * 
 * TODO To change the template for this generated file go to Window -
 * Preferences - Java - Code Generation - Code and Comments
 */
package org.forritan.talvmenni.bitboard.paths;
import junit.framework.Assert;
import junit.framework.TestCase;
public class RookTest extends TestCase {
	private final String[] zeroPrefix = new String[64];
	public RookTest() {
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
	public void testRookPathsFromA1() {
		Assert.assertEquals(
				"10000000" + // H1-H8
				"10000000" + // G1-G8
				"10000000" + // F1-F8
				"10000000" + // E1-E8
				"10000000" + // D1-D8
				"10000000" + // C1-C8
				"10000000" + // B1-B8
				"01111111", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_A1)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_A1)));
	}
	public void testRookPathsFromA2() {
		Assert.assertEquals(
				"01000000" + // H1-H8
				"01000000" + // G1-G8
				"01000000" + // F1-F8
				"01000000" + // E1-E8
				"01000000" + // D1-D8
				"01000000" + // C1-C8
				"01000000" + // B1-B8
				"10111111", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_A2)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_A2)));
	}
	public void testRookPathsFromA3() {
		Assert.assertEquals(
				"00100000" + // H1-H8
				"00100000" + // G1-G8
				"00100000" + // F1-F8
				"00100000" + // E1-E8
				"00100000" + // D1-D8
				"00100000" + // C1-C8
				"00100000" + // B1-B8
				"11011111", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_A3)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_A3)));
	}
	public void testRookPathsFromA4() {
		Assert.assertEquals(
				"00010000" + // H1-H8
				"00010000" + // G1-G8
				"00010000" + // F1-F8
				"00010000" + // E1-E8
				"00010000" + // D1-D8
				"00010000" + // C1-C8
				"00010000" + // B1-B8
				"11101111", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_A4)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_A4)));
	}
	public void testRookPathsFromA5() {
		Assert.assertEquals(
				"00001000" + // H1-H8
				"00001000" + // G1-G8
				"00001000" + // F1-F8
				"00001000" + // E1-E8
				"00001000" + // D1-D8
				"00001000" + // C1-C8
				"00001000" + // B1-B8
				"11110111", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_A5)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_A5)));
	}
	public void testRookPathsFromA6() {
		Assert.assertEquals(
				"00000100" + // H1-H8
				"00000100" + // G1-G8
				"00000100" + // F1-F8
				"00000100" + // E1-E8
				"00000100" + // D1-D8
				"00000100" + // C1-C8
				"00000100" + // B1-B8
				"11111011", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_A6)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_A6)));
	}
	public void testRookPathsFromA7() {
		Assert.assertEquals(
				"00000010" + // H1-H8
				"00000010" + // G1-G8
				"00000010" + // F1-F8
				"00000010" + // E1-E8
				"00000010" + // D1-D8
				"00000010" + // C1-C8
				"00000010" + // B1-B8
				"11111101", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_A7)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_A7)));
	}
	public void testRookPathsFromA8() {
		Assert.assertEquals(
				"00000001" + // H1-H8
				"00000001" + // G1-G8
				"00000001" + // F1-F8
				"00000001" + // E1-E8
				"00000001" + // D1-D8
				"00000001" + // C1-C8
				"00000001" + // B1-B8
				"11111110", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_A8)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_A8)));
	}
	public void testRookPathsFromB1() {
		Assert.assertEquals(
				"10000000" + // H1-H8
				"10000000" + // G1-G8
				"10000000" + // F1-F8
				"10000000" + // E1-E8
				"10000000" + // D1-D8
				"10000000" + // C1-C8
				"01111111" + // B1-B8
				"10000000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_B1)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_B1)));
	}
	public void testRookPathsFromB2() {
		Assert.assertEquals(
				"01000000" + // H1-H8
				"01000000" + // G1-G8
				"01000000" + // F1-F8
				"01000000" + // E1-E8
				"01000000" + // D1-D8
				"01000000" + // C1-C8
				"10111111" + // B1-B8
				"01000000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_B2)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_B2)));
	}
	public void testRookPathsFromB3() {
		Assert.assertEquals(
				"00100000" + // H1-H8
				"00100000" + // G1-G8
				"00100000" + // F1-F8
				"00100000" + // E1-E8
				"00100000" + // D1-D8
				"00100000" + // C1-C8
				"11011111" + // B1-B8
				"00100000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_B3)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_B3)));
	}
	public void testRookPathsFromB4() {
		Assert.assertEquals(
				"00010000" + // H1-H8
				"00010000" + // G1-G8
				"00010000" + // F1-F8
				"00010000" + // E1-E8
				"00010000" + // D1-D8
				"00010000" + // C1-C8
				"11101111" + // B1-B8
				"00010000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_B4)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_B4)));
	}
	public void testRookPathsFromB5() {
		Assert.assertEquals(
				"00001000" + // H1-H8
				"00001000" + // G1-G8
				"00001000" + // F1-F8
				"00001000" + // E1-E8
				"00001000" + // D1-D8
				"00001000" + // C1-C8
				"11110111" + // B1-B8
				"00001000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_B5)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_B5)));
	}
	public void testRookPathsFromB6() {
		Assert.assertEquals(
				"00000100" + // H1-H8
				"00000100" + // G1-G8
				"00000100" + // F1-F8
				"00000100" + // E1-E8
				"00000100" + // D1-D8
				"00000100" + // C1-C8
				"11111011" + // B1-B8
				"00000100", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_B6)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_B6)));
	}
	public void testRookPathsFromB7() {
		Assert.assertEquals(
				"00000010" + // H1-H8
				"00000010" + // G1-G8
				"00000010" + // F1-F8
				"00000010" + // E1-E8
				"00000010" + // D1-D8
				"00000010" + // C1-C8
				"11111101" + // B1-B8
				"00000010", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_B7)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_B7)));
	}
	public void testRookPathsFromB8() {
		Assert.assertEquals(
				"00000001" + // H1-H8
				"00000001" + // G1-G8
				"00000001" + // F1-F8
				"00000001" + // E1-E8
				"00000001" + // D1-D8
				"00000001" + // C1-C8
				"11111110" + // B1-B8
				"00000001", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_B8)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_B8)));
	}
	public void testRookPathsFromC1() {
		Assert.assertEquals(
				"10000000" + // H1-H8
				"10000000" + // G1-G8
				"10000000" + // F1-F8
				"10000000" + // E1-E8
				"10000000" + // D1-D8
				"01111111" + // C1-C8
				"10000000" + // B1-B8
				"10000000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_C1)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_C1)));
	}
	public void testRookPathsFromC2() {
		Assert.assertEquals(
				"01000000" + // H1-H8
				"01000000" + // G1-G8
				"01000000" + // F1-F8
				"01000000" + // E1-E8
				"01000000" + // D1-D8
				"10111111" + // C1-C8
				"01000000" + // B1-B8
				"01000000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_C2)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_C2)));
	}
	public void testRookPathsFromC3() {
		Assert.assertEquals(
				"00100000" + // H1-H8
				"00100000" + // G1-G8
				"00100000" + // F1-F8
				"00100000" + // E1-E8
				"00100000" + // D1-D8
				"11011111" + // C1-C8
				"00100000" + // B1-B8
				"00100000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_C3)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_C3)));
	}
	public void testRookPathsFromC4() {
		Assert.assertEquals(
				"00010000" + // H1-H8
				"00010000" + // G1-G8
				"00010000" + // F1-F8
				"00010000" + // E1-E8
				"00010000" + // D1-D8
				"11101111" + // C1-C8
				"00010000" + // B1-B8
				"00010000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_C4)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_C4)));
	}
	public void testRookPathsFromC5() {
		Assert.assertEquals(
				"00001000" + // H1-H8
				"00001000" + // G1-G8
				"00001000" + // F1-F8
				"00001000" + // E1-E8
				"00001000" + // D1-D8
				"11110111" + // C1-C8
				"00001000" + // B1-B8
				"00001000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_C5)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_C5)));
	}
	public void testRookPathsFromC6() {
		Assert.assertEquals(
				"00000100" + // H1-H8
				"00000100" + // G1-G8
				"00000100" + // F1-F8
				"00000100" + // E1-E8
				"00000100" + // D1-D8
				"11111011" + // C1-C8
				"00000100" + // B1-B8
				"00000100", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_C6)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_C6)));
	}
	public void testRookPathsFromC7() {
		Assert.assertEquals(
				"00000010" + // H1-H8
				"00000010" + // G1-G8
				"00000010" + // F1-F8
				"00000010" + // E1-E8
				"00000010" + // D1-D8
				"11111101" + // C1-C8
				"00000010" + // B1-B8
				"00000010", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_C7)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_C7)));
	}
	public void testRookPathsFromC8() {
		Assert.assertEquals(
				"00000001" + // H1-H8
				"00000001" + // G1-G8
				"00000001" + // F1-F8
				"00000001" + // E1-E8
				"00000001" + // D1-D8
				"11111110" + // C1-C8
				"00000001" + // B1-B8
				"00000001", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_C8)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_C8)));
	}
	public void testRookPathsFromD1() {
		Assert.assertEquals(
				"10000000" + // H1-H8
				"10000000" + // G1-G8
				"10000000" + // F1-F8
				"10000000" + // E1-E8
				"01111111" + // D1-D8
				"10000000" + // C1-C8
				"10000000" + // B1-B8
				"10000000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_D1)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_D1)));
	}
	public void testRookPathsFromD2() {
		Assert.assertEquals(
				"01000000" + // H1-H8
				"01000000" + // G1-G8
				"01000000" + // F1-F8
				"01000000" + // E1-E8
				"10111111" + // D1-D8
				"01000000" + // C1-C8
				"01000000" + // B1-B8
				"01000000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_D2)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_D2)));
	}
	public void testRookPathsFromD3() {
		Assert.assertEquals(
				"00100000" + // H1-H8
				"00100000" + // G1-G8
				"00100000" + // F1-F8
				"00100000" + // E1-E8
				"11011111" + // D1-D8
				"00100000" + // C1-C8
				"00100000" + // B1-B8
				"00100000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_D3)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_D3)));
	}
	public void testRookPathsFromD4() {
		Assert.assertEquals(
				"00010000" + // H1-H8
				"00010000" + // G1-G8
				"00010000" + // F1-F8
				"00010000" + // E1-E8
				"11101111" + // D1-D8
				"00010000" + // C1-C8
				"00010000" + // B1-B8
				"00010000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_D4)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_D4)));
	}
	public void testRookPathsFromD5() {
		Assert.assertEquals(
				"00001000" + // H1-H8
				"00001000" + // G1-G8
				"00001000" + // F1-F8
				"00001000" + // E1-E8
				"11110111" + // D1-D8
				"00001000" + // C1-C8
				"00001000" + // B1-B8
				"00001000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_D5)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_D5)));
	}
	public void testRookPathsFromD6() {
		Assert.assertEquals(
				"00000100" + // H1-H8
				"00000100" + // G1-G8
				"00000100" + // F1-F8
				"00000100" + // E1-E8
				"11111011" + // D1-D8
				"00000100" + // C1-C8
				"00000100" + // B1-B8
				"00000100", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_D6)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_D6)));
	}
	public void testRookPathsFromD7() {
		Assert.assertEquals(
				"00000010" + // H1-H8
				"00000010" + // G1-G8
				"00000010" + // F1-F8
				"00000010" + // E1-E8
				"11111101" + // D1-D8
				"00000010" + // C1-C8
				"00000010" + // B1-B8
				"00000010", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_D7)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_D7)));
	}
	public void testRookPathsFromD8() {
		Assert.assertEquals(
				"00000001" + // H1-H8
				"00000001" + // G1-G8
				"00000001" + // F1-F8
				"00000001" + // E1-E8
				"11111110" + // D1-D8
				"00000001" + // C1-C8
				"00000001" + // B1-B8
				"00000001", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_D8)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_D8)));
	}
	public void testRookPathsFromE1() {
		Assert.assertEquals(
				"10000000" + // H1-H8
				"10000000" + // G1-G8
				"10000000" + // F1-F8
				"01111111" + // E1-E8
				"10000000" + // D1-D8
				"10000000" + // C1-C8
				"10000000" + // B1-B8
				"10000000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_E1)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_E1)));
	}
	public void testRookPathsFromE2() {
		Assert.assertEquals(
				"01000000" + // H1-H8
				"01000000" + // G1-G8
				"01000000" + // F1-F8
				"10111111" + // E1-E8
				"01000000" + // D1-D8
				"01000000" + // C1-C8
				"01000000" + // B1-B8
				"01000000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_E2)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_E2)));
	}
	public void testRookPathsFromE3() {
		Assert.assertEquals(
				"00100000" + // H1-H8
				"00100000" + // G1-G8
				"00100000" + // F1-F8
				"11011111" + // E1-E8
				"00100000" + // D1-D8
				"00100000" + // C1-C8
				"00100000" + // B1-B8
				"00100000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_E3)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_E3)));
	}
	public void testRookPathsFromE4() {
		Assert.assertEquals(
				"00010000" + // H1-H8
				"00010000" + // G1-G8
				"00010000" + // F1-F8
				"11101111" + // E1-E8
				"00010000" + // D1-D8
				"00010000" + // C1-C8
				"00010000" + // B1-B8
				"00010000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_E4)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_E4)));
	}
	public void testRookPathsFromE5() {
		Assert.assertEquals(
				"00001000" + // H1-H8
				"00001000" + // G1-G8
				"00001000" + // F1-F8
				"11110111" + // E1-E8
				"00001000" + // D1-D8
				"00001000" + // C1-C8
				"00001000" + // B1-B8
				"00001000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_E5)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_E5)));
	}
	public void testRookPathsFromE6() {
		Assert.assertEquals(
				"00000100" + // H1-H8
				"00000100" + // G1-G8
				"00000100" + // F1-F8
				"11111011" + // E1-E8
				"00000100" + // D1-D8
				"00000100" + // C1-C8
				"00000100" + // B1-B8
				"00000100", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_E6)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_E6)));
	}
	public void testRookPathsFromE7() {
		Assert.assertEquals(
				"00000010" + // H1-H8
				"00000010" + // G1-G8
				"00000010" + // F1-F8
				"11111101" + // E1-E8
				"00000010" + // D1-D8
				"00000010" + // C1-C8
				"00000010" + // B1-B8
				"00000010", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_E7)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_E7)));
	}
	public void testRookPathsFromE8() {
		Assert.assertEquals(
				"00000001" + // H1-H8
				"00000001" + // G1-G8
				"00000001" + // F1-F8
				"11111110" + // E1-E8
				"00000001" + // D1-D8
				"00000001" + // C1-C8
				"00000001" + // B1-B8
				"00000001", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_E8)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_E8)));
	}
	public void testRookPathsFromF1() {
		Assert.assertEquals(
				"10000000" + // H1-H8
				"10000000" + // G1-G8
				"01111111" + // F1-F8
				"10000000" + // E1-E8
				"10000000" + // D1-D8
				"10000000" + // C1-C8
				"10000000" + // B1-B8
				"10000000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_F1)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_F1)));
	}
	public void testRookPathsFromF2() {
		Assert.assertEquals(
				"01000000" + // H1-H8
				"01000000" + // G1-G8
				"10111111" + // F1-F8
				"01000000" + // E1-E8
				"01000000" + // D1-D8
				"01000000" + // C1-C8
				"01000000" + // B1-B8
				"01000000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_F2)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_F2)));
	}
	public void testRookPathsFromF3() {
		Assert.assertEquals(
				"00100000" + // H1-H8
				"00100000" + // G1-G8
				"11011111" + // F1-F8
				"00100000" + // E1-E8
				"00100000" + // D1-D8
				"00100000" + // C1-C8
				"00100000" + // B1-B8
				"00100000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_F3)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_F3)));
	}
	public void testRookPathsFromF4() {
		Assert.assertEquals(
				"00010000" + // H1-H8
				"00010000" + // G1-G8
				"11101111" + // F1-F8
				"00010000" + // E1-E8
				"00010000" + // D1-D8
				"00010000" + // C1-C8
				"00010000" + // B1-B8
				"00010000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_F4)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_F4)));
	}
	public void testRookPathsFromF5() {
		Assert.assertEquals(
				"00001000" + // H1-H8
				"00001000" + // G1-G8
				"11110111" + // F1-F8
				"00001000" + // E1-E8
				"00001000" + // D1-D8
				"00001000" + // C1-C8
				"00001000" + // B1-B8
				"00001000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_F5)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_F5)));
	}
	public void testRookPathsFromF6() {
		Assert.assertEquals(
				"00000100" + // H1-H8
				"00000100" + // G1-G8
				"11111011" + // F1-F8
				"00000100" + // E1-E8
				"00000100" + // D1-D8
				"00000100" + // C1-C8
				"00000100" + // B1-B8
				"00000100", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_F6)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_F6)));
	}
	public void testRookPathsFromF7() {
		Assert.assertEquals(
				"00000010" + // H1-H8
				"00000010" + // G1-G8
				"11111101" + // F1-F8
				"00000010" + // E1-E8
				"00000010" + // D1-D8
				"00000010" + // C1-C8
				"00000010" + // B1-B8
				"00000010", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_F7)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_F7)));
	}
	public void testRookPathsFromF8() {
		Assert.assertEquals(
				"00000001" + // H1-H8
				"00000001" + // G1-G8
				"11111110" + // F1-F8
				"00000001" + // E1-E8
				"00000001" + // D1-D8
				"00000001" + // C1-C8
				"00000001" + // B1-B8
				"00000001", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_F8)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_F8)));
	}
	public void testRookPathsFromG1() {
		Assert.assertEquals(
				"10000000" + // H1-H8
				"01111111" + // G1-G8
				"10000000" + // F1-F8
				"10000000" + // E1-E8
				"10000000" + // D1-D8
				"10000000" + // C1-C8
				"10000000" + // B1-B8
				"10000000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_G1)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_G1)));
	}
	public void testRookPathsFromG2() {
		Assert.assertEquals(
				"01000000" + // H1-H8
				"10111111" + // G1-G8
				"01000000" + // F1-F8
				"01000000" + // E1-E8
				"01000000" + // D1-D8
				"01000000" + // C1-C8
				"01000000" + // B1-B8
				"01000000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_G2)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_G2)));
	}
	public void testRookPathsFromG3() {
		Assert.assertEquals(
				"00100000" + // H1-H8
				"11011111" + // G1-G8
				"00100000" + // F1-F8
				"00100000" + // E1-E8
				"00100000" + // D1-D8
				"00100000" + // C1-C8
				"00100000" + // B1-B8
				"00100000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_G3)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_G3)));
	}
	public void testRookPathsFromG4() {
		Assert.assertEquals(
				"00010000" + // H1-H8
				"11101111" + // G1-G8
				"00010000" + // F1-F8
				"00010000" + // E1-E8
				"00010000" + // D1-D8
				"00010000" + // C1-C8
				"00010000" + // B1-B8
				"00010000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_G4)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_G4)));
	}
	public void testRookPathsFromG5() {
		Assert.assertEquals(
				"00001000" + // H1-H8
				"11110111" + // G1-G8
				"00001000" + // F1-F8
				"00001000" + // E1-E8
				"00001000" + // D1-D8
				"00001000" + // C1-C8
				"00001000" + // B1-B8
				"00001000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_G5)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_G5)));
	}
	public void testRookPathsFromG6() {
		Assert.assertEquals(
				"00000100" + // H1-H8
				"11111011" + // G1-G8
				"00000100" + // F1-F8
				"00000100" + // E1-E8
				"00000100" + // D1-D8
				"00000100" + // C1-C8
				"00000100" + // B1-B8
				"00000100", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_G6)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_G6)));
	}
	public void testRookPathsFromG7() {
		Assert.assertEquals(
				"00000010" + // H1-H8
				"11111101" + // G1-G8
				"00000010" + // F1-F8
				"00000010" + // E1-E8
				"00000010" + // D1-D8
				"00000010" + // C1-C8
				"00000010" + // B1-B8
				"00000010", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_G7)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_G7)));
	}
	public void testRookPathsFromG8() {
		Assert.assertEquals(
				"00000001" + // H1-H8
				"11111110" + // G1-G8
				"00000001" + // F1-F8
				"00000001" + // E1-E8
				"00000001" + // D1-D8
				"00000001" + // C1-C8
				"00000001" + // B1-B8
				"00000001", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_G8)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_G8)));
	}
	public void testRookPathsFromH1() {
		Assert.assertEquals(
				"01111111" + // H1-H8
				"10000000" + // G1-G8
				"10000000" + // F1-F8
				"10000000" + // E1-E8
				"10000000" + // D1-D8
				"10000000" + // C1-C8
				"10000000" + // B1-B8
				"10000000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_H1)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_H1)));
	}
	public void testRookPathsFromH2() {
		Assert.assertEquals(
				"10111111" + // H1-H8
				"01000000" + // G1-G8
				"01000000" + // F1-F8
				"01000000" + // E1-E8
				"01000000" + // D1-D8
				"01000000" + // C1-C8
				"01000000" + // B1-B8
				"01000000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_H2)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_H2)));
	}
	public void testRookPathsFromH3() {
		Assert.assertEquals(
				"11011111" + // H1-H8
				"00100000" + // G1-G8
				"00100000" + // F1-F8
				"00100000" + // E1-E8
				"00100000" + // D1-D8
				"00100000" + // C1-C8
				"00100000" + // B1-B8
				"00100000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_H3)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_H3)));
	}
	public void testRookPathsFromH4() {
		Assert.assertEquals(
				"11101111" + // H1-H8
				"00010000" + // G1-G8
				"00010000" + // F1-F8
				"00010000" + // E1-E8
				"00010000" + // D1-D8
				"00010000" + // C1-C8
				"00010000" + // B1-B8
				"00010000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_H4)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_H4)));
	}
	public void testRookPathsFromH5() {
		Assert.assertEquals(
				"11110111" + // H1-H8
				"00001000" + // G1-G8
				"00001000" + // F1-F8
				"00001000" + // E1-E8
				"00001000" + // D1-D8
				"00001000" + // C1-C8
				"00001000" + // B1-B8
				"00001000", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_H5)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_H5)));
	}
	public void testRookPathsFromH6() {
		Assert.assertEquals(
				"11111011" + // H1-H8
				"00000100" + // G1-G8
				"00000100" + // F1-F8
				"00000100" + // E1-E8
				"00000100" + // D1-D8
				"00000100" + // C1-C8
				"00000100" + // B1-B8
				"00000100", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_H6)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_H6)));
	}
	public void testRookPathsFromH7() {
		Assert.assertEquals(
				"11111101" + // H1-H8
				"00000010" + // G1-G8
				"00000010" + // F1-F8
				"00000010" + // E1-E8
				"00000010" + // D1-D8
				"00000010" + // C1-C8
				"00000010" + // B1-B8
				"00000010", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_H7)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_H7)));
	}
	public void testRookPathsFromH8() {
		Assert.assertEquals(
				"11111110" + // H1-H8
				"00000001" + // G1-G8
				"00000001" + // F1-F8
				"00000001" + // E1-E8
				"00000001" + // D1-D8
				"00000001" + // C1-C8
				"00000001" + // B1-B8
				"00000001", // A1-A8
				(this.zeroPrefix[Long.toBinaryString(Rook._PATHS_FROM_H8)
						.length() - 1] + Long
						.toBinaryString(Rook._PATHS_FROM_H8)));
	}
}