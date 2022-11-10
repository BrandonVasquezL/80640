package mx.uv.c80640;
import static spark.Spark.*;

import java.util.HashMap;
import java.util.Map;

import javax.sound.sampled.Port;

import com.google.gson.Gson;
/**
 * Hello world!
 *
 */
public class AppDb {
    public static Gson gson = new Gson();
    //base de datos en memoria
    public static Map<String, Usuario> usuarios = new HashMap<>();
    public static void main( String[] args ){
        port(80);
        //inicializacion de datos


        // before((req, res)-> res.type("application/json"));
        // get("/usuarios", (req, res)-> gson.toJson(DAO.dameUsuario()));
        
        // post("/usuarios", (req, res)->{
        //     String usuario_request = req.body();
        //     logger.info(usuario_request);
        //     Usuario u = gson.fromJson(usuario_request, null);
        // });
    }
}