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

package com.google.cloud.managedidentities.v1beta1.samples;

// [START managedidentities_v1beta1_generated_ManagedIdentitiesService_ValidateTrust_StringTrust_sync]
import com.google.cloud.managedidentities.v1beta1.Domain;
import com.google.cloud.managedidentities.v1beta1.DomainName;
import com.google.cloud.managedidentities.v1beta1.ManagedIdentitiesServiceClient;
import com.google.cloud.managedidentities.v1beta1.Trust;

public class SyncValidateTrustStringTrust {

  public static void main(String[] args) throws Exception {
    syncValidateTrustStringTrust();
  }

  public static void syncValidateTrustStringTrust() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ManagedIdentitiesServiceClient managedIdentitiesServiceClient =
        ManagedIdentitiesServiceClient.create()) {
      String name = DomainName.of("[PROJECT]", "[LOCATION]", "[DOMAIN]").toString();
      Trust trust = Trust.newBuilder().build();
      Domain response = managedIdentitiesServiceClient.validateTrustAsync(name, trust).get();
    }
  }
}
// [END managedidentities_v1beta1_generated_ManagedIdentitiesService_ValidateTrust_StringTrust_sync]
