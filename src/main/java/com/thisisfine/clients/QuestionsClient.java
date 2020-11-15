package com.thisisfine.clients;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import java.util.Map;
import javax.validation.constraints.NotBlank;

@Client("http://127.0.0.1:8002")
public interface QuestionsClient {

  @Get("/questions/facets/{field}")
  Map<String, Object> getFacets(@NotBlank String field);
}
