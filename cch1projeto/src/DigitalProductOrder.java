public class DigitalProductOrder extends OrderProcessor {
    @Override
    protected void validateOrder() {
        System.out.println("Verificando disponibilidade do produto digital...");
    }

    @Override
    protected void calculatePrice() {
        System.out.println("Calculando preço do produto digital...");
    }

    @Override
    protected void finalizeOrder() {
        System.out.println("Gerando link de download...");
        System.out.println("Enviando email com instruções de acesso...");
    }
}
