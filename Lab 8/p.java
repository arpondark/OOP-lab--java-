class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

class Product {
    public void productCheck(int weight) throws MyException {
        if (weight < 100) {
            throw new MyException("Product is invalid");
        } else {
            System.out.println("Product weight: " + weight);
        }
    }

    public static void main(String[] args) {
        Product product = new Product();

        try {
            product.productCheck(50);
        } catch (MyException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            product.productCheck(150);
        } catch (MyException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
