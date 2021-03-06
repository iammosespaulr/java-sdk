/**
 * Copyright 2017 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.developer_cloud.alchemy.v1.model;

/**
 * Abstract model class for Alchemy Language models.
 */
public abstract class AlchemyLanguageGenericModel extends AlchemyGenericModel {

  private String language;
  private String url;

  /**
   * Gets the language.
   *
   * @return the language
   */
  public String getLanguage() {
    return language;
  }

  /**
   * Gets the url.
   *
   * @return the url
   */
  public String getUrl() {
    return url;
  }

  /**
   * Sets the language.
   *
   * @param language the language to set
   */
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * Sets the url.
   *
   * @param url the url to set
   */
  public void setUrl(String url) {
    this.url = url;
  }

}
