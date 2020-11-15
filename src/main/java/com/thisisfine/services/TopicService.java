package com.thisisfine.services;

import static com.thisisfine.utils.CastUtils.castToList;
import static com.thisisfine.utils.CastUtils.castToMap;

import com.thisisfine.clients.QuestionsClient;
import com.thisisfine.dao.Topic;
import com.thisisfine.utils.CastUtils;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.inject.Singleton;

@Singleton
public class TopicService {

  public static final String TOPIC_FIELD_NAME = "lang";
  private final QuestionsClient questionsClient;

  public TopicService(QuestionsClient questionsClient) {
    this.questionsClient = questionsClient;
  }

  /**
   * Retrieve list of topics
   *
   * @return {@link List} of {@link Topic}
   */
  public List<Topic> getAllTopics() {
    Map<String, Object> facets = questionsClient.getFacets(TOPIC_FIELD_NAME);
    Map<String, Object> result = castToMap(facets.get(TOPIC_FIELD_NAME));
    return castToList(result.get("values")).stream()
        .map(CastUtils::castToMap)
        .map(value -> Topic.of((String) value.get("range")))
        .collect(Collectors.toList());
  }
}
