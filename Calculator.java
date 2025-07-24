public class Calculator{
	public static double performOperation(double num1, double num2, char operator) 
	{double result = 0.0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            
            default:
                System.out.println("올바른 연산자를 입력하세요.");
        }

        return result;
		
}	public static void main(String[] args){
}

