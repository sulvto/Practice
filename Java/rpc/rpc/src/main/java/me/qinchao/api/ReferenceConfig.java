/*
 * Copyright 1999-2011 Alibaba Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package me.qinchao.api;

/**
 * ReferenceConfig
 * 
 */
public class ReferenceConfig extends AbstractConfig{

    private String serviceName;

    public ReferenceConfig(String serviceName) {
        this.serviceName = serviceName;
    }

    public ReferenceConfig(String host, int port, String serviceName) {
        super(host, port);
        this.serviceName = serviceName;

    }


    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}