package day01;


import java.util.ArrayList;
import java.util.Date;

public class HelloWord {

    private static Date date;

    public HelloWord() {
    }

    //类的主函数
    public static void main(String[] args) {
        System.out.println("Hello,World!");
        ArrayList<Object> list1 = new ArrayList<>();
        //alt+enter idea特有，生成返回值。
        date = new Date();
        //ctrl+alt+/ 提示参数类型
        list1.add(2);
        //ctrl+o 查看类结构类似于eclipse中的outline
        //alt+shift+r 重构，修改变量名和方法名
        //ctrl+shift+y 大小写转换
        //alt+shift+s 生成构造函数

        try {
            secondMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //快捷键的使用
    public static void secondMethod() {
        String name = "limingyang";
    }
}
