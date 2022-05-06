package automationcraft.testcreation.farmacia.pages;


import automationcraft.engine.selenium.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarritoDeComprasPage extends SeleniumBase {

    public CarritoDeComprasPage(WebDriver driver) {
        super(driver);
    }


    //Atributos de la pagina

    By btnAgregarAlCarrito = By.xpath("//button[@class=\"action tocart primary \"]");
    By mensajeOKAgregarProductoAlCarrito = By.xpath("//div[@class='toast-message']");
    By contadorProductosEnCarrito = By.xpath("//span[@class=\"counter-number\"]");
    By btnCarrito = By.xpath("//i[@class=\"navbar-tool-icon icon-cart\"]");
    By btnVerdeCarrito = By.id("top-cart-btn-checkout");

    public void irAURLFarmacia(String url){
    goToUrl(url);
    }

    public void clickBtnAgregarCarrito(){
        click(btnAgregarAlCarrito);
    }

    public String validarMensajeIngresoProductoEnCarrito() {
        exwait(mensajeOKAgregarProductoAlCarrito);
        if (isDisplayed(mensajeOKAgregarProductoAlCarrito)) {
            return getText(mensajeOKAgregarProductoAlCarrito);
        }
        return "mensaje no valido";
    }


}





