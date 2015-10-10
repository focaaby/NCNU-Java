/*    Time:20150304 
 *
 *
 *    class 是用來新增物件的模板
 *
*/
public class Student {
    String name;
    int age;
    public Student(String n) {
        this.name = n;
    }
    public Student(String n, int a) {
        this.name = n; // this :
        this.age = a;
    }
    public void sayYourName() {
        System.out.println(name);
    }
    public void increaseAge() {
        age++;
    }
    public void sayYourAge() {
        System.out.println(age);
    }
    public static void main(String[] argv) {
        Student 右手;
        Student 左手;
        右手 = new Student("Jerry");
        左手 = new Student("Sky");
        右手.sayYourName();
        左手.sayYourName();
        右手 = new Student("Yure", 49);
        右手.sayYourAge();
        右手.increaseAge();
        右手.sayYourAge();        
    }
}
