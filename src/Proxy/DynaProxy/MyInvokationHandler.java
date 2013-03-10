package Proxy.DynaProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvokationHandler implements InvocationHandler {
	private Object target;
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		TxUtil util = new TxUtil();
		util.beginTx();
		//唯一重要的一句
		Object result = method.invoke(target, args);
		util.endTx();
		return result;
	}

	public void setTarget(Object target) {
		this.target = target;
	}

}
