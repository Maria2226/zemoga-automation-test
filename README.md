
# Zemoga TAE Test

_Automation practice test for Zemoga_

## Starting 🚀

_This test was built creating a framework for implementation of automated tests for web, based on Selenium Web Driver, and with help of cucumber, to handle execution with Gerkin and reports generation with screenshots._


## Running 🔧

_In order to run tests, I used Maven_

_and they are executed as follows_

```
mvn test
```
_or if you want to run only one test or several filtered by tags, it is done as follows_

```
mvn test -Dcucumber.filter.tags=@Checkout
```

_After this, all the tests will be run and at the end a report will be generated_


## Report 🧾

_After all the tests are run, a report will be generated in the path **target/report.html**, which can be executed in a browser and the result of execution can be viewed in detail._


## Built with 🛠️

_Those tools was used_

* [Selenium](https://www.selenium.dev/) - Range of tools and libraries aimed at supporting web browser automation
* [Java Faker](https://github.com/DiUS/java-faker) - This library that generates fake data
* [Cucumber](https://cucumber.io/) - Is a software tool that supports behavior-driven development BDD
* [JUnit](https://junit.org/junit5/) - JUnit is a unit testing framework for the Java


## What would I have liked to do? ⌨️

_Due to time, there are things that can still be added to this test, I can come up with ideas such as:_

- **Make an example without cucumber** , In order to demonstrate that it is not necessary to depend on a framework such as cucumber to perform this test, I would have liked to add test examples accessing the methods of the steps definitions without being run through the features of cucumber
- **Add a logger** , In order to add process logs and a more telling record of the steps, I would have liked to add a logger such as [log4j](https://logging.apache.org/log4j/2.x/) or [slf4j](https://www.slf4j.org/) that already has this previous embedded
- **Add global data handler** , I also would have liked to add a global data handler like Serenity does with the actor's memory to validate data that are references from previous steps, such as:
  - Validate that the cart price value is the same value of checkout 
  - Validate that name entered on sign in form is the same at the end of the order
- **Integrate with TestRail** , Integrate with a tool for test case management to manage, track & organize test cases, like TestRail with a Test Rail API binding for Java

## Author ✒️

* **Maria Angelica Castro** - *Test author*

## To create a PR ✒
_I made this in order to crate a PR, due to all changes are already in main branch_

---
⌨️ with ❤️ by Maria Angelica Castro 😊
   