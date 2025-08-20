import java.math.BigInteger;

class LeetCodeSolution_Q415{
    public String addStrings(String num1, String num2) {
        BigInteger x = new BigInteger(num1);
		BigInteger y = new BigInteger(num2);

		return (x.add(y)).toString();
    }
}