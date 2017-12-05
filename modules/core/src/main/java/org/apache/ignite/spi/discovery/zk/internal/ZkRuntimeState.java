/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.spi.discovery.zk.internal;

import org.apache.ignite.spi.IgniteSpiTimeoutObject;

/**
 *
 */
class ZkRuntimeState {
    /** */
    final boolean prevJoined;

    /** */
    ZookeeperClient zkClient;

    /** */
    int internalOrder;

    /** */
    int joinDataPartCnt;

    /** */
    IgniteSpiTimeoutObject joinTimeoutObj;

    /** */
    long gridStartTime;

    /** */
    volatile boolean joined;

    /** */
    ZkDiscoveryEventsData evtsData;

    /** */
    boolean crd;

    /** */
    String locNodeZkPath;

    /** */
    ZkAliveNodeData locNodeInfo = new ZkAliveNodeData();

    /** */
    int procEvtCnt;

    /** */
    final ZkClusterNodes top = new ZkClusterNodes();

    /**
     * @param prevJoined {@code True} if joined topology before reconnect attempt.
     */
    ZkRuntimeState(boolean prevJoined) {
        this.prevJoined = prevJoined;
    }
}
