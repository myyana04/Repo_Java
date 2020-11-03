public class MidTerm {
   // public static int removeAnInt(int[]arr,int num){
     //   int length=0;
       // for(int i=0;i<arr.length;i++){
         //   if(arr[i]!=num)
           //     length++;}
             //   int[]result=new int [arr.length];
        //for(int i=0; i<arr.length;i++)
          //  {if int )



    public static void speedTik(int num) {
        if (num > 0 && num <= 70) ;
        {
            System.out.println("Your speed is " + num + " . Thank you for driving with in speed limit.");
        }
         else if (num >= 75)
        {
            System.out.println("Your speed is " + num + " , and you lost 1 point");
        }
        else  if (num >= 80)
        {
            System.out.println("Your speed is " + num + " , and you 2 points.");
        }
            else if (num >= 85)
        {
            System.out.println("Your speed is " + num + " ,and lost 3 points");
        }
         else if (num >= 90)
        {
            System.out.println("Your speed is "+num+" , and you lost 4 points.");

        }
        else if(num>=95){
            System.out.println("Your speed is "+num+" , you lost 5 points");
        }
        else if(num>=130){
            System.out.println("Your speed is "+num+" , and your license suspended");
        }


    }


    public static void main(String[] args) {

        int num = 90;
        speedTik(num);
    }
}