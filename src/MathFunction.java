public class MathFunction
{
    public int multiply(int x, int y) {
        return (x * y);
    }

    public float multiply(float x, float y) {
        return (x * y);
    }

    public float multiply(float x, int y) {
        return (x + y);
    }

    public static void main(String[] args) {
        MathFunction s = new MathFunction();
        System.out.println(s.multiply(15, 20));
        System.out.println(s.multiply(15.5f, 10.6f));
        System.out.println(s.multiply(12.5f, 20));
    }
}