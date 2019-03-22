

import javax.jws.WebMethod;
import javax.jws.WebService;
@WebService
public interface Welcome {
  @WebMethod	
  public String getWelcomeMsg(String name);
} 