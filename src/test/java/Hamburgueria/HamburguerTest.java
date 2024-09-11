package Hamburgueria;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HamburgerTest {

    @Test
    void deveRetornarPrecoHamburgerBasico() {
        Hamburger hamburger = new BasicHamburger();

        assertEquals(5.00f, hamburger.getPreco());
    }

    @Test
    void deveRetornarDescricaoHamburgerBasico() {
        Hamburger hamburger = new BasicHamburger();

        assertEquals("Hambúrguer básico", hamburger.getDescricao());
    }

    @Test
    void deveRetornarPrecoHamburgerComPao() {
        Hamburger hamburger = new PaoDecorator(new BasicHamburger(), "integral");

        assertEquals(6.00f, hamburger.getPreco());
    }

    @Test
    void deveRetornarDescricaoHamburgerComPao() {
        Hamburger hamburger = new PaoDecorator(new BasicHamburger(), "integral");

        assertEquals("Hambúrguer básico com pão integral", hamburger.getDescricao());
    }

    @Test
    void deveRetornarPrecoHamburgerComCarne() {
        Hamburger hamburger = new CarneDecorator(new BasicHamburger(), "bovina");

        assertEquals(8.00f, hamburger.getPreco());
    }

    @Test
    void deveRetornarDescricaoHamburgerComCarne() {
        Hamburger hamburger = new CarneDecorator(new BasicHamburger(), "bovina");

        assertEquals("Hambúrguer básico com carne bovina", hamburger.getDescricao());
    }

    @Test
    void deveRetornarPrecoHamburgerComPaoMaisCarne() {
        Hamburger hamburger = new CarneDecorator(new PaoDecorator(new BasicHamburger(), "integral"), "bovina");

        assertEquals(9.00f, hamburger.getPreco());
    }

    @Test
    void deveRetornarDescricaoHamburgerComPaoMaisCarne() {
        Hamburger hamburger = new CarneDecorator(new PaoDecorator(new BasicHamburger(), "integral"), "bovina");

        assertEquals("Hambúrguer básico com pão integral com carne bovina", hamburger.getDescricao());
    }

    @Test
    void deveRetornarPrecoHamburgerComCarneMaisPaoMaisCarne() {
        Hamburger hamburger = new CarneDecorator(new PaoDecorator(new CarneDecorator(new BasicHamburger(), "frango"), "integral"), "bovina");

        assertEquals(12.00f, hamburger.getPreco());
    }

    @Test
    void deveRetornarDescricaoHamburgerComCarneMaisPaoMaisCarne() {
        Hamburger hamburger = new CarneDecorator(new PaoDecorator(new CarneDecorator(new BasicHamburger(), "frango"), "integral"), "bovina");

        assertEquals("Hambúrguer básico com carne frango com pão integral com carne bovina", hamburger.getDescricao());
    }
}
