import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainController {
    public static void main(String[] args) throws Exception {


        /// to jest moja galaz 


        String url  ="http://www.apple.de";
        


        URL conection =  new URL(url);
        HttpURLConnection con = (HttpURLConnection) conection.openConnection();

       

        int responseCode = con.getResponseCode();


        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        String s = "cos";

    }

    public static String getSomeText(String s ){

        return s+ " someTExt";
    }

}
