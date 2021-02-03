package All3;

public enum Animal {
    DOG ("Собака"), CAT ("Кошка"), Frog;         // Необходимо добавить с пустыми аргументами в конструкторе для работы перечисления
    //new DOG("Собака");

    private String translation;

    Animal (){

    }

    Animal(String translation){    // Все конструкторы по умолчанию private в enum
        this.translation = translation;

    }

    public String  getTranslation()
    {
        return translation;
    }

    @Override
    public String toString() {
        return "Перевод на русский язык " + translation;
    }
}
