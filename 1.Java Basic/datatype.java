public class datatype {
    // int: 4 bytes (32 bits)
    int a = 100;

    // float: 4 bytes (32 bits)
    float b = 5.25f;

    // double: 8 bytes (64 bits)
    double c = 5.25;

    // boolean: 1 bit (但通常使用 1 byte 來對齊內存)
    boolean d = true;

    // char: 2 bytes (16 bits, 可以存儲 Unicode 字符)
    char e = 'E';

    // String: 變量大小
    // 在 Java 中，String 是一個對象，它的大小取決於字符串的長度
    // 每個字符使用 2 bytes (因為內部使用 UTF-16 編碼)
    // 所以這個 String 大約使用 14 bytes (7 字符 * 2 bytes)
    // 加上 String 對象的開銷 (包括對字符數組的引用、長度信息等)
    String s = "try me ";
}
