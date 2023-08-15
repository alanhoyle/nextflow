/*
 * Copyright 2013-2023, Seqera Labs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * Task Execution Service
 *
 * OpenAPI spec version: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package nextflow.ga4gh.tes.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * OutputFileLog describes a single output file. This describes file details after the task has completed successfully, for logging purposes.
 */
@Schema(description = "OutputFileLog describes a single output file. This describes file details after the task has completed successfully, for logging purposes.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-15T14:10:09.878Z[GMT]")

public class TesOutputFileLog {
  @SerializedName("url")
  private String url = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("size_bytes")
  private String sizeBytes = null;

  public TesOutputFileLog url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL of the file in storage, e.g. s3://bucket/file.txt
   * @return url
  **/
  @Schema(required = true, description = "URL of the file in storage, e.g. s3://bucket/file.txt")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public TesOutputFileLog path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Path of the file inside the container. Must be an absolute path.
   * @return path
  **/
  @Schema(required = true, description = "Path of the file inside the container. Must be an absolute path.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public TesOutputFileLog sizeBytes(String sizeBytes) {
    this.sizeBytes = sizeBytes;
    return this;
  }

   /**
   * Size of the file in bytes. Note, this is currently coded as a string because official JSON doesn&#x27;t support int64 numbers.
   * @return sizeBytes
  **/
  @Schema(example = "[\"1024\"]", required = true, description = "Size of the file in bytes. Note, this is currently coded as a string because official JSON doesn't support int64 numbers.")
  public String getSizeBytes() {
    return sizeBytes;
  }

  public void setSizeBytes(String sizeBytes) {
    this.sizeBytes = sizeBytes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TesOutputFileLog tesOutputFileLog = (TesOutputFileLog) o;
    return Objects.equals(this.url, tesOutputFileLog.url) &&
        Objects.equals(this.path, tesOutputFileLog.path) &&
        Objects.equals(this.sizeBytes, tesOutputFileLog.sizeBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, path, sizeBytes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TesOutputFileLog {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    sizeBytes: ").append(toIndentedString(sizeBytes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
