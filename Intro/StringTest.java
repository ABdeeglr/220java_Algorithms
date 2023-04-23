package Intro;

/**
 * @author ABdeeglr
 * Usage: This programm is used to test what can do with object String.
 */

public class StringTest {
    public static void main(String[] args) {
        if (true) {
            printString();
            moreStringTest();
        }
        
    }
    
    /**
     * 这个函数用于测试以下 {@code String}的基本使用方式.
     * 
     * 顺便还测试了怎么添加函数说明
     */
    private static void printString() {
        String e = ""; // It's an empty string
        String greeting = "Hello";

        String s = greeting.substring(0, 3); // 字符串具有切片功能，使用了一个方法来返回

        String message = e + s; // 字符串可以拼接
        message += 13; // 还可以进行强制拼接，非字符串值会被强制转换，这是因为 Java 的任何对象都可以转换成字符串
        System.out.println(message + " Look! It's done."); // 打印时默认添加换行符
        
        /* 可以用一个特殊的办法将多个字符串连接在一起
         * 真正令人惊讶的是 `class.method()` 的使用方式
         * 虽然我可以想象 String 类实际上也是某个超类的实例，但仍然很奇怪.
         */
        String all = String.join(" | ", "我", "被", "分", "隔", "开", "了");

        System.out.println(all.repeat(3)); // repeat 方法可以让字符串重复 n 次
    }

    private static void moreStringTest() {
        String a = "Hello";
        String b = "He" + "llo";
        // 用 equals 方法检测字符串是否相等
        // 而用 equalsIgnoreCase 方法还能忽略大小写，但在本测试中不作演示
        System.out.println("Yes, p: a == b returns >>" + a.equals(b));

        if ("".length() == 0) {
            System.out.println("这是个空串");
        }
        if ("" != null) {
            System.out.println("最好先检测是否是 null, 需要注意的是 null 上不能调用方法");
        }



    }
}


