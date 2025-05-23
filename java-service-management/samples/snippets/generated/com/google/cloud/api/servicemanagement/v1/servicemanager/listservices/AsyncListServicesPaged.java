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

package com.google.cloud.api.servicemanagement.v1.samples;

// [START servicemanagement_v1_generated_ServiceManager_ListServices_Paged_async]
import com.google.api.servicemanagement.v1.ListServicesRequest;
import com.google.api.servicemanagement.v1.ListServicesResponse;
import com.google.api.servicemanagement.v1.ManagedService;
import com.google.cloud.api.servicemanagement.v1.ServiceManagerClient;
import com.google.common.base.Strings;

public class AsyncListServicesPaged {

  public static void main(String[] args) throws Exception {
    asyncListServicesPaged();
  }

  public static void asyncListServicesPaged() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ServiceManagerClient serviceManagerClient = ServiceManagerClient.create()) {
      ListServicesRequest request =
          ListServicesRequest.newBuilder()
              .setProducerProjectId("producerProjectId-1297373534")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setConsumerId("consumerId-166238287")
              .build();
      while (true) {
        ListServicesResponse response = serviceManagerClient.listServicesCallable().call(request);
        for (ManagedService element : response.getServicesList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END servicemanagement_v1_generated_ServiceManager_ListServices_Paged_async]
