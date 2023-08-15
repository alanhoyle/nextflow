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
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Task state as defined by the server.   - &#x60;UNKNOWN&#x60;: The state of the task is unknown. The cause for this status   message may be dependent on the underlying system. The &#x60;UNKNOWN&#x60; states   provides a safe default for messages where this field is missing so   that a missing field does not accidentally imply that   the state is QUEUED.  - &#x60;QUEUED&#x60;: The task is queued and awaiting resources to begin computing.  - &#x60;INITIALIZING&#x60;: The task has been assigned to a worker and is currently preparing to run. For example, the worker may be turning on, downloading input files, etc.  - &#x60;RUNNING&#x60;: The task is running. Input files are downloaded and the first Executor has been started.  - &#x60;PAUSED&#x60;: The task is paused. The reasons for this would be tied to   the specific system running the job. An implementation may have the ability   to pause a task, but this is not required.  - &#x60;COMPLETE&#x60;: The task has completed running. Executors have exited without error and output files have been successfully uploaded.  - &#x60;EXECUTOR_ERROR&#x60;: The task encountered an error in one of the Executor processes. Generally, this means that an Executor exited with a non-zero exit code.  - &#x60;SYSTEM_ERROR&#x60;: The task was stopped due to a system error, but not from an Executor, for example an upload failed due to network issues, the worker&#x27;s ran out of disk space, etc.  - &#x60;CANCELED&#x60;: The task was canceled by the user, and downstream resources have been deleted.  - &#x60;CANCELING&#x60;: The task was canceled by the user, but the downstream resources are still awaiting deletion.  - &#x60;PREEMPTED&#x60;: The task is stopped (preempted) by the system. The reasons for this would be tied to the specific system running the job. Generally, this means that the system reclaimed the compute capacity for reallocation.
 */
@JsonAdapter(TesState.Adapter.class)
public enum TesState {
  @SerializedName("UNKNOWN")
  UNKNOWN("UNKNOWN"),
  @SerializedName("QUEUED")
  QUEUED("QUEUED"),
  @SerializedName("INITIALIZING")
  INITIALIZING("INITIALIZING"),
  @SerializedName("RUNNING")
  RUNNING("RUNNING"),
  @SerializedName("PAUSED")
  PAUSED("PAUSED"),
  @SerializedName("COMPLETE")
  COMPLETE("COMPLETE"),
  @SerializedName("EXECUTOR_ERROR")
  EXECUTOR_ERROR("EXECUTOR_ERROR"),
  @SerializedName("SYSTEM_ERROR")
  SYSTEM_ERROR("SYSTEM_ERROR"),
  @SerializedName("CANCELED")
  CANCELED("CANCELED"),
  @SerializedName("PREEMPTED")
  PREEMPTED("PREEMPTED"),
  @SerializedName("CANCELING")
  CANCELING("CANCELING");

  private String value;

  TesState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TesState fromValue(String input) {
    for (TesState b : TesState.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TesState> {
    @Override
    public void write(final JsonWriter jsonWriter, final TesState enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public TesState read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return TesState.fromValue((String)(value));
    }
  }
}
