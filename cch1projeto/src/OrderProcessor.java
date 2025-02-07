public abstract class OrderProcessor {
    public final void processOrder() {
        validateOrder();
        calculatePrice();
        processPayment();
        finalizeOrder();
    }

    protected abstract void validateOrder();
    protected abstract void calculatePrice();

    protected void processPayment() {
        System.out.println("Processando pagamento do pedido...");
    }

    protected void finalizeOrder() {
        System.out.println("Finalizando pedido...");
    }
}
