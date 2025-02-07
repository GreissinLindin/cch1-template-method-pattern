public class PhysicalProductOrder extends OrderProcessor {
    @Override
    protected void validateOrder() {
        System.out.println("Verificando estoque do produto físico...");
    }

    @Override
    protected void calculatePrice() {
        System.out.println("Calculando preço + frete do produto físico...");
    }

    @Override
    protected void finalizeOrder() {
        System.out.println("Gerando etiqueta de envio...");
        System.out.println("Enviando produto para setor de expedição...");
    }
}
