package it.colella.esame.model;

public enum Card {

	D0(Number.ACE, Suit.DIAMONDS, 1),
	D1(Number.TWO, Suit.DIAMONDS, 2),
	D2(Number.THREE, Suit.DIAMONDS, 3),
	D3(Number.FOUR, Suit.DIAMONDS, 4),
	D4(Number.FIVE, Suit.DIAMONDS, 5),
	D5(Number.SIX, Suit.DIAMONDS, 6),
	D6(Number.SEVEN, Suit.DIAMONDS, 7),
	D7(Number.EIGHT, Suit.DIAMONDS, 8),
	D8(Number.NINE, Suit.DIAMONDS, 9),
	D9(Number.TEN, Suit.DIAMONDS, 10),
	D10(Number.J, Suit.DIAMONDS, 10),
	D11(Number.Q, Suit.DIAMONDS, 10),
	D12(Number.K, Suit.DIAMONDS, 10),
	
	S0(Number.ACE, Suit.SPADES, 1),
	S1(Number.TWO, Suit.SPADES, 2),
	S2(Number.THREE, Suit.SPADES, 3),
	S3(Number.FOUR, Suit.SPADES, 4),
	S4(Number.FIVE, Suit.SPADES, 5),
	S5(Number.SIX, Suit.SPADES, 6),
	S6(Number.SEVEN, Suit.SPADES, 7),
	S7(Number.EIGHT, Suit.SPADES, 8),
	S8(Number.NINE, Suit.SPADES, 9),
	S9(Number.TEN, Suit.SPADES, 10),
	S10(Number.J, Suit.SPADES, 10),
	S11(Number.Q, Suit.SPADES, 10),
	S12(Number.K, Suit.SPADES, 10),
	
	C0(Number.ACE, Suit.CLUBS, 1),
	C1(Number.TWO, Suit.CLUBS, 2),
	C2(Number.THREE, Suit.CLUBS, 3),
	C3(Number.FOUR, Suit.CLUBS, 4),
	C4(Number.FIVE, Suit.CLUBS, 5),
	C5(Number.SIX, Suit.CLUBS, 6),
	C6(Number.SEVEN, Suit.CLUBS, 7),
	C7(Number.EIGHT, Suit.CLUBS, 8),
	C8(Number.NINE, Suit.CLUBS, 9),
	C9(Number.TEN, Suit.CLUBS, 10),
	C10(Number.J, Suit.CLUBS, 10),
	C11(Number.Q, Suit.CLUBS, 10),
	C12(Number.K, Suit.CLUBS, 10),
	
	H0(Number.ACE, Suit.HEARTS, 1),
	H1(Number.TWO, Suit.HEARTS, 2),
	H2(Number.THREE, Suit.HEARTS, 3),
	H3(Number.FOUR, Suit.HEARTS, 4),
	H4(Number.FIVE, Suit.HEARTS, 5),
	H5(Number.SIX, Suit.HEARTS, 6),
	H6(Number.SEVEN, Suit.HEARTS, 7),
	H7(Number.EIGHT, Suit.HEARTS, 8),
	H8(Number.NINE, Suit.HEARTS, 9),
	H9(Number.TEN, Suit.HEARTS, 10),
	H10(Number.J, Suit.HEARTS, 10),
	H11(Number.Q, Suit.HEARTS, 10),
	H12(Number.K, Suit.HEARTS, 10);

	private Number number;
	private Suit suit;
	private int point;

	Card(Number number, Suit suit, int point) {
		this.point = point;
	}

	public Number getNumber() {
		return number;
	}

	public Suit getSuit() {
		return suit;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	
}
