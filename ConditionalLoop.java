package homework;

public class ConditionalLoop {
    public static void main(String[] args) {
        double studentScore=80.00;
        double maxScore=160.00;
        double percentage=(studentScore/maxScore)*100;
        if(percentage>90) {
            System.out.println("Your percentage is; " + percentage + " and your grade is: A. ");
        }
        else if (percentage>80&&percentage<91){
            System.out.println("Your percentage is:"+percentage+" and your grade is: B. " );}
        else if(percentage>70&&percentage<81){
            System.out.println(" Your percentage is:"+percentage+" and your grade is: C. ");}
        else if(percentage>60&&percentage<71){
            System.out.println("Your percentage is:"+percentage+" and your grade is: D. ");}
        else if(percentage>50&&percentage<61){
            System.out.println("Your percentage is: "+percentage+" and your grade is E.");}
        else if(percentage<=50){
            System.out.println(" Your percentage is: "+percentage+" and your grade is: F.");}




    }
}
