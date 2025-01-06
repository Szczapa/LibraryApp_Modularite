module checkoutSystem {
    requires inventory;
    requires emailNotification;
    requires bookApi;
    exports com.checkout;
}