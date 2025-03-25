public class MultiplyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Product: " + (num1 * num2));
        scanner.close();
    }
}