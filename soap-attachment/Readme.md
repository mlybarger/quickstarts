Introduction
============
This quickstart demonstrates the usage of SOAP with Attachments (SwA). It binds
one SwitchYard service over SOAP/HTTP URL that can be accessed by any SOAP based client.
It also invokes an external Webservice with the passed in attachment.

```
+-----------------+      +--------------+      +-------------+      +----------------------+
| http://         | ---- | ImageService | ---- | camel:route | ---- | ImageServiceExternal |
+-----------------+      +--------------+      +-------------+      +----------------------+
```

![SOAP with Attachments Quickstart](https://github.com/jboss-switchyard/quickstarts/raw/master/soap-attachment/soap-attachment.jpg)

Running the quickstart
======================

JBoss AS 7
----------
1. Start JBoss AS 7 in standalone mode:

        ${AS}/bin/standalone.sh --server-config=standalone.xml

2. Build and deploy the quickstart

        mvn install -Pdeploy

3. Open a console window and type

        mvn exec:java

4. You should see the following output
```
<env:Envelope xmlns:env="http://www.w3.org/2003/05/soap-envelope">
    <env:Header/>
    <env:Body>
        <ns2:echoImageResponse xmlns:ns2="urn:switchyard-quickstart:soap-attachment:1.0">cid:external-switchyard.png</ns2:echoImageResponse>
    </env:Body>
</env:Envelope>
```
Response attachment: <external-switchyard.png> with content type image/png

5. Undeploy the quickstart:

        mvn clean -Pdeploy

## Further Reading

1. [SOAP Binding Documentation](https://docs.jboss.org/author/display/SWITCHYARD/SOAP)
2. [SOAP Messages with Attachments] http://www.w3.org/TR/SOAP-attachments
