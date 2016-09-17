package com.sim.tinyhttpclient;

import com.sim.tinyhttpclient.impl.UrlConnHttpclient;

import org.junit.Test;

import java.util.HashMap;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class PostUnitTest {
    private final String pathUrl = "https://api.github.com?callback=foo";

    @Test
    public void simplePost() throws Exception {
        UrlConnHttpclient client = new UrlConnHttpclient.Builder().build();
        client.Post(pathUrl, null);
    }

    @Test
    public void simplePostHttps() throws Exception {
        UrlConnHttpclient client = new UrlConnHttpclient.Builder().build();
        client.Post(pathUrl, null);
    }

    @Test
    public void simplePostWithParameter() throws Exception {
        UrlConnHttpclient client = new UrlConnHttpclient.Builder().build();
        HashMap<String, String> map = new HashMap<>();
        map.put("limit", "1");
        client.Post("https://api.xmonster.cn/v2/feeds", map);
    }
}