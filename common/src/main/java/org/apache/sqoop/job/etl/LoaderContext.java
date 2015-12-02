/**
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
package org.apache.sqoop.job.etl;

import org.apache.sqoop.classification.InterfaceAudience;
import org.apache.sqoop.classification.InterfaceStability;
import org.apache.sqoop.common.ImmutableContext;
import org.apache.sqoop.etl.io.DataReader;
import org.apache.sqoop.schema.Schema;

/**
 * Context implementation for Loader.
 *
 * This class is also wrapping reader object.
 */
@InterfaceAudience.Public
@InterfaceStability.Unstable
public class LoaderContext extends TransferableContext {

  private final DataReader reader;

  private final Schema schema;

  public LoaderContext(ImmutableContext context, DataReader reader, Schema schema, String user) {
    super(context, user);
    this.reader = reader;
    this.schema = schema;
  }

  /**
   * Return associated data reader object.
   *
   * @return Data reader object for loader input
   */
  public DataReader getDataReader() {
    return reader;
  }

  /**
   * Return schema associated with TO.
   *
   * @return
   */
  public Schema getSchema() {
    return schema;
  }
}
