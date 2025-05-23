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

package com.google.maps.fleetengine.v1.samples;

// [START fleetengine_v1_generated_TripService_ReportBillableTrip_sync]
import com.google.maps.fleetengine.v1.BillingPlatformIdentifier;
import com.google.maps.fleetengine.v1.ReportBillableTripRequest;
import com.google.maps.fleetengine.v1.TripServiceClient;
import com.google.protobuf.Empty;
import java.util.ArrayList;

public class SyncReportBillableTrip {

  public static void main(String[] args) throws Exception {
    syncReportBillableTrip();
  }

  public static void syncReportBillableTrip() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (TripServiceClient tripServiceClient = TripServiceClient.create()) {
      ReportBillableTripRequest request =
          ReportBillableTripRequest.newBuilder()
              .setName("name3373707")
              .setCountryCode("countryCode-1477067101")
              .setPlatform(BillingPlatformIdentifier.forNumber(0))
              .addAllRelatedIds(new ArrayList<String>())
              .build();
      tripServiceClient.reportBillableTrip(request);
    }
  }
}
// [END fleetengine_v1_generated_TripService_ReportBillableTrip_sync]
