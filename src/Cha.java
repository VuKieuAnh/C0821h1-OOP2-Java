public class Cha {
    private String name;
    private String age;

    public Cha() {
        System.out.println("Ham khoi tao cha");
    }

    public Cha(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void m1(){
        System.out.println("pt thuoc Cha");
    }

    @Override
    //tạo ra 1 chuỗi mô tả đối tượng
    public String toString() {
        return "Cha{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public int tinhtien(){
        return 0;
    }
}
