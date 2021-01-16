package ch8.ex;

public class UnsupportedFunctionException extends RuntimeException {

  final private int ERR_CODE;
  String ERR_MESSAGE;

  UnsupportedFunctionException(String error){
    this(error, 100);
  }

  UnsupportedFunctionException(String error, int ERR_CODE){
    super(error);
    this.ERR_CODE = ERR_CODE;
  }

  public int getERR_CODE() {
    return ERR_CODE;
  }

  @Override
  public String getMessage() {
    return "[" + getERR_CODE() + "]" + super.getMessage();
  }
}

class Exercise8_9 {

  public static void main(String[] args) {
    throw new UnsupportedFunctionException("지원하지 않는 기능입니다.",100);
  }
}