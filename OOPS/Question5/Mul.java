package OOPS.Question5;

public abstract class Mul extends Sub{
	@Override
    void mul(int a, int b) {
        int mul = a*b;
        System.out.println("mul : "+mul);
    }
}
