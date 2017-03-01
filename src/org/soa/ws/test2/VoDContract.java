package org.soa.ws.test2;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public interface VoDContract {
	
	@WebMethod
	@WebResult(name="ItemTitle")
	public ArrayList<String> getItemsTitleByRealisator(@WebParam(name="RealisatorName") String name);
	
	@WebMethod
	public boolean isItemAvailable(@WebParam(name="ItemTitle")String title, @WebParam(name="ItemCategory")String category);

}
