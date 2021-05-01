package HomeWork7;

public class MyHw7 {


    public double addArry(double[] num) {
        double result = 0.00;
        for (int i = 0; i < num.length; i++) {
            result = result + i;


        }
        return result;
    }


    public boolean checkPrimeNumber(int number) {

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }

    public boolean isItPalindrome(String word) {


        int i = 0, j = word.length() - 1;


        while (i < j) {


            if (word.charAt(i) != word.charAt(j))
                return false;


            i++;
            j--;
        }
        return true;
    }


        public void findDupSt(String[]commonStr) {


            for (int i = 0; i < commonStr.length; i++) {
                for (int j = i + 1; j < commonStr.length; j++) {
                    if ((commonStr[i].equalsIgnoreCase(commonStr[j]))) {
                        System.out.println("Duplicate values is : " + commonStr[j]);
                        break;
                         }
                    }

               }
            }

            public void findComValue(String[] s1,String[] s2){
                for(int i = 0; i < s1.length; i++)
                {
                    for(int j = 0; j < s2.length; j++)
                    {
                        if(s1[i].equalsIgnoreCase(s2[j]))
                            System.out.println(s1[i]);
                        {

                        }
                    }
                }




            }






}




























