package Nomor1;

public class MainCircle {
    public static void main(String[] args) {
        Cylinder objek1 = new Cylinder();
        Cylinder objek2 = new Cylinder(14);
        Cylinder objek3 = new Cylinder(14, 10);

        //Menjalankan Semua Method objek1
        objek1.setRadius(21);
        objek1.setColor("biru");
        System.out.println(objek1.getColor());
        System.out.println(objek1.getRadius());
        System.out.println(objek1.getArea());
        objek1.setHeight(12);
        System.out.println(objek1.getHeight());
        System.out.println(objek1.getVolume());
        System.out.println(objek1.toString());

        //Menjalankan Semua Method objek2
        objek2.setRadius(7);
        objek2.setColor("red");
        System.out.println(objek2.getColor());
        System.out.println(objek2.getRadius());
        System.out.println(objek2.getArea());
        objek2.setHeight(10);
        System.out.println(objek2.getHeight());
        System.out.println(objek2.getVolume());
        System.out.println(objek2.toString());

        //Menjalankan Semua Method objek3
        objek3.setRadius(28);
        objek3.setColor("kelabu");
        System.out.println(objek3.getColor());
        System.out.println(objek3.getRadius());
        System.out.println(objek3.getArea());
        objek3.setHeight(14);
        System.out.println(objek3.getHeight());
        System.out.println(objek3.getVolume());
        System.out.println(objek3.toString());
    }
}
