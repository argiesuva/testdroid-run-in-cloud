package com.testdroid.jenkins.remotesupport;

import com.testdroid.jenkins.TestdroidCloudSettings;

import java.io.Serializable;

/**
 * @author Krzysztof Fonal <krzysztof.fonal@bitbar.com>
 */
public class MachineIndependentTask implements Serializable {

    String cloudUrl;

    boolean isProxy;

    boolean noCheckCertificate;

    String password;

    boolean privateInstance;

    String proxyHost;

    String proxyPassword;

    Integer proxyPort;

    String proxyUser;

    String user;

    public MachineIndependentTask(TestdroidCloudSettings.DescriptorImpl descriptor) {
        this.user = descriptor.getEmail();
        this.password = descriptor.getPassword();
        this.cloudUrl = descriptor.getCloudUrl();
        this.privateInstance = descriptor.getPrivateInstanceState();
        this.isProxy = descriptor.getIsProxy();
        this.proxyHost = descriptor.getProxyHost();
        this.proxyPort = descriptor.getProxyPort();
        this.proxyUser = descriptor.getProxyUser();
        this.proxyPassword = descriptor.getProxyPassword();
    }
}
