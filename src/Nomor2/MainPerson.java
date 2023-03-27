package Nomor2;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person("Ghifari", "tangerang");
        Student student = new Student("Fadil", "bantul", "D4", 2022, 500000);
        Staff staff = new Staff("Tanto", "palembang", "University of Gadjah Mada", 10000000);

        // Menampilkan Seluruh Method Person
        person.setAddress("Tangerang");
        System.out.println(person.getAddress());
        System.out.println(person.getName());
        System.out.println(person.toString());

        // Menampilkan Seluruh Method Student
        student.setAddress("Bantul");
        System.out.println(student.getAddress());
        System.out.println(student.getName());
        student.setProgram("S1");
        student.setYear(2023);
        student.setFee(300000);
        System.out.println(student.getProgram());
        System.out.println(student.getYear());
        System.out.println(student.getFee());
        System.out.println(student.toString());

        // Menampilkan Seluruh Method Staff
        staff.setAddress("Palembang");
        System.out.println(staff.getAddress());
        System.out.println(staff.getName());
        staff.setSchool("TK Amikom");
        staff.setPay(3000000);
        System.out.println(staff.getSchool());
        System.out.println(staff.getPay());
    }
}
