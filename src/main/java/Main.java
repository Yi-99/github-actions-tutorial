public class Main {
    public static void main(String[] args) {
        System.out.println("Testing Dockerfile");

        Calculator c = new Calculator();

        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        switch (args[0]) {
            case "add":
                System.out.println(c.add(a, b));
                break;
            case "subtract":
                System.out.println(c.subtract(a, b));
                break;
            case "multiply":
                System.out.println(c.multiply(a, b));
                break;
            case "divide":
                System.out.println(c.divide(a, b));
                break;
            case "binary":
                System.out.println(c.intToBinaryNumber(a));
                break;
        }
    }
}
