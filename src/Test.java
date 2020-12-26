import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        File file=new File(pahtname:"C:\\Users\\dell\\Desktop\\Shop\\src\\Shop.xlsx");
        ReadExcel readExcel=new ReadExcel();//创建对象
        User user[]=readExcel.readExcel(file);
        for (User user:users){
            System.out.println(user.getUsername());
            System.out.println("\t"+user.getPasword());
        }

        System.out.println("请输入用户名：");
        Scanner sc=new Scanner(System.in);
        String username=sc.next();

        System.out.println("请输入密码：");
        String password=sc.next();
    }

}
