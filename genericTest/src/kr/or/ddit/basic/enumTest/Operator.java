package kr.or.ddit.basic.enumTest;

/*
    산술 연산자 기호를 데이터로 갖는 열거형 상수를 정의하고
    해당 연산자에 맞는 계산 결과를 반환하는 메소드로 구성된 열거형을 만드시오.
*/

public enum Operator {
  PLUS("+") {
    @Override
    public int calculator(int n1, int n2) {
      return n1 + n2;
    }
  },
  MINUS("-") {
    @Override
    public int calculator(int n1, int n2) {
      return n1 - n2;
    }
  },
  MULTIPLY("*") {
    @Override
    public int calculator(int n1, int n2) {
      return n1 * n2;
    }
  },
  DIVIDE("/") {
    @Override
    public int calculator(int n1, int n2) {
      return n1 / n2;
    }
  },
  MODULO("%") {
    @Override
    public int calculator(int n1, int n2) {
      return n1 % n2;
    }
  };

  private String symbol;

  private Operator(String symbol) {
    this.symbol = symbol;
  }

  public String getSymbol() {
    return this.symbol;
  }

  public abstract int calculator(int n1, int n2);
}

