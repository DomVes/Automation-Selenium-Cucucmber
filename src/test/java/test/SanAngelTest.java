package test;

import excel.Excel;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class SanAngelTest {

    private WebDriver driver;
    public ArrayList<Map<String, String>> listaProductos;

    By txtBuscar = By.xpath("//input[@placeholder]");
    By btnBusqueda = By.xpath("/html/body/div[3]/div[1]");


    @Before
    public void setUp() throws IOException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-infobars");
        driver = new ChromeDriver(options);
        listaProductos = Excel.leerDatosDeHojaDeExcel("Productos.xlsx", "Hoja1");

    }

    @Test
    public void buscarproductos() throws InterruptedException {
        driver.get("https://sanangel.com.co/");


       for (int i = 0; i < listaProductos.size(); i++){
            driver.findElement(txtBuscar).sendKeys(listaProductos.get(i).get("Producto"));
            Thread.sleep(5000);
            driver.findElement(btnBusqueda).click();
           Assert.assertEquals(listaProductos.get(i).get("Producto"),driver.findElement(By.xpath("//h1[@class = \"product_title entry-title\"]")).getText());
        }

    }

        @After
        public void tearDown () {

            driver.quit();

        }

    }

