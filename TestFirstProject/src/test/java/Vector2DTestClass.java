import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Vector;

public class Vector2DTestClass {
    private final double EPS = 1e-9;
    private Vector2DClass v1;

    @Before
    public void createNewVector(){
        v1 = new Vector2DClass(); //перед каждым методом создается данный объект, то есть для каждого Test


    }
    @Test
    public void newVectorShouldHaveZeroLenght(){
   //     Vector2DClass v1 = new Vector2DClass(); можно не создавать вектор

        //assertion

        Assert.assertEquals(0, v1.length(), EPS);    //1 - ожидаемая величина, фактический результат, дельта (возможные изменения в рамках данной величины


    }
    @Test
    public void newVectorShouldHaveZeroX() {
     //   Vector2DClass v1 = new Vector2DClass();

        Assert.assertEquals(0, v1.getX(), EPS);

    }
    @Test
    public void newVectorShouldHaveZeroY() {
       // Vector2DClass v1 = new Vector2DClass();

        Assert.assertEquals(0, v1.getY(), EPS);

    }
    @Test
    public void newVectorShoildHaveZeroXAndY(){
        Assert.assertEquals(0, v1.getX(), EPS);
        Assert.assertEquals(0, v1.getY(), EPS);
    }



}


