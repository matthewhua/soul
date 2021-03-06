/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dromara.soul.admin.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.dromara.soul.admin.entity.UserRoleDO;
import org.dromara.soul.common.utils.DateUtils;

import java.util.Optional;

/**
 * this is user role for web front..
 *
 * @author nuo-promise
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRoleVO {

    /**
     * primary key.
     */
    private String id;

    /**
     * user key.
     */
    private String userId;

    /**
     * role key.
     */
    private String roleId;

    /**
     * created time.
     */
    private String dateCreated;

    /**
     * updated time.
     */
    private String dateUpdated;

    /**
     * build roleDO.
     *
     * @param userRoleDO {@linkplain UserRoleDO}
     * @return {@linkplain UserRoleVO}
     */
    public static UserRoleVO buildUserRoleVO(final UserRoleDO userRoleDO) {
        return Optional.ofNullable(userRoleDO).map(item -> new UserRoleVO(item.getId(), item.getUserId(), item.getRoleId(),
                DateUtils.localDateTimeToString(item.getDateCreated().toLocalDateTime()),
                DateUtils.localDateTimeToString(item.getDateUpdated().toLocalDateTime()))).orElse(null);
    }
}
