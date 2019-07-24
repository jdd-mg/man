package com.ppg.man.idea;

/**
 * idea 使用 技巧
 */
public class IdeaExperience {

    public static void main(String[] args) {

        //方法参数提示 ctrl + p
        //method();

        //alt + enter  不一定 使用.var
        //可以补全调用方法返回的类型。
        //Calendar instance = Calendar.getInstance();
        //IdeaExperience ideaExperience = new IdeaExperience();

        method("1", 1, 1L);

        //7、快速补全分号
        //ctrl + shift + enter
        //String s = new String();

        //shift shift 查找文件
        //ctrl + shift + f 查找文件的内容

        //查看字节码
        //点开 .class文件， view -> show byteCode

        //alt + ↑  方法间移动

        // alt + f7 打开类的引用窗口   shift + esc  隐藏窗口

        System.out.println("end....");
    }


    public static void method(String str, Integer i, Long id) {

        System.out.println(str);
        System.out.println(i);
        System.out.println(id);
    }
}
