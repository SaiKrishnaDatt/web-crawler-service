package com.no.ads.news.webcrawlerservice.controller;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * @author : ssuddhapally
 * @since : 06/02/21, Sat
 **/
@RestController
public class RssParserController {
  @PostMapping(path = "/live-news")
  public @ResponseBody
  String getLatestNews(@RequestBody String text) throws IOException {

//read from google news
    OkHttpClient client = new OkHttpClient();

    Request request = new Request.Builder()
            .url("https://google-search3.p.rapidapi.com/api/v1/search/q="+ text +"&num=100")
            .get()
            .addHeader("x-rapidapi-key", "7116410c6cmsh4a53be5fc7c0cf5p17ea8cjsnaa1a7a17f03e")
            .addHeader("x-rapidapi-host", "google-search3.p.rapidapi.com")
            .build();

    try (Response response = client.newCall(request).execute()) {
      return response.body().string();
    }
  }

}
