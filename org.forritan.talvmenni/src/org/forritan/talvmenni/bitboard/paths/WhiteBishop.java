package org.forritan.talvmenni.bitboard.paths;

import org.forritan.talvmenni.bitboard.Square;

public interface WhiteBishop {

	public static final long _PATHS_FROM_B1 =
		Square._A2
			| Square._C2
			| Square._D3
			| Square._E4
			| Square._F5
			| Square._G6
			| Square._H7;

	public static final long _PATHS_FROM_D1 =
		Square._A4
			| Square._B3
			| Square._C2
			| Square._E2
			| Square._F3
			| Square._G4
			| Square._H5;

	public static final long _PATHS_FROM_F1 =
		Square._A6
			| Square._B5
			| Square._C4
			| Square._D3
			| Square._E2
			| Square._G2
			| Square._H3;

	public static final long _PATHS_FROM_H1 =
		Square._A8
			| Square._B7
			| Square._C6
			| Square._D5
			| Square._E4
			| Square._F3
			| Square._G2;

	public static final long _PATHS_FROM_A2 =
		Square._B1
			| Square._B3
			| Square._C4
			| Square._D5
			| Square._E6
			| Square._F7
			| Square._G8;

	public static final long _PATHS_FROM_C2 =
		Square._A4
			| Square._B3
			| Square._B1
			| Square._D1
			| Square._D3
			| Square._E4
			| Square._F5
			| Square._G6
			| Square._H7;

	public static final long _PATHS_FROM_E2 =
		Square._A6
			| Square._B5
			| Square._C4
			| Square._D3
			| Square._D1
			| Square._F3
			| Square._F1
			| Square._G4
			| Square._H5;

	public static final long _PATHS_FROM_G2 =
		Square._A8
			| Square._B7
			| Square._C6
			| Square._D5
			| Square._E4
			| Square._F3
			| Square._F1
			| Square._H3
			| Square._H1;

	public static final long _PATHS_FROM_B3 =
		Square._A2
			| Square._A4
			| Square._D2
			| Square._D4
			| Square._D1
			| Square._D5
			| Square._E6
			| Square._F7
			| Square._G8;

	public static final long _PATHS_FROM_D3 =
		Square._A6
			| Square._B5
			| Square._B1
			| Square._C4
			| Square._C2
			| Square._E4
			| Square._E2
			| Square._F5
			| Square._F1
			| Square._G6
			| Square._H7;

	public static final long _PATHS_FROM_F3 =
		Square._A8
			| Square._B7
			| Square._C6
			| Square._D5
			| Square._D1
			| Square._E4
			| Square._E2
			| Square._G4
			| Square._G2
			| Square._H5
			| Square._H1;

	public static final long _PATHS_FROM_H3 =
		Square._C8
			| Square._D7
			| Square._E6
			| Square._F5
			| Square._F1
			| Square._G4
			| Square._G2;

	public static final long _PATHS_FROM_A4 =
		Square._B3
			| Square._B5
			| Square._C2
			| Square._C6
			| Square._D1
			| Square._D7
			| Square._E8;

	public static final long _PATHS_FROM_C4 =
		Square._A6
			| Square._A2
			| Square._B5
			| Square._B3
			| Square._D5
			| Square._D3
			| Square._E6
			| Square._E2
			| Square._F7
			| Square._F1
			| Square._G8;

	public static final long _PATHS_FROM_E4 =
		Square._A8
			| Square._B1
			| Square._B7
			| Square._C2
			| Square._C6
			| Square._D3
			| Square._D5
			| Square._F3
			| Square._F5
			| Square._G2
			| Square._G6
			| Square._H1
			| Square._H7;

	public static final long _PATHS_FROM_G4 =
		Square._C8
			| Square._D7
			| Square._D1
			| Square._E6
			| Square._E2
			| Square._F5
			| Square._F3
			| Square._H5
			| Square._H3;

	public static final long _PATHS_FROM_B5 =
		Square._A6
			| Square._A4
			| Square._C6
			| Square._C4
			| Square._D7
			| Square._D3
			| Square._E8
			| Square._E2
			| Square._F1;

	public static final long _PATHS_FROM_D5 =
		Square._A2
			| Square._A8
			| Square._B3
			| Square._B7
			| Square._C4
			| Square._C6
			| Square._E4
			| Square._E6
			| Square._F3
			| Square._F7
			| Square._G2
			| Square._G8
			| Square._H1;

	public static final long _PATHS_FROM_F5 =
		Square._B1
			| Square._C2
			| Square._C8
			| Square._D3
			| Square._D7
			| Square._E4
			| Square._E6
			| Square._G4
			| Square._G6
			| Square._H3
			| Square._H7;

	public static final long _PATHS_FROM_H5 =
		Square._D1
			| Square._E2
			| Square._E8
			| Square._F3
			| Square._F7
			| Square._G4
			| Square._G6;

	public static final long _PATHS_FROM_A6 =
		Square._B5
			| Square._B7
			| Square._C4
			| Square._C8
			| Square._D3
			| Square._E2
			| Square._F1;

	public static final long _PATHS_FROM_C6 =
		Square._A4
			| Square._A8
			| Square._B5
			| Square._B7
			| Square._D7
			| Square._D5
			| Square._E8
			| Square._E4
			| Square._F3
			| Square._G2
			| Square._H1;

	public static final long _PATHS_FROM_E6 =
		Square._A2
			| Square._B3
			| Square._C4
			| Square._C8
			| Square._D5
			| Square._D7
			| Square._F5
			| Square._F7
			| Square._G4
			| Square._G8
			| Square._H3;

	public static final long _PATHS_FROM_G6 =
		Square._B1
			| Square._C2
			| Square._D3
			| Square._E4
			| Square._E8
			| Square._F5
			| Square._F7
			| Square._H5
			| Square._H7;

	public static final long _PATHS_FROM_B7 =
		Square._A6
			| Square._A8
			| Square._C8
			| Square._C6
			| Square._D5
			| Square._E4
			| Square._F3
			| Square._G2
			| Square._H1;

	public static final long _PATHS_FROM_D7 =
		Square._A4
			| Square._B5
			| Square._C6
			| Square._C8
			| Square._E6
			| Square._E8
			| Square._F5
			| Square._G4
			| Square._H3;

	public static final long _PATHS_FROM_F7 =
		Square._A2
			| Square._B3
			| Square._C4
			| Square._D5
			| Square._E6
			| Square._E8
			| Square._G6
			| Square._G8
			| Square._H5;

	public static final long _PATHS_FROM_H7 =
		Square._B1
			| Square._C2
			| Square._D3
			| Square._E4
			| Square._F5
			| Square._G6
			| Square._G8;

	public static final long _PATHS_FROM_A8 =
		Square._B7
			| Square._C6
			| Square._D5
			| Square._E4
			| Square._F3
			| Square._G2
			| Square._H1;

	public static final long _PATHS_FROM_C8 =
		Square._A6
			| Square._B7
			| Square._D7
			| Square._E6
			| Square._F5
			| Square._G4
			| Square._H3;

	public static final long _PATHS_FROM_E8 =
		Square._A4
			| Square._B5
			| Square._C6
			| Square._D7
			| Square._F7
			| Square._G6
			| Square._H5;

	public static final long _PATHS_FROM_G8 =
		Square._A2
			| Square._B3
			| Square._C4
			| Square._D5
			| Square._E6
			| Square._F7
			| Square._H7;

}
