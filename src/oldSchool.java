public class oldSchool {
    void academic1(){
        System.out.println("School has old blackboards.");
    }
}
class newSchool extends oldSchool{
    void academic2(){
        System.out.println("Scool has new blackboards.");
    }
}
class modernSchool extends oldSchool{
    void academic3(){
        System.out.println("School has digital boards");
    }
}
class testSchools{
    public static void main(String[] args) {
        modernSchool ms = new modernSchool();
        ms.academic1();
        //ms.academic2();
        //this method can't call because it belongs to newShool. modernSchool has not extends from new school.0
        ms.academic3();
    }
}
