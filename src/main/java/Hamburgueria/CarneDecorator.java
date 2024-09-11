package Hamburgueria;

public class CarneDecorator extends HamburgerDecorator {

    private String tipoCarne;

    public CarneDecorator(Hamburger hamburger, String tipoCarne) {
        super(hamburger);
        this.tipoCarne = tipoCarne;
    }

    @Override
    public float getPreco() {
        return super.getPreco() + 3.00f;  // Adiciona o custo da carne
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " com carne " + tipoCarne;
    }
}
