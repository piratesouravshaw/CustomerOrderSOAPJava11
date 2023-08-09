cxf-codegen-plugin => used for wsdl to java code generation

jakarta.xml.bind-api => When we use code-gen plugin
of apache for generation of pojo files from wsdl
then it by defaults uses some annotation which are 
defind in this dependency

snakeyaml => Exclusion needed to be included
due to Security vulnerability some issue [because of older spring boot version]which I was facing in my local 
enviorment setup we might or might not need it in 
future. with latest spring boot it need not be required

cxf-spring-boot-starter-jaxws => This is the most important dependency here.



Here the url we can access this will be -> http://localhost:8080/services/customerordersservice?wsdl
if we want to remove /services part from url we can add this entry inside application.properties
cxf.path=/


