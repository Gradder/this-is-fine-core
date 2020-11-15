package com.thisisfine.dao;

import lombok.Data;

@Data
public class Topic {

  private String language;

  public static Topic of(String language) {
    Topic topic = new Topic();
    topic.setLanguage(language);
    return topic;
  }
}
