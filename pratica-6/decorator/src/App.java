public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=== Gerador de cartões de Natal customizados ===");

        System.out.println("Cartão 1:");
        CartaoComponent c1 = new Cartao();
        c1.showMessage();
        System.out.println("");
        
        System.out.println("Cartão 2:");
        CartaoComponent c2 = new Cartao();
        c2 = new AbracoDecorator(c2);
        c2.showMessage();
        System.out.println("");

        System.out.println("Cartão 3:");
        CartaoComponent c3 = new Cartao();
        c3 = new SaudadeDecorator(c3);
        c3.showMessage();
        System.out.println("");
        
        System.out.println("Cartão 4:");
        CartaoComponent c4 = new Cartao();
        c4 = new BoasFestasDecorator(c4);
        c4.showMessage();
        System.out.println("");

        System.out.println("Cartão 5:");
        CartaoComponent c5 = new Cartao();
        c5 = new SaudadeDecorator(c5);
        c5 = new BoasFestasDecorator(c5);
        c5.showMessage();
        System.out.println("");
        
        System.out.println("Cartão 6:");
        CartaoComponent c6 = new Cartao();
        c6 = new AbracoDecorator(c6);
        c6 = new BoasFestasDecorator(c6);
        c6.showMessage();
        System.out.println("");
        
        System.out.println("Cartão 7:");
        CartaoComponent c7 = new Cartao();
        c7 = new BoasFestasDecorator(c7);
        c7 = new AbracoDecorator(c7);
        c7.showMessage();
        System.out.println("");
        
        System.out.println("Cartão 8:");
        CartaoComponent c8 = new Cartao();
        c8 = new SaudadeDecorator(c8);
        c8 = new AbracoDecorator(c8);
        c8.showMessage();
        System.out.println("");
        
        System.out.println("Cartão 9:");
        CartaoComponent c9 = new Cartao();
        c9 = new SaudadeDecorator(c9);
        c9 = new BoasFestasDecorator(c9);
        c9 = new AbracoDecorator(c9);
        c9.showMessage();
        System.out.println("");

        System.out.println("Cartão 10:");
        CartaoComponent c10 = new Cartao();
        c10 = new SaudadeDecorator(c10);
        c10 = new AbracoDecorator(c10);
        c10 = new BoasFestasDecorator(c10);
        c10.showMessage();
        System.out.println("");
        
    }
}
