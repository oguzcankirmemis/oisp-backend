/**
 * Copyright (c) 2015 Intel Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.intel.databackend.tsdb.dummy;

import com.intel.databackend.tsdb.TsdbAccess;
import com.intel.databackend.tsdb.TsdbObject;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.*;

@Repository
public class TsdbAccessDummy implements TsdbAccess {

    @Override
    public boolean put(List<TsdbObject> tsdbObjects) {
        return true;
    }

    @Override
    public boolean put(TsdbObject tsdbObjects) {
        return true;
    }


    @Override
    public TsdbObject[] scan(TsdbObject tsdbObject, long start, long stop) {

        return new TsdbObject[0];
    }

    @Override
    public TsdbObject[] scan(TsdbObject tsdbObject, long start, long stop, boolean forward, int limit) {
        return new TsdbObject[0];
    }


    public String[] scanForAttributeNames(TsdbObject tsdbObject, long start, long stop) throws IOException {

        return new String[0];
    }

}
