package lab3;

public class FalseIQException extends Exception{
 int iq;
 public FalseIQException() {
	 
 }
public FalseIQException(String msg, int iq) {
	 super(msg);
	 this.iq = iq;
 }

}
