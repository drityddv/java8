package http;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.SimpleHttpConnectionManager;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;

import java.io.IOException;

/**
 * @author : ddv
 * @since : 2019/4/9 下午3:34
 */

public class Main {

	public static void main(String[] args) {
		HttpClient client = new HttpClient(new SimpleHttpConnectionManager(true));
		String url = "https://www.ximalaya.com/revision/seo/getTdk?typeName=CATEGORY&uri=%2Fyoushengshu%2F";

		GetMethod getMethod = new GetMethod(url);
		getMethod.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "UTF-8");
		getMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler());

		try {
			int stateCode = client.executeMethod(getMethod);
			System.out.println(stateCode);
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}
