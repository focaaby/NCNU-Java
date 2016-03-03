/* ****
   ****   父類別型態的reference可以指向子類別物件
   ****   這樣稱為polymorphism多型
   ****   Animal x = new Dog();
   ****   請問x.move()使用Animal' move or Dog' move?
   ****   if the language choose by "reference" type
   ****   then callen "non-virtual function"
   ****   if a language choose by "object" type
   ****   then called "virtual function"
   ****   x.move();
*/

/*
        Animal a = new Animal();
        Dog d = new Dog();
        Fish f = new Fish();
        Bird b = new Bird();
        a.move();
        d.move();
        f.move();
        b.move();
        // Dog y = new Animal(); // 這樣合不合法？不合法
*/
public class TestAnimal {
    public static void printAll(Animal[] list) {
        for (int i = 0; i <list.length; i++) 
            list[i].move();
    }
    public static void main(String[] argv) {
        Animal[] x = new Animal[]{new Dog(), new Bird(), new Fish(), new Animal(), new THM()};
        printAll(x); 
    }
} 
