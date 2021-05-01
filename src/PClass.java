public class PClass extends PolyUserMethod {

    String parentName="Parent";
    public void myParentMethod(){
        System.out.println("Inside my parent method");

    }
    public void changeParentName(String newName){
        parentName=newName;
    }
    public void myParentName(){
        System.out.println("My parent name: "+parentName);
    }
    public void myMethod(){
        System.out.println("Parent class method");
    }

}
