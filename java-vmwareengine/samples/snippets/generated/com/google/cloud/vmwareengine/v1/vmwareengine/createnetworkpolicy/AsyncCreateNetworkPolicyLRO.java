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

package com.google.cloud.vmwareengine.v1.samples;

// [START vmwareengine_v1_generated_VmwareEngine_CreateNetworkPolicy_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.vmwareengine.v1.CreateNetworkPolicyRequest;
import com.google.cloud.vmwareengine.v1.LocationName;
import com.google.cloud.vmwareengine.v1.NetworkPolicy;
import com.google.cloud.vmwareengine.v1.OperationMetadata;
import com.google.cloud.vmwareengine.v1.VmwareEngineClient;

public class AsyncCreateNetworkPolicyLRO {

  public static void main(String[] args) throws Exception {
    asyncCreateNetworkPolicyLRO();
  }

  public static void asyncCreateNetworkPolicyLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (VmwareEngineClient vmwareEngineClient = VmwareEngineClient.create()) {
      CreateNetworkPolicyRequest request =
          CreateNetworkPolicyRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setNetworkPolicyId("networkPolicyId-727262661")
              .setNetworkPolicy(NetworkPolicy.newBuilder().build())
              .setRequestId("requestId693933066")
              .build();
      OperationFuture<NetworkPolicy, OperationMetadata> future =
          vmwareEngineClient.createNetworkPolicyOperationCallable().futureCall(request);
      // Do something.
      NetworkPolicy response = future.get();
    }
  }
}
// [END vmwareengine_v1_generated_VmwareEngine_CreateNetworkPolicy_LRO_async]
