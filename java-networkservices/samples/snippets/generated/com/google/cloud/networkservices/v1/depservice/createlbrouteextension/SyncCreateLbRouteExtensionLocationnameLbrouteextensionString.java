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

package com.google.cloud.networkservices.v1.samples;

// [START networkservices_v1_generated_DepService_CreateLbRouteExtension_LocationnameLbrouteextensionString_sync]
import com.google.cloud.networkservices.v1.DepServiceClient;
import com.google.cloud.networkservices.v1.LbRouteExtension;
import com.google.cloud.networkservices.v1.LocationName;

public class SyncCreateLbRouteExtensionLocationnameLbrouteextensionString {

  public static void main(String[] args) throws Exception {
    syncCreateLbRouteExtensionLocationnameLbrouteextensionString();
  }

  public static void syncCreateLbRouteExtensionLocationnameLbrouteextensionString()
      throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DepServiceClient depServiceClient = DepServiceClient.create()) {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      LbRouteExtension lbRouteExtension = LbRouteExtension.newBuilder().build();
      String lbRouteExtensionId = "lbRouteExtensionId-1336830649";
      LbRouteExtension response =
          depServiceClient
              .createLbRouteExtensionAsync(parent, lbRouteExtension, lbRouteExtensionId)
              .get();
    }
  }
}
// [END networkservices_v1_generated_DepService_CreateLbRouteExtension_LocationnameLbrouteextensionString_sync]
