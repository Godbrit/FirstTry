public class EnumExample {
    enum CoffeeSize {SMALL(100), MEDIUM(200),
        BIG(300)        {
           String getCoffeeClass() {
                return "B";
        }
        };
        String coffeeClass = "A";
        int i;
        CoffeeSize(int i) {
            this.i =i;
        }
        int getI()
        {
            return i;
        }
        String getCoffeeClass() {
            return coffeeClass;
        }
    };

    public static void main(String[] args) {
        CoffeeSize coffeeSize = CoffeeSize.SMALL;
        System.out.println(coffeeSize);
        System.out.println(coffeeSize.getI());
        System.out.println(coffeeSize.getCoffeeClass());
    }
}
