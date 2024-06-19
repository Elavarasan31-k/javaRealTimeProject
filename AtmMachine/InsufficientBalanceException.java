package AtmMachine;

public class InsufficientBalanceException extends Exception {
 @Override
public String getMessage() {
	return "ley user ur begger";
}
}
