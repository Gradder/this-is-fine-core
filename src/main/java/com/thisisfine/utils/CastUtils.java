package com.thisisfine.utils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class CastUtils {

  private CastUtils() {
  }

  /**
   * Cast object to {@link Map}
   *
   * @param map input {@link Object}
   * @return {@link Map}
   */
  @SuppressWarnings("unchecked")
  public static Map<String, Object> castToMap(Object map) {
    if (map instanceof Map) {
      return (Map<String, Object>) map;
    }
    return Collections.emptyMap();
  }

  /**
   * Cast object to {@link List}
   *
   * @param map input {@link Object}
   * @return {@link List}
   */
  @SuppressWarnings("unchecked")
  public static List<Object> castToList(Object map) {
    if (map instanceof Collection) {
      return (List<Object>) map;
    }
    return Collections.emptyList();
  }
}
