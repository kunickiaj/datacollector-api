/**
 * Copyright 2016 StreamSets Inc.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.streamsets.pipeline.api.ext;

import com.streamsets.pipeline.api.StageException;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public interface ContextExtensions {

  public RecordReader createRecordReader(InputStream inputStream, long initialPosition, int maxObjectLen)
      throws IOException;

  public  RecordWriter createRecordWriter(OutputStream outputStream) throws IOException;

  public void notify(List<String> addresses, String subject, String body) throws StageException;

}
