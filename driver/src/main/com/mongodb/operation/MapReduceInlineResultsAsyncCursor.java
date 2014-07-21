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

package com.mongodb.operation;

import com.mongodb.async.MapReduceAsyncCursor;

import java.util.List;

/**
 * Cursor representation of the results of an inline map-reduce operation.  This allows users to iterate over the results that were returned
 * from the operation, and also provides access to the statistics returned in the results.
 *
 * @param <T> the type of document to return in the results.
 * @since 3.0
 */
class MapReduceInlineResultsAsyncCursor<T> extends InlineMongoAsyncCursor<T> implements MapReduceAsyncCursor<T> {

    private final MapReduceStatistics statistics;

    public MapReduceInlineResultsAsyncCursor(final List<T> results, final MapReduceStatistics statistics) {
        super(results);
        this.statistics = statistics;
    }

    @Override
    public MapReduceStatistics getStatistics() {
        return statistics;
    }
}
