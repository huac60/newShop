import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\lenovo\\Desktop\\newShop\\out\\production\\Shop\\Shop.xlsx");
        ReadExcel readExcel=new ReadExcel();//创建对象
        User users[]=readExcel.readExcel(file);

        System.out.println("请输入用户名：");
        Scanner sc=new Scanner(System.in);
        String username=sc.next();
        System.out.println("您输入的用户名："+username);

        System.out.println("请输入密码：");
        String password=sc.next();
        System.out.println("您输入的密码："+password);

        for (int i=0;i<users.length;i++) {
            if (username.equals(users[i].getUsername() && password.equals(users[i].getPassword())))
                System.out.println("登陆成功");
            }else{
            System.out.println("登陆失败");
        }
            /*for (User user:users){
            System.out.println(user.getUsername());
            System.out.println("\t"+user.getPassword());*/
        }
    }
}
