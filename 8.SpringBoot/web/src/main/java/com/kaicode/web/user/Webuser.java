package com.kaicode.web.user;

import jakarta.persistence.*;
import java.util.Date;
import java.time.LocalDate;
import java.time.Period;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 表示Web用戶的實體類。
 * 使用JPA注解進行物件關係映射。
 * 使用Lombok注解簡化getter、setter、建構函數和toString方法的編寫。
 */
@Entity // 標記此類為JPA實體
@Table // 指定資料庫表名（預設使用類名）
@Getter // Lombok注解：自動生成所有欄位的getter方法
@Setter // Lombok注解：自動生成所有欄位的setter方法
@NoArgsConstructor // Lombok注解：自動生成無參建構函數
@ToString(exclude = "password") // Lombok注解：生成toString方法，但排除password欄位
public class Webuser {

    @Id // 標記此欄位為主鍵
    @SequenceGenerator(
        name = "webuser_sequence",
        sequenceName = "webuser_sequence",
        allocationSize = 1
    ) // 定義序列生成器
    @GeneratedValue(
        strategy = GenerationType.AUTO,
        generator = "webuser_sequence"
    ) // 使用自動生成策略和上面定義的序列生成器
    private Long id; // 用戶ID

    @Column(nullable = false, unique = true) // 非空且唯一
    private String username; // 用戶名

    @Column() // 預設列定義
    private String password; // 密碼

    @Column(nullable = false, unique = true) // 非空且唯一
    private String email; // 電子郵件

    @Column(name = "Created_at") // 自定義列名
    private Date createdAt; // 創建時間

    @Column(name = "last_login") // 自定義列名
    private Date lastLogin; // 最後登入時間

    private LocalDate dob; // 出生日期

    @Transient
    private Integer age;

    /**
     * 自定義建構函數
     * @param id 用戶ID
     * @param username 用戶名
     * @param email 電子郵件
     * @param createdAt 創建時間
     * @param lastLogin 最後登入時間
     * @param dob 出生日期
     */
    public Webuser(Long id, String username, String email, Date createdAt, Date lastLogin, LocalDate dob) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.createdAt = createdAt;
        this.lastLogin = lastLogin;
        this.dob = dob;
    }

    public Webuser(String username, String email, Date createdAt, Date lastLogin, LocalDate dob) {
        this.username = username;
        this.email = email;
        this.createdAt = createdAt;
        this.lastLogin = lastLogin;
        this.dob = dob;
    }
    
    public Webuser(Long id, String username, String email, LocalDate dob) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.dob = dob;
    }

    public Integer getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public void setAge(Integer age) { this.age = age;}
}