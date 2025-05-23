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

/**
 * A client to Google Ad Manager API
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= AdUnitServiceClient =======================
 *
 * <p>Service Description: Provides methods for handling AdUnit objects.
 *
 * <p>Sample for AdUnitServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (AdUnitServiceClient adUnitServiceClient = AdUnitServiceClient.create()) {
 *   AdUnitName name = AdUnitName.of("[NETWORK_CODE]", "[AD_UNIT]");
 *   AdUnit response = adUnitServiceClient.getAdUnit(name);
 * }
 * }</pre>
 *
 * <p>======================= CompanyServiceClient =======================
 *
 * <p>Service Description: Provides methods for handling `Company` objects.
 *
 * <p>Sample for CompanyServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
 *   CompanyName name = CompanyName.of("[NETWORK_CODE]", "[COMPANY]");
 *   Company response = companyServiceClient.getCompany(name);
 * }
 * }</pre>
 *
 * <p>======================= CustomFieldServiceClient =======================
 *
 * <p>Service Description: Provides methods for handling `CustomField` objects.
 *
 * <p>Sample for CustomFieldServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (CustomFieldServiceClient customFieldServiceClient = CustomFieldServiceClient.create()) {
 *   CustomFieldName name = CustomFieldName.of("[NETWORK_CODE]", "[CUSTOM_FIELD]");
 *   CustomField response = customFieldServiceClient.getCustomField(name);
 * }
 * }</pre>
 *
 * <p>======================= CustomTargetingKeyServiceClient =======================
 *
 * <p>Service Description: Provides methods for handling `CustomTargetingKey` objects.
 *
 * <p>Sample for CustomTargetingKeyServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (CustomTargetingKeyServiceClient customTargetingKeyServiceClient =
 *     CustomTargetingKeyServiceClient.create()) {
 *   CustomTargetingKeyName name =
 *       CustomTargetingKeyName.of("[NETWORK_CODE]", "[CUSTOM_TARGETING_KEY]");
 *   CustomTargetingKey response = customTargetingKeyServiceClient.getCustomTargetingKey(name);
 * }
 * }</pre>
 *
 * <p>======================= CustomTargetingValueServiceClient =======================
 *
 * <p>Service Description: Provides methods for handling `CustomTargetingValue` objects.
 *
 * <p>Sample for CustomTargetingValueServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (CustomTargetingValueServiceClient customTargetingValueServiceClient =
 *     CustomTargetingValueServiceClient.create()) {
 *   CustomTargetingValueName name =
 *       CustomTargetingValueName.of(
 *           "[NETWORK_CODE]", "[CUSTOM_TARGETING_KEY]", "[CUSTOM_TARGETING_VALUE]");
 *   CustomTargetingValue response =
 *       customTargetingValueServiceClient.getCustomTargetingValue(name);
 * }
 * }</pre>
 *
 * <p>======================= EntitySignalsMappingServiceClient =======================
 *
 * <p>Service Description: Provides methods for handling `EntitySignalsMapping` objects.
 *
 * <p>Sample for EntitySignalsMappingServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (EntitySignalsMappingServiceClient entitySignalsMappingServiceClient =
 *     EntitySignalsMappingServiceClient.create()) {
 *   EntitySignalsMappingName name =
 *       EntitySignalsMappingName.of("[NETWORK_CODE]", "[ENTITY_SIGNALS_MAPPING]");
 *   EntitySignalsMapping response =
 *       entitySignalsMappingServiceClient.getEntitySignalsMapping(name);
 * }
 * }</pre>
 *
 * <p>======================= NetworkServiceClient =======================
 *
 * <p>Service Description: Provides methods for handling Network objects.
 *
 * <p>Sample for NetworkServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (NetworkServiceClient networkServiceClient = NetworkServiceClient.create()) {
 *   NetworkName name = NetworkName.of("[NETWORK_CODE]");
 *   Network response = networkServiceClient.getNetwork(name);
 * }
 * }</pre>
 *
 * <p>======================= OrderServiceClient =======================
 *
 * <p>Service Description: Provides methods for handling `Order` objects.
 *
 * <p>Sample for OrderServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (OrderServiceClient orderServiceClient = OrderServiceClient.create()) {
 *   OrderName name = OrderName.of("[NETWORK_CODE]", "[ORDER]");
 *   Order response = orderServiceClient.getOrder(name);
 * }
 * }</pre>
 *
 * <p>======================= PlacementServiceClient =======================
 *
 * <p>Service Description: Provides methods for handling `Placement` objects.
 *
 * <p>Sample for PlacementServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (PlacementServiceClient placementServiceClient = PlacementServiceClient.create()) {
 *   PlacementName name = PlacementName.of("[NETWORK_CODE]", "[PLACEMENT]");
 *   Placement response = placementServiceClient.getPlacement(name);
 * }
 * }</pre>
 *
 * <p>======================= ReportServiceClient =======================
 *
 * <p>Service Description: Provides methods for interacting with reports.
 *
 * <p>Sample for ReportServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (ReportServiceClient reportServiceClient = ReportServiceClient.create()) {
 *   ReportName name = ReportName.of("[NETWORK_CODE]", "[REPORT]");
 *   Report response = reportServiceClient.getReport(name);
 * }
 * }</pre>
 *
 * <p>======================= RoleServiceClient =======================
 *
 * <p>Service Description: Provides methods for handling `Role` objects.
 *
 * <p>Sample for RoleServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (RoleServiceClient roleServiceClient = RoleServiceClient.create()) {
 *   RoleName name = RoleName.of("[NETWORK_CODE]", "[ROLE]");
 *   Role response = roleServiceClient.getRole(name);
 * }
 * }</pre>
 *
 * <p>======================= TaxonomyCategoryServiceClient =======================
 *
 * <p>Service Description: Provides methods for handling `TaxonomyCategory` objects.
 *
 * <p>Sample for TaxonomyCategoryServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (TaxonomyCategoryServiceClient taxonomyCategoryServiceClient =
 *     TaxonomyCategoryServiceClient.create()) {
 *   TaxonomyCategoryName name = TaxonomyCategoryName.of("[NETWORK_CODE]", "[TAXONOMY_CATEGORY]");
 *   TaxonomyCategory response = taxonomyCategoryServiceClient.getTaxonomyCategory(name);
 * }
 * }</pre>
 *
 * <p>======================= UserServiceClient =======================
 *
 * <p>Service Description: Provides methods for handling User objects.
 *
 * <p>Sample for UserServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (UserServiceClient userServiceClient = UserServiceClient.create()) {
 *   UserName name = UserName.of("[NETWORK_CODE]", "[USER]");
 *   User response = userServiceClient.getUser(name);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.ads.admanager.v1;

import javax.annotation.Generated;
