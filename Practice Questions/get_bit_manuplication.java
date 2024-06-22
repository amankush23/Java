class get_bit_manuplication{
    public static void main(String args[]){
        int n = 5; 
        int pos = 3;
        int bitmask = 1<<pos;

        if((bitmask & n) == 0){
            System.out.print("Bit was zero.");
        }
        else{
            System.out.print("Bit was one.");
        }
    }
}