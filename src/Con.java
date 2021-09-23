public class Con extends Cha {
    private String sex;

    public Con() {
        //super gọi đến constructor thuộc lớp cha
        super("KA", "18");
        System.out.println("Ham khoi tao con");
    }

    public Con(String sex) {
        //vẫn được gọi constructor mặc định ko tham số thuộc lớp cha
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void m2(){
        //super chỉ đến đối tượng được tạo ra ở lớp cha
        super.getName();
    }
    @Override
    public void m1(){
        //triển khai lại phương thức ở lớp cha
        //tôi cần thay đổi phương thức ở lớp cha
        //ghi đè
        System.out.println("PT thuoc lop Con");
    }

    public void m1(int a){

    }

    @Override
    public String toString() {
        return "Con{" +
                "name= "+ this.getName()+
                "sex='" + sex + '\'' +
                '}';
    }
}
