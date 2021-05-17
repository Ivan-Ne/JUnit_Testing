// class Calculator
public class Calculator {

    // Method add.
    // Here we get and summarize a and b variables of a double type.
    public double add(double a, double b){
        return a + b;
    }

    // Also method add.
    // Here we get a and b variables of a String type.
    // Then we converse a and b to double type, and summarize them.
    public double add(String a, String b){
        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);
        return numA + numB;
    }

    // Method decrease.
    // Here we get and decrement a by b variables of a double type.
    public double decrease(double a, double b){
        return a - b;
    }

    // Also method decrease.
    // Here we get a and b variables of a String type.
    // Then we converse a and b to double type, and decrement a by b.
    public double decrease(String a, String b){
        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);
        return numA - numB;
    }

    // Multiply method.
    // Here we get and multiply a and b variables of a double type.
    public double multiply(double a, double b){
        return a * b;
    }

    // Also Multiply method.
    // Here we get a and b variables of a String type.
    // Then we converse a and b to double type, and multiply them.
    public double multiply(String a, String b){
        double numA = Integer.parseInt(a);
        double numB = Integer.parseInt(b);
        return numA * numB;
    }

    // Divide method.
    // Here we get a and b variables of a double type.
    // Then we divide a by b.
    public double divide(double a, double b){
        return a / b;
    }

    // Also divide method.
    // Here we get a and b variables of a String type.
    // Then we converse a and b to double type, and divide a by b.
    public double divide(String a, String b){
        double numA = Integer.parseInt(a);
        double numB = Integer.parseInt(b);
        return numA / numB;
    }

    // Power method.
    // Here we get a and b variables of a double type.
    // Then we rise a to the b power.
    public double power(double a, double b){
        return Math.pow(a, b);
    }

    // Also power method.
    // Here we get a and b variables of a String type.
    // Then we converse a and b to double type, and rise a to the b power.
    public double power(String a, String b){
        double numA = Integer.parseInt(a);
        double numB = Integer.parseInt(b);
        return Math.pow(numA, numB);
    }
}
