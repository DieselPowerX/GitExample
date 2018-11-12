import java.net.HttpURLConnection;
import java.net.URL;

public class MainController {
    public static void main(String[] args) throws Exception {

        String url  ="http://www.google.de";
        URL conection =  new URL(url);
        HttpURLConnection con = (HttpURLConnection) conection.openConnection();
        

    }

    public static String getSomeText(String s ){

        return s+ " someTExt";
    }

}
