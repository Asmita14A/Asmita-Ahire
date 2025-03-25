public class IncrementAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        System.out.println("Next year, your age will be: " + (age + 1));
        scanner.close();
    }
}