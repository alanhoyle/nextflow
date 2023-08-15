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
 * ExecutorLog describes logging information related to an Executor.
 */
@Schema(description = "ExecutorLog describes logging information related to an Executor.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-15T14:10:09.878Z[GMT]")

public class TesExecutorLog {
  @SerializedName("start_time")
  private String startTime = null;

  @SerializedName("end_time")
  private String endTime = null;

  @SerializedName("stdout")
  private String stdout = null;

  @SerializedName("stderr")
  private String stderr = null;

  @SerializedName("exit_code")
  private Integer exitCode = null;

  public TesExecutorLog startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Time the executor started, in RFC 3339 format.
   * @return startTime
  **/
  @Schema(example = "2020-10-02 10:00:00-05:00", description = "Time the executor started, in RFC 3339 format.")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public TesExecutorLog endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Time the executor ended, in RFC 3339 format.
   * @return endTime
  **/
  @Schema(example = "2020-10-02 11:00:00-05:00", description = "Time the executor ended, in RFC 3339 format.")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public TesExecutorLog stdout(String stdout) {
    this.stdout = stdout;
    return this;
  }

   /**
   * Stdout content.  This is meant for convenience. No guarantees are made about the content. Implementations may chose different approaches: only the head, only the tail, a URL reference only, etc.  In order to capture the full stdout client should set Executor.stdout to a container file path, and use Task.outputs to upload that file to permanent storage.
   * @return stdout
  **/
  @Schema(description = "Stdout content.  This is meant for convenience. No guarantees are made about the content. Implementations may chose different approaches: only the head, only the tail, a URL reference only, etc.  In order to capture the full stdout client should set Executor.stdout to a container file path, and use Task.outputs to upload that file to permanent storage.")
  public String getStdout() {
    return stdout;
  }

  public void setStdout(String stdout) {
    this.stdout = stdout;
  }

  public TesExecutorLog stderr(String stderr) {
    this.stderr = stderr;
    return this;
  }

   /**
   * Stderr content.  This is meant for convenience. No guarantees are made about the content. Implementations may chose different approaches: only the head, only the tail, a URL reference only, etc.  In order to capture the full stderr client should set Executor.stderr to a container file path, and use Task.outputs to upload that file to permanent storage.
   * @return stderr
  **/
  @Schema(description = "Stderr content.  This is meant for convenience. No guarantees are made about the content. Implementations may chose different approaches: only the head, only the tail, a URL reference only, etc.  In order to capture the full stderr client should set Executor.stderr to a container file path, and use Task.outputs to upload that file to permanent storage.")
  public String getStderr() {
    return stderr;
  }

  public void setStderr(String stderr) {
    this.stderr = stderr;
  }

  public TesExecutorLog exitCode(Integer exitCode) {
    this.exitCode = exitCode;
    return this;
  }

   /**
   * Exit code.
   * @return exitCode
  **/
  @Schema(required = true, description = "Exit code.")
  public Integer getExitCode() {
    return exitCode;
  }

  public void setExitCode(Integer exitCode) {
    this.exitCode = exitCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TesExecutorLog tesExecutorLog = (TesExecutorLog) o;
    return Objects.equals(this.startTime, tesExecutorLog.startTime) &&
        Objects.equals(this.endTime, tesExecutorLog.endTime) &&
        Objects.equals(this.stdout, tesExecutorLog.stdout) &&
        Objects.equals(this.stderr, tesExecutorLog.stderr) &&
        Objects.equals(this.exitCode, tesExecutorLog.exitCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, endTime, stdout, stderr, exitCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TesExecutorLog {\n");
    
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    stdout: ").append(toIndentedString(stdout)).append("\n");
    sb.append("    stderr: ").append(toIndentedString(stderr)).append("\n");
    sb.append("    exitCode: ").append(toIndentedString(exitCode)).append("\n");
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
