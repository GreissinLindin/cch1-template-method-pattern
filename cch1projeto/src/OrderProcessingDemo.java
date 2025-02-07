public class OrderProcessingDemo {
    public static void main(String[] args) {
        System.out.println("Processando pedido de produto físico:");
        OrderProcessor physicalOrder = new PhysicalProductOrder();
        physicalOrder.processOrder();

        System.out.println("\nProcessando pedido de produto digital:");
        OrderProcessor digitalOrder = new DigitalProductOrder();
        digitalOrder.processOrder();
    }
}
