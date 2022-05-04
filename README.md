# UI-automation

Hello ! this is a simple Selenium-based UI automation project whose current purpose is search keyword `java` in https://www.baidu.com and check all the returned title having `java` keywords on FireFox Browser

technoloy stack: Java Selenium，Maven，IntelliJ

dependencies:

        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.1.3</version>
        </dependency>

code structure:

![1651682493(1)](https://user-images.githubusercontent.com/24584111/166729612-20becdc0-b7fc-4482-afa7-1fb0328df27a.png)

steps:

1.create a maven project using IntelliJ

![1651682569(1)](https://user-images.githubusercontent.com/24584111/166730008-24eb7106-b39f-410a-8e29-8bf89bd8f065.png)

2.import selenium dependency into pom.xml 

![1651682643(1)](https://user-images.githubusercontent.com/24584111/166730686-e2e66f7c-470d-4da0-a9cc-5820fa391155.png)

3.download firefox driver and place it into resource folder

![1651682768(1)](https://user-images.githubusercontent.com/24584111/166731958-df6a4803-1f5c-44c2-af53-136cae87b4ce.png)


4.write functional codes

![1651682688(1)](https://user-images.githubusercontent.com/24584111/166731237-eab0a484-77ad-4b15-b84c-09ad05830eac.png)

5.run the code and get result

![ca5e67ee6285d3c1242c91766f6c43e](https://user-images.githubusercontent.com/24584111/166732701-9a51ee3a-03c7-4bf2-9b9f-64dd62dc3a90.png)




