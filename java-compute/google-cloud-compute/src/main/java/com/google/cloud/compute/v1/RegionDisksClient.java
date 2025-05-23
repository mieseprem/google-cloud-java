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

package com.google.cloud.compute.v1;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.stub.RegionDisksStub;
import com.google.cloud.compute.v1.stub.RegionDisksStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: The RegionDisks API.
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
 * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
 *   String project = "project-309310695";
 *   String region = "region-934795532";
 *   String disk = "disk3083677";
 *   Disk response = regionDisksClient.get(project, region, disk);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the RegionDisksClient object to clean up resources such as
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
 *      <td><p> AddResourcePolicies</td>
 *      <td><p> Adds existing resource policies to a regional disk. You can only add one policy which will be applied to this disk for scheduling snapshot creation.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> addResourcePoliciesAsync(AddResourcePoliciesRegionDiskRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> addResourcePoliciesAsync(String project, String region, String disk, RegionDisksAddResourcePoliciesRequest regionDisksAddResourcePoliciesRequestResource)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> addResourcePoliciesOperationCallable()
 *           <li><p> addResourcePoliciesCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> BulkInsert</td>
 *      <td><p> Bulk create a set of disks.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> bulkInsertAsync(BulkInsertRegionDiskRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> bulkInsertAsync(String project, String region, BulkInsertDiskResource bulkInsertDiskResourceResource)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> bulkInsertOperationCallable()
 *           <li><p> bulkInsertCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CreateSnapshot</td>
 *      <td><p> Creates a snapshot of a specified persistent disk. For regular snapshot creation, consider using snapshots.insert instead, as that method supports more features, such as creating snapshots in a project different from the source disk project.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createSnapshotAsync(CreateSnapshotRegionDiskRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> createSnapshotAsync(String project, String region, String disk, Snapshot snapshotResource)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createSnapshotOperationCallable()
 *           <li><p> createSnapshotCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> Delete</td>
 *      <td><p> Deletes the specified regional persistent disk. Deleting a regional disk removes all the replicas of its data permanently and is irreversible. However, deleting a disk does not delete any snapshots previously made from the disk. You must separately delete snapshots.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteAsync(DeleteRegionDiskRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> deleteAsync(String project, String region, String disk)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteOperationCallable()
 *           <li><p> deleteCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> Get</td>
 *      <td><p> Returns a specified regional persistent disk.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> get(GetRegionDiskRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> get(String project, String region, String disk)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetIamPolicy</td>
 *      <td><p> Gets the access control policy for a resource. May be empty if no such policy or resource exists.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getIamPolicy(GetIamPolicyRegionDiskRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getIamPolicy(String project, String region, String resource)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getIamPolicyCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> Insert</td>
 *      <td><p> Creates a persistent regional disk in the specified project using the data included in the request.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> insertAsync(InsertRegionDiskRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> insertAsync(String project, String region, Disk diskResource)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> insertOperationCallable()
 *           <li><p> insertCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> List</td>
 *      <td><p> Retrieves the list of persistent disks contained within the specified region.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> list(ListRegionDisksRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> list(String project, String region)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listPagedCallable()
 *           <li><p> listCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> RemoveResourcePolicies</td>
 *      <td><p> Removes resource policies from a regional disk.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> removeResourcePoliciesAsync(RemoveResourcePoliciesRegionDiskRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> removeResourcePoliciesAsync(String project, String region, String disk, RegionDisksRemoveResourcePoliciesRequest regionDisksRemoveResourcePoliciesRequestResource)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> removeResourcePoliciesOperationCallable()
 *           <li><p> removeResourcePoliciesCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> Resize</td>
 *      <td><p> Resizes the specified regional persistent disk.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> resizeAsync(ResizeRegionDiskRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> resizeAsync(String project, String region, String disk, RegionDisksResizeRequest regionDisksResizeRequestResource)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> resizeOperationCallable()
 *           <li><p> resizeCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> SetIamPolicy</td>
 *      <td><p> Sets the access control policy on the specified resource. Replaces any existing policy.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> setIamPolicy(SetIamPolicyRegionDiskRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> setIamPolicy(String project, String region, String resource, RegionSetPolicyRequest regionSetPolicyRequestResource)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> setIamPolicyCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> SetLabels</td>
 *      <td><p> Sets the labels on the target regional disk.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> setLabelsAsync(SetLabelsRegionDiskRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> setLabelsAsync(String project, String region, String resource, RegionSetLabelsRequest regionSetLabelsRequestResource)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> setLabelsOperationCallable()
 *           <li><p> setLabelsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> StartAsyncReplication</td>
 *      <td><p> Starts asynchronous replication. Must be invoked on the primary disk.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> startAsyncReplicationAsync(StartAsyncReplicationRegionDiskRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> startAsyncReplicationAsync(String project, String region, String disk, RegionDisksStartAsyncReplicationRequest regionDisksStartAsyncReplicationRequestResource)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> startAsyncReplicationOperationCallable()
 *           <li><p> startAsyncReplicationCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> StopAsyncReplication</td>
 *      <td><p> Stops asynchronous replication. Can be invoked either on the primary or on the secondary disk.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> stopAsyncReplicationAsync(StopAsyncReplicationRegionDiskRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> stopAsyncReplicationAsync(String project, String region, String disk)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> stopAsyncReplicationOperationCallable()
 *           <li><p> stopAsyncReplicationCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> StopGroupAsyncReplication</td>
 *      <td><p> Stops asynchronous replication for a consistency group of disks. Can be invoked either in the primary or secondary scope.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> stopGroupAsyncReplicationAsync(StopGroupAsyncReplicationRegionDiskRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> stopGroupAsyncReplicationAsync(String project, String region, DisksStopGroupAsyncReplicationResource disksStopGroupAsyncReplicationResourceResource)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> stopGroupAsyncReplicationOperationCallable()
 *           <li><p> stopGroupAsyncReplicationCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> TestIamPermissions</td>
 *      <td><p> Returns permissions that a caller has on the specified resource.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> testIamPermissions(TestIamPermissionsRegionDiskRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> testIamPermissions(String project, String region, String resource, TestPermissionsRequest testPermissionsRequestResource)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> testIamPermissionsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> Update</td>
 *      <td><p> Update the specified disk with the data included in the request. Update is performed only on selected fields included as part of update-mask. Only the following fields can be modified: user_license.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateAsync(UpdateRegionDiskRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> updateAsync(String project, String region, String disk, Disk diskResource)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateOperationCallable()
 *           <li><p> updateCallable()
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
 * <p>This class can be customized by passing in a custom instance of RegionDisksSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * RegionDisksSettings regionDisksSettings =
 *     RegionDisksSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * RegionDisksClient regionDisksClient = RegionDisksClient.create(regionDisksSettings);
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
 * RegionDisksSettings regionDisksSettings =
 *     RegionDisksSettings.newBuilder().setEndpoint(myEndpoint).build();
 * RegionDisksClient regionDisksClient = RegionDisksClient.create(regionDisksSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class RegionDisksClient implements BackgroundResource {
  private final RegionDisksSettings settings;
  private final RegionDisksStub stub;

  /** Constructs an instance of RegionDisksClient with default settings. */
  public static final RegionDisksClient create() throws IOException {
    return create(RegionDisksSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of RegionDisksClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final RegionDisksClient create(RegionDisksSettings settings) throws IOException {
    return new RegionDisksClient(settings);
  }

  /**
   * Constructs an instance of RegionDisksClient, using the given stub for making calls. This is for
   * advanced usage - prefer using create(RegionDisksSettings).
   */
  public static final RegionDisksClient create(RegionDisksStub stub) {
    return new RegionDisksClient(stub);
  }

  /**
   * Constructs an instance of RegionDisksClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected RegionDisksClient(RegionDisksSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((RegionDisksStubSettings) settings.getStubSettings()).createStub();
  }

  protected RegionDisksClient(RegionDisksStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final RegionDisksSettings getSettings() {
    return settings;
  }

  public RegionDisksStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Adds existing resource policies to a regional disk. You can only add one policy which will be
   * applied to this disk for scheduling snapshot creation.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   String disk = "disk3083677";
   *   RegionDisksAddResourcePoliciesRequest regionDisksAddResourcePoliciesRequestResource =
   *       RegionDisksAddResourcePoliciesRequest.newBuilder().build();
   *   Operation response =
   *       regionDisksClient
   *           .addResourcePoliciesAsync(
   *               project, region, disk, regionDisksAddResourcePoliciesRequestResource)
   *           .get();
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region The name of the region for this request.
   * @param disk The disk name for this request.
   * @param regionDisksAddResourcePoliciesRequestResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> addResourcePoliciesAsync(
      String project,
      String region,
      String disk,
      RegionDisksAddResourcePoliciesRequest regionDisksAddResourcePoliciesRequestResource) {
    AddResourcePoliciesRegionDiskRequest request =
        AddResourcePoliciesRegionDiskRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setDisk(disk)
            .setRegionDisksAddResourcePoliciesRequestResource(
                regionDisksAddResourcePoliciesRequestResource)
            .build();
    return addResourcePoliciesAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Adds existing resource policies to a regional disk. You can only add one policy which will be
   * applied to this disk for scheduling snapshot creation.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   AddResourcePoliciesRegionDiskRequest request =
   *       AddResourcePoliciesRegionDiskRequest.newBuilder()
   *           .setDisk("disk3083677")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRegionDisksAddResourcePoliciesRequestResource(
   *               RegionDisksAddResourcePoliciesRequest.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   Operation response = regionDisksClient.addResourcePoliciesAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> addResourcePoliciesAsync(
      AddResourcePoliciesRegionDiskRequest request) {
    return addResourcePoliciesOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Adds existing resource policies to a regional disk. You can only add one policy which will be
   * applied to this disk for scheduling snapshot creation.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   AddResourcePoliciesRegionDiskRequest request =
   *       AddResourcePoliciesRegionDiskRequest.newBuilder()
   *           .setDisk("disk3083677")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRegionDisksAddResourcePoliciesRequestResource(
   *               RegionDisksAddResourcePoliciesRequest.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<Operation, Operation> future =
   *       regionDisksClient.addResourcePoliciesOperationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<AddResourcePoliciesRegionDiskRequest, Operation, Operation>
      addResourcePoliciesOperationCallable() {
    return stub.addResourcePoliciesOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Adds existing resource policies to a regional disk. You can only add one policy which will be
   * applied to this disk for scheduling snapshot creation.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   AddResourcePoliciesRegionDiskRequest request =
   *       AddResourcePoliciesRegionDiskRequest.newBuilder()
   *           .setDisk("disk3083677")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRegionDisksAddResourcePoliciesRequestResource(
   *               RegionDisksAddResourcePoliciesRequest.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future =
   *       regionDisksClient.addResourcePoliciesCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<AddResourcePoliciesRegionDiskRequest, Operation>
      addResourcePoliciesCallable() {
    return stub.addResourcePoliciesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Bulk create a set of disks.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   BulkInsertDiskResource bulkInsertDiskResourceResource =
   *       BulkInsertDiskResource.newBuilder().build();
   *   Operation response =
   *       regionDisksClient.bulkInsertAsync(project, region, bulkInsertDiskResourceResource).get();
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region The name of the region for this request.
   * @param bulkInsertDiskResourceResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> bulkInsertAsync(
      String project, String region, BulkInsertDiskResource bulkInsertDiskResourceResource) {
    BulkInsertRegionDiskRequest request =
        BulkInsertRegionDiskRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setBulkInsertDiskResourceResource(bulkInsertDiskResourceResource)
            .build();
    return bulkInsertAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Bulk create a set of disks.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   BulkInsertRegionDiskRequest request =
   *       BulkInsertRegionDiskRequest.newBuilder()
   *           .setBulkInsertDiskResourceResource(BulkInsertDiskResource.newBuilder().build())
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   Operation response = regionDisksClient.bulkInsertAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> bulkInsertAsync(
      BulkInsertRegionDiskRequest request) {
    return bulkInsertOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Bulk create a set of disks.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   BulkInsertRegionDiskRequest request =
   *       BulkInsertRegionDiskRequest.newBuilder()
   *           .setBulkInsertDiskResourceResource(BulkInsertDiskResource.newBuilder().build())
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<Operation, Operation> future =
   *       regionDisksClient.bulkInsertOperationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<BulkInsertRegionDiskRequest, Operation, Operation>
      bulkInsertOperationCallable() {
    return stub.bulkInsertOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Bulk create a set of disks.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   BulkInsertRegionDiskRequest request =
   *       BulkInsertRegionDiskRequest.newBuilder()
   *           .setBulkInsertDiskResourceResource(BulkInsertDiskResource.newBuilder().build())
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future = regionDisksClient.bulkInsertCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<BulkInsertRegionDiskRequest, Operation> bulkInsertCallable() {
    return stub.bulkInsertCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a snapshot of a specified persistent disk. For regular snapshot creation, consider
   * using snapshots.insert instead, as that method supports more features, such as creating
   * snapshots in a project different from the source disk project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   String disk = "disk3083677";
   *   Snapshot snapshotResource = Snapshot.newBuilder().build();
   *   Operation response =
   *       regionDisksClient.createSnapshotAsync(project, region, disk, snapshotResource).get();
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region Name of the region for this request.
   * @param disk Name of the regional persistent disk to snapshot.
   * @param snapshotResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> createSnapshotAsync(
      String project, String region, String disk, Snapshot snapshotResource) {
    CreateSnapshotRegionDiskRequest request =
        CreateSnapshotRegionDiskRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setDisk(disk)
            .setSnapshotResource(snapshotResource)
            .build();
    return createSnapshotAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a snapshot of a specified persistent disk. For regular snapshot creation, consider
   * using snapshots.insert instead, as that method supports more features, such as creating
   * snapshots in a project different from the source disk project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   CreateSnapshotRegionDiskRequest request =
   *       CreateSnapshotRegionDiskRequest.newBuilder()
   *           .setDisk("disk3083677")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setSnapshotResource(Snapshot.newBuilder().build())
   *           .build();
   *   Operation response = regionDisksClient.createSnapshotAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> createSnapshotAsync(
      CreateSnapshotRegionDiskRequest request) {
    return createSnapshotOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a snapshot of a specified persistent disk. For regular snapshot creation, consider
   * using snapshots.insert instead, as that method supports more features, such as creating
   * snapshots in a project different from the source disk project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   CreateSnapshotRegionDiskRequest request =
   *       CreateSnapshotRegionDiskRequest.newBuilder()
   *           .setDisk("disk3083677")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setSnapshotResource(Snapshot.newBuilder().build())
   *           .build();
   *   OperationFuture<Operation, Operation> future =
   *       regionDisksClient.createSnapshotOperationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<CreateSnapshotRegionDiskRequest, Operation, Operation>
      createSnapshotOperationCallable() {
    return stub.createSnapshotOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a snapshot of a specified persistent disk. For regular snapshot creation, consider
   * using snapshots.insert instead, as that method supports more features, such as creating
   * snapshots in a project different from the source disk project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   CreateSnapshotRegionDiskRequest request =
   *       CreateSnapshotRegionDiskRequest.newBuilder()
   *           .setDisk("disk3083677")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setSnapshotResource(Snapshot.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future = regionDisksClient.createSnapshotCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateSnapshotRegionDiskRequest, Operation> createSnapshotCallable() {
    return stub.createSnapshotCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified regional persistent disk. Deleting a regional disk removes all the
   * replicas of its data permanently and is irreversible. However, deleting a disk does not delete
   * any snapshots previously made from the disk. You must separately delete snapshots.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   String disk = "disk3083677";
   *   Operation response = regionDisksClient.deleteAsync(project, region, disk).get();
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region Name of the region for this request.
   * @param disk Name of the regional persistent disk to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> deleteAsync(
      String project, String region, String disk) {
    DeleteRegionDiskRequest request =
        DeleteRegionDiskRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setDisk(disk)
            .build();
    return deleteAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified regional persistent disk. Deleting a regional disk removes all the
   * replicas of its data permanently and is irreversible. However, deleting a disk does not delete
   * any snapshots previously made from the disk. You must separately delete snapshots.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   DeleteRegionDiskRequest request =
   *       DeleteRegionDiskRequest.newBuilder()
   *           .setDisk("disk3083677")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   Operation response = regionDisksClient.deleteAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> deleteAsync(DeleteRegionDiskRequest request) {
    return deleteOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified regional persistent disk. Deleting a regional disk removes all the
   * replicas of its data permanently and is irreversible. However, deleting a disk does not delete
   * any snapshots previously made from the disk. You must separately delete snapshots.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   DeleteRegionDiskRequest request =
   *       DeleteRegionDiskRequest.newBuilder()
   *           .setDisk("disk3083677")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<Operation, Operation> future =
   *       regionDisksClient.deleteOperationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeleteRegionDiskRequest, Operation, Operation>
      deleteOperationCallable() {
    return stub.deleteOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified regional persistent disk. Deleting a regional disk removes all the
   * replicas of its data permanently and is irreversible. However, deleting a disk does not delete
   * any snapshots previously made from the disk. You must separately delete snapshots.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   DeleteRegionDiskRequest request =
   *       DeleteRegionDiskRequest.newBuilder()
   *           .setDisk("disk3083677")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future = regionDisksClient.deleteCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteRegionDiskRequest, Operation> deleteCallable() {
    return stub.deleteCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a specified regional persistent disk.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   String disk = "disk3083677";
   *   Disk response = regionDisksClient.get(project, region, disk);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region Name of the region for this request.
   * @param disk Name of the regional persistent disk to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Disk get(String project, String region, String disk) {
    GetRegionDiskRequest request =
        GetRegionDiskRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setDisk(disk)
            .build();
    return get(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a specified regional persistent disk.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   GetRegionDiskRequest request =
   *       GetRegionDiskRequest.newBuilder()
   *           .setDisk("disk3083677")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .build();
   *   Disk response = regionDisksClient.get(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Disk get(GetRegionDiskRequest request) {
    return getCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a specified regional persistent disk.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   GetRegionDiskRequest request =
   *       GetRegionDiskRequest.newBuilder()
   *           .setDisk("disk3083677")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .build();
   *   ApiFuture<Disk> future = regionDisksClient.getCallable().futureCall(request);
   *   // Do something.
   *   Disk response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetRegionDiskRequest, Disk> getCallable() {
    return stub.getCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the access control policy for a resource. May be empty if no such policy or resource
   * exists.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   String resource = "resource-341064690";
   *   Policy response = regionDisksClient.getIamPolicy(project, region, resource);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region The name of the region for this request.
   * @param resource Name or id of the resource for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy getIamPolicy(String project, String region, String resource) {
    GetIamPolicyRegionDiskRequest request =
        GetIamPolicyRegionDiskRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setResource(resource)
            .build();
    return getIamPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the access control policy for a resource. May be empty if no such policy or resource
   * exists.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   GetIamPolicyRegionDiskRequest request =
   *       GetIamPolicyRegionDiskRequest.newBuilder()
   *           .setOptionsRequestedPolicyVersion(-574521795)
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setResource("resource-341064690")
   *           .build();
   *   Policy response = regionDisksClient.getIamPolicy(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy getIamPolicy(GetIamPolicyRegionDiskRequest request) {
    return getIamPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the access control policy for a resource. May be empty if no such policy or resource
   * exists.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   GetIamPolicyRegionDiskRequest request =
   *       GetIamPolicyRegionDiskRequest.newBuilder()
   *           .setOptionsRequestedPolicyVersion(-574521795)
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setResource("resource-341064690")
   *           .build();
   *   ApiFuture<Policy> future = regionDisksClient.getIamPolicyCallable().futureCall(request);
   *   // Do something.
   *   Policy response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetIamPolicyRegionDiskRequest, Policy> getIamPolicyCallable() {
    return stub.getIamPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a persistent regional disk in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   Disk diskResource = Disk.newBuilder().build();
   *   Operation response = regionDisksClient.insertAsync(project, region, diskResource).get();
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region Name of the region for this request.
   * @param diskResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> insertAsync(
      String project, String region, Disk diskResource) {
    InsertRegionDiskRequest request =
        InsertRegionDiskRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setDiskResource(diskResource)
            .build();
    return insertAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a persistent regional disk in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   InsertRegionDiskRequest request =
   *       InsertRegionDiskRequest.newBuilder()
   *           .setDiskResource(Disk.newBuilder().build())
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setSourceImage("sourceImage-105174528")
   *           .build();
   *   Operation response = regionDisksClient.insertAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> insertAsync(InsertRegionDiskRequest request) {
    return insertOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a persistent regional disk in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   InsertRegionDiskRequest request =
   *       InsertRegionDiskRequest.newBuilder()
   *           .setDiskResource(Disk.newBuilder().build())
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setSourceImage("sourceImage-105174528")
   *           .build();
   *   OperationFuture<Operation, Operation> future =
   *       regionDisksClient.insertOperationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<InsertRegionDiskRequest, Operation, Operation>
      insertOperationCallable() {
    return stub.insertOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a persistent regional disk in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   InsertRegionDiskRequest request =
   *       InsertRegionDiskRequest.newBuilder()
   *           .setDiskResource(Disk.newBuilder().build())
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setSourceImage("sourceImage-105174528")
   *           .build();
   *   ApiFuture<Operation> future = regionDisksClient.insertCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<InsertRegionDiskRequest, Operation> insertCallable() {
    return stub.insertCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the list of persistent disks contained within the specified region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   for (Disk element : regionDisksClient.list(project, region).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region Name of the region for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPagedResponse list(String project, String region) {
    ListRegionDisksRequest request =
        ListRegionDisksRequest.newBuilder().setProject(project).setRegion(region).build();
    return list(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the list of persistent disks contained within the specified region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   ListRegionDisksRequest request =
   *       ListRegionDisksRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   for (Disk element : regionDisksClient.list(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPagedResponse list(ListRegionDisksRequest request) {
    return listPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the list of persistent disks contained within the specified region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   ListRegionDisksRequest request =
   *       ListRegionDisksRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   ApiFuture<Disk> future = regionDisksClient.listPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Disk element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListRegionDisksRequest, ListPagedResponse> listPagedCallable() {
    return stub.listPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the list of persistent disks contained within the specified region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   ListRegionDisksRequest request =
   *       ListRegionDisksRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   while (true) {
   *     DiskList response = regionDisksClient.listCallable().call(request);
   *     for (Disk element : response.getItemsList()) {
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
  public final UnaryCallable<ListRegionDisksRequest, DiskList> listCallable() {
    return stub.listCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Removes resource policies from a regional disk.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   String disk = "disk3083677";
   *   RegionDisksRemoveResourcePoliciesRequest regionDisksRemoveResourcePoliciesRequestResource =
   *       RegionDisksRemoveResourcePoliciesRequest.newBuilder().build();
   *   Operation response =
   *       regionDisksClient
   *           .removeResourcePoliciesAsync(
   *               project, region, disk, regionDisksRemoveResourcePoliciesRequestResource)
   *           .get();
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region The name of the region for this request.
   * @param disk The disk name for this request.
   * @param regionDisksRemoveResourcePoliciesRequestResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> removeResourcePoliciesAsync(
      String project,
      String region,
      String disk,
      RegionDisksRemoveResourcePoliciesRequest regionDisksRemoveResourcePoliciesRequestResource) {
    RemoveResourcePoliciesRegionDiskRequest request =
        RemoveResourcePoliciesRegionDiskRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setDisk(disk)
            .setRegionDisksRemoveResourcePoliciesRequestResource(
                regionDisksRemoveResourcePoliciesRequestResource)
            .build();
    return removeResourcePoliciesAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Removes resource policies from a regional disk.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   RemoveResourcePoliciesRegionDiskRequest request =
   *       RemoveResourcePoliciesRegionDiskRequest.newBuilder()
   *           .setDisk("disk3083677")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRegionDisksRemoveResourcePoliciesRequestResource(
   *               RegionDisksRemoveResourcePoliciesRequest.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   Operation response = regionDisksClient.removeResourcePoliciesAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> removeResourcePoliciesAsync(
      RemoveResourcePoliciesRegionDiskRequest request) {
    return removeResourcePoliciesOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Removes resource policies from a regional disk.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   RemoveResourcePoliciesRegionDiskRequest request =
   *       RemoveResourcePoliciesRegionDiskRequest.newBuilder()
   *           .setDisk("disk3083677")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRegionDisksRemoveResourcePoliciesRequestResource(
   *               RegionDisksRemoveResourcePoliciesRequest.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<Operation, Operation> future =
   *       regionDisksClient.removeResourcePoliciesOperationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<RemoveResourcePoliciesRegionDiskRequest, Operation, Operation>
      removeResourcePoliciesOperationCallable() {
    return stub.removeResourcePoliciesOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Removes resource policies from a regional disk.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   RemoveResourcePoliciesRegionDiskRequest request =
   *       RemoveResourcePoliciesRegionDiskRequest.newBuilder()
   *           .setDisk("disk3083677")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRegionDisksRemoveResourcePoliciesRequestResource(
   *               RegionDisksRemoveResourcePoliciesRequest.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future =
   *       regionDisksClient.removeResourcePoliciesCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<RemoveResourcePoliciesRegionDiskRequest, Operation>
      removeResourcePoliciesCallable() {
    return stub.removeResourcePoliciesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Resizes the specified regional persistent disk.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   String disk = "disk3083677";
   *   RegionDisksResizeRequest regionDisksResizeRequestResource =
   *       RegionDisksResizeRequest.newBuilder().build();
   *   Operation response =
   *       regionDisksClient
   *           .resizeAsync(project, region, disk, regionDisksResizeRequestResource)
   *           .get();
   * }
   * }</pre>
   *
   * @param project The project ID for this request.
   * @param region Name of the region for this request.
   * @param disk Name of the regional persistent disk.
   * @param regionDisksResizeRequestResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> resizeAsync(
      String project,
      String region,
      String disk,
      RegionDisksResizeRequest regionDisksResizeRequestResource) {
    ResizeRegionDiskRequest request =
        ResizeRegionDiskRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setDisk(disk)
            .setRegionDisksResizeRequestResource(regionDisksResizeRequestResource)
            .build();
    return resizeAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Resizes the specified regional persistent disk.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   ResizeRegionDiskRequest request =
   *       ResizeRegionDiskRequest.newBuilder()
   *           .setDisk("disk3083677")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRegionDisksResizeRequestResource(RegionDisksResizeRequest.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   Operation response = regionDisksClient.resizeAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> resizeAsync(ResizeRegionDiskRequest request) {
    return resizeOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Resizes the specified regional persistent disk.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   ResizeRegionDiskRequest request =
   *       ResizeRegionDiskRequest.newBuilder()
   *           .setDisk("disk3083677")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRegionDisksResizeRequestResource(RegionDisksResizeRequest.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<Operation, Operation> future =
   *       regionDisksClient.resizeOperationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<ResizeRegionDiskRequest, Operation, Operation>
      resizeOperationCallable() {
    return stub.resizeOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Resizes the specified regional persistent disk.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   ResizeRegionDiskRequest request =
   *       ResizeRegionDiskRequest.newBuilder()
   *           .setDisk("disk3083677")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRegionDisksResizeRequestResource(RegionDisksResizeRequest.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future = regionDisksClient.resizeCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ResizeRegionDiskRequest, Operation> resizeCallable() {
    return stub.resizeCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the access control policy on the specified resource. Replaces any existing policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   String resource = "resource-341064690";
   *   RegionSetPolicyRequest regionSetPolicyRequestResource =
   *       RegionSetPolicyRequest.newBuilder().build();
   *   Policy response =
   *       regionDisksClient.setIamPolicy(project, region, resource, regionSetPolicyRequestResource);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region The name of the region for this request.
   * @param resource Name or id of the resource for this request.
   * @param regionSetPolicyRequestResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy setIamPolicy(
      String project,
      String region,
      String resource,
      RegionSetPolicyRequest regionSetPolicyRequestResource) {
    SetIamPolicyRegionDiskRequest request =
        SetIamPolicyRegionDiskRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setResource(resource)
            .setRegionSetPolicyRequestResource(regionSetPolicyRequestResource)
            .build();
    return setIamPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the access control policy on the specified resource. Replaces any existing policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   SetIamPolicyRegionDiskRequest request =
   *       SetIamPolicyRegionDiskRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRegionSetPolicyRequestResource(RegionSetPolicyRequest.newBuilder().build())
   *           .setResource("resource-341064690")
   *           .build();
   *   Policy response = regionDisksClient.setIamPolicy(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy setIamPolicy(SetIamPolicyRegionDiskRequest request) {
    return setIamPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the access control policy on the specified resource. Replaces any existing policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   SetIamPolicyRegionDiskRequest request =
   *       SetIamPolicyRegionDiskRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRegionSetPolicyRequestResource(RegionSetPolicyRequest.newBuilder().build())
   *           .setResource("resource-341064690")
   *           .build();
   *   ApiFuture<Policy> future = regionDisksClient.setIamPolicyCallable().futureCall(request);
   *   // Do something.
   *   Policy response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<SetIamPolicyRegionDiskRequest, Policy> setIamPolicyCallable() {
    return stub.setIamPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the labels on the target regional disk.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   String resource = "resource-341064690";
   *   RegionSetLabelsRequest regionSetLabelsRequestResource =
   *       RegionSetLabelsRequest.newBuilder().build();
   *   Operation response =
   *       regionDisksClient
   *           .setLabelsAsync(project, region, resource, regionSetLabelsRequestResource)
   *           .get();
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region The region for this request.
   * @param resource Name or id of the resource for this request.
   * @param regionSetLabelsRequestResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> setLabelsAsync(
      String project,
      String region,
      String resource,
      RegionSetLabelsRequest regionSetLabelsRequestResource) {
    SetLabelsRegionDiskRequest request =
        SetLabelsRegionDiskRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setResource(resource)
            .setRegionSetLabelsRequestResource(regionSetLabelsRequestResource)
            .build();
    return setLabelsAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the labels on the target regional disk.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   SetLabelsRegionDiskRequest request =
   *       SetLabelsRegionDiskRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRegionSetLabelsRequestResource(RegionSetLabelsRequest.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .setResource("resource-341064690")
   *           .build();
   *   Operation response = regionDisksClient.setLabelsAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> setLabelsAsync(
      SetLabelsRegionDiskRequest request) {
    return setLabelsOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the labels on the target regional disk.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   SetLabelsRegionDiskRequest request =
   *       SetLabelsRegionDiskRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRegionSetLabelsRequestResource(RegionSetLabelsRequest.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .setResource("resource-341064690")
   *           .build();
   *   OperationFuture<Operation, Operation> future =
   *       regionDisksClient.setLabelsOperationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<SetLabelsRegionDiskRequest, Operation, Operation>
      setLabelsOperationCallable() {
    return stub.setLabelsOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the labels on the target regional disk.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   SetLabelsRegionDiskRequest request =
   *       SetLabelsRegionDiskRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRegionSetLabelsRequestResource(RegionSetLabelsRequest.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .setResource("resource-341064690")
   *           .build();
   *   ApiFuture<Operation> future = regionDisksClient.setLabelsCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<SetLabelsRegionDiskRequest, Operation> setLabelsCallable() {
    return stub.setLabelsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Starts asynchronous replication. Must be invoked on the primary disk.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   String disk = "disk3083677";
   *   RegionDisksStartAsyncReplicationRequest regionDisksStartAsyncReplicationRequestResource =
   *       RegionDisksStartAsyncReplicationRequest.newBuilder().build();
   *   Operation response =
   *       regionDisksClient
   *           .startAsyncReplicationAsync(
   *               project, region, disk, regionDisksStartAsyncReplicationRequestResource)
   *           .get();
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region The name of the region for this request.
   * @param disk The name of the persistent disk.
   * @param regionDisksStartAsyncReplicationRequestResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> startAsyncReplicationAsync(
      String project,
      String region,
      String disk,
      RegionDisksStartAsyncReplicationRequest regionDisksStartAsyncReplicationRequestResource) {
    StartAsyncReplicationRegionDiskRequest request =
        StartAsyncReplicationRegionDiskRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setDisk(disk)
            .setRegionDisksStartAsyncReplicationRequestResource(
                regionDisksStartAsyncReplicationRequestResource)
            .build();
    return startAsyncReplicationAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Starts asynchronous replication. Must be invoked on the primary disk.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   StartAsyncReplicationRegionDiskRequest request =
   *       StartAsyncReplicationRegionDiskRequest.newBuilder()
   *           .setDisk("disk3083677")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRegionDisksStartAsyncReplicationRequestResource(
   *               RegionDisksStartAsyncReplicationRequest.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   Operation response = regionDisksClient.startAsyncReplicationAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> startAsyncReplicationAsync(
      StartAsyncReplicationRegionDiskRequest request) {
    return startAsyncReplicationOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Starts asynchronous replication. Must be invoked on the primary disk.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   StartAsyncReplicationRegionDiskRequest request =
   *       StartAsyncReplicationRegionDiskRequest.newBuilder()
   *           .setDisk("disk3083677")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRegionDisksStartAsyncReplicationRequestResource(
   *               RegionDisksStartAsyncReplicationRequest.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<Operation, Operation> future =
   *       regionDisksClient.startAsyncReplicationOperationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<StartAsyncReplicationRegionDiskRequest, Operation, Operation>
      startAsyncReplicationOperationCallable() {
    return stub.startAsyncReplicationOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Starts asynchronous replication. Must be invoked on the primary disk.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   StartAsyncReplicationRegionDiskRequest request =
   *       StartAsyncReplicationRegionDiskRequest.newBuilder()
   *           .setDisk("disk3083677")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRegionDisksStartAsyncReplicationRequestResource(
   *               RegionDisksStartAsyncReplicationRequest.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future =
   *       regionDisksClient.startAsyncReplicationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<StartAsyncReplicationRegionDiskRequest, Operation>
      startAsyncReplicationCallable() {
    return stub.startAsyncReplicationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Stops asynchronous replication. Can be invoked either on the primary or on the secondary disk.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   String disk = "disk3083677";
   *   Operation response = regionDisksClient.stopAsyncReplicationAsync(project, region, disk).get();
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region The name of the region for this request.
   * @param disk The name of the persistent disk.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> stopAsyncReplicationAsync(
      String project, String region, String disk) {
    StopAsyncReplicationRegionDiskRequest request =
        StopAsyncReplicationRegionDiskRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setDisk(disk)
            .build();
    return stopAsyncReplicationAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Stops asynchronous replication. Can be invoked either on the primary or on the secondary disk.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   StopAsyncReplicationRegionDiskRequest request =
   *       StopAsyncReplicationRegionDiskRequest.newBuilder()
   *           .setDisk("disk3083677")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   Operation response = regionDisksClient.stopAsyncReplicationAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> stopAsyncReplicationAsync(
      StopAsyncReplicationRegionDiskRequest request) {
    return stopAsyncReplicationOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Stops asynchronous replication. Can be invoked either on the primary or on the secondary disk.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   StopAsyncReplicationRegionDiskRequest request =
   *       StopAsyncReplicationRegionDiskRequest.newBuilder()
   *           .setDisk("disk3083677")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<Operation, Operation> future =
   *       regionDisksClient.stopAsyncReplicationOperationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<StopAsyncReplicationRegionDiskRequest, Operation, Operation>
      stopAsyncReplicationOperationCallable() {
    return stub.stopAsyncReplicationOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Stops asynchronous replication. Can be invoked either on the primary or on the secondary disk.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   StopAsyncReplicationRegionDiskRequest request =
   *       StopAsyncReplicationRegionDiskRequest.newBuilder()
   *           .setDisk("disk3083677")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future =
   *       regionDisksClient.stopAsyncReplicationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<StopAsyncReplicationRegionDiskRequest, Operation>
      stopAsyncReplicationCallable() {
    return stub.stopAsyncReplicationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Stops asynchronous replication for a consistency group of disks. Can be invoked either in the
   * primary or secondary scope.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   DisksStopGroupAsyncReplicationResource disksStopGroupAsyncReplicationResourceResource =
   *       DisksStopGroupAsyncReplicationResource.newBuilder().build();
   *   Operation response =
   *       regionDisksClient
   *           .stopGroupAsyncReplicationAsync(
   *               project, region, disksStopGroupAsyncReplicationResourceResource)
   *           .get();
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region The name of the region for this request. This must be the region of the primary
   *     or secondary disks in the consistency group.
   * @param disksStopGroupAsyncReplicationResourceResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> stopGroupAsyncReplicationAsync(
      String project,
      String region,
      DisksStopGroupAsyncReplicationResource disksStopGroupAsyncReplicationResourceResource) {
    StopGroupAsyncReplicationRegionDiskRequest request =
        StopGroupAsyncReplicationRegionDiskRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setDisksStopGroupAsyncReplicationResourceResource(
                disksStopGroupAsyncReplicationResourceResource)
            .build();
    return stopGroupAsyncReplicationAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Stops asynchronous replication for a consistency group of disks. Can be invoked either in the
   * primary or secondary scope.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   StopGroupAsyncReplicationRegionDiskRequest request =
   *       StopGroupAsyncReplicationRegionDiskRequest.newBuilder()
   *           .setDisksStopGroupAsyncReplicationResourceResource(
   *               DisksStopGroupAsyncReplicationResource.newBuilder().build())
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   Operation response = regionDisksClient.stopGroupAsyncReplicationAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> stopGroupAsyncReplicationAsync(
      StopGroupAsyncReplicationRegionDiskRequest request) {
    return stopGroupAsyncReplicationOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Stops asynchronous replication for a consistency group of disks. Can be invoked either in the
   * primary or secondary scope.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   StopGroupAsyncReplicationRegionDiskRequest request =
   *       StopGroupAsyncReplicationRegionDiskRequest.newBuilder()
   *           .setDisksStopGroupAsyncReplicationResourceResource(
   *               DisksStopGroupAsyncReplicationResource.newBuilder().build())
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<Operation, Operation> future =
   *       regionDisksClient.stopGroupAsyncReplicationOperationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<StopGroupAsyncReplicationRegionDiskRequest, Operation, Operation>
      stopGroupAsyncReplicationOperationCallable() {
    return stub.stopGroupAsyncReplicationOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Stops asynchronous replication for a consistency group of disks. Can be invoked either in the
   * primary or secondary scope.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   StopGroupAsyncReplicationRegionDiskRequest request =
   *       StopGroupAsyncReplicationRegionDiskRequest.newBuilder()
   *           .setDisksStopGroupAsyncReplicationResourceResource(
   *               DisksStopGroupAsyncReplicationResource.newBuilder().build())
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future =
   *       regionDisksClient.stopGroupAsyncReplicationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<StopGroupAsyncReplicationRegionDiskRequest, Operation>
      stopGroupAsyncReplicationCallable() {
    return stub.stopGroupAsyncReplicationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns permissions that a caller has on the specified resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   String resource = "resource-341064690";
   *   TestPermissionsRequest testPermissionsRequestResource =
   *       TestPermissionsRequest.newBuilder().build();
   *   TestPermissionsResponse response =
   *       regionDisksClient.testIamPermissions(
   *           project, region, resource, testPermissionsRequestResource);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region The name of the region for this request.
   * @param resource Name or id of the resource for this request.
   * @param testPermissionsRequestResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final TestPermissionsResponse testIamPermissions(
      String project,
      String region,
      String resource,
      TestPermissionsRequest testPermissionsRequestResource) {
    TestIamPermissionsRegionDiskRequest request =
        TestIamPermissionsRegionDiskRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setResource(resource)
            .setTestPermissionsRequestResource(testPermissionsRequestResource)
            .build();
    return testIamPermissions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns permissions that a caller has on the specified resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   TestIamPermissionsRegionDiskRequest request =
   *       TestIamPermissionsRegionDiskRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setResource("resource-341064690")
   *           .setTestPermissionsRequestResource(TestPermissionsRequest.newBuilder().build())
   *           .build();
   *   TestPermissionsResponse response = regionDisksClient.testIamPermissions(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final TestPermissionsResponse testIamPermissions(
      TestIamPermissionsRegionDiskRequest request) {
    return testIamPermissionsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns permissions that a caller has on the specified resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   TestIamPermissionsRegionDiskRequest request =
   *       TestIamPermissionsRegionDiskRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setResource("resource-341064690")
   *           .setTestPermissionsRequestResource(TestPermissionsRequest.newBuilder().build())
   *           .build();
   *   ApiFuture<TestPermissionsResponse> future =
   *       regionDisksClient.testIamPermissionsCallable().futureCall(request);
   *   // Do something.
   *   TestPermissionsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<TestIamPermissionsRegionDiskRequest, TestPermissionsResponse>
      testIamPermissionsCallable() {
    return stub.testIamPermissionsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Update the specified disk with the data included in the request. Update is performed only on
   * selected fields included as part of update-mask. Only the following fields can be modified:
   * user_license.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   String disk = "disk3083677";
   *   Disk diskResource = Disk.newBuilder().build();
   *   Operation response = regionDisksClient.updateAsync(project, region, disk, diskResource).get();
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region The name of the region for this request.
   * @param disk The disk name for this request.
   * @param diskResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> updateAsync(
      String project, String region, String disk, Disk diskResource) {
    UpdateRegionDiskRequest request =
        UpdateRegionDiskRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setDisk(disk)
            .setDiskResource(diskResource)
            .build();
    return updateAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Update the specified disk with the data included in the request. Update is performed only on
   * selected fields included as part of update-mask. Only the following fields can be modified:
   * user_license.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   UpdateRegionDiskRequest request =
   *       UpdateRegionDiskRequest.newBuilder()
   *           .setDisk("disk3083677")
   *           .setDiskResource(Disk.newBuilder().build())
   *           .setPaths("paths106438894")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setUpdateMask("updateMask-296147115")
   *           .build();
   *   Operation response = regionDisksClient.updateAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> updateAsync(UpdateRegionDiskRequest request) {
    return updateOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Update the specified disk with the data included in the request. Update is performed only on
   * selected fields included as part of update-mask. Only the following fields can be modified:
   * user_license.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   UpdateRegionDiskRequest request =
   *       UpdateRegionDiskRequest.newBuilder()
   *           .setDisk("disk3083677")
   *           .setDiskResource(Disk.newBuilder().build())
   *           .setPaths("paths106438894")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setUpdateMask("updateMask-296147115")
   *           .build();
   *   OperationFuture<Operation, Operation> future =
   *       regionDisksClient.updateOperationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<UpdateRegionDiskRequest, Operation, Operation>
      updateOperationCallable() {
    return stub.updateOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Update the specified disk with the data included in the request. Update is performed only on
   * selected fields included as part of update-mask. Only the following fields can be modified:
   * user_license.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RegionDisksClient regionDisksClient = RegionDisksClient.create()) {
   *   UpdateRegionDiskRequest request =
   *       UpdateRegionDiskRequest.newBuilder()
   *           .setDisk("disk3083677")
   *           .setDiskResource(Disk.newBuilder().build())
   *           .setPaths("paths106438894")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setUpdateMask("updateMask-296147115")
   *           .build();
   *   ApiFuture<Operation> future = regionDisksClient.updateCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateRegionDiskRequest, Operation> updateCallable() {
    return stub.updateCallable();
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

  public static class ListPagedResponse
      extends AbstractPagedListResponse<
          ListRegionDisksRequest, DiskList, Disk, ListPage, ListFixedSizeCollection> {

    public static ApiFuture<ListPagedResponse> createAsync(
        PageContext<ListRegionDisksRequest, DiskList, Disk> context,
        ApiFuture<DiskList> futureResponse) {
      ApiFuture<ListPage> futurePage =
          ListPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage, input -> new ListPagedResponse(input), MoreExecutors.directExecutor());
    }

    private ListPagedResponse(ListPage page) {
      super(page, ListFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListPage
      extends AbstractPage<ListRegionDisksRequest, DiskList, Disk, ListPage> {

    private ListPage(
        PageContext<ListRegionDisksRequest, DiskList, Disk> context, DiskList response) {
      super(context, response);
    }

    private static ListPage createEmptyPage() {
      return new ListPage(null, null);
    }

    @Override
    protected ListPage createPage(
        PageContext<ListRegionDisksRequest, DiskList, Disk> context, DiskList response) {
      return new ListPage(context, response);
    }

    @Override
    public ApiFuture<ListPage> createPageAsync(
        PageContext<ListRegionDisksRequest, DiskList, Disk> context,
        ApiFuture<DiskList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListRegionDisksRequest, DiskList, Disk, ListPage, ListFixedSizeCollection> {

    private ListFixedSizeCollection(List<ListPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListFixedSizeCollection createEmptyCollection() {
      return new ListFixedSizeCollection(null, 0);
    }

    @Override
    protected ListFixedSizeCollection createCollection(List<ListPage> pages, int collectionSize) {
      return new ListFixedSizeCollection(pages, collectionSize);
    }
  }
}
