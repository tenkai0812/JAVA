// 定義一個名為 Car 的類
public class Car {
    // 實例變量（對象的屬性）
    private String brand;  // private 關鍵字表示這個變量只能在類內部訪問
    private String model;
    private int year;
    private double mileage;
    
    // 靜態變量（類變量，被所有實例共享）
    public static int totalCars = 0;  // public 關鍵字允許從類外部訪問此變量

    // 構造函數：用於創建對象時初始化實例變量
    public Car(String brand, String model, int year) {
        this.brand = brand;    // this 關鍵字指代當前對象
        this.model = model;
        this.year = year;
        this.mileage = 0.0;    // 初始里程為 0
        totalCars++;           // 每創建一個 Car 對象，總數就增加 1
    }

    // 實例方法：操作對象的數據或執行某些行為
    public void drive(double distance) {
        this.mileage += distance;
        System.out.println(this.brand + " " + this.model + " has been driven for " + distance + " km.");
    }

    // Getter 方法：用於獲取私有變量的值
    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public double getMileage() {
        return this.mileage;
    }

    // Setter 方法：用於設置私有變量的值
    public void setMileage(double mileage) {
        if (mileage >= 0) {  // 添加一些基本的驗證
            this.mileage = mileage;
        } else {
            System.out.println("Mileage cannot be negative.");
        }
    }

    // 靜態方法：屬於類而不是對象，可以不創建對象就調用
    public static void displayTotalCars() {
        System.out.println("Total number of cars: " + totalCars);
    }
}

// 主類，用於演示 Car 類的使用
public class CarDemo {
    public static void main(String[] args) {
        // 創建 Car 類的對象
        Car car1 = new Car("Toyota", "Corolla", 2020);
        Car car2 = new Car("Honda", "Civic", 2021);

        // 使用對象的方法
        car1.drive(100.5);
        car2.drive(150.0);

        // 獲取對象的屬性
        System.out.println(car1.getBrand() + " " + car1.getModel() + " mileage: " + car1.getMileage());
        System.out.println(car2.getBrand() + " " + car2.getModel() + " mileage: " + car2.getMileage());

        // 修改對象的屬性
        car1.setMileage(500.0);
        System.out.println(car1.getBrand() + " new mileage: " + car1.getMileage());

        // 調用靜態方法
        Car.displayTotalCars();
    }
}