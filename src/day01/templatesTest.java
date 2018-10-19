package day01;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.naming.Name;
import javax.swing.text.html.ListView;
import java.util.ArrayList;

/**
 * @author lmy
 * @date 2018/10/18 - 20:51
 */
public class templatesTest {

    /*
    1.idea中模板所处的位置：settings - Editor - live Templates / Postfix Completion
    2.常用模板
    */


    //prsf 可生成private static final
    private static final String ARGES = "10";
    //psf 可生成public static final
    public static final int sex = 1;
    //psfi 可是生成 public static final int
    public static final int fiters = 5;
    //psfs 可生成
    public static final String grade ="yinainji";


    //模板一：psvm
    public static void main(String[] args) {
        //模板二：sout
        System.out.println("helllo!");
        //变形：soutp/soutm/soutv/XXX.sout
        System.out.println("args = [" + args + "]");
        System.out.println("templatesTest.main");
        int num=10;
        System.out.println("num = " + num);
        //fori
        for (int i = 0; i < 10; i++) {
            
        }
        //for循环变形iter
        for (String arg : args) {
            
        }
        //变形：itar
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            
        }
        //list.for
        ArrayList<Object> list = new ArrayList<>();
        list.add(123);
        list.add(456);
        list.add(789);
        for (Object o : list) {
            
        }
        //变形：list.fori,list.forr(倒叙遍历)
        for (int i = 0; i < list.size(); i++) {
            
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
        //条件判断：ifn
        if (list == null) {

        }
        //变形：inn
        if (list != null) {

        }
    }
}
