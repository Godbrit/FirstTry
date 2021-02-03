public class InCup {

    public static void main(String[] args) {
        Person2 person2 = new Person2();
        person2.setName("Kakoe-to");
        person2.setAge(-1);
        System.out.println("Vivod  znacheniia " + person2.getName());
        System.out.println("vivod znacheniia " + person2.getAge());
        person2.speak();

    }
}


class Person2
{
      private String name;
     private  int age;
     public void setName(String username){
        if (username.isEmpty()){
             System.out.println("Pustoe imya");
         } else {
         name = username;
     }}
    public String getName() {

         return name;
    }


    public void setAge (int userAge){
        if (userAge <0) {
            System.out.println("Gde polozhitelnii");
        } else{
         age = userAge;
    }
    }
    public int getAge() {
        return age;
    }
        int calculateYears()
        {int years = 65- age;
        return years;
        }
        void speak()
        {
            System.out.println("imya " + name + " god " + age);
        }

}
