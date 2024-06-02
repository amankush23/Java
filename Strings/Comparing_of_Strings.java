class Comparing_of_Strings{
    public static void main(String[] args){
        String Name1 = "Sudheer";
        String Name2 = "Sudheer";

        //Conditions of compareTo
        //1. s1 > s2 : +ve value
        //2. s1 == s2 : 0
        //3. s1 < s2 : -ve value
        if(Name1.compareTo(Name2) == 0){
            System.out.print("Strings are equal.");
        } else{
            System.out.print("Strings are not equal!");
        }
    }
}