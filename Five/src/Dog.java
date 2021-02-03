public class Dog extends AnimalClass {//Класс является родителем класса Dog. Класс наследует все классы
        public void bark() {
            System.out.println("I am barking");
        }
        @Override
        public void eat(){ //переопределение метода
            System.out.println("Dog is eating");
            }
    }


