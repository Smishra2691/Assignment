
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
@WebService(endpointInterface = "com.concretepage.endpoint.Welcome")
public class WelcomeImpl implements Welcome, WebService {
	@Resource
        WebServiceContext ctx;
	@SuppressWarnings("unchecked")
	@Override
	public String getWelcomeMsg(String name){
	  MessageContext msgctx = ctx.getMessageContext();
	  Map headers = (Map) msgctx.get(MessageContext.HTTP_REQUEST_HEADERS);
          List<String> users = (List<String>) headers.get("username");
          List<String> pwds = (List<String>) headers.get("password");
             if(users!=null && pwds != null){
        	if("sushmitha".equals(users.get(0))&& "1234".equals(pwds.get(0))){
       		 return "Welcome "+name;
        	}else{
        		return "Authentication failed.";
        	}
             }
             return "Username and password not provided.";
	 }
	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String endpointInterface() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String portName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String serviceName() {
	System.out.println("Add list to-do");
	System.out.println("Select date");
	System.out.println("Send email");
		return null;
	}
	@Override
	public String targetNamespace() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String wsdlLocation() {
		// TODO Auto-generated method stub
		return null;
	}
} 