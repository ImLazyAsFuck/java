import java.util.Scanner;

public class b10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();

        System.out.print("Nhập chuỗi ban đầu: ");
        str.append(sc.nextLine());

        int choice;
        do {
            System.out.println("\n========= MENU =========");
            System.out.println("1. Đảo ngược chuỗi");
            System.out.println("2. Chèn chuỗi vào vị trí bất kỳ");
            System.out.println("3. Xóa một đoạn trong chuỗi");
            System.out.println("4. Thay thế một đoạn trong chuỗi");
            System.out.println("5. Chuyển đổi chữ hoa/chữ thường");
            System.out.println("6. Thoát chương trình");
            System.out.print("Lựa chọn của bạn: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    str.reverse();
                    System.out.println("Mảng sau khi đảo ngược: " +  str.toString());
                    break;
                case 2:
                    System.out.print("Nhập chuỗi cần chèn: ");
                    String insertStr = sc.nextLine();
                    System.out.print("Nhập vị trí cần chèn 0 - " + str.length() + ": ");
                    int insertPos = Integer.parseInt(sc.nextLine());
                    if(insertPos >= 0 && insertPos <= str.length()){
                        str.insert(insertPos, insertStr);
                        System.out.println("Chuỗi sau khi chèn: " + str.toString());
                    }else{
                        System.out.println("Vị trí chèn không hợp lệ");
                    }
                    break;
                case 3:
                    System.out.print("Nhập vị trí bắt đầu: ");
                    int startStr = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhập vị trí kết thúc: ");
                    int endStr = Integer.parseInt(sc.nextLine());
                    sc.nextLine();
                    if (startStr >= 0 && endStr <= str.length() && startStr < endStr) {
                        str.delete(startStr, endStr);
                        System.out.println("Chuỗi sau khi xóa: " + str);
                    } else {
                        System.out.println("Vị trí không hợp lệ!");
                    }
                    break;
                case 4:
                    System.out.print("Nhập vị trí bắt đầu: ");
                    int replaceStart = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhập vị trí kết thúc: ");
                    int replaceEnd = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhập chuỗi thay thế: ");
                    String replaceStr = sc.nextLine();
                    if (replaceStart >= 0 && replaceEnd <= str.length() && replaceStart < replaceEnd) {
                        str.replace(replaceStart, replaceEnd, replaceStr);
                        System.out.println("Chuỗi sau khi thay thế: " + str);
                    } else {
                        System.out.println("Vị trí không hợp lệ!");
                    }
                    break;
                case 5:
                    System.out.println("1. Chuyển sang CHỮ HOA");
                    System.out.println("2. Chuyển sang chữ thường");
                    int option = Integer.parseInt(sc.nextLine());
                    sc.nextLine();
                    switch (option){
                        case 1:
                            str = new StringBuilder(str.toString().toUpperCase());
                            System.out.println("Chuỗi sau khi chuyển sang chữ HOA: " + str);
                            break;
                        case 2:
                            str = new StringBuilder(str.toString().toLowerCase());
                            System.out.println("Chuỗi sau khi chuyển sang chữ thường: " + str);
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ");
                            System.exit(0);
                    }
                    break;
                default:
                    System.out.println("Vui lòng nhập lại.");
            }
        }while(choice != 6);
    }
}
