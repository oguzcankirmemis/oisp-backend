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

package com.intel.databackend.config;

import com.intel.databackend.datasources.hbase.KerberosProperties;
import com.intel.databackend.exceptions.VcapEnvironmentException;

public interface ServiceConfigProvider {

    String getKafkaUri() throws VcapEnvironmentException;

    String getZookeeperUri() throws VcapEnvironmentException;

    Boolean isKafkaEnabled() throws VcapEnvironmentException;

    String getKafkaObservationsTopicName() throws VcapEnvironmentException;

    String getKafkaHeartbeatTopicName() throws VcapEnvironmentException;

    Integer getKafkaHeartbeatInterval() throws VcapEnvironmentException;

    Integer getKafkaPartitionsFactor() throws VcapEnvironmentException;

    Integer getKafkaReplicationFactor() throws VcapEnvironmentException;

    Integer getKafkaTimeoutInMs() throws VcapEnvironmentException;

    KerberosProperties getKerberosCredentials() throws VcapEnvironmentException;

}
