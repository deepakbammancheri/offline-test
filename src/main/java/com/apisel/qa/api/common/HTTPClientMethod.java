package com.apisel.qa.api.common;

import java.io.IOException;

import javax.json.JsonObject;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * Class to perform HTTP Operations
 *
 */
public class HTTPClientMethod {

	CloseableHttpClient httpclient = HttpClients.createDefault();

	/**
	 * Method to perform HHTP GET	 * 
	 * @param uri
	 * @return
	 * @throws IOException
	 */
	public HttpResponse HTTPClientGet(String uri) throws IOException {
		HttpGet httpget = new HttpGet(uri);
		System.out.println("Request Type: " + httpget.getMethod());
		HttpResponse httpresponse = httpclient.execute(httpget);
		return httpresponse;

	}

	/**
	 * Method to perform POST	 * 
	 * @param uri
	 * @param payload
	 * @return
	 * @throws IOException
	 */
	public HttpResponse HTTPClientPost(String uri, JsonObject payload) throws IOException {
		HttpPost httpPost = new HttpPost(uri);
		StringEntity entity = new StringEntity(payload.toString());
		httpPost.setEntity(entity);
		httpPost.setHeader("Accept", "application/json");
		httpPost.setHeader("Content-type", "application/json");
		CloseableHttpResponse response = httpclient.execute(httpPost);
		return response;
	}

	public void closeClientObj() throws IOException {
		httpclient.close();
	}
}
