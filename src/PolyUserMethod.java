public class PolyUserMethod {
    public int addNum(int a,int b){
        int res =a+b;
        return res;
    }

    public int addNum(int a,int b,int c){return a+b+c;}

    //same number of arguments with different datatypes

    public double addNum(double a,int b){
        return a+b;
    }
    //different sequence of arguments
    public double addNum(int a,double b){return a+b;}
}
