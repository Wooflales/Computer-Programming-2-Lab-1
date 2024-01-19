public class Main {
    public static void main(String[] args) {
        Person matthew = new Person("000001","Matthew","Brown","Mr.",2004);
        Person adriana = new Person("000002","Adriana","Mendoza","Ms.",2002);
        Person michael = new Person("000003","Michael","Arias","Mr.",2005);
        Product water = new Product("1","Water","a drinkable substance",1);
        System.out.println(matthew.getId());
        System.out.println(matthew.getFullName());
        System.out.println(matthew.getFormalName());
        adriana.setYOB(2009);
        System.out.println(adriana.getYOB());
        System.out.println(adriana.toCSVDataRecord());
        System.out.println(michael.getAge());
        System.out.println(michael.getAge());
        System.out.println(water.productInfo());
        System.out.println(water.toCSVDataRecord());
    }
}
