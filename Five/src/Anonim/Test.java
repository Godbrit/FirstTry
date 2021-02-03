package Anonim;



interface Abletoeat {
    void eat();
}


        class Animal implements Abletoeat {
            @Override
            public void eat() {
                System.out.println("Animal is eating");
            }
        }

        class OtherAnimal extends Animal {  //расшерение метода
            public void eat() {
                System.out.println("Other animal is eating");
            }
        }

        public class Test {
            public static void main(String[] args) {
                Animal animal = new Animal();
                animal.eat();

                OtherAnimal otheranimal = new OtherAnimal();
                otheranimal.eat();


                Animal animal2 = new Animal() {
                    public void eat() {   //переопределение метода создаваемого объекта, то есть наследник метода.
                        System.out.println("Someone animal is eating");
                    }
                };

                animal2.eat();
                Abletoeat abletoeat = new Animal();
                abletoeat.eat();
                Abletoeat abletoeat1 = new Abletoeat() {
                    @Override
                    public void eat() {
                        System.out.println("Other animal is eating");          //переопределение метода интерфейса
                    }
                };
                abletoeat1.eat();

                    }
                }
