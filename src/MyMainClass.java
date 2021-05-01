import java.util.Arrays;

public class MyMainClass {
    public static void main(String[] args) {
        //create object of PClass
        //access of PClass
        PClass pc1=new PClass();

        //object of child class

        CClass cc1=new CClass();
        pc1.myParentName();
        cc1.myParentName();
        //since child class CClass extends parent class PClass, cc1 can access everything from PClass
        //abd CClass
        int res=cc1.addNum(10,20,30);
        System.out.println(res);
        cc1.addNum(10,20);
        MidTermCodeTest m1=new MidTermCodeTest();


        int []array={32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        int num=24;
        int[]dingi=m1.returnIntArray(array,num);
        System.out.println(Arrays.toString(dingi));




    }
}
