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

package com.google.cloud.support.v2.stub;

import static com.google.cloud.support.v2.CaseAttachmentServiceClient.ListAttachmentsPagedResponse;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.support.v2.ListAttachmentsRequest;
import com.google.cloud.support.v2.ListAttachmentsResponse;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the CaseAttachmentService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class CaseAttachmentServiceStub implements BackgroundResource {

  public UnaryCallable<ListAttachmentsRequest, ListAttachmentsPagedResponse>
      listAttachmentsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listAttachmentsPagedCallable()");
  }

  public UnaryCallable<ListAttachmentsRequest, ListAttachmentsResponse> listAttachmentsCallable() {
    throw new UnsupportedOperationException("Not implemented: listAttachmentsCallable()");
  }

  @Override
  public abstract void close();
}
