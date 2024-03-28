package exceptionTest;

public class NegativeException extends Exception {

   public NegativeException() {
      super("음수 입력 예외");
   }
}