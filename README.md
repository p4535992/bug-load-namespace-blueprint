PROJECT TO DESCRIBE THE BUG  The url http://camel.apache.org/schema/blueprint/cxf is down
=========================================================================================


### JIRA REFERENCE 

https://issues.apache.org/jira/browse/CAMEL-13953

### PRODUCUT

REDHAT FUSE KARAF version 7.3.1.fuse-731003-redhat-00003

OPENJDK openjdk version "1.8.0_212"

### OLD NAMESPACE WORKING UNTIL 2019-07-25

```

<?xml version="1.0" encoding="UTF-8"?>
<blueprint default-activation="eager"
    xmlns="http://www.osgi.org/xmlns/blueprint/v1.0.0"
    xmlns:blueprint-schema-cxf="http://camel.apache.org/schema/blueprint/cxf"
    xmlns:camel="http://camel.apache.org/schema/blueprint"
    xmlns:cm="http://aries.apache.org/blueprint/xmlns/blueprint-cm/v1.1.0"
    xmlns:ctx="http://www.springframework.org/schema/context"
    xmlns:cxf="http://camel.apache.org/schema/blueprint/cxf"
    xmlns:cxf-core="http://cxf.apache.org/blueprint/core"
    xmlns:cxf-security="http://cxf.apache.org/configuration/security"
    xmlns:enc="http://karaf.apache.org/xmlns/jasypt/v1.0.0"
    xmlns:ext="http://aries.apache.org/blueprint/xmlns/blueprint-ext/v1.0.0"
    xmlns:ext15="http://aries.apache.org/blueprint/xmlns/blueprint-ext/v1.5.0"
    xmlns:http="http://cxf.apache.org/transports/http/configuration"
    xmlns:httpn="http://cxf.apache.org/transports/http-netty-server/configuration"
    xmlns:httpu="http://cxf.apache.org/transports/http-undertow/configuration"
    xmlns:jaxrs="http://cxf.apache.org/blueprint/jaxrs"
    xmlns:jaxws="http://cxf.apache.org/blueprint/jaxws"
    xmlns:osgi="http://www.springframework.org/schema/osgi"
    xmlns:osgix="http://www.springframework.org/schema/osgi-compendium"
    xmlns:sec="http://cxf.apache.org/configuration/security"
    xmlns:spring-beans="http://www.springframework.org/schema/beans"
    xmlns:spring-camel-cxf="http://camel.apache.org/schema/cxf"
    xmlns:spring-security="http://www.springframework.org/schema/security"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="             http://cxf.apache.org/configuration/security http://cxf.apache.org/schemas/configuration/security.xsd             http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd             http://camel.apache.org/schema/cxf http://camel.apache.org/schema/cxf/camel-cxf.xsd                   http://www.springframework.org/schema/osgi-compendium http://www.springframework.org/schema/osgi-compendium/spring-osgi-compendium.xsd             http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd             http://cxf.apache.org/transports/http/configuration http://cxf.apache.org/schemas/configuration/http-conf.xsd            http://cxf.apache.org/configuration/security http://cxf.apache.org/schemas/configuration/security.xsd             http://cxf.apache.org/transports/http-undertow/configuration http://cxf.apache.org/schemas/configuration/http-undertow.xsd            http://cxf.apache.org/transports/http-netty-server/configuration http://cxf.apache.org/schemas/configuration/http-netty-server.xsd   http://www.springframework.org/schema/security http://www.springframework.org/schema/security/spring-security.xsd            http://camel.apache.org/schema/spring-security http://camel.apache.org/schema/spring-security/camel-spring-security.xsd                            http://www.springframework.org/schema/osgi http://www.springframework.org/schema/osgi/spring-osgi.xsd                           http://cxf.apache.org/blueprint/core http://cxf.apache.org/schemas/blueprint/core.xsd                   http://www.osgi.org/xmlns/blueprint/v1.0.0 https://www.osgi.org/xmlns/blueprint/v1.0.0/blueprint.xsd http://camel.apache.org/schema/blueprint             http://camel.apache.org/schema/blueprint/camel-blueprint.xsd                     http://cxf.apache.org/blueprint/jaxws http://cxf.apache.org/schemas/blueprint/jaxws.xsd             http://cxf.apache.org/blueprint/jaxrs http://cxf.apache.org/schemas/blueprint/jaxrs.xsd             http://aries.apache.org/blueprint/xmlns/blueprint-cm/v1.1.0 http://aries.apache.org/schemas/blueprint-cm/blueprint-cm-1.1.0.xsd             http://aries.apache.org/blueprint/xmlns/blueprint-cm/v1.0.0 http://aries.apache.org/schemas/blueprint-cm/blueprint-cm-1.0.0.xsd             http://aries.apache.org/blueprint/xmlns/blueprint-ext/v1.5.0 http://aries.apache.org/schemas/blueprint-ext/blueprint-ext-1.5.xsd             http://cxf.apache.org/blueprint/core http://cxf.apache.org/schemas/blueprint/core.xsd   http://camel.apache.org/schema/blueprint/cxf http://camel.apache.org/schema/blueprint/cxf/camel-cxf.xsd">
    
```

### ALL THE FEATURE INSTALLED ON RED HAT FUSE 

```

 feature:install instance
 feature:install cxf-commands
 feature:install log
 feature:install pax-cdi-weld
 feature:install ssh
 feature:install camel-cxf
 feature:install aries-blueprint
 feature:install cxf
 feature:install cxf-http-undertow
 feature:install patch
 feature:install cxf-rs-description-swagger2
 feature:install feature
 feature:install camel
 feature:install jaas
 feature:install camel-jaxb
 feature:install camel-paxlogging
 feature:install deployer
 feature:install diagnostic
 feature:install patch-management
 feature:install bundle
 feature:install kar
 feature:install camel-csv
 feature:install package
 feature:install scr
 feature:install maven
 feature:install war
 feature:install camel-mail
 feature:install fuse-credential-store
 feature:install framework
 feature:install system
 feature:install pax-http-undertow
 feature:install fuse-javaee-apis
 feature:install management
 feature:install camel-undertow
 feature:install camel-blueprint
 feature:install camel-spring
 feature:install hawtio
 feature:install camel-ftp
 feature:install fuse-credential-store-core
 feature:install config
 feature:install transaction-manager-narayana
feature:install camel-http4
feature:install camel-spring-security
feature:install camel-jms
feature:install camel-jackson
feature:install camel-jacksonxml
feature:install camel-restlet-jackson
feature:install camel-rest-swagger 
feature:install camel-swagger
feature:install camel-swagger-java
feature:install camel-jdbc
feature:install camel-quartz2
feature:install camel-hl7
feature:install camel-xmlsecurity
feature:install camel-tika
feature:install camel-undertow
feature:install camel-activemq
feature:install camel-netty4
feature:install spring-jdbc
feature:install spring-orm
feature:install spring-security
feature:install cxf-http-client
feature:install cxf-rs-description-openapi-v3
feature:install cxf-http-netty-client
feature:install cxf-http-netty-server
feature:install hibernate
feature:install pax-jdbc-pool-dbcp2
feature:install aries-blueprint-spring
feature:install jms
feature:install pax-jms-pool-pooledjms
feature:install pax-jms-artemis
feature:install pax-jms-config
feature:install pax-jms-pool 
feature:install activemq-client
feature:install artemis
feature:install artemis-core
feature:install artemis-core-client 
feature:install artemis-jms-client
features:install webconsole

```

When i start the component on Karaf Console with the command:

bundle:install -s  mvn:bug.test/bug-load-namespace-blueprint/1.0.0-SNAPSHOT

i got stuck on the status "Grace Period" because of this error:

```

Blueprint bundle bug.test.bug-load-namespace-blueprint/1.0.0.SNAPSHOT is waiting for namespace handlers [http://cxf.apache.org/blueprint/core, http://cxf.apache.org/transports/http/configuration, http://aries.apache.org/blueprint/xmlns/blueprint-cm/v1.3.0, http://camel.apache.org/schema/blueprint/cxf, http://cxf.apache.org/configuration/security, http://camel.apache.org/schema/blueprint, http://cxf.apache.org/transports/http-undertow/configuration]

```
