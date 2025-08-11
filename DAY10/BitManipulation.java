package DAY10;

public class BitManipulation {

    public static void oddEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            // even
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public static int getIthBit(int n, int i) {
        int bitMask = (1 << i);
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = (1 << i);
        return (n | bitMask);
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return (n & bitMask);
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        // clearIthBit(n, i);
        // } else {
        // setIthBit(n, i);
        // }

        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;

    }

    public static int clearIBits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static int clearRangeBits(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;

    }

    public static void main(String args[]) {
        System.out.println(clearRangeBits(10, 2, 4));
    }
}
