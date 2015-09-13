package appa;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@LocalBean
@WebService(serviceName = "ServiceAService", portName = "ServiceAPort", endpointInterface = "appa.IServiceA", targetNamespace = "http://appa/ServiceA")
public class ServiceA implements IServiceA {

	@Override
	public int plus(int left, int right) {
		
		int result = left + right;
		
		System.out.println("method=plus, left="+left + ", right=" + right + ", result=" + result);
		
		return result;
	}

}
