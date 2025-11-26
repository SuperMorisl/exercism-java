import java.math.BigInteger;

class Grains {
    BigInteger grainsOnSquare(final int square) {
        if (square<=64&&square>=1){
        BigInteger sum = BigInteger.ONE;
        for (int i = 1; i<square;i++){
            sum = sum.multiply(BigInteger.TWO);
        };
            return sum;}
        throw new IllegalArgumentException("square must be between 1 and 64");
    }
    

    public BigInteger grainsOnBoard() {
        // Calculate 2^64
        BigInteger totalPowerOfTwo = BigInteger.ONE.shiftLeft(64);
        
        // Return 2^64 - 1
        return totalPowerOfTwo.subtract(BigInteger.ONE);
    }

}
