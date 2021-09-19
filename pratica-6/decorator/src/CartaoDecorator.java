public abstract class CartaoDecorator extends CartaoComponent{
    protected CartaoComponent cartao;

    public CartaoDecorator(CartaoComponent cartao){
        this.cartao = cartao;
    }
}
