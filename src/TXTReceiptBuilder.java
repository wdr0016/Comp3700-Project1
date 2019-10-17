public class TXTReceiptBuilder implements IReceiptBuilder {

    StringBuilder sb = new StringBuilder();

    public void appendHeader(String header) {
        sb.append(header).append("\n");
    }

    public void appendCustomer(CustomerModel customer) {
        sb.append("Customer ID: ").append(customer.mCustomerID).append("\n");
        sb.append("Customer Name: ").append(customer.mName).append("\n\n");
    }

    public void appendProduct(ProductModel product) {
        sb.append("Product ID: ").append(product.mProductID).append("\n");
        sb.append("Product Name: ").append(product.mName).append("\n\n");
    }

    public void appendPurchase(PurchaseModel purchase) {
        sb.append("Purchase ID: ").append(purchase.mPurchaseID).append("\n");
        sb.append("Customer ID: ").append(purchase.mCustomerID).append("\n");
        sb.append("Product ID: ").append(purchase.mCustomerID).append("\n");
        sb.append("Price: ").append(purchase.mPrice).append("\n");
        sb.append("Quantity: ").append(purchase.mQuantity).append("\n");
        sb.append("Cost: ").append(purchase.mCost).append("\n");
        sb.append("Tax: ").append(purchase.mTax).append("\n\n");
        sb.append("Total: ").append(purchase.mPrice).append("\n");

    }

    public void appendFooter(String footer) {
        sb.append(footer).append("\n");
    }

    public void appendAll(String header, CustomerModel customer, ProductModel product,
                          PurchaseModel purchase, String footer) {
        appendHeader(header);
        appendCustomer(customer);
        appendProduct(product);
        appendPurchase(purchase);
        appendFooter(footer);
    }

    public String toString() {
        return sb.toString();
    }
}
