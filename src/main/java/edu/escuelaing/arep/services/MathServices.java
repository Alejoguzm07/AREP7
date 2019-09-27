
package edu.escuelaing.arep.services;

import static spark.Spark.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import spark.Request;
import spark.Response;

public class MathServices {
    public static void main(String[] args) throws NumberFormatException, IOException
    {
		setPort(4567);
        port(getPort());
        get("/inputdata", (req, res) -> lectura(req, res));
        get("/results", (req, res) -> impresion(req, res));
	}
	
	private static String lectura(Request req, Response res) {
        String pagina = "<!DOCTYPE html>"
        		+ "<html><body><h1>Cuadrado de un numero</h1>"
        		+ "<h2>introduzca el valor que quiere elevar al cuadrado</h2>"
        		+ "<form action='results'>"
        		+ "<input type='number' name='valor'  required>"
        		+ "<input type='submit' value='Submit'>"
        		+ "</form>"
        		+ "</body></html>";
        return pagina;
    }
	
	private static String impresion(Request req, Response res) throws MalformedURLException, IOException {
        String[] datos = req.queryParams("valor").split(" "); 
         
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String urlUsuario = "https://95zlv1ypw6.execute-api.us-east-1.amazonaws.com/Beta?value=" + datos[0];
            URL url = new URL(urlUsuario);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine = null;
            String pagina = "<!DOCTYPE html><html><body><h1>El cuadrado es ";
            while ((inputLine = reader.readLine()) != null) {
                pagina += inputLine;
            }
            pagina += "</h1></body></html>";
         
        return pagina;
    }
        
    static int getPort() {        
		if (System.getenv("PORT") != null) {
			return Integer.parseInt(System.getenv("PORT"));
		}
		return 4567; //returns default port if heroku-port isn't set(i.e. on localhost)    }
	}
}
