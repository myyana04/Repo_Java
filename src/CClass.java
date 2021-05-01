public class CClass extends PClass {
    String childName="Child";
    public void myChildMethod(){
        System.out.println("Inside my child method");

    }
    public void changeChildName(String newName){
        childName=newName;
    }
    public void myChildName(){
        System.out.println(" name: "+childName);
    }
    //same method with same name and arguments and sequence
    public void myMethod(){
        System.out.println("Child class method");
    }


}

