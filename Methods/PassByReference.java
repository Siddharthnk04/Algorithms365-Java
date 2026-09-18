public class PassByReference
{
    public static void main(String[] args) 
    {

        //Pass By value
        int number = 10;
        makeItHalf(number);
        System.out.println(number);

        int number2 = 10;
        number2 = makeItHalf_v2(number2);
        System.out.println(number2);

        //Pass By Reference
        Data newData = new Data();
        newData.number = 200;
        makeItHalf(newData);
        System.out.println(newData.number);

        Data1 obj = new Data1();
        obj.numb = 2500;
        makeItHalf_v2(obj);
        System.out.println(obj.numb);

    }

    static void makeItHalf(int number)
    {
        number = number / 2;
    }

    static int makeItHalf_v2(int number)
    {
        number = number / 2;
        return number;
    }

    static void makeItHalf (Data obj)
    {
        obj.number = obj.number / 2;
    }

    static void makeItHalf_v2 (Data1 obj)
    {
        obj.numb = obj.numb / 2;
    }
}

class Data1
{
    int numb;
}
