# Java Spring Boot Demo  

**A simple Spring Boot 3.x app to send hello world message to a user**

**แอป Spring Boot 3.x ง่ายๆ เพื่อส่งข้อความ "Hello World" ให้กับผู้ใช้**

## How to Run Application
## วิธีการรันแอปพลิเคชัน

**Start the application using any of the commands mentioned below**
**เริ่มแอปพลิเคชันโดยใช้คำสั่งใดก็ได้ที่ระบุด้านล่างนี้**

> **Note:** First two commands need to run inside the root folder of this project i.e inside the **java-spring-boot-demo** folder
> **หมายเหตุ:** สองคำสั่งแรกต้องรันภายในโฟลเดอร์ root ของโปรเจกต์นี้ นั่นคือภายในโฟลเดอร์ **java-spring-boot-demo**

- **Using maven** <br/>``` mvn spring-boot:run```
- **ใช้ Maven** <br/>```mvn spring-boot:run```

- **From jar file** <br/>Create a jar file using '**mvn clean install**' command and then execute
  <br/>```java -jar target/demo-0.0.1-SNAPSHOT.jar```
- **จากไฟล์ jar** <br/>สร้างไฟล์ jar โดยใช้คำสั่ง '**mvn clean install**' แล้วรัน
  <br/>```java -jar target/demo-0.0.1-SNAPSHOT.jar```

- **Directly from IDE** <br/>Right click on HelloWorldApplication.java and click on 'Run' option
- **โดยตรงจาก IDE** <br/>คลิกขวาที่ไฟล์ HelloWorldApplication.java แล้วเลือก 'Run'
<br/><br/>

> **Note:** By default spring boot application starts on port number 8080. If port 8080 is occupied in your system then you can change the port number by uncommenting and updating the **server.port** property inside the **application.properties** file that is available inside the **src > main > resources** folder.
> **หมายเหตุ:** โดยปกติแล้วแอป Spring Boot จะเริ่มที่พอร์ต 8080 หากพอร์ต 8080 ถูกใช้งานอยู่แล้วในระบบของคุณ คุณสามารถเปลี่ยนพอร์ตได้โดยการ uncomment และแก้ไข property **server.port** ในไฟล์ **application.properties** ที่อยู่ในโฟลเดอร์ **src > main > resources**

<br/>

**Send an HTTP GET request to '/hello' endpoint using any of the two methods**
**ส่ง HTTP GET request ไปยัง endpoint '/hello' โดยใช้วิธีใดก็ได้ต่อไปนี้**

- **Browser or REST client** <br/>```http://localhost:8080/hello```
- **เบราว์เซอร์หรือ REST client** <br/>```http://localhost:8080/hello```

- **cURL** <br/>```curl --request GET 'http://localhost:8080/hello'```
- **cURL** <br/>```curl --request GET 'http://localhost:8080/hello'```

## How to Run Unit Test Cases
## วิธีการรัน Unit Test Cases

**Run the test cases using any of the commands mentioned below**
**รันทดสอบโดยใช้คำสั่งใดก็ได้ที่ระบุด้านล่างนี้**

> **Note:** These commands need to run inside the root folder of this project i.e inside the **java-spring-boot-demo** folder
> **หมายเหตุ:** คำสั่งเหล่านี้ต้องรันภายในโฟลเดอร์ root ของโปรเจกต์นี้ นั่นคือภายในโฟลเดอร์ **java-spring-boot-demo**

- **To run all the test cases** <br/>```mvn test```
- **รันทดสอบทั้งหมด** <br/>```mvn test```

- **To run a particular test class** <br/>```mvn -Dtest=HelloWorldControllerTest test``` <br/>or <br/>```mvn -Dtest=HelloWorldApplicationTests test```
- **รันทดสอบเฉพาะคลาส** <br/>```mvn -Dtest=HelloWorldControllerTest test``` <br/>หรือ <br/>```mvn -Dtest=HelloWorldApplicationTests test```
