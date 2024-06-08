import java.math.BigInteger;

public class ArbitraryBaseNumber {
    private BigInteger value;
    private int base;

    public ArbitraryBaseNumber(String number, int base) {
        this.base = base;
        this.value = new BigInteger(number, base);
    }

    public ArbitraryBaseNumber(BigInteger value, int base) {
        this.value = value;
        this.base = base;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
        this.value = this.value.mod(BigInteger.valueOf(base));
    }

    public BigInteger getValue() {
        return value;
    }

    public void setValue(BigInteger value) {
        this.value = value;
    }

    public ArbitraryBaseNumber add(ArbitraryBaseNumber other) {
        BigInteger resultValue = this.value.add(other.value);
        int resultBase = Math.max(this.base, other.base);
        return new ArbitraryBaseNumber(resultValue, resultBase);
    }

    public ArbitraryBaseNumber subtract(ArbitraryBaseNumber other) {
        BigInteger resultValue = this.value.subtract(other.value);
        int resultBase = Math.max(this.base, other.base);
        return new ArbitraryBaseNumber(resultValue, resultBase);
    }

    public boolean equals(ArbitraryBaseNumber other) {
        return this.value.equals(other.value) && this.base == other.base;
    }

    @Override
    public String toString() {
        return String.format("%s (%d)", value.toString(base), base);
    }
}
