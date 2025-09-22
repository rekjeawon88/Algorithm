import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger answer = BigInteger.valueOf(0);
        
        BigInteger numer = BigInteger.valueOf(1);
        BigInteger denom1 = BigInteger.valueOf(1);
        BigInteger denom2 = BigInteger.valueOf(1);

        for (int i = 1; i <= balls; i++) {
            numer = numer.multiply(BigInteger.valueOf(i));
        }

        for (int i = 1; i <= (balls - share); i++) {
            denom1 = denom1.multiply(BigInteger.valueOf(i));
        }

        for (int i = 1; i <= share; i++) {
            denom2 = denom2.multiply(BigInteger.valueOf(i));
        }

        answer = numer.divide(denom1.multiply(denom2));
        
        return answer;
    }
}
