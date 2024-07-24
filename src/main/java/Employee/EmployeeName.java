package Employee;
import java.util.Scanner;
public class EmployeeName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập số lượng nhân viên
        System.out.print("Nhập số lượng nhân viên: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng mới còn lại sau khi nhập số

        // Tạo mảng để lưu tên nhân viên
        String[] employeeNames = new String[numEmployees];

        // Nhập tên của từng nhân viên
        for (int i = 0; i < numEmployees; i++) {
            System.out.print("Nhập tên nhân viên thứ " + (i + 1) + ": ");
            employeeNames[i] = scanner.nextLine();
        }

        scanner.close();

        // Hiển thị danh sách tên nhân viên
        System.out.println("Danh sách tên nhân viên:");
        for (String name : employeeNames) {
            System.out.println(name);
        }
	}

}
