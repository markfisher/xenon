/*
 * Copyright (c) 2014-2015 VMware, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, without warranties or
 * conditions of any kind, EITHER EXPRESS OR IMPLIED.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.vmware.dcp.services.common;

import com.vmware.dcp.common.FactoryService;
import com.vmware.dcp.common.Service;

/**
 * User credentials service.
 */
public class AuthCredentialsFactoryService extends FactoryService {
    public static final String SELF_LINK = ServiceUriPaths.CORE_AUTH + "/credentials";

    public AuthCredentialsFactoryService() {
        super(AuthCredentialsService.AuthCredentialsServiceState.class);
    }

    @Override
    public Service createServiceInstance() {
        return new AuthCredentialsService();
    }
}
