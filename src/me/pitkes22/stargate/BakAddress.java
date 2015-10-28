package me.pitkes22.stargate;

import java.util.ArrayList;

public class BakAddress {
	public Symbol symbol1;
	public Symbol symbol2;
	public Symbol symbol3;
	public Symbol symbol4;
	public Symbol symbol5;
	public Symbol symbol6;
	public Symbol symbol7;
	public Symbol symbol8;
	public Symbol symbol9;
	
	public BakAddress(Symbol symbol1,Symbol symbol2,Symbol symbol3,Symbol symbol4,Symbol symbol5,Symbol symbol6,Symbol symbol7,Symbol symbol8,Symbol symbol9) {
		ArrayList<Symbol> symbollist= new ArrayList<Symbol>();
		symbollist.get
		this.symbol1 = symbol1;
		this.symbol2 = symbol2;
		this.symbol3 = symbol3;
		this.symbol4 = symbol4;
		this.symbol5 = symbol5;
		this.symbol6 = symbol6;
		this.symbol7 = symbol7;
		this.symbol8 = symbol8;
		this.symbol9 = symbol9;
	}
	public BakAddress(int[] id){
		this.symbol1 = Symbol.getByInteger(id[0]);
		this.symbol2 = Symbol.getByInteger(id[0]);
		this.symbol3 = Symbol.getByInteger(id[0]);
		this.symbol4 = Symbol.getByInteger(id[0]);
		this.symbol5 = Symbol.getByInteger(id[0]);
		this.symbol6 = Symbol.getByInteger(id[0]);
		this.symbol7 = Symbol.getByInteger(id[0]);
		this.symbol8 = Symbol.getByInteger(id[0]);
		this.symbol9 = Symbol.getByInteger(id[0]);
	}
	public Symbol getSymbol1() {
		return symbol1;
	}
	public void setSymbol1(Symbol symbol1) {
		this.symbol1 = symbol1;
	}
	public Symbol getSymbol2() {
		return symbol2;
	}
	public void setSymbol2(Symbol symbol2) {
		this.symbol2 = symbol2;
	}
	public Symbol getSymbol3() {
		return symbol3;
	}
	public void setSymbol3(Symbol symbol3) {
		this.symbol3 = symbol3;
	}
	public Symbol getSymbol4() {
		return symbol4;
	}
	public void setSymbol4(Symbol symbol4) {
		this.symbol4 = symbol4;
	}
	public Symbol getSymbol5() {
		return symbol5;
	}
	public void setSymbol5(Symbol symbol5) {
		this.symbol5 = symbol5;
	}
	public Symbol getSymbol6() {
		return symbol6;
	}
	public void setSymbol6(Symbol symbol6) {
		this.symbol6 = symbol6;
	}
	public Symbol getSymbol7() {
		return symbol7;
	}
	public void setSymbol7(Symbol symbol7) {
		this.symbol7 = symbol7;
	}
	public Symbol getSymbol8() {
		return symbol8;
	}
	public void setSymbol8(Symbol symbol8) {
		this.symbol8 = symbol8;
	}
	public Symbol getSymbol9() {
		return symbol9;
	}
	public void setSymbol9(Symbol symbol9) {
		this.symbol9 = symbol9;
	}
	

}

