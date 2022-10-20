package mx.uv.c80640;
import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        get("/hello", (req, res) -> "Hello World");
        get("/Eduardo", (req, res) -> "Hello Eduardo");
        get("/Brandon", (req, res) -> "Hello Brandon");
        get("/", (req, res) -> "<h1>Bienvenido</h1><img src='https://www.uv.mx/v2/images/logouv.jpg'>");
    
        post("/", (req, res)->{
            System.out.println(req.queryParams("email")+ " "+ "" );
            System.out.println();
            return oRespuesta;
        });
    }
}
