package Hamburgueria;

public class BasicHamburger implements Hamburger {

    @Override
    public float getPreco() {
        return 5.00f;  // Preço básico do hambúrguer
    }

    @Override
    public String getDescricao() {
        return "Hambúrguer básico";
    }
}
