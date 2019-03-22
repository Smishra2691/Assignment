
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
public class WelcomeMsgClient {
	public static void main(String[] args, BindingProvider welcome) {
	  WebService welService = new WelcomeImpl();
	  BindingProvider bp = (BindingProvider) welcome;
	  Map<String, Object> map = bp.getRequestContext();
	  Map<String, List<String>> headers = new HashMap<String, List<String>>();
	  headers.put("username", Collections.singletonList("sushmitha"));
	  headers.put("password", Collections.singletonList("1234"));
	  map.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
	  System.out.println(((WelcomeImpl) welcome).getWelcomeMsg("Everyone!"));
	}
} 