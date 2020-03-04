# BIL481 Homework 2 - JUnit - Mockito - Jacoco

Implement tests to improve the coverage. You are given a project that has only a few complete unit tests and the test coverage is very low. Some of the test are written partially, some of the tests are given as test method names and some there are also some missing tests. You are expected to increase the test coverage to 100% by implementing junit tests. You are going to use jacoco to measure the current test coverage numbers.

> Instructions
- Make sure your repository is private and do not change it to public till the deadline. Deadline is 14.03.2020 - 23:00

- Import project main module. If your IDE has selected child module while importing, uncheck it. Example ScreenShot of eclipse can be seen below.

![alt text](https://github.com/hdsumerkan/BIL481_HW2/blob/master/BIL481_HW2/project/maven.JPG)

- In order to build the project execute the following Maven command:

```shell
mvn clean install
```

This command will also generate a report of the code coverage produced by JaCoCo. The report will be located in the following path:

```shell
target/site/jacoco
```

- Check the current test covereage report by opening the index.html in any browser. Get a screenshots of coverage reports and save them.

- Create folder, namely preCoverageReport in your github repository and upload screenshots that you saved.

- Implement missing junit tests and commit each unit test as soon as you completed it. Make sure that your github repository shows a meaningful commit history distributed over time. In other words, we should NOT see that you committed all the files all at once because otherwise this clearly showed that you actually did not follow the instructions properly. Because of this it is strongly advised to commit and push every change that you have done over time.

- Build the project again and check the code coverage. Complete missing parts by finding them using jacoco. 

- After finishing to implement your unit tests, build the project one last time and check the final test covereage report by opening the index.html in any browser. Get a screenshots of coverage reports and save them.

- Create folder, namely postCoverageReport in your github repository and upload screenshots that you saved.



