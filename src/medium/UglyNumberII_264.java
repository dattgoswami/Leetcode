package medium;

public class UglyNumberII_264 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nthUglyNumber(10));
	}
	public static int nthUglyNumber(int n) {
        int uglyCount = 0;
        int uglyNumber = 0;
        for(int i=1; i<=1690; i++){
        	if(checkSpecialPrime(i)){
        		uglyCount++;
        		System.out.println("count "+uglyCount);
        		uglyNumber = i;
        		System.out.println(uglyNumber);
        	}
        	if(uglyCount == n){
        		break;
        	}
        }
		return uglyNumber;
    }
	private static boolean checkSpecialPrime(int num) {
		boolean primeFlag = false;
		if(num == 1){
			return true;
		}
		for(int i=2; i<=num; i++){
			if(i == 2 || i == 3 || i == 5){	
				if(num%i == 0){
					primeFlag = true;
				}
			}else{
				if(num%i == 0 && num!=i){
					primeFlag = primeFlag | false;
				}
			}
		}
		return primeFlag;
	}
}
