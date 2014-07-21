/*
 * Copyright (c) 2008-2014 MongoDB, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mongodb.binding;

import com.mongodb.async.MongoFuture;

/**
 * An asynchronous factory of connection sources to servers that can be written to, e.g, a standalone, a mongos, or a replica set primary.
 *
 * @since 3.0
 */
public interface AsyncWriteBinding extends ReferenceCounted {
    /**
     * Supply a connection source to a server that can be written to
     *
     * @return a connection source
     */
    MongoFuture<AsyncConnectionSource> getWriteConnectionSource();

    @Override
    AsyncWriteBinding retain();
}
