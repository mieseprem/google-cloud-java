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

package com.google.cloud.tpu.v2alpha1;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.cloud.tpu.v2alpha1.stub.TpuStub;
import com.google.cloud.tpu.v2alpha1.stub.TpuStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.longrunning.Operation;
import com.google.longrunning.OperationsClient;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Manages TPU nodes and other resources
 *
 * <p>TPU API v2alpha1
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (TpuClient tpuClient = TpuClient.create()) {
 *   NodeName name = NodeName.of("[PROJECT]", "[LOCATION]", "[NODE]");
 *   Node response = tpuClient.getNode(name);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the TpuClient object to clean up resources such as
 * threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> ListNodes</td>
 *      <td><p> Lists nodes.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listNodes(ListNodesRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listNodes(LocationName parent)
 *           <li><p> listNodes(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listNodesPagedCallable()
 *           <li><p> listNodesCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetNode</td>
 *      <td><p> Gets the details of a node.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getNode(GetNodeRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getNode(NodeName name)
 *           <li><p> getNode(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getNodeCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CreateNode</td>
 *      <td><p> Creates a node.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createNodeAsync(CreateNodeRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> createNodeAsync(LocationName parent, Node node, String nodeId)
 *           <li><p> createNodeAsync(String parent, Node node, String nodeId)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createNodeOperationCallable()
 *           <li><p> createNodeCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteNode</td>
 *      <td><p> Deletes a node.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteNodeAsync(DeleteNodeRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> deleteNodeAsync(NodeName name)
 *           <li><p> deleteNodeAsync(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteNodeOperationCallable()
 *           <li><p> deleteNodeCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> StopNode</td>
 *      <td><p> Stops a node. This operation is only available with single TPU nodes.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> stopNodeAsync(StopNodeRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> stopNodeOperationCallable()
 *           <li><p> stopNodeCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> StartNode</td>
 *      <td><p> Starts a node.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> startNodeAsync(StartNodeRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> startNodeOperationCallable()
 *           <li><p> startNodeCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateNode</td>
 *      <td><p> Updates the configurations of a node.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateNodeAsync(UpdateNodeRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> updateNodeAsync(Node node, FieldMask updateMask)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateNodeOperationCallable()
 *           <li><p> updateNodeCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> PerformMaintenance</td>
 *      <td><p> Perform manual maintenance on a node.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> performMaintenanceAsync(PerformMaintenanceRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> performMaintenanceOperationCallable()
 *           <li><p> performMaintenanceCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListQueuedResources</td>
 *      <td><p> Lists queued resources.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listQueuedResources(ListQueuedResourcesRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listQueuedResources(LocationName parent)
 *           <li><p> listQueuedResources(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listQueuedResourcesPagedCallable()
 *           <li><p> listQueuedResourcesCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetQueuedResource</td>
 *      <td><p> Gets details of a queued resource.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getQueuedResource(GetQueuedResourceRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getQueuedResource(QueuedResourceName name)
 *           <li><p> getQueuedResource(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getQueuedResourceCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CreateQueuedResource</td>
 *      <td><p> Creates a QueuedResource TPU instance.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createQueuedResourceAsync(CreateQueuedResourceRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> createQueuedResourceAsync(LocationName parent, QueuedResource queuedResource, String queuedResourceId)
 *           <li><p> createQueuedResourceAsync(String parent, QueuedResource queuedResource, String queuedResourceId)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createQueuedResourceOperationCallable()
 *           <li><p> createQueuedResourceCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteQueuedResource</td>
 *      <td><p> Deletes a QueuedResource TPU instance.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteQueuedResourceAsync(DeleteQueuedResourceRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> deleteQueuedResourceAsync(QueuedResourceName name)
 *           <li><p> deleteQueuedResourceAsync(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteQueuedResourceOperationCallable()
 *           <li><p> deleteQueuedResourceCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ResetQueuedResource</td>
 *      <td><p> Resets a QueuedResource TPU instance</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> resetQueuedResourceAsync(ResetQueuedResourceRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> resetQueuedResourceAsync(QueuedResourceName name)
 *           <li><p> resetQueuedResourceAsync(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> resetQueuedResourceOperationCallable()
 *           <li><p> resetQueuedResourceCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> PerformMaintenanceQueuedResource</td>
 *      <td><p> Perform manual maintenance on specific nodes of a QueuedResource.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> performMaintenanceQueuedResourceAsync(PerformMaintenanceQueuedResourceRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> performMaintenanceQueuedResourceOperationCallable()
 *           <li><p> performMaintenanceQueuedResourceCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GenerateServiceIdentity</td>
 *      <td><p> Generates the Cloud TPU service identity for the project.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> generateServiceIdentity(GenerateServiceIdentityRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> generateServiceIdentityCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListAcceleratorTypes</td>
 *      <td><p> Lists accelerator types supported by this API.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listAcceleratorTypes(ListAcceleratorTypesRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listAcceleratorTypes(LocationName parent)
 *           <li><p> listAcceleratorTypes(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listAcceleratorTypesPagedCallable()
 *           <li><p> listAcceleratorTypesCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetAcceleratorType</td>
 *      <td><p> Gets AcceleratorType.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getAcceleratorType(GetAcceleratorTypeRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getAcceleratorType(AcceleratorTypeName name)
 *           <li><p> getAcceleratorType(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getAcceleratorTypeCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListRuntimeVersions</td>
 *      <td><p> Lists runtime versions supported by this API.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listRuntimeVersions(ListRuntimeVersionsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listRuntimeVersions(LocationName parent)
 *           <li><p> listRuntimeVersions(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listRuntimeVersionsPagedCallable()
 *           <li><p> listRuntimeVersionsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetRuntimeVersion</td>
 *      <td><p> Gets a runtime version.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getRuntimeVersion(GetRuntimeVersionRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getRuntimeVersion(RuntimeVersionName name)
 *           <li><p> getRuntimeVersion(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getRuntimeVersionCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetGuestAttributes</td>
 *      <td><p> Retrieves the guest attributes for the node.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getGuestAttributes(GetGuestAttributesRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getGuestAttributesCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListReservations</td>
 *      <td><p> Retrieves the reservations for the given project in the given location.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listReservations(ListReservationsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listReservationsPagedCallable()
 *           <li><p> listReservationsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> SimulateMaintenanceEvent</td>
 *      <td><p> Simulates a maintenance event.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> simulateMaintenanceEventAsync(SimulateMaintenanceEventRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> simulateMaintenanceEventOperationCallable()
 *           <li><p> simulateMaintenanceEventCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListLocations</td>
 *      <td><p> Lists information about the supported locations for this service.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listLocations(ListLocationsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listLocationsPagedCallable()
 *           <li><p> listLocationsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetLocation</td>
 *      <td><p> Gets information about a location.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getLocation(GetLocationRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getLocationCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *  </table>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of TpuSettings to create(). For
 * example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * TpuSettings tpuSettings =
 *     TpuSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * TpuClient tpuClient = TpuClient.create(tpuSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * TpuSettings tpuSettings = TpuSettings.newBuilder().setEndpoint(myEndpoint).build();
 * TpuClient tpuClient = TpuClient.create(tpuSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class TpuClient implements BackgroundResource {
  private final TpuSettings settings;
  private final TpuStub stub;
  private final OperationsClient operationsClient;

  /** Constructs an instance of TpuClient with default settings. */
  public static final TpuClient create() throws IOException {
    return create(TpuSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of TpuClient, using the given settings. The channels are created based
   * on the settings passed in, or defaults for any settings that are not set.
   */
  public static final TpuClient create(TpuSettings settings) throws IOException {
    return new TpuClient(settings);
  }

  /**
   * Constructs an instance of TpuClient, using the given stub for making calls. This is for
   * advanced usage - prefer using create(TpuSettings).
   */
  public static final TpuClient create(TpuStub stub) {
    return new TpuClient(stub);
  }

  /**
   * Constructs an instance of TpuClient, using the given settings. This is protected so that it is
   * easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected TpuClient(TpuSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((TpuStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  protected TpuClient(TpuStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  public final TpuSettings getSettings() {
    return settings;
  }

  public TpuStub getStub() {
    return stub;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  public final OperationsClient getOperationsClient() {
    return operationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists nodes.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (Node element : tpuClient.listNodes(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent resource name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListNodesPagedResponse listNodes(LocationName parent) {
    ListNodesRequest request =
        ListNodesRequest.newBuilder().setParent(parent == null ? null : parent.toString()).build();
    return listNodes(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists nodes.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   for (Node element : tpuClient.listNodes(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent resource name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListNodesPagedResponse listNodes(String parent) {
    ListNodesRequest request = ListNodesRequest.newBuilder().setParent(parent).build();
    return listNodes(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists nodes.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   ListNodesRequest request =
   *       ListNodesRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Node element : tpuClient.listNodes(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListNodesPagedResponse listNodes(ListNodesRequest request) {
    return listNodesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists nodes.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   ListNodesRequest request =
   *       ListNodesRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Node> future = tpuClient.listNodesPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Node element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListNodesRequest, ListNodesPagedResponse> listNodesPagedCallable() {
    return stub.listNodesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists nodes.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   ListNodesRequest request =
   *       ListNodesRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListNodesResponse response = tpuClient.listNodesCallable().call(request);
   *     for (Node element : response.getNodesList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListNodesRequest, ListNodesResponse> listNodesCallable() {
    return stub.listNodesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the details of a node.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   NodeName name = NodeName.of("[PROJECT]", "[LOCATION]", "[NODE]");
   *   Node response = tpuClient.getNode(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Node getNode(NodeName name) {
    GetNodeRequest request =
        GetNodeRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getNode(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the details of a node.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   String name = NodeName.of("[PROJECT]", "[LOCATION]", "[NODE]").toString();
   *   Node response = tpuClient.getNode(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Node getNode(String name) {
    GetNodeRequest request = GetNodeRequest.newBuilder().setName(name).build();
    return getNode(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the details of a node.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   GetNodeRequest request =
   *       GetNodeRequest.newBuilder()
   *           .setName(NodeName.of("[PROJECT]", "[LOCATION]", "[NODE]").toString())
   *           .build();
   *   Node response = tpuClient.getNode(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Node getNode(GetNodeRequest request) {
    return getNodeCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the details of a node.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   GetNodeRequest request =
   *       GetNodeRequest.newBuilder()
   *           .setName(NodeName.of("[PROJECT]", "[LOCATION]", "[NODE]").toString())
   *           .build();
   *   ApiFuture<Node> future = tpuClient.getNodeCallable().futureCall(request);
   *   // Do something.
   *   Node response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetNodeRequest, Node> getNodeCallable() {
    return stub.getNodeCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a node.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   Node node = Node.newBuilder().build();
   *   String nodeId = "nodeId-1040171331";
   *   Node response = tpuClient.createNodeAsync(parent, node, nodeId).get();
   * }
   * }</pre>
   *
   * @param parent Required. The parent resource name.
   * @param node Required. The node.
   * @param nodeId The unqualified resource name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Node, OperationMetadata> createNodeAsync(
      LocationName parent, Node node, String nodeId) {
    CreateNodeRequest request =
        CreateNodeRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setNode(node)
            .setNodeId(nodeId)
            .build();
    return createNodeAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a node.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   Node node = Node.newBuilder().build();
   *   String nodeId = "nodeId-1040171331";
   *   Node response = tpuClient.createNodeAsync(parent, node, nodeId).get();
   * }
   * }</pre>
   *
   * @param parent Required. The parent resource name.
   * @param node Required. The node.
   * @param nodeId The unqualified resource name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Node, OperationMetadata> createNodeAsync(
      String parent, Node node, String nodeId) {
    CreateNodeRequest request =
        CreateNodeRequest.newBuilder().setParent(parent).setNode(node).setNodeId(nodeId).build();
    return createNodeAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a node.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   CreateNodeRequest request =
   *       CreateNodeRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setNodeId("nodeId-1040171331")
   *           .setNode(Node.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   Node response = tpuClient.createNodeAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Node, OperationMetadata> createNodeAsync(CreateNodeRequest request) {
    return createNodeOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a node.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   CreateNodeRequest request =
   *       CreateNodeRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setNodeId("nodeId-1040171331")
   *           .setNode(Node.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<Node, OperationMetadata> future =
   *       tpuClient.createNodeOperationCallable().futureCall(request);
   *   // Do something.
   *   Node response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<CreateNodeRequest, Node, OperationMetadata>
      createNodeOperationCallable() {
    return stub.createNodeOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a node.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   CreateNodeRequest request =
   *       CreateNodeRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setNodeId("nodeId-1040171331")
   *           .setNode(Node.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future = tpuClient.createNodeCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateNodeRequest, Operation> createNodeCallable() {
    return stub.createNodeCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a node.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   NodeName name = NodeName.of("[PROJECT]", "[LOCATION]", "[NODE]");
   *   tpuClient.deleteNodeAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The resource name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteNodeAsync(NodeName name) {
    DeleteNodeRequest request =
        DeleteNodeRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return deleteNodeAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a node.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   String name = NodeName.of("[PROJECT]", "[LOCATION]", "[NODE]").toString();
   *   tpuClient.deleteNodeAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The resource name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteNodeAsync(String name) {
    DeleteNodeRequest request = DeleteNodeRequest.newBuilder().setName(name).build();
    return deleteNodeAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a node.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   DeleteNodeRequest request =
   *       DeleteNodeRequest.newBuilder()
   *           .setName(NodeName.of("[PROJECT]", "[LOCATION]", "[NODE]").toString())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   tpuClient.deleteNodeAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteNodeAsync(
      DeleteNodeRequest request) {
    return deleteNodeOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a node.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   DeleteNodeRequest request =
   *       DeleteNodeRequest.newBuilder()
   *           .setName(NodeName.of("[PROJECT]", "[LOCATION]", "[NODE]").toString())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<Empty, OperationMetadata> future =
   *       tpuClient.deleteNodeOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeleteNodeRequest, Empty, OperationMetadata>
      deleteNodeOperationCallable() {
    return stub.deleteNodeOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a node.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   DeleteNodeRequest request =
   *       DeleteNodeRequest.newBuilder()
   *           .setName(NodeName.of("[PROJECT]", "[LOCATION]", "[NODE]").toString())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future = tpuClient.deleteNodeCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteNodeRequest, Operation> deleteNodeCallable() {
    return stub.deleteNodeCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Stops a node. This operation is only available with single TPU nodes.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   StopNodeRequest request =
   *       StopNodeRequest.newBuilder()
   *           .setName(NodeName.of("[PROJECT]", "[LOCATION]", "[NODE]").toString())
   *           .build();
   *   Node response = tpuClient.stopNodeAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Node, OperationMetadata> stopNodeAsync(StopNodeRequest request) {
    return stopNodeOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Stops a node. This operation is only available with single TPU nodes.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   StopNodeRequest request =
   *       StopNodeRequest.newBuilder()
   *           .setName(NodeName.of("[PROJECT]", "[LOCATION]", "[NODE]").toString())
   *           .build();
   *   OperationFuture<Node, OperationMetadata> future =
   *       tpuClient.stopNodeOperationCallable().futureCall(request);
   *   // Do something.
   *   Node response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<StopNodeRequest, Node, OperationMetadata>
      stopNodeOperationCallable() {
    return stub.stopNodeOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Stops a node. This operation is only available with single TPU nodes.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   StopNodeRequest request =
   *       StopNodeRequest.newBuilder()
   *           .setName(NodeName.of("[PROJECT]", "[LOCATION]", "[NODE]").toString())
   *           .build();
   *   ApiFuture<Operation> future = tpuClient.stopNodeCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<StopNodeRequest, Operation> stopNodeCallable() {
    return stub.stopNodeCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Starts a node.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   StartNodeRequest request =
   *       StartNodeRequest.newBuilder()
   *           .setName(NodeName.of("[PROJECT]", "[LOCATION]", "[NODE]").toString())
   *           .build();
   *   Node response = tpuClient.startNodeAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Node, OperationMetadata> startNodeAsync(StartNodeRequest request) {
    return startNodeOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Starts a node.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   StartNodeRequest request =
   *       StartNodeRequest.newBuilder()
   *           .setName(NodeName.of("[PROJECT]", "[LOCATION]", "[NODE]").toString())
   *           .build();
   *   OperationFuture<Node, OperationMetadata> future =
   *       tpuClient.startNodeOperationCallable().futureCall(request);
   *   // Do something.
   *   Node response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<StartNodeRequest, Node, OperationMetadata>
      startNodeOperationCallable() {
    return stub.startNodeOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Starts a node.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   StartNodeRequest request =
   *       StartNodeRequest.newBuilder()
   *           .setName(NodeName.of("[PROJECT]", "[LOCATION]", "[NODE]").toString())
   *           .build();
   *   ApiFuture<Operation> future = tpuClient.startNodeCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<StartNodeRequest, Operation> startNodeCallable() {
    return stub.startNodeCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the configurations of a node.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   Node node = Node.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   Node response = tpuClient.updateNodeAsync(node, updateMask).get();
   * }
   * }</pre>
   *
   * @param node Required. The node. Only fields specified in update_mask are updated.
   * @param updateMask Required. Mask of fields from [Node][Tpu.Node] to update. Supported fields:
   *     [description, tags, labels, metadata, network_config.enable_external_ips].
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Node, OperationMetadata> updateNodeAsync(
      Node node, FieldMask updateMask) {
    UpdateNodeRequest request =
        UpdateNodeRequest.newBuilder().setNode(node).setUpdateMask(updateMask).build();
    return updateNodeAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the configurations of a node.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   UpdateNodeRequest request =
   *       UpdateNodeRequest.newBuilder()
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setNode(Node.newBuilder().build())
   *           .build();
   *   Node response = tpuClient.updateNodeAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Node, OperationMetadata> updateNodeAsync(UpdateNodeRequest request) {
    return updateNodeOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the configurations of a node.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   UpdateNodeRequest request =
   *       UpdateNodeRequest.newBuilder()
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setNode(Node.newBuilder().build())
   *           .build();
   *   OperationFuture<Node, OperationMetadata> future =
   *       tpuClient.updateNodeOperationCallable().futureCall(request);
   *   // Do something.
   *   Node response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<UpdateNodeRequest, Node, OperationMetadata>
      updateNodeOperationCallable() {
    return stub.updateNodeOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the configurations of a node.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   UpdateNodeRequest request =
   *       UpdateNodeRequest.newBuilder()
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setNode(Node.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future = tpuClient.updateNodeCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateNodeRequest, Operation> updateNodeCallable() {
    return stub.updateNodeCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Perform manual maintenance on a node.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   PerformMaintenanceRequest request =
   *       PerformMaintenanceRequest.newBuilder()
   *           .setName(NodeName.of("[PROJECT]", "[LOCATION]", "[NODE]").toString())
   *           .build();
   *   Node response = tpuClient.performMaintenanceAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Node, OperationMetadata> performMaintenanceAsync(
      PerformMaintenanceRequest request) {
    return performMaintenanceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Perform manual maintenance on a node.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   PerformMaintenanceRequest request =
   *       PerformMaintenanceRequest.newBuilder()
   *           .setName(NodeName.of("[PROJECT]", "[LOCATION]", "[NODE]").toString())
   *           .build();
   *   OperationFuture<Node, OperationMetadata> future =
   *       tpuClient.performMaintenanceOperationCallable().futureCall(request);
   *   // Do something.
   *   Node response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<PerformMaintenanceRequest, Node, OperationMetadata>
      performMaintenanceOperationCallable() {
    return stub.performMaintenanceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Perform manual maintenance on a node.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   PerformMaintenanceRequest request =
   *       PerformMaintenanceRequest.newBuilder()
   *           .setName(NodeName.of("[PROJECT]", "[LOCATION]", "[NODE]").toString())
   *           .build();
   *   ApiFuture<Operation> future = tpuClient.performMaintenanceCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<PerformMaintenanceRequest, Operation> performMaintenanceCallable() {
    return stub.performMaintenanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists queued resources.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (QueuedResource element : tpuClient.listQueuedResources(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent resource name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListQueuedResourcesPagedResponse listQueuedResources(LocationName parent) {
    ListQueuedResourcesRequest request =
        ListQueuedResourcesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listQueuedResources(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists queued resources.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   for (QueuedResource element : tpuClient.listQueuedResources(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent resource name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListQueuedResourcesPagedResponse listQueuedResources(String parent) {
    ListQueuedResourcesRequest request =
        ListQueuedResourcesRequest.newBuilder().setParent(parent).build();
    return listQueuedResources(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists queued resources.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   ListQueuedResourcesRequest request =
   *       ListQueuedResourcesRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (QueuedResource element : tpuClient.listQueuedResources(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListQueuedResourcesPagedResponse listQueuedResources(
      ListQueuedResourcesRequest request) {
    return listQueuedResourcesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists queued resources.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   ListQueuedResourcesRequest request =
   *       ListQueuedResourcesRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<QueuedResource> future =
   *       tpuClient.listQueuedResourcesPagedCallable().futureCall(request);
   *   // Do something.
   *   for (QueuedResource element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListQueuedResourcesRequest, ListQueuedResourcesPagedResponse>
      listQueuedResourcesPagedCallable() {
    return stub.listQueuedResourcesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists queued resources.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   ListQueuedResourcesRequest request =
   *       ListQueuedResourcesRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListQueuedResourcesResponse response =
   *         tpuClient.listQueuedResourcesCallable().call(request);
   *     for (QueuedResource element : response.getQueuedResourcesList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListQueuedResourcesRequest, ListQueuedResourcesResponse>
      listQueuedResourcesCallable() {
    return stub.listQueuedResourcesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a queued resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   QueuedResourceName name =
   *       QueuedResourceName.of("[PROJECT]", "[LOCATION]", "[QUEUED_RESOURCE]");
   *   QueuedResource response = tpuClient.getQueuedResource(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final QueuedResource getQueuedResource(QueuedResourceName name) {
    GetQueuedResourceRequest request =
        GetQueuedResourceRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getQueuedResource(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a queued resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   String name =
   *       QueuedResourceName.of("[PROJECT]", "[LOCATION]", "[QUEUED_RESOURCE]").toString();
   *   QueuedResource response = tpuClient.getQueuedResource(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final QueuedResource getQueuedResource(String name) {
    GetQueuedResourceRequest request = GetQueuedResourceRequest.newBuilder().setName(name).build();
    return getQueuedResource(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a queued resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   GetQueuedResourceRequest request =
   *       GetQueuedResourceRequest.newBuilder()
   *           .setName(
   *               QueuedResourceName.of("[PROJECT]", "[LOCATION]", "[QUEUED_RESOURCE]").toString())
   *           .build();
   *   QueuedResource response = tpuClient.getQueuedResource(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final QueuedResource getQueuedResource(GetQueuedResourceRequest request) {
    return getQueuedResourceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a queued resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   GetQueuedResourceRequest request =
   *       GetQueuedResourceRequest.newBuilder()
   *           .setName(
   *               QueuedResourceName.of("[PROJECT]", "[LOCATION]", "[QUEUED_RESOURCE]").toString())
   *           .build();
   *   ApiFuture<QueuedResource> future = tpuClient.getQueuedResourceCallable().futureCall(request);
   *   // Do something.
   *   QueuedResource response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetQueuedResourceRequest, QueuedResource> getQueuedResourceCallable() {
    return stub.getQueuedResourceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a QueuedResource TPU instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   QueuedResource queuedResource = QueuedResource.newBuilder().build();
   *   String queuedResourceId = "queuedResourceId437646236";
   *   QueuedResource response =
   *       tpuClient.createQueuedResourceAsync(parent, queuedResource, queuedResourceId).get();
   * }
   * }</pre>
   *
   * @param parent Required. The parent resource name.
   * @param queuedResource Required. The queued resource.
   * @param queuedResourceId The unqualified resource name. Should follow the `^[A-Za-z0-9_.~+%-]+$`
   *     regex format.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<QueuedResource, OperationMetadata> createQueuedResourceAsync(
      LocationName parent, QueuedResource queuedResource, String queuedResourceId) {
    CreateQueuedResourceRequest request =
        CreateQueuedResourceRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setQueuedResource(queuedResource)
            .setQueuedResourceId(queuedResourceId)
            .build();
    return createQueuedResourceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a QueuedResource TPU instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   QueuedResource queuedResource = QueuedResource.newBuilder().build();
   *   String queuedResourceId = "queuedResourceId437646236";
   *   QueuedResource response =
   *       tpuClient.createQueuedResourceAsync(parent, queuedResource, queuedResourceId).get();
   * }
   * }</pre>
   *
   * @param parent Required. The parent resource name.
   * @param queuedResource Required. The queued resource.
   * @param queuedResourceId The unqualified resource name. Should follow the `^[A-Za-z0-9_.~+%-]+$`
   *     regex format.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<QueuedResource, OperationMetadata> createQueuedResourceAsync(
      String parent, QueuedResource queuedResource, String queuedResourceId) {
    CreateQueuedResourceRequest request =
        CreateQueuedResourceRequest.newBuilder()
            .setParent(parent)
            .setQueuedResource(queuedResource)
            .setQueuedResourceId(queuedResourceId)
            .build();
    return createQueuedResourceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a QueuedResource TPU instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   CreateQueuedResourceRequest request =
   *       CreateQueuedResourceRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setQueuedResourceId("queuedResourceId437646236")
   *           .setQueuedResource(QueuedResource.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   QueuedResource response = tpuClient.createQueuedResourceAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<QueuedResource, OperationMetadata> createQueuedResourceAsync(
      CreateQueuedResourceRequest request) {
    return createQueuedResourceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a QueuedResource TPU instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   CreateQueuedResourceRequest request =
   *       CreateQueuedResourceRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setQueuedResourceId("queuedResourceId437646236")
   *           .setQueuedResource(QueuedResource.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<QueuedResource, OperationMetadata> future =
   *       tpuClient.createQueuedResourceOperationCallable().futureCall(request);
   *   // Do something.
   *   QueuedResource response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<CreateQueuedResourceRequest, QueuedResource, OperationMetadata>
      createQueuedResourceOperationCallable() {
    return stub.createQueuedResourceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a QueuedResource TPU instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   CreateQueuedResourceRequest request =
   *       CreateQueuedResourceRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setQueuedResourceId("queuedResourceId437646236")
   *           .setQueuedResource(QueuedResource.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future = tpuClient.createQueuedResourceCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateQueuedResourceRequest, Operation>
      createQueuedResourceCallable() {
    return stub.createQueuedResourceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a QueuedResource TPU instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   QueuedResourceName name =
   *       QueuedResourceName.of("[PROJECT]", "[LOCATION]", "[QUEUED_RESOURCE]");
   *   QueuedResource response = tpuClient.deleteQueuedResourceAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The resource name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<QueuedResource, OperationMetadata> deleteQueuedResourceAsync(
      QueuedResourceName name) {
    DeleteQueuedResourceRequest request =
        DeleteQueuedResourceRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return deleteQueuedResourceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a QueuedResource TPU instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   String name =
   *       QueuedResourceName.of("[PROJECT]", "[LOCATION]", "[QUEUED_RESOURCE]").toString();
   *   QueuedResource response = tpuClient.deleteQueuedResourceAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The resource name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<QueuedResource, OperationMetadata> deleteQueuedResourceAsync(
      String name) {
    DeleteQueuedResourceRequest request =
        DeleteQueuedResourceRequest.newBuilder().setName(name).build();
    return deleteQueuedResourceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a QueuedResource TPU instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   DeleteQueuedResourceRequest request =
   *       DeleteQueuedResourceRequest.newBuilder()
   *           .setName(
   *               QueuedResourceName.of("[PROJECT]", "[LOCATION]", "[QUEUED_RESOURCE]").toString())
   *           .setRequestId("requestId693933066")
   *           .setForce(true)
   *           .build();
   *   QueuedResource response = tpuClient.deleteQueuedResourceAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<QueuedResource, OperationMetadata> deleteQueuedResourceAsync(
      DeleteQueuedResourceRequest request) {
    return deleteQueuedResourceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a QueuedResource TPU instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   DeleteQueuedResourceRequest request =
   *       DeleteQueuedResourceRequest.newBuilder()
   *           .setName(
   *               QueuedResourceName.of("[PROJECT]", "[LOCATION]", "[QUEUED_RESOURCE]").toString())
   *           .setRequestId("requestId693933066")
   *           .setForce(true)
   *           .build();
   *   OperationFuture<QueuedResource, OperationMetadata> future =
   *       tpuClient.deleteQueuedResourceOperationCallable().futureCall(request);
   *   // Do something.
   *   QueuedResource response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeleteQueuedResourceRequest, QueuedResource, OperationMetadata>
      deleteQueuedResourceOperationCallable() {
    return stub.deleteQueuedResourceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a QueuedResource TPU instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   DeleteQueuedResourceRequest request =
   *       DeleteQueuedResourceRequest.newBuilder()
   *           .setName(
   *               QueuedResourceName.of("[PROJECT]", "[LOCATION]", "[QUEUED_RESOURCE]").toString())
   *           .setRequestId("requestId693933066")
   *           .setForce(true)
   *           .build();
   *   ApiFuture<Operation> future = tpuClient.deleteQueuedResourceCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteQueuedResourceRequest, Operation>
      deleteQueuedResourceCallable() {
    return stub.deleteQueuedResourceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Resets a QueuedResource TPU instance
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   QueuedResourceName name =
   *       QueuedResourceName.of("[PROJECT]", "[LOCATION]", "[QUEUED_RESOURCE]");
   *   QueuedResource response = tpuClient.resetQueuedResourceAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The name of the queued resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<QueuedResource, OperationMetadata> resetQueuedResourceAsync(
      QueuedResourceName name) {
    ResetQueuedResourceRequest request =
        ResetQueuedResourceRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return resetQueuedResourceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Resets a QueuedResource TPU instance
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   String name =
   *       QueuedResourceName.of("[PROJECT]", "[LOCATION]", "[QUEUED_RESOURCE]").toString();
   *   QueuedResource response = tpuClient.resetQueuedResourceAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The name of the queued resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<QueuedResource, OperationMetadata> resetQueuedResourceAsync(
      String name) {
    ResetQueuedResourceRequest request =
        ResetQueuedResourceRequest.newBuilder().setName(name).build();
    return resetQueuedResourceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Resets a QueuedResource TPU instance
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   ResetQueuedResourceRequest request =
   *       ResetQueuedResourceRequest.newBuilder()
   *           .setName(
   *               QueuedResourceName.of("[PROJECT]", "[LOCATION]", "[QUEUED_RESOURCE]").toString())
   *           .build();
   *   QueuedResource response = tpuClient.resetQueuedResourceAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<QueuedResource, OperationMetadata> resetQueuedResourceAsync(
      ResetQueuedResourceRequest request) {
    return resetQueuedResourceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Resets a QueuedResource TPU instance
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   ResetQueuedResourceRequest request =
   *       ResetQueuedResourceRequest.newBuilder()
   *           .setName(
   *               QueuedResourceName.of("[PROJECT]", "[LOCATION]", "[QUEUED_RESOURCE]").toString())
   *           .build();
   *   OperationFuture<QueuedResource, OperationMetadata> future =
   *       tpuClient.resetQueuedResourceOperationCallable().futureCall(request);
   *   // Do something.
   *   QueuedResource response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<ResetQueuedResourceRequest, QueuedResource, OperationMetadata>
      resetQueuedResourceOperationCallable() {
    return stub.resetQueuedResourceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Resets a QueuedResource TPU instance
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   ResetQueuedResourceRequest request =
   *       ResetQueuedResourceRequest.newBuilder()
   *           .setName(
   *               QueuedResourceName.of("[PROJECT]", "[LOCATION]", "[QUEUED_RESOURCE]").toString())
   *           .build();
   *   ApiFuture<Operation> future = tpuClient.resetQueuedResourceCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ResetQueuedResourceRequest, Operation> resetQueuedResourceCallable() {
    return stub.resetQueuedResourceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Perform manual maintenance on specific nodes of a QueuedResource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   PerformMaintenanceQueuedResourceRequest request =
   *       PerformMaintenanceQueuedResourceRequest.newBuilder()
   *           .setName(
   *               QueuedResourceName.of("[PROJECT]", "[LOCATION]", "[QUEUED_RESOURCE]").toString())
   *           .addAllNodeNames(new ArrayList<String>())
   *           .build();
   *   QueuedResource response = tpuClient.performMaintenanceQueuedResourceAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<QueuedResource, OperationMetadata>
      performMaintenanceQueuedResourceAsync(PerformMaintenanceQueuedResourceRequest request) {
    return performMaintenanceQueuedResourceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Perform manual maintenance on specific nodes of a QueuedResource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   PerformMaintenanceQueuedResourceRequest request =
   *       PerformMaintenanceQueuedResourceRequest.newBuilder()
   *           .setName(
   *               QueuedResourceName.of("[PROJECT]", "[LOCATION]", "[QUEUED_RESOURCE]").toString())
   *           .addAllNodeNames(new ArrayList<String>())
   *           .build();
   *   OperationFuture<QueuedResource, OperationMetadata> future =
   *       tpuClient.performMaintenanceQueuedResourceOperationCallable().futureCall(request);
   *   // Do something.
   *   QueuedResource response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          PerformMaintenanceQueuedResourceRequest, QueuedResource, OperationMetadata>
      performMaintenanceQueuedResourceOperationCallable() {
    return stub.performMaintenanceQueuedResourceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Perform manual maintenance on specific nodes of a QueuedResource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   PerformMaintenanceQueuedResourceRequest request =
   *       PerformMaintenanceQueuedResourceRequest.newBuilder()
   *           .setName(
   *               QueuedResourceName.of("[PROJECT]", "[LOCATION]", "[QUEUED_RESOURCE]").toString())
   *           .addAllNodeNames(new ArrayList<String>())
   *           .build();
   *   ApiFuture<Operation> future =
   *       tpuClient.performMaintenanceQueuedResourceCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<PerformMaintenanceQueuedResourceRequest, Operation>
      performMaintenanceQueuedResourceCallable() {
    return stub.performMaintenanceQueuedResourceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Generates the Cloud TPU service identity for the project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   GenerateServiceIdentityRequest request =
   *       GenerateServiceIdentityRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .build();
   *   GenerateServiceIdentityResponse response = tpuClient.generateServiceIdentity(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateServiceIdentityResponse generateServiceIdentity(
      GenerateServiceIdentityRequest request) {
    return generateServiceIdentityCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Generates the Cloud TPU service identity for the project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   GenerateServiceIdentityRequest request =
   *       GenerateServiceIdentityRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .build();
   *   ApiFuture<GenerateServiceIdentityResponse> future =
   *       tpuClient.generateServiceIdentityCallable().futureCall(request);
   *   // Do something.
   *   GenerateServiceIdentityResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GenerateServiceIdentityRequest, GenerateServiceIdentityResponse>
      generateServiceIdentityCallable() {
    return stub.generateServiceIdentityCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists accelerator types supported by this API.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (AcceleratorType element : tpuClient.listAcceleratorTypes(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent resource name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListAcceleratorTypesPagedResponse listAcceleratorTypes(LocationName parent) {
    ListAcceleratorTypesRequest request =
        ListAcceleratorTypesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listAcceleratorTypes(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists accelerator types supported by this API.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   for (AcceleratorType element : tpuClient.listAcceleratorTypes(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent resource name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListAcceleratorTypesPagedResponse listAcceleratorTypes(String parent) {
    ListAcceleratorTypesRequest request =
        ListAcceleratorTypesRequest.newBuilder().setParent(parent).build();
    return listAcceleratorTypes(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists accelerator types supported by this API.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   ListAcceleratorTypesRequest request =
   *       ListAcceleratorTypesRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   for (AcceleratorType element : tpuClient.listAcceleratorTypes(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListAcceleratorTypesPagedResponse listAcceleratorTypes(
      ListAcceleratorTypesRequest request) {
    return listAcceleratorTypesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists accelerator types supported by this API.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   ListAcceleratorTypesRequest request =
   *       ListAcceleratorTypesRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   ApiFuture<AcceleratorType> future =
   *       tpuClient.listAcceleratorTypesPagedCallable().futureCall(request);
   *   // Do something.
   *   for (AcceleratorType element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListAcceleratorTypesRequest, ListAcceleratorTypesPagedResponse>
      listAcceleratorTypesPagedCallable() {
    return stub.listAcceleratorTypesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists accelerator types supported by this API.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   ListAcceleratorTypesRequest request =
   *       ListAcceleratorTypesRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   while (true) {
   *     ListAcceleratorTypesResponse response =
   *         tpuClient.listAcceleratorTypesCallable().call(request);
   *     for (AcceleratorType element : response.getAcceleratorTypesList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListAcceleratorTypesRequest, ListAcceleratorTypesResponse>
      listAcceleratorTypesCallable() {
    return stub.listAcceleratorTypesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets AcceleratorType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   AcceleratorTypeName name =
   *       AcceleratorTypeName.of("[PROJECT]", "[LOCATION]", "[ACCELERATOR_TYPE]");
   *   AcceleratorType response = tpuClient.getAcceleratorType(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AcceleratorType getAcceleratorType(AcceleratorTypeName name) {
    GetAcceleratorTypeRequest request =
        GetAcceleratorTypeRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getAcceleratorType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets AcceleratorType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   String name =
   *       AcceleratorTypeName.of("[PROJECT]", "[LOCATION]", "[ACCELERATOR_TYPE]").toString();
   *   AcceleratorType response = tpuClient.getAcceleratorType(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AcceleratorType getAcceleratorType(String name) {
    GetAcceleratorTypeRequest request =
        GetAcceleratorTypeRequest.newBuilder().setName(name).build();
    return getAcceleratorType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets AcceleratorType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   GetAcceleratorTypeRequest request =
   *       GetAcceleratorTypeRequest.newBuilder()
   *           .setName(
   *               AcceleratorTypeName.of("[PROJECT]", "[LOCATION]", "[ACCELERATOR_TYPE]")
   *                   .toString())
   *           .build();
   *   AcceleratorType response = tpuClient.getAcceleratorType(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AcceleratorType getAcceleratorType(GetAcceleratorTypeRequest request) {
    return getAcceleratorTypeCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets AcceleratorType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   GetAcceleratorTypeRequest request =
   *       GetAcceleratorTypeRequest.newBuilder()
   *           .setName(
   *               AcceleratorTypeName.of("[PROJECT]", "[LOCATION]", "[ACCELERATOR_TYPE]")
   *                   .toString())
   *           .build();
   *   ApiFuture<AcceleratorType> future =
   *       tpuClient.getAcceleratorTypeCallable().futureCall(request);
   *   // Do something.
   *   AcceleratorType response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetAcceleratorTypeRequest, AcceleratorType>
      getAcceleratorTypeCallable() {
    return stub.getAcceleratorTypeCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists runtime versions supported by this API.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (RuntimeVersion element : tpuClient.listRuntimeVersions(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent resource name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListRuntimeVersionsPagedResponse listRuntimeVersions(LocationName parent) {
    ListRuntimeVersionsRequest request =
        ListRuntimeVersionsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listRuntimeVersions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists runtime versions supported by this API.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   for (RuntimeVersion element : tpuClient.listRuntimeVersions(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent resource name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListRuntimeVersionsPagedResponse listRuntimeVersions(String parent) {
    ListRuntimeVersionsRequest request =
        ListRuntimeVersionsRequest.newBuilder().setParent(parent).build();
    return listRuntimeVersions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists runtime versions supported by this API.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   ListRuntimeVersionsRequest request =
   *       ListRuntimeVersionsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   for (RuntimeVersion element : tpuClient.listRuntimeVersions(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListRuntimeVersionsPagedResponse listRuntimeVersions(
      ListRuntimeVersionsRequest request) {
    return listRuntimeVersionsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists runtime versions supported by this API.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   ListRuntimeVersionsRequest request =
   *       ListRuntimeVersionsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   ApiFuture<RuntimeVersion> future =
   *       tpuClient.listRuntimeVersionsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (RuntimeVersion element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListRuntimeVersionsRequest, ListRuntimeVersionsPagedResponse>
      listRuntimeVersionsPagedCallable() {
    return stub.listRuntimeVersionsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists runtime versions supported by this API.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   ListRuntimeVersionsRequest request =
   *       ListRuntimeVersionsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   while (true) {
   *     ListRuntimeVersionsResponse response =
   *         tpuClient.listRuntimeVersionsCallable().call(request);
   *     for (RuntimeVersion element : response.getRuntimeVersionsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListRuntimeVersionsRequest, ListRuntimeVersionsResponse>
      listRuntimeVersionsCallable() {
    return stub.listRuntimeVersionsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a runtime version.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   RuntimeVersionName name =
   *       RuntimeVersionName.of("[PROJECT]", "[LOCATION]", "[RUNTIME_VERSION]");
   *   RuntimeVersion response = tpuClient.getRuntimeVersion(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RuntimeVersion getRuntimeVersion(RuntimeVersionName name) {
    GetRuntimeVersionRequest request =
        GetRuntimeVersionRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getRuntimeVersion(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a runtime version.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   String name =
   *       RuntimeVersionName.of("[PROJECT]", "[LOCATION]", "[RUNTIME_VERSION]").toString();
   *   RuntimeVersion response = tpuClient.getRuntimeVersion(name);
   * }
   * }</pre>
   *
   * @param name Required. The resource name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RuntimeVersion getRuntimeVersion(String name) {
    GetRuntimeVersionRequest request = GetRuntimeVersionRequest.newBuilder().setName(name).build();
    return getRuntimeVersion(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a runtime version.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   GetRuntimeVersionRequest request =
   *       GetRuntimeVersionRequest.newBuilder()
   *           .setName(
   *               RuntimeVersionName.of("[PROJECT]", "[LOCATION]", "[RUNTIME_VERSION]").toString())
   *           .build();
   *   RuntimeVersion response = tpuClient.getRuntimeVersion(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RuntimeVersion getRuntimeVersion(GetRuntimeVersionRequest request) {
    return getRuntimeVersionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a runtime version.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   GetRuntimeVersionRequest request =
   *       GetRuntimeVersionRequest.newBuilder()
   *           .setName(
   *               RuntimeVersionName.of("[PROJECT]", "[LOCATION]", "[RUNTIME_VERSION]").toString())
   *           .build();
   *   ApiFuture<RuntimeVersion> future = tpuClient.getRuntimeVersionCallable().futureCall(request);
   *   // Do something.
   *   RuntimeVersion response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetRuntimeVersionRequest, RuntimeVersion> getRuntimeVersionCallable() {
    return stub.getRuntimeVersionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the guest attributes for the node.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   GetGuestAttributesRequest request =
   *       GetGuestAttributesRequest.newBuilder()
   *           .setName(NodeName.of("[PROJECT]", "[LOCATION]", "[NODE]").toString())
   *           .setQueryPath("queryPath-1807004403")
   *           .addAllWorkerIds(new ArrayList<String>())
   *           .build();
   *   GetGuestAttributesResponse response = tpuClient.getGuestAttributes(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GetGuestAttributesResponse getGuestAttributes(GetGuestAttributesRequest request) {
    return getGuestAttributesCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the guest attributes for the node.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   GetGuestAttributesRequest request =
   *       GetGuestAttributesRequest.newBuilder()
   *           .setName(NodeName.of("[PROJECT]", "[LOCATION]", "[NODE]").toString())
   *           .setQueryPath("queryPath-1807004403")
   *           .addAllWorkerIds(new ArrayList<String>())
   *           .build();
   *   ApiFuture<GetGuestAttributesResponse> future =
   *       tpuClient.getGuestAttributesCallable().futureCall(request);
   *   // Do something.
   *   GetGuestAttributesResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetGuestAttributesRequest, GetGuestAttributesResponse>
      getGuestAttributesCallable() {
    return stub.getGuestAttributesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the reservations for the given project in the given location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   ListReservationsRequest request =
   *       ListReservationsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Reservation element : tpuClient.listReservations(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListReservationsPagedResponse listReservations(ListReservationsRequest request) {
    return listReservationsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the reservations for the given project in the given location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   ListReservationsRequest request =
   *       ListReservationsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Reservation> future = tpuClient.listReservationsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Reservation element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListReservationsRequest, ListReservationsPagedResponse>
      listReservationsPagedCallable() {
    return stub.listReservationsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the reservations for the given project in the given location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   ListReservationsRequest request =
   *       ListReservationsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListReservationsResponse response = tpuClient.listReservationsCallable().call(request);
   *     for (Reservation element : response.getReservationsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListReservationsRequest, ListReservationsResponse>
      listReservationsCallable() {
    return stub.listReservationsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Simulates a maintenance event.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   SimulateMaintenanceEventRequest request =
   *       SimulateMaintenanceEventRequest.newBuilder()
   *           .setName(NodeName.of("[PROJECT]", "[LOCATION]", "[NODE]").toString())
   *           .addAllWorkerIds(new ArrayList<String>())
   *           .build();
   *   Node response = tpuClient.simulateMaintenanceEventAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Node, OperationMetadata> simulateMaintenanceEventAsync(
      SimulateMaintenanceEventRequest request) {
    return simulateMaintenanceEventOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Simulates a maintenance event.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   SimulateMaintenanceEventRequest request =
   *       SimulateMaintenanceEventRequest.newBuilder()
   *           .setName(NodeName.of("[PROJECT]", "[LOCATION]", "[NODE]").toString())
   *           .addAllWorkerIds(new ArrayList<String>())
   *           .build();
   *   OperationFuture<Node, OperationMetadata> future =
   *       tpuClient.simulateMaintenanceEventOperationCallable().futureCall(request);
   *   // Do something.
   *   Node response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<SimulateMaintenanceEventRequest, Node, OperationMetadata>
      simulateMaintenanceEventOperationCallable() {
    return stub.simulateMaintenanceEventOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Simulates a maintenance event.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   SimulateMaintenanceEventRequest request =
   *       SimulateMaintenanceEventRequest.newBuilder()
   *           .setName(NodeName.of("[PROJECT]", "[LOCATION]", "[NODE]").toString())
   *           .addAllWorkerIds(new ArrayList<String>())
   *           .build();
   *   ApiFuture<Operation> future =
   *       tpuClient.simulateMaintenanceEventCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<SimulateMaintenanceEventRequest, Operation>
      simulateMaintenanceEventCallable() {
    return stub.simulateMaintenanceEventCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists information about the supported locations for this service.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Location element : tpuClient.listLocations(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListLocationsPagedResponse listLocations(ListLocationsRequest request) {
    return listLocationsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists information about the supported locations for this service.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Location> future = tpuClient.listLocationsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Location element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable() {
    return stub.listLocationsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists information about the supported locations for this service.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListLocationsResponse response = tpuClient.listLocationsCallable().call(request);
   *     for (Location element : response.getLocationsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable() {
    return stub.listLocationsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets information about a location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   GetLocationRequest request = GetLocationRequest.newBuilder().setName("name3373707").build();
   *   Location response = tpuClient.getLocation(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Location getLocation(GetLocationRequest request) {
    return getLocationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets information about a location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (TpuClient tpuClient = TpuClient.create()) {
   *   GetLocationRequest request = GetLocationRequest.newBuilder().setName("name3373707").build();
   *   ApiFuture<Location> future = tpuClient.getLocationCallable().futureCall(request);
   *   // Do something.
   *   Location response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetLocationRequest, Location> getLocationCallable() {
    return stub.getLocationCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListNodesPagedResponse
      extends AbstractPagedListResponse<
          ListNodesRequest, ListNodesResponse, Node, ListNodesPage, ListNodesFixedSizeCollection> {

    public static ApiFuture<ListNodesPagedResponse> createAsync(
        PageContext<ListNodesRequest, ListNodesResponse, Node> context,
        ApiFuture<ListNodesResponse> futureResponse) {
      ApiFuture<ListNodesPage> futurePage =
          ListNodesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage, input -> new ListNodesPagedResponse(input), MoreExecutors.directExecutor());
    }

    private ListNodesPagedResponse(ListNodesPage page) {
      super(page, ListNodesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListNodesPage
      extends AbstractPage<ListNodesRequest, ListNodesResponse, Node, ListNodesPage> {

    private ListNodesPage(
        PageContext<ListNodesRequest, ListNodesResponse, Node> context,
        ListNodesResponse response) {
      super(context, response);
    }

    private static ListNodesPage createEmptyPage() {
      return new ListNodesPage(null, null);
    }

    @Override
    protected ListNodesPage createPage(
        PageContext<ListNodesRequest, ListNodesResponse, Node> context,
        ListNodesResponse response) {
      return new ListNodesPage(context, response);
    }

    @Override
    public ApiFuture<ListNodesPage> createPageAsync(
        PageContext<ListNodesRequest, ListNodesResponse, Node> context,
        ApiFuture<ListNodesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListNodesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListNodesRequest, ListNodesResponse, Node, ListNodesPage, ListNodesFixedSizeCollection> {

    private ListNodesFixedSizeCollection(List<ListNodesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListNodesFixedSizeCollection createEmptyCollection() {
      return new ListNodesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListNodesFixedSizeCollection createCollection(
        List<ListNodesPage> pages, int collectionSize) {
      return new ListNodesFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListQueuedResourcesPagedResponse
      extends AbstractPagedListResponse<
          ListQueuedResourcesRequest,
          ListQueuedResourcesResponse,
          QueuedResource,
          ListQueuedResourcesPage,
          ListQueuedResourcesFixedSizeCollection> {

    public static ApiFuture<ListQueuedResourcesPagedResponse> createAsync(
        PageContext<ListQueuedResourcesRequest, ListQueuedResourcesResponse, QueuedResource>
            context,
        ApiFuture<ListQueuedResourcesResponse> futureResponse) {
      ApiFuture<ListQueuedResourcesPage> futurePage =
          ListQueuedResourcesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListQueuedResourcesPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListQueuedResourcesPagedResponse(ListQueuedResourcesPage page) {
      super(page, ListQueuedResourcesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListQueuedResourcesPage
      extends AbstractPage<
          ListQueuedResourcesRequest,
          ListQueuedResourcesResponse,
          QueuedResource,
          ListQueuedResourcesPage> {

    private ListQueuedResourcesPage(
        PageContext<ListQueuedResourcesRequest, ListQueuedResourcesResponse, QueuedResource>
            context,
        ListQueuedResourcesResponse response) {
      super(context, response);
    }

    private static ListQueuedResourcesPage createEmptyPage() {
      return new ListQueuedResourcesPage(null, null);
    }

    @Override
    protected ListQueuedResourcesPage createPage(
        PageContext<ListQueuedResourcesRequest, ListQueuedResourcesResponse, QueuedResource>
            context,
        ListQueuedResourcesResponse response) {
      return new ListQueuedResourcesPage(context, response);
    }

    @Override
    public ApiFuture<ListQueuedResourcesPage> createPageAsync(
        PageContext<ListQueuedResourcesRequest, ListQueuedResourcesResponse, QueuedResource>
            context,
        ApiFuture<ListQueuedResourcesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListQueuedResourcesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListQueuedResourcesRequest,
          ListQueuedResourcesResponse,
          QueuedResource,
          ListQueuedResourcesPage,
          ListQueuedResourcesFixedSizeCollection> {

    private ListQueuedResourcesFixedSizeCollection(
        List<ListQueuedResourcesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListQueuedResourcesFixedSizeCollection createEmptyCollection() {
      return new ListQueuedResourcesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListQueuedResourcesFixedSizeCollection createCollection(
        List<ListQueuedResourcesPage> pages, int collectionSize) {
      return new ListQueuedResourcesFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListAcceleratorTypesPagedResponse
      extends AbstractPagedListResponse<
          ListAcceleratorTypesRequest,
          ListAcceleratorTypesResponse,
          AcceleratorType,
          ListAcceleratorTypesPage,
          ListAcceleratorTypesFixedSizeCollection> {

    public static ApiFuture<ListAcceleratorTypesPagedResponse> createAsync(
        PageContext<ListAcceleratorTypesRequest, ListAcceleratorTypesResponse, AcceleratorType>
            context,
        ApiFuture<ListAcceleratorTypesResponse> futureResponse) {
      ApiFuture<ListAcceleratorTypesPage> futurePage =
          ListAcceleratorTypesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListAcceleratorTypesPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListAcceleratorTypesPagedResponse(ListAcceleratorTypesPage page) {
      super(page, ListAcceleratorTypesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListAcceleratorTypesPage
      extends AbstractPage<
          ListAcceleratorTypesRequest,
          ListAcceleratorTypesResponse,
          AcceleratorType,
          ListAcceleratorTypesPage> {

    private ListAcceleratorTypesPage(
        PageContext<ListAcceleratorTypesRequest, ListAcceleratorTypesResponse, AcceleratorType>
            context,
        ListAcceleratorTypesResponse response) {
      super(context, response);
    }

    private static ListAcceleratorTypesPage createEmptyPage() {
      return new ListAcceleratorTypesPage(null, null);
    }

    @Override
    protected ListAcceleratorTypesPage createPage(
        PageContext<ListAcceleratorTypesRequest, ListAcceleratorTypesResponse, AcceleratorType>
            context,
        ListAcceleratorTypesResponse response) {
      return new ListAcceleratorTypesPage(context, response);
    }

    @Override
    public ApiFuture<ListAcceleratorTypesPage> createPageAsync(
        PageContext<ListAcceleratorTypesRequest, ListAcceleratorTypesResponse, AcceleratorType>
            context,
        ApiFuture<ListAcceleratorTypesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListAcceleratorTypesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListAcceleratorTypesRequest,
          ListAcceleratorTypesResponse,
          AcceleratorType,
          ListAcceleratorTypesPage,
          ListAcceleratorTypesFixedSizeCollection> {

    private ListAcceleratorTypesFixedSizeCollection(
        List<ListAcceleratorTypesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListAcceleratorTypesFixedSizeCollection createEmptyCollection() {
      return new ListAcceleratorTypesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListAcceleratorTypesFixedSizeCollection createCollection(
        List<ListAcceleratorTypesPage> pages, int collectionSize) {
      return new ListAcceleratorTypesFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListRuntimeVersionsPagedResponse
      extends AbstractPagedListResponse<
          ListRuntimeVersionsRequest,
          ListRuntimeVersionsResponse,
          RuntimeVersion,
          ListRuntimeVersionsPage,
          ListRuntimeVersionsFixedSizeCollection> {

    public static ApiFuture<ListRuntimeVersionsPagedResponse> createAsync(
        PageContext<ListRuntimeVersionsRequest, ListRuntimeVersionsResponse, RuntimeVersion>
            context,
        ApiFuture<ListRuntimeVersionsResponse> futureResponse) {
      ApiFuture<ListRuntimeVersionsPage> futurePage =
          ListRuntimeVersionsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListRuntimeVersionsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListRuntimeVersionsPagedResponse(ListRuntimeVersionsPage page) {
      super(page, ListRuntimeVersionsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListRuntimeVersionsPage
      extends AbstractPage<
          ListRuntimeVersionsRequest,
          ListRuntimeVersionsResponse,
          RuntimeVersion,
          ListRuntimeVersionsPage> {

    private ListRuntimeVersionsPage(
        PageContext<ListRuntimeVersionsRequest, ListRuntimeVersionsResponse, RuntimeVersion>
            context,
        ListRuntimeVersionsResponse response) {
      super(context, response);
    }

    private static ListRuntimeVersionsPage createEmptyPage() {
      return new ListRuntimeVersionsPage(null, null);
    }

    @Override
    protected ListRuntimeVersionsPage createPage(
        PageContext<ListRuntimeVersionsRequest, ListRuntimeVersionsResponse, RuntimeVersion>
            context,
        ListRuntimeVersionsResponse response) {
      return new ListRuntimeVersionsPage(context, response);
    }

    @Override
    public ApiFuture<ListRuntimeVersionsPage> createPageAsync(
        PageContext<ListRuntimeVersionsRequest, ListRuntimeVersionsResponse, RuntimeVersion>
            context,
        ApiFuture<ListRuntimeVersionsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListRuntimeVersionsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListRuntimeVersionsRequest,
          ListRuntimeVersionsResponse,
          RuntimeVersion,
          ListRuntimeVersionsPage,
          ListRuntimeVersionsFixedSizeCollection> {

    private ListRuntimeVersionsFixedSizeCollection(
        List<ListRuntimeVersionsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListRuntimeVersionsFixedSizeCollection createEmptyCollection() {
      return new ListRuntimeVersionsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListRuntimeVersionsFixedSizeCollection createCollection(
        List<ListRuntimeVersionsPage> pages, int collectionSize) {
      return new ListRuntimeVersionsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListReservationsPagedResponse
      extends AbstractPagedListResponse<
          ListReservationsRequest,
          ListReservationsResponse,
          Reservation,
          ListReservationsPage,
          ListReservationsFixedSizeCollection> {

    public static ApiFuture<ListReservationsPagedResponse> createAsync(
        PageContext<ListReservationsRequest, ListReservationsResponse, Reservation> context,
        ApiFuture<ListReservationsResponse> futureResponse) {
      ApiFuture<ListReservationsPage> futurePage =
          ListReservationsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListReservationsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListReservationsPagedResponse(ListReservationsPage page) {
      super(page, ListReservationsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListReservationsPage
      extends AbstractPage<
          ListReservationsRequest, ListReservationsResponse, Reservation, ListReservationsPage> {

    private ListReservationsPage(
        PageContext<ListReservationsRequest, ListReservationsResponse, Reservation> context,
        ListReservationsResponse response) {
      super(context, response);
    }

    private static ListReservationsPage createEmptyPage() {
      return new ListReservationsPage(null, null);
    }

    @Override
    protected ListReservationsPage createPage(
        PageContext<ListReservationsRequest, ListReservationsResponse, Reservation> context,
        ListReservationsResponse response) {
      return new ListReservationsPage(context, response);
    }

    @Override
    public ApiFuture<ListReservationsPage> createPageAsync(
        PageContext<ListReservationsRequest, ListReservationsResponse, Reservation> context,
        ApiFuture<ListReservationsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListReservationsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListReservationsRequest,
          ListReservationsResponse,
          Reservation,
          ListReservationsPage,
          ListReservationsFixedSizeCollection> {

    private ListReservationsFixedSizeCollection(
        List<ListReservationsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListReservationsFixedSizeCollection createEmptyCollection() {
      return new ListReservationsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListReservationsFixedSizeCollection createCollection(
        List<ListReservationsPage> pages, int collectionSize) {
      return new ListReservationsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListLocationsPagedResponse
      extends AbstractPagedListResponse<
          ListLocationsRequest,
          ListLocationsResponse,
          Location,
          ListLocationsPage,
          ListLocationsFixedSizeCollection> {

    public static ApiFuture<ListLocationsPagedResponse> createAsync(
        PageContext<ListLocationsRequest, ListLocationsResponse, Location> context,
        ApiFuture<ListLocationsResponse> futureResponse) {
      ApiFuture<ListLocationsPage> futurePage =
          ListLocationsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListLocationsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListLocationsPagedResponse(ListLocationsPage page) {
      super(page, ListLocationsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListLocationsPage
      extends AbstractPage<
          ListLocationsRequest, ListLocationsResponse, Location, ListLocationsPage> {

    private ListLocationsPage(
        PageContext<ListLocationsRequest, ListLocationsResponse, Location> context,
        ListLocationsResponse response) {
      super(context, response);
    }

    private static ListLocationsPage createEmptyPage() {
      return new ListLocationsPage(null, null);
    }

    @Override
    protected ListLocationsPage createPage(
        PageContext<ListLocationsRequest, ListLocationsResponse, Location> context,
        ListLocationsResponse response) {
      return new ListLocationsPage(context, response);
    }

    @Override
    public ApiFuture<ListLocationsPage> createPageAsync(
        PageContext<ListLocationsRequest, ListLocationsResponse, Location> context,
        ApiFuture<ListLocationsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListLocationsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListLocationsRequest,
          ListLocationsResponse,
          Location,
          ListLocationsPage,
          ListLocationsFixedSizeCollection> {

    private ListLocationsFixedSizeCollection(List<ListLocationsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListLocationsFixedSizeCollection createEmptyCollection() {
      return new ListLocationsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListLocationsFixedSizeCollection createCollection(
        List<ListLocationsPage> pages, int collectionSize) {
      return new ListLocationsFixedSizeCollection(pages, collectionSize);
    }
  }
}
