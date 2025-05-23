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

package com.google.cloud.notebooks.v1.stub;

import static com.google.cloud.notebooks.v1.ManagedNotebookServiceClient.ListLocationsPagedResponse;
import static com.google.cloud.notebooks.v1.ManagedNotebookServiceClient.ListRuntimesPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ObsoleteApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.grpc.ProtoOperationTransformers;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.longrunning.OperationTimedPollAlgorithm;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.cloud.notebooks.v1.CreateRuntimeRequest;
import com.google.cloud.notebooks.v1.DeleteRuntimeRequest;
import com.google.cloud.notebooks.v1.DiagnoseRuntimeRequest;
import com.google.cloud.notebooks.v1.GetRuntimeRequest;
import com.google.cloud.notebooks.v1.ListRuntimesRequest;
import com.google.cloud.notebooks.v1.ListRuntimesResponse;
import com.google.cloud.notebooks.v1.OperationMetadata;
import com.google.cloud.notebooks.v1.RefreshRuntimeTokenInternalRequest;
import com.google.cloud.notebooks.v1.RefreshRuntimeTokenInternalResponse;
import com.google.cloud.notebooks.v1.ReportRuntimeEventRequest;
import com.google.cloud.notebooks.v1.ResetRuntimeRequest;
import com.google.cloud.notebooks.v1.Runtime;
import com.google.cloud.notebooks.v1.StartRuntimeRequest;
import com.google.cloud.notebooks.v1.StopRuntimeRequest;
import com.google.cloud.notebooks.v1.SwitchRuntimeRequest;
import com.google.cloud.notebooks.v1.UpdateRuntimeRequest;
import com.google.cloud.notebooks.v1.UpgradeRuntimeRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link ManagedNotebookServiceStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (notebooks.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the
 * [RetrySettings](https://cloud.google.com/java/docs/reference/gax/latest/com.google.api.gax.retrying.RetrySettings)
 * of getRuntime:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * ManagedNotebookServiceStubSettings.Builder managedNotebookServiceSettingsBuilder =
 *     ManagedNotebookServiceStubSettings.newBuilder();
 * managedNotebookServiceSettingsBuilder
 *     .getRuntimeSettings()
 *     .setRetrySettings(
 *         managedNotebookServiceSettingsBuilder
 *             .getRuntimeSettings()
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
 * ManagedNotebookServiceStubSettings managedNotebookServiceSettings =
 *     managedNotebookServiceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 *
 * <p>To configure the RetrySettings of a Long Running Operation method, create an
 * OperationTimedPollAlgorithm object and update the RPC's polling algorithm. For example, to
 * configure the RetrySettings for createRuntime:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * ManagedNotebookServiceStubSettings.Builder managedNotebookServiceSettingsBuilder =
 *     ManagedNotebookServiceStubSettings.newBuilder();
 * TimedRetryAlgorithm timedRetryAlgorithm =
 *     OperationalTimedPollAlgorithm.create(
 *         RetrySettings.newBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofMillis(500))
 *             .setRetryDelayMultiplier(1.5)
 *             .setMaxRetryDelayDuration(Duration.ofMillis(5000))
 *             .setTotalTimeoutDuration(Duration.ofHours(24))
 *             .build());
 * managedNotebookServiceSettingsBuilder
 *     .createClusterOperationSettings()
 *     .setPollingAlgorithm(timedRetryAlgorithm)
 *     .build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class ManagedNotebookServiceStubSettings
    extends StubSettings<ManagedNotebookServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final PagedCallSettings<
          ListRuntimesRequest, ListRuntimesResponse, ListRuntimesPagedResponse>
      listRuntimesSettings;
  private final UnaryCallSettings<GetRuntimeRequest, Runtime> getRuntimeSettings;
  private final UnaryCallSettings<CreateRuntimeRequest, Operation> createRuntimeSettings;
  private final OperationCallSettings<CreateRuntimeRequest, Runtime, OperationMetadata>
      createRuntimeOperationSettings;
  private final UnaryCallSettings<UpdateRuntimeRequest, Operation> updateRuntimeSettings;
  private final OperationCallSettings<UpdateRuntimeRequest, Runtime, OperationMetadata>
      updateRuntimeOperationSettings;
  private final UnaryCallSettings<DeleteRuntimeRequest, Operation> deleteRuntimeSettings;
  private final OperationCallSettings<DeleteRuntimeRequest, Empty, OperationMetadata>
      deleteRuntimeOperationSettings;
  private final UnaryCallSettings<StartRuntimeRequest, Operation> startRuntimeSettings;
  private final OperationCallSettings<StartRuntimeRequest, Runtime, OperationMetadata>
      startRuntimeOperationSettings;
  private final UnaryCallSettings<StopRuntimeRequest, Operation> stopRuntimeSettings;
  private final OperationCallSettings<StopRuntimeRequest, Runtime, OperationMetadata>
      stopRuntimeOperationSettings;
  private final UnaryCallSettings<SwitchRuntimeRequest, Operation> switchRuntimeSettings;
  private final OperationCallSettings<SwitchRuntimeRequest, Runtime, OperationMetadata>
      switchRuntimeOperationSettings;
  private final UnaryCallSettings<ResetRuntimeRequest, Operation> resetRuntimeSettings;
  private final OperationCallSettings<ResetRuntimeRequest, Runtime, OperationMetadata>
      resetRuntimeOperationSettings;
  private final UnaryCallSettings<UpgradeRuntimeRequest, Operation> upgradeRuntimeSettings;
  private final OperationCallSettings<UpgradeRuntimeRequest, Runtime, OperationMetadata>
      upgradeRuntimeOperationSettings;
  private final UnaryCallSettings<ReportRuntimeEventRequest, Operation> reportRuntimeEventSettings;
  private final OperationCallSettings<ReportRuntimeEventRequest, Runtime, OperationMetadata>
      reportRuntimeEventOperationSettings;
  private final UnaryCallSettings<
          RefreshRuntimeTokenInternalRequest, RefreshRuntimeTokenInternalResponse>
      refreshRuntimeTokenInternalSettings;
  private final UnaryCallSettings<DiagnoseRuntimeRequest, Operation> diagnoseRuntimeSettings;
  private final OperationCallSettings<DiagnoseRuntimeRequest, Runtime, OperationMetadata>
      diagnoseRuntimeOperationSettings;
  private final PagedCallSettings<
          ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      listLocationsSettings;
  private final UnaryCallSettings<GetLocationRequest, Location> getLocationSettings;
  private final UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings;
  private final UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings;
  private final UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings;

  private static final PagedListDescriptor<ListRuntimesRequest, ListRuntimesResponse, Runtime>
      LIST_RUNTIMES_PAGE_STR_DESC =
          new PagedListDescriptor<ListRuntimesRequest, ListRuntimesResponse, Runtime>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListRuntimesRequest injectToken(ListRuntimesRequest payload, String token) {
              return ListRuntimesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListRuntimesRequest injectPageSize(ListRuntimesRequest payload, int pageSize) {
              return ListRuntimesRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListRuntimesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListRuntimesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Runtime> extractResources(ListRuntimesResponse payload) {
              return payload.getRuntimesList();
            }
          };

  private static final PagedListDescriptor<ListLocationsRequest, ListLocationsResponse, Location>
      LIST_LOCATIONS_PAGE_STR_DESC =
          new PagedListDescriptor<ListLocationsRequest, ListLocationsResponse, Location>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListLocationsRequest injectToken(ListLocationsRequest payload, String token) {
              return ListLocationsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListLocationsRequest injectPageSize(ListLocationsRequest payload, int pageSize) {
              return ListLocationsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListLocationsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListLocationsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Location> extractResources(ListLocationsResponse payload) {
              return payload.getLocationsList();
            }
          };

  private static final PagedListResponseFactory<
          ListRuntimesRequest, ListRuntimesResponse, ListRuntimesPagedResponse>
      LIST_RUNTIMES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListRuntimesRequest, ListRuntimesResponse, ListRuntimesPagedResponse>() {
            @Override
            public ApiFuture<ListRuntimesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListRuntimesRequest, ListRuntimesResponse> callable,
                ListRuntimesRequest request,
                ApiCallContext context,
                ApiFuture<ListRuntimesResponse> futureResponse) {
              PageContext<ListRuntimesRequest, ListRuntimesResponse, Runtime> pageContext =
                  PageContext.create(callable, LIST_RUNTIMES_PAGE_STR_DESC, request, context);
              return ListRuntimesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      LIST_LOCATIONS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>() {
            @Override
            public ApiFuture<ListLocationsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListLocationsRequest, ListLocationsResponse> callable,
                ListLocationsRequest request,
                ApiCallContext context,
                ApiFuture<ListLocationsResponse> futureResponse) {
              PageContext<ListLocationsRequest, ListLocationsResponse, Location> pageContext =
                  PageContext.create(callable, LIST_LOCATIONS_PAGE_STR_DESC, request, context);
              return ListLocationsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to listRuntimes. */
  public PagedCallSettings<ListRuntimesRequest, ListRuntimesResponse, ListRuntimesPagedResponse>
      listRuntimesSettings() {
    return listRuntimesSettings;
  }

  /** Returns the object with the settings used for calls to getRuntime. */
  public UnaryCallSettings<GetRuntimeRequest, Runtime> getRuntimeSettings() {
    return getRuntimeSettings;
  }

  /** Returns the object with the settings used for calls to createRuntime. */
  public UnaryCallSettings<CreateRuntimeRequest, Operation> createRuntimeSettings() {
    return createRuntimeSettings;
  }

  /** Returns the object with the settings used for calls to createRuntime. */
  public OperationCallSettings<CreateRuntimeRequest, Runtime, OperationMetadata>
      createRuntimeOperationSettings() {
    return createRuntimeOperationSettings;
  }

  /** Returns the object with the settings used for calls to updateRuntime. */
  public UnaryCallSettings<UpdateRuntimeRequest, Operation> updateRuntimeSettings() {
    return updateRuntimeSettings;
  }

  /** Returns the object with the settings used for calls to updateRuntime. */
  public OperationCallSettings<UpdateRuntimeRequest, Runtime, OperationMetadata>
      updateRuntimeOperationSettings() {
    return updateRuntimeOperationSettings;
  }

  /** Returns the object with the settings used for calls to deleteRuntime. */
  public UnaryCallSettings<DeleteRuntimeRequest, Operation> deleteRuntimeSettings() {
    return deleteRuntimeSettings;
  }

  /** Returns the object with the settings used for calls to deleteRuntime. */
  public OperationCallSettings<DeleteRuntimeRequest, Empty, OperationMetadata>
      deleteRuntimeOperationSettings() {
    return deleteRuntimeOperationSettings;
  }

  /** Returns the object with the settings used for calls to startRuntime. */
  public UnaryCallSettings<StartRuntimeRequest, Operation> startRuntimeSettings() {
    return startRuntimeSettings;
  }

  /** Returns the object with the settings used for calls to startRuntime. */
  public OperationCallSettings<StartRuntimeRequest, Runtime, OperationMetadata>
      startRuntimeOperationSettings() {
    return startRuntimeOperationSettings;
  }

  /** Returns the object with the settings used for calls to stopRuntime. */
  public UnaryCallSettings<StopRuntimeRequest, Operation> stopRuntimeSettings() {
    return stopRuntimeSettings;
  }

  /** Returns the object with the settings used for calls to stopRuntime. */
  public OperationCallSettings<StopRuntimeRequest, Runtime, OperationMetadata>
      stopRuntimeOperationSettings() {
    return stopRuntimeOperationSettings;
  }

  /** Returns the object with the settings used for calls to switchRuntime. */
  public UnaryCallSettings<SwitchRuntimeRequest, Operation> switchRuntimeSettings() {
    return switchRuntimeSettings;
  }

  /** Returns the object with the settings used for calls to switchRuntime. */
  public OperationCallSettings<SwitchRuntimeRequest, Runtime, OperationMetadata>
      switchRuntimeOperationSettings() {
    return switchRuntimeOperationSettings;
  }

  /** Returns the object with the settings used for calls to resetRuntime. */
  public UnaryCallSettings<ResetRuntimeRequest, Operation> resetRuntimeSettings() {
    return resetRuntimeSettings;
  }

  /** Returns the object with the settings used for calls to resetRuntime. */
  public OperationCallSettings<ResetRuntimeRequest, Runtime, OperationMetadata>
      resetRuntimeOperationSettings() {
    return resetRuntimeOperationSettings;
  }

  /** Returns the object with the settings used for calls to upgradeRuntime. */
  public UnaryCallSettings<UpgradeRuntimeRequest, Operation> upgradeRuntimeSettings() {
    return upgradeRuntimeSettings;
  }

  /** Returns the object with the settings used for calls to upgradeRuntime. */
  public OperationCallSettings<UpgradeRuntimeRequest, Runtime, OperationMetadata>
      upgradeRuntimeOperationSettings() {
    return upgradeRuntimeOperationSettings;
  }

  /** Returns the object with the settings used for calls to reportRuntimeEvent. */
  public UnaryCallSettings<ReportRuntimeEventRequest, Operation> reportRuntimeEventSettings() {
    return reportRuntimeEventSettings;
  }

  /** Returns the object with the settings used for calls to reportRuntimeEvent. */
  public OperationCallSettings<ReportRuntimeEventRequest, Runtime, OperationMetadata>
      reportRuntimeEventOperationSettings() {
    return reportRuntimeEventOperationSettings;
  }

  /** Returns the object with the settings used for calls to refreshRuntimeTokenInternal. */
  public UnaryCallSettings<RefreshRuntimeTokenInternalRequest, RefreshRuntimeTokenInternalResponse>
      refreshRuntimeTokenInternalSettings() {
    return refreshRuntimeTokenInternalSettings;
  }

  /** Returns the object with the settings used for calls to diagnoseRuntime. */
  public UnaryCallSettings<DiagnoseRuntimeRequest, Operation> diagnoseRuntimeSettings() {
    return diagnoseRuntimeSettings;
  }

  /** Returns the object with the settings used for calls to diagnoseRuntime. */
  public OperationCallSettings<DiagnoseRuntimeRequest, Runtime, OperationMetadata>
      diagnoseRuntimeOperationSettings() {
    return diagnoseRuntimeOperationSettings;
  }

  /** Returns the object with the settings used for calls to listLocations. */
  public PagedCallSettings<ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      listLocationsSettings() {
    return listLocationsSettings;
  }

  /** Returns the object with the settings used for calls to getLocation. */
  public UnaryCallSettings<GetLocationRequest, Location> getLocationSettings() {
    return getLocationSettings;
  }

  /** Returns the object with the settings used for calls to setIamPolicy. */
  public UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings() {
    return setIamPolicySettings;
  }

  /** Returns the object with the settings used for calls to getIamPolicy. */
  public UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings() {
    return getIamPolicySettings;
  }

  /** Returns the object with the settings used for calls to testIamPermissions. */
  public UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings() {
    return testIamPermissionsSettings;
  }

  public ManagedNotebookServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcManagedNotebookServiceStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns the default service name. */
  @Override
  public String getServiceName() {
    return "notebooks";
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  @ObsoleteApi("Use getEndpoint() instead")
  public static String getDefaultEndpoint() {
    return "notebooks.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "notebooks.mtls.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder()
        .setScopesToApply(DEFAULT_SERVICE_SCOPES)
        .setUseJwtAccessWithScope(true);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(ManagedNotebookServiceStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected ManagedNotebookServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    listRuntimesSettings = settingsBuilder.listRuntimesSettings().build();
    getRuntimeSettings = settingsBuilder.getRuntimeSettings().build();
    createRuntimeSettings = settingsBuilder.createRuntimeSettings().build();
    createRuntimeOperationSettings = settingsBuilder.createRuntimeOperationSettings().build();
    updateRuntimeSettings = settingsBuilder.updateRuntimeSettings().build();
    updateRuntimeOperationSettings = settingsBuilder.updateRuntimeOperationSettings().build();
    deleteRuntimeSettings = settingsBuilder.deleteRuntimeSettings().build();
    deleteRuntimeOperationSettings = settingsBuilder.deleteRuntimeOperationSettings().build();
    startRuntimeSettings = settingsBuilder.startRuntimeSettings().build();
    startRuntimeOperationSettings = settingsBuilder.startRuntimeOperationSettings().build();
    stopRuntimeSettings = settingsBuilder.stopRuntimeSettings().build();
    stopRuntimeOperationSettings = settingsBuilder.stopRuntimeOperationSettings().build();
    switchRuntimeSettings = settingsBuilder.switchRuntimeSettings().build();
    switchRuntimeOperationSettings = settingsBuilder.switchRuntimeOperationSettings().build();
    resetRuntimeSettings = settingsBuilder.resetRuntimeSettings().build();
    resetRuntimeOperationSettings = settingsBuilder.resetRuntimeOperationSettings().build();
    upgradeRuntimeSettings = settingsBuilder.upgradeRuntimeSettings().build();
    upgradeRuntimeOperationSettings = settingsBuilder.upgradeRuntimeOperationSettings().build();
    reportRuntimeEventSettings = settingsBuilder.reportRuntimeEventSettings().build();
    reportRuntimeEventOperationSettings =
        settingsBuilder.reportRuntimeEventOperationSettings().build();
    refreshRuntimeTokenInternalSettings =
        settingsBuilder.refreshRuntimeTokenInternalSettings().build();
    diagnoseRuntimeSettings = settingsBuilder.diagnoseRuntimeSettings().build();
    diagnoseRuntimeOperationSettings = settingsBuilder.diagnoseRuntimeOperationSettings().build();
    listLocationsSettings = settingsBuilder.listLocationsSettings().build();
    getLocationSettings = settingsBuilder.getLocationSettings().build();
    setIamPolicySettings = settingsBuilder.setIamPolicySettings().build();
    getIamPolicySettings = settingsBuilder.getIamPolicySettings().build();
    testIamPermissionsSettings = settingsBuilder.testIamPermissionsSettings().build();
  }

  /** Builder for ManagedNotebookServiceStubSettings. */
  public static class Builder
      extends StubSettings.Builder<ManagedNotebookServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final PagedCallSettings.Builder<
            ListRuntimesRequest, ListRuntimesResponse, ListRuntimesPagedResponse>
        listRuntimesSettings;
    private final UnaryCallSettings.Builder<GetRuntimeRequest, Runtime> getRuntimeSettings;
    private final UnaryCallSettings.Builder<CreateRuntimeRequest, Operation> createRuntimeSettings;
    private final OperationCallSettings.Builder<CreateRuntimeRequest, Runtime, OperationMetadata>
        createRuntimeOperationSettings;
    private final UnaryCallSettings.Builder<UpdateRuntimeRequest, Operation> updateRuntimeSettings;
    private final OperationCallSettings.Builder<UpdateRuntimeRequest, Runtime, OperationMetadata>
        updateRuntimeOperationSettings;
    private final UnaryCallSettings.Builder<DeleteRuntimeRequest, Operation> deleteRuntimeSettings;
    private final OperationCallSettings.Builder<DeleteRuntimeRequest, Empty, OperationMetadata>
        deleteRuntimeOperationSettings;
    private final UnaryCallSettings.Builder<StartRuntimeRequest, Operation> startRuntimeSettings;
    private final OperationCallSettings.Builder<StartRuntimeRequest, Runtime, OperationMetadata>
        startRuntimeOperationSettings;
    private final UnaryCallSettings.Builder<StopRuntimeRequest, Operation> stopRuntimeSettings;
    private final OperationCallSettings.Builder<StopRuntimeRequest, Runtime, OperationMetadata>
        stopRuntimeOperationSettings;
    private final UnaryCallSettings.Builder<SwitchRuntimeRequest, Operation> switchRuntimeSettings;
    private final OperationCallSettings.Builder<SwitchRuntimeRequest, Runtime, OperationMetadata>
        switchRuntimeOperationSettings;
    private final UnaryCallSettings.Builder<ResetRuntimeRequest, Operation> resetRuntimeSettings;
    private final OperationCallSettings.Builder<ResetRuntimeRequest, Runtime, OperationMetadata>
        resetRuntimeOperationSettings;
    private final UnaryCallSettings.Builder<UpgradeRuntimeRequest, Operation>
        upgradeRuntimeSettings;
    private final OperationCallSettings.Builder<UpgradeRuntimeRequest, Runtime, OperationMetadata>
        upgradeRuntimeOperationSettings;
    private final UnaryCallSettings.Builder<ReportRuntimeEventRequest, Operation>
        reportRuntimeEventSettings;
    private final OperationCallSettings.Builder<
            ReportRuntimeEventRequest, Runtime, OperationMetadata>
        reportRuntimeEventOperationSettings;
    private final UnaryCallSettings.Builder<
            RefreshRuntimeTokenInternalRequest, RefreshRuntimeTokenInternalResponse>
        refreshRuntimeTokenInternalSettings;
    private final UnaryCallSettings.Builder<DiagnoseRuntimeRequest, Operation>
        diagnoseRuntimeSettings;
    private final OperationCallSettings.Builder<DiagnoseRuntimeRequest, Runtime, OperationMetadata>
        diagnoseRuntimeOperationSettings;
    private final PagedCallSettings.Builder<
            ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
        listLocationsSettings;
    private final UnaryCallSettings.Builder<GetLocationRequest, Location> getLocationSettings;
    private final UnaryCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicySettings;
    private final UnaryCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicySettings;
    private final UnaryCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "no_retry_1_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      definitions.put(
          "retry_policy_0_codes",
          ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList(StatusCode.Code.UNAVAILABLE)));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeoutDuration(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(60000L))
              .setTotalTimeoutDuration(Duration.ofMillis(60000L))
              .build();
      definitions.put("no_retry_1_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelayDuration(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelayDuration(Duration.ofMillis(60000L))
              .setInitialRpcTimeoutDuration(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(60000L))
              .setTotalTimeoutDuration(Duration.ofMillis(60000L))
              .build();
      definitions.put("retry_policy_0_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      listRuntimesSettings = PagedCallSettings.newBuilder(LIST_RUNTIMES_PAGE_STR_FACT);
      getRuntimeSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createRuntimeSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createRuntimeOperationSettings = OperationCallSettings.newBuilder();
      updateRuntimeSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateRuntimeOperationSettings = OperationCallSettings.newBuilder();
      deleteRuntimeSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteRuntimeOperationSettings = OperationCallSettings.newBuilder();
      startRuntimeSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      startRuntimeOperationSettings = OperationCallSettings.newBuilder();
      stopRuntimeSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      stopRuntimeOperationSettings = OperationCallSettings.newBuilder();
      switchRuntimeSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      switchRuntimeOperationSettings = OperationCallSettings.newBuilder();
      resetRuntimeSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      resetRuntimeOperationSettings = OperationCallSettings.newBuilder();
      upgradeRuntimeSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      upgradeRuntimeOperationSettings = OperationCallSettings.newBuilder();
      reportRuntimeEventSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      reportRuntimeEventOperationSettings = OperationCallSettings.newBuilder();
      refreshRuntimeTokenInternalSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      diagnoseRuntimeSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      diagnoseRuntimeOperationSettings = OperationCallSettings.newBuilder();
      listLocationsSettings = PagedCallSettings.newBuilder(LIST_LOCATIONS_PAGE_STR_FACT);
      getLocationSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      setIamPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getIamPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      testIamPermissionsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listRuntimesSettings,
              getRuntimeSettings,
              createRuntimeSettings,
              updateRuntimeSettings,
              deleteRuntimeSettings,
              startRuntimeSettings,
              stopRuntimeSettings,
              switchRuntimeSettings,
              resetRuntimeSettings,
              upgradeRuntimeSettings,
              reportRuntimeEventSettings,
              refreshRuntimeTokenInternalSettings,
              diagnoseRuntimeSettings,
              listLocationsSettings,
              getLocationSettings,
              setIamPolicySettings,
              getIamPolicySettings,
              testIamPermissionsSettings);
      initDefaults(this);
    }

    protected Builder(ManagedNotebookServiceStubSettings settings) {
      super(settings);

      listRuntimesSettings = settings.listRuntimesSettings.toBuilder();
      getRuntimeSettings = settings.getRuntimeSettings.toBuilder();
      createRuntimeSettings = settings.createRuntimeSettings.toBuilder();
      createRuntimeOperationSettings = settings.createRuntimeOperationSettings.toBuilder();
      updateRuntimeSettings = settings.updateRuntimeSettings.toBuilder();
      updateRuntimeOperationSettings = settings.updateRuntimeOperationSettings.toBuilder();
      deleteRuntimeSettings = settings.deleteRuntimeSettings.toBuilder();
      deleteRuntimeOperationSettings = settings.deleteRuntimeOperationSettings.toBuilder();
      startRuntimeSettings = settings.startRuntimeSettings.toBuilder();
      startRuntimeOperationSettings = settings.startRuntimeOperationSettings.toBuilder();
      stopRuntimeSettings = settings.stopRuntimeSettings.toBuilder();
      stopRuntimeOperationSettings = settings.stopRuntimeOperationSettings.toBuilder();
      switchRuntimeSettings = settings.switchRuntimeSettings.toBuilder();
      switchRuntimeOperationSettings = settings.switchRuntimeOperationSettings.toBuilder();
      resetRuntimeSettings = settings.resetRuntimeSettings.toBuilder();
      resetRuntimeOperationSettings = settings.resetRuntimeOperationSettings.toBuilder();
      upgradeRuntimeSettings = settings.upgradeRuntimeSettings.toBuilder();
      upgradeRuntimeOperationSettings = settings.upgradeRuntimeOperationSettings.toBuilder();
      reportRuntimeEventSettings = settings.reportRuntimeEventSettings.toBuilder();
      reportRuntimeEventOperationSettings =
          settings.reportRuntimeEventOperationSettings.toBuilder();
      refreshRuntimeTokenInternalSettings =
          settings.refreshRuntimeTokenInternalSettings.toBuilder();
      diagnoseRuntimeSettings = settings.diagnoseRuntimeSettings.toBuilder();
      diagnoseRuntimeOperationSettings = settings.diagnoseRuntimeOperationSettings.toBuilder();
      listLocationsSettings = settings.listLocationsSettings.toBuilder();
      getLocationSettings = settings.getLocationSettings.toBuilder();
      setIamPolicySettings = settings.setIamPolicySettings.toBuilder();
      getIamPolicySettings = settings.getIamPolicySettings.toBuilder();
      testIamPermissionsSettings = settings.testIamPermissionsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listRuntimesSettings,
              getRuntimeSettings,
              createRuntimeSettings,
              updateRuntimeSettings,
              deleteRuntimeSettings,
              startRuntimeSettings,
              stopRuntimeSettings,
              switchRuntimeSettings,
              resetRuntimeSettings,
              upgradeRuntimeSettings,
              reportRuntimeEventSettings,
              refreshRuntimeTokenInternalSettings,
              diagnoseRuntimeSettings,
              listLocationsSettings,
              getLocationSettings,
              setIamPolicySettings,
              getIamPolicySettings,
              testIamPermissionsSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .listRuntimesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .getRuntimeSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .createRuntimeSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .updateRuntimeSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .deleteRuntimeSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .startRuntimeSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .stopRuntimeSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .switchRuntimeSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .resetRuntimeSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .upgradeRuntimeSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .reportRuntimeEventSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .refreshRuntimeTokenInternalSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .diagnoseRuntimeSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .listLocationsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getLocationSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .setIamPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getIamPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .testIamPermissionsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createRuntimeOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<CreateRuntimeRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Runtime.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      builder
          .updateRuntimeOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<UpdateRuntimeRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Runtime.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      builder
          .deleteRuntimeOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteRuntimeRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      builder
          .startRuntimeOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<StartRuntimeRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Runtime.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      builder
          .stopRuntimeOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings.<StopRuntimeRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Runtime.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      builder
          .switchRuntimeOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<SwitchRuntimeRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Runtime.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      builder
          .resetRuntimeOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<ResetRuntimeRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Runtime.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      builder
          .upgradeRuntimeOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<UpgradeRuntimeRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Runtime.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      builder
          .reportRuntimeEventOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<ReportRuntimeEventRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Runtime.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      builder
          .diagnoseRuntimeOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DiagnoseRuntimeRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Runtime.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      return builder;
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to listRuntimes. */
    public PagedCallSettings.Builder<
            ListRuntimesRequest, ListRuntimesResponse, ListRuntimesPagedResponse>
        listRuntimesSettings() {
      return listRuntimesSettings;
    }

    /** Returns the builder for the settings used for calls to getRuntime. */
    public UnaryCallSettings.Builder<GetRuntimeRequest, Runtime> getRuntimeSettings() {
      return getRuntimeSettings;
    }

    /** Returns the builder for the settings used for calls to createRuntime. */
    public UnaryCallSettings.Builder<CreateRuntimeRequest, Operation> createRuntimeSettings() {
      return createRuntimeSettings;
    }

    /** Returns the builder for the settings used for calls to createRuntime. */
    public OperationCallSettings.Builder<CreateRuntimeRequest, Runtime, OperationMetadata>
        createRuntimeOperationSettings() {
      return createRuntimeOperationSettings;
    }

    /** Returns the builder for the settings used for calls to updateRuntime. */
    public UnaryCallSettings.Builder<UpdateRuntimeRequest, Operation> updateRuntimeSettings() {
      return updateRuntimeSettings;
    }

    /** Returns the builder for the settings used for calls to updateRuntime. */
    public OperationCallSettings.Builder<UpdateRuntimeRequest, Runtime, OperationMetadata>
        updateRuntimeOperationSettings() {
      return updateRuntimeOperationSettings;
    }

    /** Returns the builder for the settings used for calls to deleteRuntime. */
    public UnaryCallSettings.Builder<DeleteRuntimeRequest, Operation> deleteRuntimeSettings() {
      return deleteRuntimeSettings;
    }

    /** Returns the builder for the settings used for calls to deleteRuntime. */
    public OperationCallSettings.Builder<DeleteRuntimeRequest, Empty, OperationMetadata>
        deleteRuntimeOperationSettings() {
      return deleteRuntimeOperationSettings;
    }

    /** Returns the builder for the settings used for calls to startRuntime. */
    public UnaryCallSettings.Builder<StartRuntimeRequest, Operation> startRuntimeSettings() {
      return startRuntimeSettings;
    }

    /** Returns the builder for the settings used for calls to startRuntime. */
    public OperationCallSettings.Builder<StartRuntimeRequest, Runtime, OperationMetadata>
        startRuntimeOperationSettings() {
      return startRuntimeOperationSettings;
    }

    /** Returns the builder for the settings used for calls to stopRuntime. */
    public UnaryCallSettings.Builder<StopRuntimeRequest, Operation> stopRuntimeSettings() {
      return stopRuntimeSettings;
    }

    /** Returns the builder for the settings used for calls to stopRuntime. */
    public OperationCallSettings.Builder<StopRuntimeRequest, Runtime, OperationMetadata>
        stopRuntimeOperationSettings() {
      return stopRuntimeOperationSettings;
    }

    /** Returns the builder for the settings used for calls to switchRuntime. */
    public UnaryCallSettings.Builder<SwitchRuntimeRequest, Operation> switchRuntimeSettings() {
      return switchRuntimeSettings;
    }

    /** Returns the builder for the settings used for calls to switchRuntime. */
    public OperationCallSettings.Builder<SwitchRuntimeRequest, Runtime, OperationMetadata>
        switchRuntimeOperationSettings() {
      return switchRuntimeOperationSettings;
    }

    /** Returns the builder for the settings used for calls to resetRuntime. */
    public UnaryCallSettings.Builder<ResetRuntimeRequest, Operation> resetRuntimeSettings() {
      return resetRuntimeSettings;
    }

    /** Returns the builder for the settings used for calls to resetRuntime. */
    public OperationCallSettings.Builder<ResetRuntimeRequest, Runtime, OperationMetadata>
        resetRuntimeOperationSettings() {
      return resetRuntimeOperationSettings;
    }

    /** Returns the builder for the settings used for calls to upgradeRuntime. */
    public UnaryCallSettings.Builder<UpgradeRuntimeRequest, Operation> upgradeRuntimeSettings() {
      return upgradeRuntimeSettings;
    }

    /** Returns the builder for the settings used for calls to upgradeRuntime. */
    public OperationCallSettings.Builder<UpgradeRuntimeRequest, Runtime, OperationMetadata>
        upgradeRuntimeOperationSettings() {
      return upgradeRuntimeOperationSettings;
    }

    /** Returns the builder for the settings used for calls to reportRuntimeEvent. */
    public UnaryCallSettings.Builder<ReportRuntimeEventRequest, Operation>
        reportRuntimeEventSettings() {
      return reportRuntimeEventSettings;
    }

    /** Returns the builder for the settings used for calls to reportRuntimeEvent. */
    public OperationCallSettings.Builder<ReportRuntimeEventRequest, Runtime, OperationMetadata>
        reportRuntimeEventOperationSettings() {
      return reportRuntimeEventOperationSettings;
    }

    /** Returns the builder for the settings used for calls to refreshRuntimeTokenInternal. */
    public UnaryCallSettings.Builder<
            RefreshRuntimeTokenInternalRequest, RefreshRuntimeTokenInternalResponse>
        refreshRuntimeTokenInternalSettings() {
      return refreshRuntimeTokenInternalSettings;
    }

    /** Returns the builder for the settings used for calls to diagnoseRuntime. */
    public UnaryCallSettings.Builder<DiagnoseRuntimeRequest, Operation> diagnoseRuntimeSettings() {
      return diagnoseRuntimeSettings;
    }

    /** Returns the builder for the settings used for calls to diagnoseRuntime. */
    public OperationCallSettings.Builder<DiagnoseRuntimeRequest, Runtime, OperationMetadata>
        diagnoseRuntimeOperationSettings() {
      return diagnoseRuntimeOperationSettings;
    }

    /** Returns the builder for the settings used for calls to listLocations. */
    public PagedCallSettings.Builder<
            ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
        listLocationsSettings() {
      return listLocationsSettings;
    }

    /** Returns the builder for the settings used for calls to getLocation. */
    public UnaryCallSettings.Builder<GetLocationRequest, Location> getLocationSettings() {
      return getLocationSettings;
    }

    /** Returns the builder for the settings used for calls to setIamPolicy. */
    public UnaryCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicySettings() {
      return setIamPolicySettings;
    }

    /** Returns the builder for the settings used for calls to getIamPolicy. */
    public UnaryCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicySettings() {
      return getIamPolicySettings;
    }

    /** Returns the builder for the settings used for calls to testIamPermissions. */
    public UnaryCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsSettings() {
      return testIamPermissionsSettings;
    }

    @Override
    public ManagedNotebookServiceStubSettings build() throws IOException {
      return new ManagedNotebookServiceStubSettings(this);
    }
  }
}
