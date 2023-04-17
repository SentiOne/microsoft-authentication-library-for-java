// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.aad.msal4j;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestConstants {
    public static final String KEYVAULT_DEFAULT_SCOPE = "https://vault.azure.net/.default";
    public static final String MSIDLAB_DEFAULT_SCOPE = "https://msidlab.com/.default";
    public static final String MSIDLAB_VAULT_URL = "https://msidlabs.vault.azure.net/";
    public static final String GRAPH_DEFAULT_SCOPE = "https://graph.windows.net/.default";
    public static final String USER_READ_SCOPE = "user.read";
    public static final String B2C_LAB_SCOPE = "https://msidlabb2c.onmicrosoft.com/msaapp/user_impersonation";
    public static final String B2C_CONFIDENTIAL_CLIENT_APP_SECRETID = "MSIDLABB2C-MSAapp-AppSecret";
    public static final String B2C_CONFIDENTIAL_CLIENT_LAB_APP_ID = "MSIDLABB2C-MSAapp-AppID";

    public static final String MICROSOFT_AUTHORITY_HOST = "https://login.microsoftonline.com/";
    public static final String MICROSOFT_AUTHORITY_BASIC_HOST = "login.microsoftonline.com";
    public static final String MICROSOFT_AUTHORITY_HOST_WITH_PORT = "https://login.microsoftonline.com:443/";
    public static final String ARLINGTON_MICROSOFT_AUTHORITY_HOST = "https://login.microsoftonline.us/";
    public static final String MICROSOFT_AUTHORITY_TENANT = "msidlab4.onmicrosoft.com";
    public static final String ARLINGTON_AUTHORITY_TENANT = "arlmsidlab1.onmicrosoft.us";

    public static final String ORGANIZATIONS_AUTHORITY = MICROSOFT_AUTHORITY_HOST + "organizations/";
    public static final String COMMON_AUTHORITY = MICROSOFT_AUTHORITY_HOST + "common/";
    public static final String CONSUMERS_AUTHORITY = MICROSOFT_AUTHORITY_HOST + "consumers/";
    public static final String COMMON_AUTHORITY_WITH_PORT = MICROSOFT_AUTHORITY_HOST_WITH_PORT + "msidlab4.onmicrosoft.com";
    public static final String MICROSOFT_AUTHORITY = MICROSOFT_AUTHORITY_HOST + "microsoft.onmicrosoft.com";
    public static final String TENANT_SPECIFIC_AUTHORITY = MICROSOFT_AUTHORITY_HOST + MICROSOFT_AUTHORITY_TENANT;
    public static final String REGIONAL_MICROSOFT_AUTHORITY_BASIC_HOST_WESTUS = "westus.login.microsoft.com";

    public static final String REGIONAL_MICROSOFT_AUTHORITY_BASIC_HOST_EASTUS = "eastus.login.microsoft.com";

//    public static final String CIAM_AUTHORITY = MICROSOFT_AUTHORITY_HOST + "msidlabciam1.onmicrosoft.com";
    public static final String CIAM_AUTHORITY = "https://msidlabciam1.ciamlogin.com/" + "msidlabciam1.onmicrosoft.com";

    public static final String CIAM_TEST_AUTHORITY = "https://contoso0781.ciamlogin.com/6babcaad-604b-40ac-a9d7-9fd97c0b779f/v2.0/.well-known/openid-configuration?dc=ESTS-PUB-EUS-AZ1-FD000-TEST1&ciamhost=true";

    public static final String ARLINGTON_ORGANIZATIONS_AUTHORITY = ARLINGTON_MICROSOFT_AUTHORITY_HOST + "organizations/";
    public static final String ARLINGTON_TENANT_SPECIFIC_AUTHORITY = ARLINGTON_MICROSOFT_AUTHORITY_HOST + ARLINGTON_AUTHORITY_TENANT;
    public static final String ARLINGTON_GRAPH_DEFAULT_SCOPE = "https://graph.microsoft.us/.default";

    public static final String B2C_AUTHORITY = "https://msidlabb2c.b2clogin.com/msidlabb2c.onmicrosoft.com/";
    public static final String B2C_AUTHORITY_LEGACY_FORMAT = "https://msidlabb2c.b2clogin.com/tfp/msidlabb2c.onmicrosoft.com/";

    public static final String B2C_ROPC_POLICY = "B2C_1_ROPC_Auth";
    public static final String B2C_SIGN_IN_POLICY = "B2C_1_SignInPolicy";
    public static final String B2C_AUTHORITY_SIGN_IN = B2C_AUTHORITY + B2C_SIGN_IN_POLICY;
    public static final String B2C_AUTHORITY_ROPC = B2C_AUTHORITY + B2C_ROPC_POLICY;
    public static final String B2C_READ_SCOPE = "https://msidlabb2c.onmicrosoft.com/msidlabb2capi/read";
    public static final String B2C_MICROSOFTLOGIN_AUTHORITY = "https://msidlabb2c.b2clogin.com/tfp/msidlabb2c.onmicrosoft.com/";
    public static final String B2C_MICROSOFTLOGIN_ROPC = B2C_MICROSOFTLOGIN_AUTHORITY + B2C_ROPC_POLICY;

    public static final String LOCALHOST = "http://localhost:";

    public static final String ADFS_AUTHORITY = "https://fs.msidlab8.com/adfs/";
    public static final String ADFS_SCOPE = USER_READ_SCOPE;
    public static final String ADFS_APP_ID = "PublicClientId";

    public static final String CLAIMS = "{\"id_token\":{\"auth_time\":{\"essential\":true}}}";
    public static final Set<String> CLIENT_CAPABILITIES_EMPTY = new HashSet<>(Collections.emptySet());
    public static final String AUTHORITY_PUBLIC_TENANT_SPECIFIC = "https://login.microsoftonline.com/" + MICROSOFT_AUTHORITY_TENANT;

    public static final String DEFAULT_ACCESS_TOKEN = "defaultAccessToken";
}
