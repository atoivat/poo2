public class SaudadeDecorator extends CartaoDecorator {
    
    public SaudadeDecorator(CartaoComponent cartao){
        super(cartao);
    }

    public void showMessage(){
        System.out.println("Que saudade de você...");
        cartao.showMessage();
    }
}
