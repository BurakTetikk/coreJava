package ders_16;

public class C01_Methods {
    public static void main(String[] args) {
        boolean member = true;
        int memberYear = 3;
        double price = 250;
        double discount = 0;
        double discountedPrice = 0;

        if (member){
            if (5 <= memberYear){
                discount = countDiscount(price, 15);
                discountedPrice = countDiscountedPrice(price, discount);
                System.out.printf("Price %.2f, Discount %.2f, Discounted Price %.2f", price, discount, discountedPrice);
            } else {
                discount = countDiscount(price, 10);
                discountedPrice = countDiscountedPrice(price, discount);
                System.out.printf("Price %.2f, Discount %.2f, Discounted Price %.2f", price, discount, discountedPrice);
            }
        } else {
            discount = countDiscount(price, 5);
            discountedPrice = countDiscountedPrice(price, discount);
            System.out.printf("Price %.2f, Discount %.2f, Discounted Price %.2f", price, discount, discountedPrice);
        }
    }

    private static double countDiscountedPrice(double price, double discount) {
        return price - discount;
    }

    private static double countDiscount(double price, int discount) {
        return price * (discount / 100.0);
    }
}
