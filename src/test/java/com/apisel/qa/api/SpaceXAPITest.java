package com.apisel.qa.api;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import org.apache.http.HttpResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.apisel.qa.api.common.Constants;
import com.apisel.qa.api.common.HTTPClientMethod;
import com.apisel.qa.api.common.JsonMapperUtil;
import com.apisel.qa.api.mapper.SpaceXGet;
import com.google.common.io.CharStreams;

/**
 * Test class fr spaceX API
 */
public class SpaceXAPITest {

	HTTPClientMethod client = new HTTPClientMethod();

	@Test
	public void getSpaceXDetailsTest() throws IOException {
		HttpResponse resp = client.HTTPClientGet(Constants.URL);
		Assert.assertEquals(resp.getStatusLine().getStatusCode(), Constants.STATUS_CODE_200);
	}

	@Test
	public void spaceXNameTest() throws IOException {
		HttpResponse resp = client.HTTPClientGet(Constants.URL);
		Assert.assertEquals(resp.getStatusLine().getStatusCode(), Constants.STATUS_CODE_200);
		Reader reader = new InputStreamReader(resp.getEntity().getContent());
		String responseBody = CharStreams.toString(reader);
		System.out.println("Response:" + responseBody);

		JsonMapperUtil jsonMapperUtil = new JsonMapperUtil();
		SpaceXGet spaceX = jsonMapperUtil.mappJson(responseBody);
		System.out.println("spaceX:" + spaceX.getName());
		Assert.assertEquals(spaceX.getName(), "Starlink-26 (v1.0) + Capella-6 + Tyvak-0130", "Name is wrong");
	}
}
