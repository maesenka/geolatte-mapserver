/*
 * Copyright 2009-2010  Geovise BVBA, QMINO BVBA
 *
 * This file is part of GeoLatte Mapserver.
 *
 * GeoLatte Mapserver is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * GeoLatte Mapserver is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with GeoLatte Mapserver.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.geolatte.mapserver.wms;

public class WMSGetCapabilitiesRequest extends WMSRequest {


    @WMSParameter(required = true, param = WMSParam.REQUEST)
    private String request;

    @WMSParameter(required = false, param = WMSParam.VERSION)
    private String version;

    @WMSParameter(required = true, param = WMSParam.SERVICE)
    private String service;

    @WMSParameter(required = false, param = WMSParam.UPDATESEQUENCE)
    private String updateSeq;

    public String getRequest() {
        return request;
    }

    public String getVersion() {
        return version;
    }

    public String getService() {
        return service;
    }

    //Note that this request parameter is
    //currently ignored.
    public String getUpdateSequence() {
        return updateSeq;
    }

    @Override
    public String getResponseContentType() {
        return OGCMIMETypes.CAPABILITIES;
    }
}
