package com.redfig;

import com.sap.ecm.api.AbstractCmisProxyServlet;

public class CMISProxyServlet extends AbstractCmisProxyServlet {

    @Override
    protected String getRepositoryUniqueName() {
        return "MySampleRepository";
    }

    @Override
    // For applications in production, use a secure location to store the secret
    // key.
    protected String getRepositoryKey() {
        return "MFWeThIiC1utyer";
    }

}