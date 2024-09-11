package Hamburgueria;

public abstract class HamburgerDecorator implements Hamburger {

    private Hamburger hamburger;

    public HamburgerDecorator(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    public Hamburger getHamburger() {
        return hamburger;
    }

    public void setHamburger(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    @Override
    public float getPreco() {
        return hamburger.getPreco();
    }

    @Override
    public String getDescricao() {
        return hamburger.getDescricao();
    }
}
