public class Main {
    public static void main(String[] args) {
        Cha contrai = new ConTrai();
        Cha con = new Con();
//      <Kiểu dữ liệu> tên biến = new Constructor tương ứng
//      Kiểu khai báo tên biến = new Constructor của kiểu con hoặc Constructor tương ứng
//      Kiểu khai báo: Quy định phương thức có thể truy cập ở biên dịch <complie>
//      Kiểu thực tế: instansce thực tế ở trên heap <runtime>
        System.out.println(con);
        System.out.println(contrai);

        //kiểu ép kiểu
        //upcasting:
        Cha c = new ConTrai();

        //duyệt 1 mảng thuộc superClass
        Cha[] chaList = new Cha[3];
        Con c1 = new Con();
        ConTrai c2 = new ConTrai();
        Con c3 = new Con();
        int s = 0;
        for (int i = 0; i < 3; i++) {
            s+=chaList[i].tinhtien();
        }
        System.out.println(s);

        //không thể
//        chaList[0].m2();
        //Ép từ kiểu cha xuống kiểu con
//      //downcasting
        //để thực hiện các phương thức ở lớp con riêng biệt
        //(<Kiểu dữ liệu thuộc lớp con>) tên biến

        ((Con)chaList[0]).m2();

    }
}
