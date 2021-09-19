public class AbracoDecorator extends CartaoDecorator{

    public AbracoDecorator(CartaoComponent cartao){
        super(cartao);
    }

    public void showMessage(){
        cartao.showMessage();
        System.out.println("Um grande abraço para você e sua família!");
    }
}
