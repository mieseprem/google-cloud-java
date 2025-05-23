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

package com.google.cloud.talent.v4;

import static com.google.cloud.talent.v4.JobServiceClient.ListJobsPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.testing.MockHttpService;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.testing.FakeStatusCode;
import com.google.cloud.talent.v4.stub.HttpJsonJobServiceStub;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.protobuf.Any;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class JobServiceClientHttpJsonTest {
  private static MockHttpService mockService;
  private static JobServiceClient client;

  @BeforeClass
  public static void startStaticServer() throws IOException {
    mockService =
        new MockHttpService(
            HttpJsonJobServiceStub.getMethodDescriptors(), JobServiceSettings.getDefaultEndpoint());
    JobServiceSettings settings =
        JobServiceSettings.newHttpJsonBuilder()
            .setTransportChannelProvider(
                JobServiceSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = JobServiceClient.create(settings);
  }

  @AfterClass
  public static void stopServer() {
    client.close();
  }

  @Before
  public void setUp() {}

  @After
  public void tearDown() throws Exception {
    mockService.reset();
  }

  @Test
  public void createJobTest() throws Exception {
    Job expectedResponse =
        Job.newBuilder()
            .setName(JobName.of("[PROJECT]", "[TENANT]", "[JOB]").toString())
            .setCompany(CompanyName.of("[PROJECT]", "[TENANT]", "[COMPANY]").toString())
            .setRequisitionId("requisitionId-1769495849")
            .setTitle("title110371416")
            .setDescription("description-1724546052")
            .addAllAddresses(new ArrayList<String>())
            .setApplicationInfo(Job.ApplicationInfo.newBuilder().build())
            .addAllJobBenefits(new ArrayList<JobBenefit>())
            .setCompensationInfo(CompensationInfo.newBuilder().build())
            .putAllCustomAttributes(new HashMap<String, CustomAttribute>())
            .addAllDegreeTypes(new ArrayList<DegreeType>())
            .setDepartment("department848184146")
            .addAllEmploymentTypes(new ArrayList<EmploymentType>())
            .setIncentives("incentives-1262874520")
            .setLanguageCode("languageCode-2092349083")
            .setJobLevel(JobLevel.forNumber(0))
            .setPromotionValue(353413845)
            .setQualifications("qualifications1903501412")
            .setResponsibilities("responsibilities-926952660")
            .setPostingRegion(PostingRegion.forNumber(0))
            .setVisibility(Visibility.forNumber(0))
            .setJobStartTime(Timestamp.newBuilder().build())
            .setJobEndTime(Timestamp.newBuilder().build())
            .setPostingPublishTime(Timestamp.newBuilder().build())
            .setPostingExpireTime(Timestamp.newBuilder().build())
            .setPostingCreateTime(Timestamp.newBuilder().build())
            .setPostingUpdateTime(Timestamp.newBuilder().build())
            .setCompanyDisplayName("companyDisplayName-686915152")
            .setDerivedInfo(Job.DerivedInfo.newBuilder().build())
            .setProcessingOptions(Job.ProcessingOptions.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    TenantName parent = TenantName.of("[PROJECT]", "[TENANT]");
    Job job = Job.newBuilder().build();

    Job actualResponse = client.createJob(parent, job);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createJobExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      TenantName parent = TenantName.of("[PROJECT]", "[TENANT]");
      Job job = Job.newBuilder().build();
      client.createJob(parent, job);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createJobTest2() throws Exception {
    Job expectedResponse =
        Job.newBuilder()
            .setName(JobName.of("[PROJECT]", "[TENANT]", "[JOB]").toString())
            .setCompany(CompanyName.of("[PROJECT]", "[TENANT]", "[COMPANY]").toString())
            .setRequisitionId("requisitionId-1769495849")
            .setTitle("title110371416")
            .setDescription("description-1724546052")
            .addAllAddresses(new ArrayList<String>())
            .setApplicationInfo(Job.ApplicationInfo.newBuilder().build())
            .addAllJobBenefits(new ArrayList<JobBenefit>())
            .setCompensationInfo(CompensationInfo.newBuilder().build())
            .putAllCustomAttributes(new HashMap<String, CustomAttribute>())
            .addAllDegreeTypes(new ArrayList<DegreeType>())
            .setDepartment("department848184146")
            .addAllEmploymentTypes(new ArrayList<EmploymentType>())
            .setIncentives("incentives-1262874520")
            .setLanguageCode("languageCode-2092349083")
            .setJobLevel(JobLevel.forNumber(0))
            .setPromotionValue(353413845)
            .setQualifications("qualifications1903501412")
            .setResponsibilities("responsibilities-926952660")
            .setPostingRegion(PostingRegion.forNumber(0))
            .setVisibility(Visibility.forNumber(0))
            .setJobStartTime(Timestamp.newBuilder().build())
            .setJobEndTime(Timestamp.newBuilder().build())
            .setPostingPublishTime(Timestamp.newBuilder().build())
            .setPostingExpireTime(Timestamp.newBuilder().build())
            .setPostingCreateTime(Timestamp.newBuilder().build())
            .setPostingUpdateTime(Timestamp.newBuilder().build())
            .setCompanyDisplayName("companyDisplayName-686915152")
            .setDerivedInfo(Job.DerivedInfo.newBuilder().build())
            .setProcessingOptions(Job.ProcessingOptions.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-8940/tenants/tenant-8940";
    Job job = Job.newBuilder().build();

    Job actualResponse = client.createJob(parent, job);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createJobExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-8940/tenants/tenant-8940";
      Job job = Job.newBuilder().build();
      client.createJob(parent, job);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void batchCreateJobsTest() throws Exception {
    BatchCreateJobsResponse expectedResponse =
        BatchCreateJobsResponse.newBuilder().addAllJobResults(new ArrayList<JobResult>()).build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("batchCreateJobsTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    TenantName parent = TenantName.of("[PROJECT]", "[TENANT]");
    List<Job> jobs = new ArrayList<>();

    BatchCreateJobsResponse actualResponse = client.batchCreateJobsAsync(parent, jobs).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void batchCreateJobsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      TenantName parent = TenantName.of("[PROJECT]", "[TENANT]");
      List<Job> jobs = new ArrayList<>();
      client.batchCreateJobsAsync(parent, jobs).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void batchCreateJobsTest2() throws Exception {
    BatchCreateJobsResponse expectedResponse =
        BatchCreateJobsResponse.newBuilder().addAllJobResults(new ArrayList<JobResult>()).build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("batchCreateJobsTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String parent = "projects/project-8940/tenants/tenant-8940";
    List<Job> jobs = new ArrayList<>();

    BatchCreateJobsResponse actualResponse = client.batchCreateJobsAsync(parent, jobs).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void batchCreateJobsExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-8940/tenants/tenant-8940";
      List<Job> jobs = new ArrayList<>();
      client.batchCreateJobsAsync(parent, jobs).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void getJobTest() throws Exception {
    Job expectedResponse =
        Job.newBuilder()
            .setName(JobName.of("[PROJECT]", "[TENANT]", "[JOB]").toString())
            .setCompany(CompanyName.of("[PROJECT]", "[TENANT]", "[COMPANY]").toString())
            .setRequisitionId("requisitionId-1769495849")
            .setTitle("title110371416")
            .setDescription("description-1724546052")
            .addAllAddresses(new ArrayList<String>())
            .setApplicationInfo(Job.ApplicationInfo.newBuilder().build())
            .addAllJobBenefits(new ArrayList<JobBenefit>())
            .setCompensationInfo(CompensationInfo.newBuilder().build())
            .putAllCustomAttributes(new HashMap<String, CustomAttribute>())
            .addAllDegreeTypes(new ArrayList<DegreeType>())
            .setDepartment("department848184146")
            .addAllEmploymentTypes(new ArrayList<EmploymentType>())
            .setIncentives("incentives-1262874520")
            .setLanguageCode("languageCode-2092349083")
            .setJobLevel(JobLevel.forNumber(0))
            .setPromotionValue(353413845)
            .setQualifications("qualifications1903501412")
            .setResponsibilities("responsibilities-926952660")
            .setPostingRegion(PostingRegion.forNumber(0))
            .setVisibility(Visibility.forNumber(0))
            .setJobStartTime(Timestamp.newBuilder().build())
            .setJobEndTime(Timestamp.newBuilder().build())
            .setPostingPublishTime(Timestamp.newBuilder().build())
            .setPostingExpireTime(Timestamp.newBuilder().build())
            .setPostingCreateTime(Timestamp.newBuilder().build())
            .setPostingUpdateTime(Timestamp.newBuilder().build())
            .setCompanyDisplayName("companyDisplayName-686915152")
            .setDerivedInfo(Job.DerivedInfo.newBuilder().build())
            .setProcessingOptions(Job.ProcessingOptions.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    JobName name = JobName.of("[PROJECT]", "[TENANT]", "[JOB]");

    Job actualResponse = client.getJob(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getJobExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      JobName name = JobName.of("[PROJECT]", "[TENANT]", "[JOB]");
      client.getJob(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getJobTest2() throws Exception {
    Job expectedResponse =
        Job.newBuilder()
            .setName(JobName.of("[PROJECT]", "[TENANT]", "[JOB]").toString())
            .setCompany(CompanyName.of("[PROJECT]", "[TENANT]", "[COMPANY]").toString())
            .setRequisitionId("requisitionId-1769495849")
            .setTitle("title110371416")
            .setDescription("description-1724546052")
            .addAllAddresses(new ArrayList<String>())
            .setApplicationInfo(Job.ApplicationInfo.newBuilder().build())
            .addAllJobBenefits(new ArrayList<JobBenefit>())
            .setCompensationInfo(CompensationInfo.newBuilder().build())
            .putAllCustomAttributes(new HashMap<String, CustomAttribute>())
            .addAllDegreeTypes(new ArrayList<DegreeType>())
            .setDepartment("department848184146")
            .addAllEmploymentTypes(new ArrayList<EmploymentType>())
            .setIncentives("incentives-1262874520")
            .setLanguageCode("languageCode-2092349083")
            .setJobLevel(JobLevel.forNumber(0))
            .setPromotionValue(353413845)
            .setQualifications("qualifications1903501412")
            .setResponsibilities("responsibilities-926952660")
            .setPostingRegion(PostingRegion.forNumber(0))
            .setVisibility(Visibility.forNumber(0))
            .setJobStartTime(Timestamp.newBuilder().build())
            .setJobEndTime(Timestamp.newBuilder().build())
            .setPostingPublishTime(Timestamp.newBuilder().build())
            .setPostingExpireTime(Timestamp.newBuilder().build())
            .setPostingCreateTime(Timestamp.newBuilder().build())
            .setPostingUpdateTime(Timestamp.newBuilder().build())
            .setCompanyDisplayName("companyDisplayName-686915152")
            .setDerivedInfo(Job.DerivedInfo.newBuilder().build())
            .setProcessingOptions(Job.ProcessingOptions.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    String name = "projects/project-4373/tenants/tenant-4373/jobs/job-4373";

    Job actualResponse = client.getJob(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getJobExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name = "projects/project-4373/tenants/tenant-4373/jobs/job-4373";
      client.getJob(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateJobTest() throws Exception {
    Job expectedResponse =
        Job.newBuilder()
            .setName(JobName.of("[PROJECT]", "[TENANT]", "[JOB]").toString())
            .setCompany(CompanyName.of("[PROJECT]", "[TENANT]", "[COMPANY]").toString())
            .setRequisitionId("requisitionId-1769495849")
            .setTitle("title110371416")
            .setDescription("description-1724546052")
            .addAllAddresses(new ArrayList<String>())
            .setApplicationInfo(Job.ApplicationInfo.newBuilder().build())
            .addAllJobBenefits(new ArrayList<JobBenefit>())
            .setCompensationInfo(CompensationInfo.newBuilder().build())
            .putAllCustomAttributes(new HashMap<String, CustomAttribute>())
            .addAllDegreeTypes(new ArrayList<DegreeType>())
            .setDepartment("department848184146")
            .addAllEmploymentTypes(new ArrayList<EmploymentType>())
            .setIncentives("incentives-1262874520")
            .setLanguageCode("languageCode-2092349083")
            .setJobLevel(JobLevel.forNumber(0))
            .setPromotionValue(353413845)
            .setQualifications("qualifications1903501412")
            .setResponsibilities("responsibilities-926952660")
            .setPostingRegion(PostingRegion.forNumber(0))
            .setVisibility(Visibility.forNumber(0))
            .setJobStartTime(Timestamp.newBuilder().build())
            .setJobEndTime(Timestamp.newBuilder().build())
            .setPostingPublishTime(Timestamp.newBuilder().build())
            .setPostingExpireTime(Timestamp.newBuilder().build())
            .setPostingCreateTime(Timestamp.newBuilder().build())
            .setPostingUpdateTime(Timestamp.newBuilder().build())
            .setCompanyDisplayName("companyDisplayName-686915152")
            .setDerivedInfo(Job.DerivedInfo.newBuilder().build())
            .setProcessingOptions(Job.ProcessingOptions.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    Job job =
        Job.newBuilder()
            .setName(JobName.of("[PROJECT]", "[TENANT]", "[JOB]").toString())
            .setCompany(CompanyName.of("[PROJECT]", "[TENANT]", "[COMPANY]").toString())
            .setRequisitionId("requisitionId-1769495849")
            .setTitle("title110371416")
            .setDescription("description-1724546052")
            .addAllAddresses(new ArrayList<String>())
            .setApplicationInfo(Job.ApplicationInfo.newBuilder().build())
            .addAllJobBenefits(new ArrayList<JobBenefit>())
            .setCompensationInfo(CompensationInfo.newBuilder().build())
            .putAllCustomAttributes(new HashMap<String, CustomAttribute>())
            .addAllDegreeTypes(new ArrayList<DegreeType>())
            .setDepartment("department848184146")
            .addAllEmploymentTypes(new ArrayList<EmploymentType>())
            .setIncentives("incentives-1262874520")
            .setLanguageCode("languageCode-2092349083")
            .setJobLevel(JobLevel.forNumber(0))
            .setPromotionValue(353413845)
            .setQualifications("qualifications1903501412")
            .setResponsibilities("responsibilities-926952660")
            .setPostingRegion(PostingRegion.forNumber(0))
            .setVisibility(Visibility.forNumber(0))
            .setJobStartTime(Timestamp.newBuilder().build())
            .setJobEndTime(Timestamp.newBuilder().build())
            .setPostingPublishTime(Timestamp.newBuilder().build())
            .setPostingExpireTime(Timestamp.newBuilder().build())
            .setPostingCreateTime(Timestamp.newBuilder().build())
            .setPostingUpdateTime(Timestamp.newBuilder().build())
            .setCompanyDisplayName("companyDisplayName-686915152")
            .setDerivedInfo(Job.DerivedInfo.newBuilder().build())
            .setProcessingOptions(Job.ProcessingOptions.newBuilder().build())
            .build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    Job actualResponse = client.updateJob(job, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void updateJobExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      Job job =
          Job.newBuilder()
              .setName(JobName.of("[PROJECT]", "[TENANT]", "[JOB]").toString())
              .setCompany(CompanyName.of("[PROJECT]", "[TENANT]", "[COMPANY]").toString())
              .setRequisitionId("requisitionId-1769495849")
              .setTitle("title110371416")
              .setDescription("description-1724546052")
              .addAllAddresses(new ArrayList<String>())
              .setApplicationInfo(Job.ApplicationInfo.newBuilder().build())
              .addAllJobBenefits(new ArrayList<JobBenefit>())
              .setCompensationInfo(CompensationInfo.newBuilder().build())
              .putAllCustomAttributes(new HashMap<String, CustomAttribute>())
              .addAllDegreeTypes(new ArrayList<DegreeType>())
              .setDepartment("department848184146")
              .addAllEmploymentTypes(new ArrayList<EmploymentType>())
              .setIncentives("incentives-1262874520")
              .setLanguageCode("languageCode-2092349083")
              .setJobLevel(JobLevel.forNumber(0))
              .setPromotionValue(353413845)
              .setQualifications("qualifications1903501412")
              .setResponsibilities("responsibilities-926952660")
              .setPostingRegion(PostingRegion.forNumber(0))
              .setVisibility(Visibility.forNumber(0))
              .setJobStartTime(Timestamp.newBuilder().build())
              .setJobEndTime(Timestamp.newBuilder().build())
              .setPostingPublishTime(Timestamp.newBuilder().build())
              .setPostingExpireTime(Timestamp.newBuilder().build())
              .setPostingCreateTime(Timestamp.newBuilder().build())
              .setPostingUpdateTime(Timestamp.newBuilder().build())
              .setCompanyDisplayName("companyDisplayName-686915152")
              .setDerivedInfo(Job.DerivedInfo.newBuilder().build())
              .setProcessingOptions(Job.ProcessingOptions.newBuilder().build())
              .build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateJob(job, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void batchUpdateJobsTest() throws Exception {
    BatchUpdateJobsResponse expectedResponse =
        BatchUpdateJobsResponse.newBuilder().addAllJobResults(new ArrayList<JobResult>()).build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("batchUpdateJobsTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    TenantName parent = TenantName.of("[PROJECT]", "[TENANT]");
    List<Job> jobs = new ArrayList<>();

    BatchUpdateJobsResponse actualResponse = client.batchUpdateJobsAsync(parent, jobs).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void batchUpdateJobsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      TenantName parent = TenantName.of("[PROJECT]", "[TENANT]");
      List<Job> jobs = new ArrayList<>();
      client.batchUpdateJobsAsync(parent, jobs).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void batchUpdateJobsTest2() throws Exception {
    BatchUpdateJobsResponse expectedResponse =
        BatchUpdateJobsResponse.newBuilder().addAllJobResults(new ArrayList<JobResult>()).build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("batchUpdateJobsTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String parent = "projects/project-8940/tenants/tenant-8940";
    List<Job> jobs = new ArrayList<>();

    BatchUpdateJobsResponse actualResponse = client.batchUpdateJobsAsync(parent, jobs).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void batchUpdateJobsExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-8940/tenants/tenant-8940";
      List<Job> jobs = new ArrayList<>();
      client.batchUpdateJobsAsync(parent, jobs).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void deleteJobTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockService.addResponse(expectedResponse);

    JobName name = JobName.of("[PROJECT]", "[TENANT]", "[JOB]");

    client.deleteJob(name);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteJobExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      JobName name = JobName.of("[PROJECT]", "[TENANT]", "[JOB]");
      client.deleteJob(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteJobTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockService.addResponse(expectedResponse);

    String name = "projects/project-4373/tenants/tenant-4373/jobs/job-4373";

    client.deleteJob(name);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteJobExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name = "projects/project-4373/tenants/tenant-4373/jobs/job-4373";
      client.deleteJob(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void batchDeleteJobsTest() throws Exception {
    BatchDeleteJobsResponse expectedResponse =
        BatchDeleteJobsResponse.newBuilder().addAllJobResults(new ArrayList<JobResult>()).build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("batchDeleteJobsTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    TenantName parent = TenantName.of("[PROJECT]", "[TENANT]");
    List<String> names = new ArrayList<>();

    BatchDeleteJobsResponse actualResponse = client.batchDeleteJobsAsync(parent, names).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void batchDeleteJobsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      TenantName parent = TenantName.of("[PROJECT]", "[TENANT]");
      List<String> names = new ArrayList<>();
      client.batchDeleteJobsAsync(parent, names).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void batchDeleteJobsTest2() throws Exception {
    BatchDeleteJobsResponse expectedResponse =
        BatchDeleteJobsResponse.newBuilder().addAllJobResults(new ArrayList<JobResult>()).build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("batchDeleteJobsTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String parent = "projects/project-8940/tenants/tenant-8940";
    List<String> names = new ArrayList<>();

    BatchDeleteJobsResponse actualResponse = client.batchDeleteJobsAsync(parent, names).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void batchDeleteJobsExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-8940/tenants/tenant-8940";
      List<String> names = new ArrayList<>();
      client.batchDeleteJobsAsync(parent, names).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void listJobsTest() throws Exception {
    Job responsesElement = Job.newBuilder().build();
    ListJobsResponse expectedResponse =
        ListJobsResponse.newBuilder()
            .setNextPageToken("")
            .addAllJobs(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    TenantName parent = TenantName.of("[PROJECT]", "[TENANT]");
    String filter = "filter-1274492040";

    ListJobsPagedResponse pagedListResponse = client.listJobs(parent, filter);

    List<Job> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getJobsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listJobsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      TenantName parent = TenantName.of("[PROJECT]", "[TENANT]");
      String filter = "filter-1274492040";
      client.listJobs(parent, filter);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listJobsTest2() throws Exception {
    Job responsesElement = Job.newBuilder().build();
    ListJobsResponse expectedResponse =
        ListJobsResponse.newBuilder()
            .setNextPageToken("")
            .addAllJobs(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-8940/tenants/tenant-8940";
    String filter = "filter-1274492040";

    ListJobsPagedResponse pagedListResponse = client.listJobs(parent, filter);

    List<Job> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getJobsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listJobsExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-8940/tenants/tenant-8940";
      String filter = "filter-1274492040";
      client.listJobs(parent, filter);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void searchJobsTest() throws Exception {
    SearchJobsResponse expectedResponse =
        SearchJobsResponse.newBuilder()
            .addAllMatchingJobs(new ArrayList<SearchJobsResponse.MatchingJob>())
            .addAllHistogramQueryResults(new ArrayList<HistogramQueryResult>())
            .setNextPageToken("nextPageToken-1386094857")
            .addAllLocationFilters(new ArrayList<Location>())
            .setTotalSize(-705419236)
            .setMetadata(ResponseMetadata.newBuilder().build())
            .setBroadenedQueryJobsCount(1432104658)
            .setSpellCorrection(SpellingCorrection.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    SearchJobsRequest request =
        SearchJobsRequest.newBuilder()
            .setParent(TenantName.of("[PROJECT]", "[TENANT]").toString())
            .setRequestMetadata(RequestMetadata.newBuilder().build())
            .setJobQuery(JobQuery.newBuilder().build())
            .setEnableBroadening(true)
            .addAllHistogramQueries(new ArrayList<HistogramQuery>())
            .setJobView(JobView.forNumber(0))
            .setOffset(-1019779949)
            .setMaxPageSize(524069526)
            .setPageToken("pageToken873572522")
            .setOrderBy("orderBy-1207110587")
            .setCustomRankingInfo(SearchJobsRequest.CustomRankingInfo.newBuilder().build())
            .setDisableKeywordMatch(true)
            .build();

    SearchJobsResponse actualResponse = client.searchJobs(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void searchJobsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      SearchJobsRequest request =
          SearchJobsRequest.newBuilder()
              .setParent(TenantName.of("[PROJECT]", "[TENANT]").toString())
              .setRequestMetadata(RequestMetadata.newBuilder().build())
              .setJobQuery(JobQuery.newBuilder().build())
              .setEnableBroadening(true)
              .addAllHistogramQueries(new ArrayList<HistogramQuery>())
              .setJobView(JobView.forNumber(0))
              .setOffset(-1019779949)
              .setMaxPageSize(524069526)
              .setPageToken("pageToken873572522")
              .setOrderBy("orderBy-1207110587")
              .setCustomRankingInfo(SearchJobsRequest.CustomRankingInfo.newBuilder().build())
              .setDisableKeywordMatch(true)
              .build();
      client.searchJobs(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void searchJobsForAlertTest() throws Exception {
    SearchJobsResponse expectedResponse =
        SearchJobsResponse.newBuilder()
            .addAllMatchingJobs(new ArrayList<SearchJobsResponse.MatchingJob>())
            .addAllHistogramQueryResults(new ArrayList<HistogramQueryResult>())
            .setNextPageToken("nextPageToken-1386094857")
            .addAllLocationFilters(new ArrayList<Location>())
            .setTotalSize(-705419236)
            .setMetadata(ResponseMetadata.newBuilder().build())
            .setBroadenedQueryJobsCount(1432104658)
            .setSpellCorrection(SpellingCorrection.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    SearchJobsRequest request =
        SearchJobsRequest.newBuilder()
            .setParent(TenantName.of("[PROJECT]", "[TENANT]").toString())
            .setRequestMetadata(RequestMetadata.newBuilder().build())
            .setJobQuery(JobQuery.newBuilder().build())
            .setEnableBroadening(true)
            .addAllHistogramQueries(new ArrayList<HistogramQuery>())
            .setJobView(JobView.forNumber(0))
            .setOffset(-1019779949)
            .setMaxPageSize(524069526)
            .setPageToken("pageToken873572522")
            .setOrderBy("orderBy-1207110587")
            .setCustomRankingInfo(SearchJobsRequest.CustomRankingInfo.newBuilder().build())
            .setDisableKeywordMatch(true)
            .build();

    SearchJobsResponse actualResponse = client.searchJobsForAlert(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void searchJobsForAlertExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      SearchJobsRequest request =
          SearchJobsRequest.newBuilder()
              .setParent(TenantName.of("[PROJECT]", "[TENANT]").toString())
              .setRequestMetadata(RequestMetadata.newBuilder().build())
              .setJobQuery(JobQuery.newBuilder().build())
              .setEnableBroadening(true)
              .addAllHistogramQueries(new ArrayList<HistogramQuery>())
              .setJobView(JobView.forNumber(0))
              .setOffset(-1019779949)
              .setMaxPageSize(524069526)
              .setPageToken("pageToken873572522")
              .setOrderBy("orderBy-1207110587")
              .setCustomRankingInfo(SearchJobsRequest.CustomRankingInfo.newBuilder().build())
              .setDisableKeywordMatch(true)
              .build();
      client.searchJobsForAlert(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
