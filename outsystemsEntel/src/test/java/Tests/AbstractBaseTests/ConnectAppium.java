
package Tests.AbstractBaseTests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

 /*
  * Una base abstracta para todas las pruebas de Android dentro de este paquete
   responsable de configurar el controlador de prueba Appium
*/

public abstract class ConnectAppium {

    private final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
    private final int TIMEOUT = 30;


     /**   * Hacer el controlador estático. Esto permite que se cree solo una vez.
           * y se utiliza en todas las clases de prueba.
           */
    public static AndroidDriver<MobileElement> driver;

    /**
          * Este método se ejecuta antes que cualquier otro método.
          *
          * Appium sigue un modelo cliente - servidor:
          * Estamos configurando nuestro cliente de Appium para conectarnos al servidor de Appium de Device Farm.
          *
          * No es necesario y NO DEBEMOS establecer nuestras propias capacidades Desired
          * Device Farm crea configuraciones personalizadas en el nivel del servidor. Estableciendo tus propias capacidades deseadas
          * resultará en resultados inesperados y fallos.
          *
          * @ throws MalformedURLException Una excepción que ocurre cuando la URL es incorrecta
          */
    @BeforeSuite
    public void setUpAppium() throws MalformedURLException{

        URL url = new URL(URL_STRING);

        /**
        * ejecutándo en el servidor de Device Farm. Las configuraciones hechas aquí serán ignoradas o pueden tener
        * Resultados inesperados.
        */
        
        driver = new AndroidDriver<MobileElement>(url, new DesiredCapabilities());

        //Use un valor más alto si sus elementos móviles tardan en aparecer..
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
    }

 
    @AfterSuite
    public void tearDownAppium(){
        if (driver != null) {
            driver.quit();
        }
    }

    /**
     * Reinicie la aplicación después de cada clase de prueba para volver al menú principal.
     * Pantalla y para restablecer el comportamiento.
     */
    @AfterClass
    public void restartApp() {
    }
}
