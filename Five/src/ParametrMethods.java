public class ParametrMethods {
    public static void main(String[] args) {
        Human human = new Human();
        human.setAge(19);
        human.setName("RRR");
        human.getInfo();
    }
}




class Human {
    String name;
    int age;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int Age) {
        this.age = Age; ///this. - использование атрибута из самого класса.
    }

    public String getName() {

        return name;
    }


    public int getAge() {
        return age;
    }
    public void  getInfo(){
        System.out.println(name + "," + age);
    }
}