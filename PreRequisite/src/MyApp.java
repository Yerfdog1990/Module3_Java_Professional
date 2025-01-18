
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import java.io.IOException;

public class MyApp {
    public static void main(String[] args) throws IOException {
        try(CloseableHttpClient client = HttpClients.createDefault()) {
            HttpGet request = new HttpGet("https://example.com/");

            try (CloseableHttpResponse response = client.execute(request)) {
                System.out.println(response);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
//Class path - C:\Users\gouma\IdeaProjects\Module-3-Java-Professional\Lib\commons-httpclient-3.1.jar:\Users\gouma\IdeaProjects\Module-3-Java-Professional\out\production\MavenLiveDemo