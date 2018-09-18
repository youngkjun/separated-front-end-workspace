# John 1:12
Yet to all who did receive him, to those whoe believed in his name, he gave the right to become children of God


# separated-front-end-workspace

This is a sample Spring Boot project to separate front-end and back-end work directories.

Default work directory sturcture of Spring Boot is like below.

- src
  - main
    - java
      - resources
Usually src/main/resources is used for environment settings and front-end codes.
And src/main/java is for Java source codes.

However, if one of source code has error,IDE indicated the src/main directory has error, although it is not related to Front-end or Back-end.

It’s not only about error indicator.
When graphic designers and Front-end, Back-end developers work together, and if there’s any updates under any thing, it would indicate those src/main directory has updates.

You may already has those experience.
Imagine those situation, how it is irritated.
It could interrupt developers to focus implementing program logic.
It leads to another, eventually it could reduce productivity and efficiency.
Do you think it’s too much detail?
Well, I experienced many times that tiny small difference could make big problems.
This would be one of those cases.

So, I tried to test to separate those directories, not to confusing for each parts.
Front-end developer can focus Front-end related libraries, directory structure and program logic, and vice versa.

Let’s share our experiences here below link.
https://youngkjun.com/separated-front-end-workspace-on-spring-boot/
