public class OOPS_Concept {
    public static void main(String[] args) {
        /**
         * 1.Encapsulation: Code wrapped in a single unit like class in java.
         *      To implement Encapsulation, we create class and write code in it.
         *
         * 2.Abstractioc: Hiding unnecesary information from user
         *      ex: remote control we pressed button but do not know how this work
         *      To implement Abstractiion we create methods
         *
         * 3. Inheritence: (Class has methods and variable)
         *       Implement inheritence concept, we crete parent child set between two classes
         Child class and acess parent methods and variable(aceept private method or private variable)

         4. We use 'extends' keyword to child class to achieve inheritence
         *** A clas  can extends only one class. child class can not extends two parends class.
         * it's a diamond problem. if child class want to reach grandfather class, child class can
         access that through one parent class. Can't go through two parents class

         5> Polymorphism: can make two or more methods with same name with different int options. one can have
         1 input, one can have 2 and 3 inputs and so on.
         Abstarction and Polymorphism revolve around the methods
         Encapsulatin and Inheritence revolve around the Class
         Polymorphism--> sama name but different forms
         --> when we two or more methods with SAME namw
         Types of polymorphism--->
         1. Complile time or (static binding or method overloading)
         2. Runtime Polymorphism or (dynamic binding or method overriding)

         Complile time or (static binding or method overloading)-->
         1.in a single class
         with two or more methods with different parameters or inputs or arguments
         ex: substring has one or two arguments

         2.-->Ways to set different arguments
         another way to do it same number of arguments or inputs with different datatypee.

         3.different sequence of arguments

         public double addNum(int a,double b){return a+b;}

         ** Return type DOES  Not have any role in compile time polymorphism.
         *

         Runtime Polymorphism or (dynamic binding or method overriding)
            Happens in Inheritence type of set up
            --> same name, same arguments between parent and child class

         same method with same name and arguments and sequence (parent class)
         public void myMethod(){
         System.out.println("Parent class method");

         //same method with same name and arguments and sequence(child class)
         public void myMethod(){
         System.out.println("Parent class method");
         -->Keyword super
         we use super key word when we want to parent class method in the child class
         when methgod has same name both parent and chlid class





         */
    }

}

