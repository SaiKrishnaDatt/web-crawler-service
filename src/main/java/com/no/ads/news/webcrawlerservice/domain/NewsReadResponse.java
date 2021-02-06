package com.no.ads.news.webcrawlerservice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : ssuddhapally
 * @since : 06/02/21, Sat
 **/
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewsReadResponse {
  String Title;
  String Description;
}
