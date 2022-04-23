import java.util.ArrayList;

public class Main {
    static int c = 100;
    static int b = 200;

    public static void main(String args[])
    {
        System.out.println("hello"); //testing

        System.out.println("welcome again");

        c = 200;
        b = 300;

        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(10);
        Integer myInt = new Integer(30);
        myArrayList.add(myInt);

        for(int i = 0 ; i < myArrayList.size(); i++)
        {
            System.out.println(myArrayList.get(i));
        }
    }
}

class StaticExample
{
    private static int staticInt = 5;
    private int nonstatic = 5;

    public int getStatic(){
        return staticInt;
    }

    public int getNonstatic()
    {
        return nonstatic;
    }

    public void setStatic(int staticInt)
    {
        StaticExample.staticInt = staticInt;
    }

    public void setNonStatic(int nonStatic)
    {
        this.nonstatic = nonStatic;
    }

}
