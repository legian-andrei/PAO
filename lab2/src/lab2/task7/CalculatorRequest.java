package lab2.task7;

public class CalculatorRequest {
    private Object leftOperand, rightOperand;
    String operation;
    public CalculatorRequest (Object leftOperand, Object operation, Object rightOperand) {
        this.leftOperand = leftOperand;
        this.operation = operation.toString();
        this.rightOperand = rightOperand;
    }
    public String getRequestType() {

    }
    public String toString(){
        return leftOperand + operation + rightOperand;
    }
}
