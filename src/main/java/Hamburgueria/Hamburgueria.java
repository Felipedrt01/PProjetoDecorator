package Hamburgueria;

public class Hamburgueria {
    public static void main(String[] args) {
        // Hambúrguer básico
        Hamburger hamburger = new BasicHamburger();
        System.out.println(hamburger.getDescricao() + " custa " + hamburger.getPreco());

        // Adiciona um tipo de pão
        hamburger = new PaoDecorator(hamburger, "integral");
        System.out.println(hamburger.getDescricao() + " custa " + hamburger.getPreco());

        // Adiciona um tipo de carne
        hamburger = new CarneDecorator(hamburger, "bovina");
        System.out.println(hamburger.getDescricao() + " custa " + hamburger.getPreco());
    }
}
