public class BoasFestasDecorator extends CartaoDecorator{
    
    public BoasFestasDecorator(CartaoComponent cartao){
        super(cartao);
    }

    public void showMessage(){
        cartao.showMessage();
        System.out.println("Boas festas e um próspero ano novo!");
    }
}
