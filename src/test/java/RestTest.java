import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;

public class RestTest {
	public static void main(String[] args) {
		Client c = Client.create();

		// plain text
		WebResource r = c
				.resource("http://localhost:9090/jaxrs/services/timeoftheday/asplaintext/mathew");
		System.out.println("Plain Text=>> " + r.get(String.class));

		// json
		r = c.resource("http://localhost:9090/jaxrs/services/timeoftheday/asjson/mathew");
		c.addFilter(new HTTPBasicAuthFilter("johndoe", "password"));
		System.out.println("JSON=>> " + r.get(String.class));

		// xml
		r = c.resource("http://localhost:9090/jaxrs/services/timeoftheday/asxml/mathew");
		c.addFilter(new HTTPBasicAuthFilter("admin", "password"));
		System.out.println("XML=>> " + r.get(String.class));
	}
}
