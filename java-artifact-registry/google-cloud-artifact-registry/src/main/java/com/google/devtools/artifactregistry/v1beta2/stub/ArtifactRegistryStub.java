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

package com.google.devtools.artifactregistry.v1beta2.stub;

import static com.google.devtools.artifactregistry.v1beta2.ArtifactRegistryClient.ListFilesPagedResponse;
import static com.google.devtools.artifactregistry.v1beta2.ArtifactRegistryClient.ListLocationsPagedResponse;
import static com.google.devtools.artifactregistry.v1beta2.ArtifactRegistryClient.ListPackagesPagedResponse;
import static com.google.devtools.artifactregistry.v1beta2.ArtifactRegistryClient.ListRepositoriesPagedResponse;
import static com.google.devtools.artifactregistry.v1beta2.ArtifactRegistryClient.ListTagsPagedResponse;
import static com.google.devtools.artifactregistry.v1beta2.ArtifactRegistryClient.ListVersionsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest;
import com.google.devtools.artifactregistry.v1beta2.CreateTagRequest;
import com.google.devtools.artifactregistry.v1beta2.DeletePackageRequest;
import com.google.devtools.artifactregistry.v1beta2.DeleteRepositoryRequest;
import com.google.devtools.artifactregistry.v1beta2.DeleteTagRequest;
import com.google.devtools.artifactregistry.v1beta2.DeleteVersionRequest;
import com.google.devtools.artifactregistry.v1beta2.File;
import com.google.devtools.artifactregistry.v1beta2.GetFileRequest;
import com.google.devtools.artifactregistry.v1beta2.GetPackageRequest;
import com.google.devtools.artifactregistry.v1beta2.GetProjectSettingsRequest;
import com.google.devtools.artifactregistry.v1beta2.GetRepositoryRequest;
import com.google.devtools.artifactregistry.v1beta2.GetTagRequest;
import com.google.devtools.artifactregistry.v1beta2.GetVersionRequest;
import com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata;
import com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest;
import com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsResponse;
import com.google.devtools.artifactregistry.v1beta2.ImportYumArtifactsMetadata;
import com.google.devtools.artifactregistry.v1beta2.ImportYumArtifactsRequest;
import com.google.devtools.artifactregistry.v1beta2.ImportYumArtifactsResponse;
import com.google.devtools.artifactregistry.v1beta2.ListFilesRequest;
import com.google.devtools.artifactregistry.v1beta2.ListFilesResponse;
import com.google.devtools.artifactregistry.v1beta2.ListPackagesRequest;
import com.google.devtools.artifactregistry.v1beta2.ListPackagesResponse;
import com.google.devtools.artifactregistry.v1beta2.ListRepositoriesRequest;
import com.google.devtools.artifactregistry.v1beta2.ListRepositoriesResponse;
import com.google.devtools.artifactregistry.v1beta2.ListTagsRequest;
import com.google.devtools.artifactregistry.v1beta2.ListTagsResponse;
import com.google.devtools.artifactregistry.v1beta2.ListVersionsRequest;
import com.google.devtools.artifactregistry.v1beta2.ListVersionsResponse;
import com.google.devtools.artifactregistry.v1beta2.OperationMetadata;
import com.google.devtools.artifactregistry.v1beta2.Package;
import com.google.devtools.artifactregistry.v1beta2.ProjectSettings;
import com.google.devtools.artifactregistry.v1beta2.Repository;
import com.google.devtools.artifactregistry.v1beta2.Tag;
import com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest;
import com.google.devtools.artifactregistry.v1beta2.UpdateRepositoryRequest;
import com.google.devtools.artifactregistry.v1beta2.UpdateTagRequest;
import com.google.devtools.artifactregistry.v1beta2.Version;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the ArtifactRegistry service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public abstract class ArtifactRegistryStub implements BackgroundResource {

  public OperationsStub getOperationsStub() {
    return null;
  }

  public com.google.api.gax.httpjson.longrunning.stub.OperationsStub getHttpJsonOperationsStub() {
    return null;
  }

  public OperationCallable<
          ImportAptArtifactsRequest, ImportAptArtifactsResponse, ImportAptArtifactsMetadata>
      importAptArtifactsOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: importAptArtifactsOperationCallable()");
  }

  public UnaryCallable<ImportAptArtifactsRequest, Operation> importAptArtifactsCallable() {
    throw new UnsupportedOperationException("Not implemented: importAptArtifactsCallable()");
  }

  public OperationCallable<
          ImportYumArtifactsRequest, ImportYumArtifactsResponse, ImportYumArtifactsMetadata>
      importYumArtifactsOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: importYumArtifactsOperationCallable()");
  }

  public UnaryCallable<ImportYumArtifactsRequest, Operation> importYumArtifactsCallable() {
    throw new UnsupportedOperationException("Not implemented: importYumArtifactsCallable()");
  }

  public UnaryCallable<ListRepositoriesRequest, ListRepositoriesPagedResponse>
      listRepositoriesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listRepositoriesPagedCallable()");
  }

  public UnaryCallable<ListRepositoriesRequest, ListRepositoriesResponse>
      listRepositoriesCallable() {
    throw new UnsupportedOperationException("Not implemented: listRepositoriesCallable()");
  }

  public UnaryCallable<GetRepositoryRequest, Repository> getRepositoryCallable() {
    throw new UnsupportedOperationException("Not implemented: getRepositoryCallable()");
  }

  public OperationCallable<CreateRepositoryRequest, Repository, OperationMetadata>
      createRepositoryOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: createRepositoryOperationCallable()");
  }

  public UnaryCallable<CreateRepositoryRequest, Operation> createRepositoryCallable() {
    throw new UnsupportedOperationException("Not implemented: createRepositoryCallable()");
  }

  public UnaryCallable<UpdateRepositoryRequest, Repository> updateRepositoryCallable() {
    throw new UnsupportedOperationException("Not implemented: updateRepositoryCallable()");
  }

  public OperationCallable<DeleteRepositoryRequest, Empty, OperationMetadata>
      deleteRepositoryOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteRepositoryOperationCallable()");
  }

  public UnaryCallable<DeleteRepositoryRequest, Operation> deleteRepositoryCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteRepositoryCallable()");
  }

  public UnaryCallable<ListPackagesRequest, ListPackagesPagedResponse> listPackagesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listPackagesPagedCallable()");
  }

  public UnaryCallable<ListPackagesRequest, ListPackagesResponse> listPackagesCallable() {
    throw new UnsupportedOperationException("Not implemented: listPackagesCallable()");
  }

  public UnaryCallable<GetPackageRequest, Package> getPackageCallable() {
    throw new UnsupportedOperationException("Not implemented: getPackageCallable()");
  }

  public OperationCallable<DeletePackageRequest, Empty, OperationMetadata>
      deletePackageOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: deletePackageOperationCallable()");
  }

  public UnaryCallable<DeletePackageRequest, Operation> deletePackageCallable() {
    throw new UnsupportedOperationException("Not implemented: deletePackageCallable()");
  }

  public UnaryCallable<ListVersionsRequest, ListVersionsPagedResponse> listVersionsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listVersionsPagedCallable()");
  }

  public UnaryCallable<ListVersionsRequest, ListVersionsResponse> listVersionsCallable() {
    throw new UnsupportedOperationException("Not implemented: listVersionsCallable()");
  }

  public UnaryCallable<GetVersionRequest, Version> getVersionCallable() {
    throw new UnsupportedOperationException("Not implemented: getVersionCallable()");
  }

  public OperationCallable<DeleteVersionRequest, Empty, OperationMetadata>
      deleteVersionOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteVersionOperationCallable()");
  }

  public UnaryCallable<DeleteVersionRequest, Operation> deleteVersionCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteVersionCallable()");
  }

  public UnaryCallable<ListFilesRequest, ListFilesPagedResponse> listFilesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listFilesPagedCallable()");
  }

  public UnaryCallable<ListFilesRequest, ListFilesResponse> listFilesCallable() {
    throw new UnsupportedOperationException("Not implemented: listFilesCallable()");
  }

  public UnaryCallable<GetFileRequest, File> getFileCallable() {
    throw new UnsupportedOperationException("Not implemented: getFileCallable()");
  }

  public UnaryCallable<ListTagsRequest, ListTagsPagedResponse> listTagsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listTagsPagedCallable()");
  }

  public UnaryCallable<ListTagsRequest, ListTagsResponse> listTagsCallable() {
    throw new UnsupportedOperationException("Not implemented: listTagsCallable()");
  }

  public UnaryCallable<GetTagRequest, Tag> getTagCallable() {
    throw new UnsupportedOperationException("Not implemented: getTagCallable()");
  }

  public UnaryCallable<CreateTagRequest, Tag> createTagCallable() {
    throw new UnsupportedOperationException("Not implemented: createTagCallable()");
  }

  public UnaryCallable<UpdateTagRequest, Tag> updateTagCallable() {
    throw new UnsupportedOperationException("Not implemented: updateTagCallable()");
  }

  public UnaryCallable<DeleteTagRequest, Empty> deleteTagCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteTagCallable()");
  }

  public UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: setIamPolicyCallable()");
  }

  public UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: getIamPolicyCallable()");
  }

  public UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable() {
    throw new UnsupportedOperationException("Not implemented: testIamPermissionsCallable()");
  }

  public UnaryCallable<GetProjectSettingsRequest, ProjectSettings> getProjectSettingsCallable() {
    throw new UnsupportedOperationException("Not implemented: getProjectSettingsCallable()");
  }

  public UnaryCallable<UpdateProjectSettingsRequest, ProjectSettings>
      updateProjectSettingsCallable() {
    throw new UnsupportedOperationException("Not implemented: updateProjectSettingsCallable()");
  }

  public UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listLocationsPagedCallable()");
  }

  public UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable() {
    throw new UnsupportedOperationException("Not implemented: listLocationsCallable()");
  }

  public UnaryCallable<GetLocationRequest, Location> getLocationCallable() {
    throw new UnsupportedOperationException("Not implemented: getLocationCallable()");
  }

  @Override
  public abstract void close();
}
