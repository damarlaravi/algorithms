package com.prime;

public class WithOutSqrt {
	public boolean isPrimeNumber(int number){
        
        for(int i=2; i<=number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
     
    public static void main(String a[]){
    	WithOutSqrt mpc = new WithOutSqrt();
        System.out.println("Is 17 prime number? "+mpc.isPrimeNumber(17));
        System.out.println("Is 19 prime number? "+mpc.isPrimeNumber(19));
        System.out.println("Is 15 prime number? "+mpc.isPrimeNumber(15));
    }
//- See more at: http://java2novice.com/java-interview-programs/is-prime-number/#sthash.SQ2rAtV9.dpuf
}
