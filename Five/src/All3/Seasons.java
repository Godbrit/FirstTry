package All3;

public enum Seasons {
    SUMMER (35), WINTER (-20), AUTUMN(10), SPRING(5) ;  //создание объектов


private int x = 0;

Seasons(Integer x)
{
    this.x = x;
}

public int getX() {
    return x;
}
    }