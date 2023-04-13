package com.sls.interview;

import java.io.StringWriter;

import javax.xml.bind.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.transform.stream.StreamResult;

import org.json.*;
public class JsonToXmlConverter {
public static void main(String[] args) throws JSONException, JAXBException {
// JSON string to be converted to XML
String jsonString = "{\"employee\":{\"id\":\"101\",\"name\":\"John\",\"age\":\"35\"}}";
// Parse JSON string to create a JSONObject
JSONObject jsonObject = new JSONObject(jsonString);
// Create JAXBContext and Marshaller
JAXBContext jaxbContext = JAXBContext.newInstance(EmployeeTest.class);
Marshaller marshaller = jaxbContext.createMarshaller();
// Convert JSONObject to EmployeeTest object
EmployeeTest employee = new EmployeeTest(jsonObject.getJSONObject("employee").getString("id"),
jsonObject.getJSONObject("employee").getString("name"),
jsonObject.getJSONObject("employee").getString("age"));
// Convert EmployeeTest object to XML
StringWriter stringWriter = new StringWriter();
marshaller.marshal(employee, new StreamResult(stringWriter));
String xmlString = stringWriter.toString();
System.out.println("JSON to XML conversion:\n" + xmlString);
}
}
@XmlRootElement
class EmployeeTest {
String id;
String name;
String age;
public EmployeeTest() {}
public EmployeeTest(String id, String name, String age) {
this.id = id;
this.name = name;
this.age = age;
}
@XmlElement
public String getId() {
return id;
}
public void setId(String id) {
this.id = id;
}
@XmlElement
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
@XmlElement
public String getAge() {
return age;
}
public void setAge(String age) {
this.age = age;
}
}