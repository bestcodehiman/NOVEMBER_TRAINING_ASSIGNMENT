package OOPS.Question5;

public class Div extends Mul{
	@Override
    void div(int a, int b) {
        int div = b/a;
        System.out.println("div : "+div);
    }
}
