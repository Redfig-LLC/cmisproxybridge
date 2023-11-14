package com.redfig;

import com.sap.ecm.api.AbstractCmisProxyServlet;

public class CMISProxyServlet extends AbstractCmisProxyServlet {

    @Override
    protected String getRepositoryUniqueName() {
        String repoName = System.getProperty("redfig.reponame");
        return repoName;
    }

    @Override
    // For applications in production, use a secure location to store the secret
    // key.
    protected String getRepositoryKey() {
        String repoKey = System.getProperty("redfig.repokey");
        return repoKey;
    }

}