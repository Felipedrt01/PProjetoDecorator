package Hamburgueria;

public class PaoDecorator extends HamburgerDecorator {

    private String tipoPao;

    public PaoDecorator(Hamburger hamburger, String tipoPao) {
        super(hamburger);
        this.tipoPao = tipoPao;
    }

    @Override
    public float getPreco() {
        return super.getPreco() + 1.00f;  // Adiciona o custo do pão
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " com pão " + tipoPao;
    }
}
