import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            // In ra menu
            System.out.println("Menu:");
            System.out.println("1. hinh chu nhat");
            System.out.println("2. In tam giác vuông");
            System.out.println("3. In tam giác cân");
            System.out.println("0. thoát");

            // Nhập lựa chọn từ người dùng
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            // Thực hiện lựa chọn
            switch (choice) {
                case 1:
                    // In hình chữ nhật
                    int height, width;
                    System.out.print("cao: ");
                    height = scanner.nextInt();
                    System.out.print("rong: ");
                    width = scanner.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    // In hình tam giác vuông
                    int size;
                    System.out.print("cỡ: ");
                    size = scanner.nextInt();
                    for (int i = 1; i <= size; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println();

                    for (int i = 1; i <= size; i++) {
                        for (int j = size; j >= i; j--) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println();

                    for (int i = 1; i <= size; i++) {
                        for (int j = 1; j <= size; j++) {
                            if (j <= size - i) {
                                System.out.print("  ");
                            } else {
                                System.out.print("* ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();

                    for (int i = size; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    // In hình tam giác cân
                    int n;
                    System.out.print("Enter size: ");
                    n = scanner.nextInt();
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n - i; j++) {
                            System.out.print("  ");
                        }
                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 0:
                    // Thoát khỏi chương trình
                    System.out.println("Goodbye!");
                    break;

                default:
                    // Lựa chọn không hợp lệ
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }
}
