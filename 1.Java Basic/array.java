public class array {
    public static void main(String[] args) {
        // 整數數組
        // 在 Java 中，數組索引總是從 0 開始
        // 這個數組佔用 5 * 4 = 20 字節 (每個 int 佔 4 字節)
        // 加上數組對象的開銷（通常在 16-24 字節之間，取決於 JVM）
        int[] intArray = new int[5];
        intArray[0] = 10;  // 第一個元素
        intArray[4] = 50;  // 最後一個元素（第五個）

        // 雙精度浮點數數組
        // 佔用 3 * 8 = 24 字節 (每個 double 佔 8 字節)
        // 加上數組對象的開銷
        double[] doubleArray = {1.1, 2.2, 3.3};  // 初始化語法

        // 字符數組
        // 佔用 4 * 2 = 8 字節 (每個 char 佔 2 字節)
        // 加上數組對象的開銷
        char[] charArray = new char[4];
        charArray[0] = 'J';  // 第一個元素
        charArray[3] = 'a';  // 最後一個元素（第四個）

        // 布爾數組
        // 理論上每個 boolean 只需要 1 位，但實際上通常每個元素佔 1 字節
        // 所以這個數組佔用 6 * 1 = 6 字節
        // 加上數組對象的開銷
        boolean[] boolArray = new boolean[6];
        boolArray[0] = true;   // 第一個元素
        boolArray[5] = false;  // 最後一個元素（第六個）

        // 字串數組
        // 每個數組元素是一個對 String 對象的引用
        // 在 64 位系統上，每個引用通常佔 8 字節
        // 所以數組本身佔用 2 * 8 = 16 字節
        // 加上數組對象的開銷
        // 注意：每個 String 對象本身還會佔用額外的內存
        String[] stringArray = new String[2];
        stringArray[0] = "Hello";  // 第一個元素
        stringArray[1] = "World";  // 最後一個元素（第二個）

        // 訪問和打印數組元素的例子
        System.out.println("intArray[0] = " + intArray[0]);
        System.out.println("doubleArray[1] = " + doubleArray[1]);
        System.out.println("charArray[3] = " + charArray[3]);
        System.out.println("boolArray[5] = " + boolArray[5]);
        System.out.println("stringArray[1] = " + stringArray[1]);
    }
}