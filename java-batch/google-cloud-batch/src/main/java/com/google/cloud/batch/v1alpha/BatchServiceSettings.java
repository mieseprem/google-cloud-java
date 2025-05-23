/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.batch.v1alpha;

import static com.google.cloud.batch.v1alpha.BatchServiceClient.ListJobsPagedResponse;
import static com.google.cloud.batch.v1alpha.BatchServiceClient.ListLocationsPagedResponse;
import static com.google.cloud.batch.v1alpha.BatchServiceClient.ListResourceAllowancesPagedResponse;
import static com.google.cloud.batch.v1alpha.BatchServiceClient.ListTasksPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.batch.v1alpha.stub.BatchServiceStubSettings;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link BatchServiceClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (batch.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the
 * [RetrySettings](https://cloud.google.com/java/docs/reference/gax/latest/com.google.api.gax.retrying.RetrySettings)
 * of createJob:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * BatchServiceSettings.Builder batchServiceSettingsBuilder = BatchServiceSettings.newBuilder();
 * batchServiceSettingsBuilder
 *     .createJobSettings()
 *     .setRetrySettings(
 *         batchServiceSettingsBuilder
 *             .createJobSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofSeconds(1))
 *             .setInitialRpcTimeoutDuration(Duration.ofSeconds(5))
 *             .setMaxAttempts(5)
 *             .setMaxRetryDelayDuration(Duration.ofSeconds(30))
 *             .setMaxRpcTimeoutDuration(Duration.ofSeconds(60))
 *             .setRetryDelayMultiplier(1.3)
 *             .setRpcTimeoutMultiplier(1.5)
 *             .setTotalTimeoutDuration(Duration.ofSeconds(300))
 *             .build());
 * BatchServiceSettings batchServiceSettings = batchServiceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 *
 * <p>To configure the RetrySettings of a Long Running Operation method, create an
 * OperationTimedPollAlgorithm object and update the RPC's polling algorithm. For example, to
 * configure the RetrySettings for deleteJob:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * BatchServiceSettings.Builder batchServiceSettingsBuilder = BatchServiceSettings.newBuilder();
 * TimedRetryAlgorithm timedRetryAlgorithm =
 *     OperationalTimedPollAlgorithm.create(
 *         RetrySettings.newBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofMillis(500))
 *             .setRetryDelayMultiplier(1.5)
 *             .setMaxRetryDelayDuration(Duration.ofMillis(5000))
 *             .setTotalTimeoutDuration(Duration.ofHours(24))
 *             .build());
 * batchServiceSettingsBuilder
 *     .createClusterOperationSettings()
 *     .setPollingAlgorithm(timedRetryAlgorithm)
 *     .build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class BatchServiceSettings extends ClientSettings<BatchServiceSettings> {

  /** Returns the object with the settings used for calls to createJob. */
  public UnaryCallSettings<CreateJobRequest, Job> createJobSettings() {
    return ((BatchServiceStubSettings) getStubSettings()).createJobSettings();
  }

  /** Returns the object with the settings used for calls to getJob. */
  public UnaryCallSettings<GetJobRequest, Job> getJobSettings() {
    return ((BatchServiceStubSettings) getStubSettings()).getJobSettings();
  }

  /** Returns the object with the settings used for calls to deleteJob. */
  public UnaryCallSettings<DeleteJobRequest, Operation> deleteJobSettings() {
    return ((BatchServiceStubSettings) getStubSettings()).deleteJobSettings();
  }

  /** Returns the object with the settings used for calls to deleteJob. */
  public OperationCallSettings<DeleteJobRequest, Empty, OperationMetadata>
      deleteJobOperationSettings() {
    return ((BatchServiceStubSettings) getStubSettings()).deleteJobOperationSettings();
  }

  /** Returns the object with the settings used for calls to cancelJob. */
  public UnaryCallSettings<CancelJobRequest, Operation> cancelJobSettings() {
    return ((BatchServiceStubSettings) getStubSettings()).cancelJobSettings();
  }

  /** Returns the object with the settings used for calls to cancelJob. */
  public OperationCallSettings<CancelJobRequest, CancelJobResponse, OperationMetadata>
      cancelJobOperationSettings() {
    return ((BatchServiceStubSettings) getStubSettings()).cancelJobOperationSettings();
  }

  /** Returns the object with the settings used for calls to updateJob. */
  public UnaryCallSettings<UpdateJobRequest, Job> updateJobSettings() {
    return ((BatchServiceStubSettings) getStubSettings()).updateJobSettings();
  }

  /** Returns the object with the settings used for calls to listJobs. */
  public PagedCallSettings<ListJobsRequest, ListJobsResponse, ListJobsPagedResponse>
      listJobsSettings() {
    return ((BatchServiceStubSettings) getStubSettings()).listJobsSettings();
  }

  /** Returns the object with the settings used for calls to getTask. */
  public UnaryCallSettings<GetTaskRequest, Task> getTaskSettings() {
    return ((BatchServiceStubSettings) getStubSettings()).getTaskSettings();
  }

  /** Returns the object with the settings used for calls to listTasks. */
  public PagedCallSettings<ListTasksRequest, ListTasksResponse, ListTasksPagedResponse>
      listTasksSettings() {
    return ((BatchServiceStubSettings) getStubSettings()).listTasksSettings();
  }

  /** Returns the object with the settings used for calls to createResourceAllowance. */
  public UnaryCallSettings<CreateResourceAllowanceRequest, ResourceAllowance>
      createResourceAllowanceSettings() {
    return ((BatchServiceStubSettings) getStubSettings()).createResourceAllowanceSettings();
  }

  /** Returns the object with the settings used for calls to getResourceAllowance. */
  public UnaryCallSettings<GetResourceAllowanceRequest, ResourceAllowance>
      getResourceAllowanceSettings() {
    return ((BatchServiceStubSettings) getStubSettings()).getResourceAllowanceSettings();
  }

  /** Returns the object with the settings used for calls to deleteResourceAllowance. */
  public UnaryCallSettings<DeleteResourceAllowanceRequest, Operation>
      deleteResourceAllowanceSettings() {
    return ((BatchServiceStubSettings) getStubSettings()).deleteResourceAllowanceSettings();
  }

  /** Returns the object with the settings used for calls to deleteResourceAllowance. */
  public OperationCallSettings<DeleteResourceAllowanceRequest, Empty, OperationMetadata>
      deleteResourceAllowanceOperationSettings() {
    return ((BatchServiceStubSettings) getStubSettings())
        .deleteResourceAllowanceOperationSettings();
  }

  /** Returns the object with the settings used for calls to listResourceAllowances. */
  public PagedCallSettings<
          ListResourceAllowancesRequest,
          ListResourceAllowancesResponse,
          ListResourceAllowancesPagedResponse>
      listResourceAllowancesSettings() {
    return ((BatchServiceStubSettings) getStubSettings()).listResourceAllowancesSettings();
  }

  /** Returns the object with the settings used for calls to updateResourceAllowance. */
  public UnaryCallSettings<UpdateResourceAllowanceRequest, ResourceAllowance>
      updateResourceAllowanceSettings() {
    return ((BatchServiceStubSettings) getStubSettings()).updateResourceAllowanceSettings();
  }

  /** Returns the object with the settings used for calls to listLocations. */
  public PagedCallSettings<ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      listLocationsSettings() {
    return ((BatchServiceStubSettings) getStubSettings()).listLocationsSettings();
  }

  /** Returns the object with the settings used for calls to getLocation. */
  public UnaryCallSettings<GetLocationRequest, Location> getLocationSettings() {
    return ((BatchServiceStubSettings) getStubSettings()).getLocationSettings();
  }

  public static final BatchServiceSettings create(BatchServiceStubSettings stub)
      throws IOException {
    return new BatchServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return BatchServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return BatchServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return BatchServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return BatchServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return BatchServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  /** Returns a builder for the default REST ChannelProvider for this service. */
  @BetaApi
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return BatchServiceStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return BatchServiceStubSettings.defaultTransportChannelProvider();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return BatchServiceStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new gRPC builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new REST builder for this class. */
  public static Builder newHttpJsonBuilder() {
    return Builder.createHttpJsonDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected BatchServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for BatchServiceSettings. */
  public static class Builder extends ClientSettings.Builder<BatchServiceSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(BatchServiceStubSettings.newBuilder(clientContext));
    }

    protected Builder(BatchServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(BatchServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(BatchServiceStubSettings.newBuilder());
    }

    private static Builder createHttpJsonDefault() {
      return new Builder(BatchServiceStubSettings.newHttpJsonBuilder());
    }

    public BatchServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((BatchServiceStubSettings.Builder) getStubSettings());
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to createJob. */
    public UnaryCallSettings.Builder<CreateJobRequest, Job> createJobSettings() {
      return getStubSettingsBuilder().createJobSettings();
    }

    /** Returns the builder for the settings used for calls to getJob. */
    public UnaryCallSettings.Builder<GetJobRequest, Job> getJobSettings() {
      return getStubSettingsBuilder().getJobSettings();
    }

    /** Returns the builder for the settings used for calls to deleteJob. */
    public UnaryCallSettings.Builder<DeleteJobRequest, Operation> deleteJobSettings() {
      return getStubSettingsBuilder().deleteJobSettings();
    }

    /** Returns the builder for the settings used for calls to deleteJob. */
    public OperationCallSettings.Builder<DeleteJobRequest, Empty, OperationMetadata>
        deleteJobOperationSettings() {
      return getStubSettingsBuilder().deleteJobOperationSettings();
    }

    /** Returns the builder for the settings used for calls to cancelJob. */
    public UnaryCallSettings.Builder<CancelJobRequest, Operation> cancelJobSettings() {
      return getStubSettingsBuilder().cancelJobSettings();
    }

    /** Returns the builder for the settings used for calls to cancelJob. */
    public OperationCallSettings.Builder<CancelJobRequest, CancelJobResponse, OperationMetadata>
        cancelJobOperationSettings() {
      return getStubSettingsBuilder().cancelJobOperationSettings();
    }

    /** Returns the builder for the settings used for calls to updateJob. */
    public UnaryCallSettings.Builder<UpdateJobRequest, Job> updateJobSettings() {
      return getStubSettingsBuilder().updateJobSettings();
    }

    /** Returns the builder for the settings used for calls to listJobs. */
    public PagedCallSettings.Builder<ListJobsRequest, ListJobsResponse, ListJobsPagedResponse>
        listJobsSettings() {
      return getStubSettingsBuilder().listJobsSettings();
    }

    /** Returns the builder for the settings used for calls to getTask. */
    public UnaryCallSettings.Builder<GetTaskRequest, Task> getTaskSettings() {
      return getStubSettingsBuilder().getTaskSettings();
    }

    /** Returns the builder for the settings used for calls to listTasks. */
    public PagedCallSettings.Builder<ListTasksRequest, ListTasksResponse, ListTasksPagedResponse>
        listTasksSettings() {
      return getStubSettingsBuilder().listTasksSettings();
    }

    /** Returns the builder for the settings used for calls to createResourceAllowance. */
    public UnaryCallSettings.Builder<CreateResourceAllowanceRequest, ResourceAllowance>
        createResourceAllowanceSettings() {
      return getStubSettingsBuilder().createResourceAllowanceSettings();
    }

    /** Returns the builder for the settings used for calls to getResourceAllowance. */
    public UnaryCallSettings.Builder<GetResourceAllowanceRequest, ResourceAllowance>
        getResourceAllowanceSettings() {
      return getStubSettingsBuilder().getResourceAllowanceSettings();
    }

    /** Returns the builder for the settings used for calls to deleteResourceAllowance. */
    public UnaryCallSettings.Builder<DeleteResourceAllowanceRequest, Operation>
        deleteResourceAllowanceSettings() {
      return getStubSettingsBuilder().deleteResourceAllowanceSettings();
    }

    /** Returns the builder for the settings used for calls to deleteResourceAllowance. */
    public OperationCallSettings.Builder<DeleteResourceAllowanceRequest, Empty, OperationMetadata>
        deleteResourceAllowanceOperationSettings() {
      return getStubSettingsBuilder().deleteResourceAllowanceOperationSettings();
    }

    /** Returns the builder for the settings used for calls to listResourceAllowances. */
    public PagedCallSettings.Builder<
            ListResourceAllowancesRequest,
            ListResourceAllowancesResponse,
            ListResourceAllowancesPagedResponse>
        listResourceAllowancesSettings() {
      return getStubSettingsBuilder().listResourceAllowancesSettings();
    }

    /** Returns the builder for the settings used for calls to updateResourceAllowance. */
    public UnaryCallSettings.Builder<UpdateResourceAllowanceRequest, ResourceAllowance>
        updateResourceAllowanceSettings() {
      return getStubSettingsBuilder().updateResourceAllowanceSettings();
    }

    /** Returns the builder for the settings used for calls to listLocations. */
    public PagedCallSettings.Builder<
            ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
        listLocationsSettings() {
      return getStubSettingsBuilder().listLocationsSettings();
    }

    /** Returns the builder for the settings used for calls to getLocation. */
    public UnaryCallSettings.Builder<GetLocationRequest, Location> getLocationSettings() {
      return getStubSettingsBuilder().getLocationSettings();
    }

    @Override
    public BatchServiceSettings build() throws IOException {
      return new BatchServiceSettings(this);
    }
  }
}
