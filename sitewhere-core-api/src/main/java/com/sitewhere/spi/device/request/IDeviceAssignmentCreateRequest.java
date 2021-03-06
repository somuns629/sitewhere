/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.spi.device.request;

import java.io.Serializable;
import java.util.Map;

import com.sitewhere.spi.device.DeviceAssignmentStatus;

/**
 * Interface for arguments needed to create a device assignment.
 * 
 * @author Derek
 */
public interface IDeviceAssignmentCreateRequest extends Serializable {

    /**
     * Get token for assignment. (Auto-assign if null).
     * 
     * @return
     */
    public String getToken();

    /**
     * Get the device token.
     * 
     * @return
     */
    public String getDeviceToken();

    /**
     * Get token of customer if assigned.
     * 
     * @return
     */
    public String getCustomerToken();

    /**
     * Get token of area if assigned.
     * 
     * @return
     */
    public String getAreaToken();

    /**
     * Get token of asset if assigned.
     * 
     * @return
     */
    public String getAssetToken();

    /**
     * Get the device assignment status.
     * 
     * @return
     */
    public DeviceAssignmentStatus getStatus();

    /**
     * Get metadata values.
     * 
     * @return
     */
    public Map<String, String> getMetadata();
}