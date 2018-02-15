# triangle
School assignment for testing kinds of triangles

## Test cases
|#| input | expected output | actual output |
|-|-------|-----------------|---------------|
|1|(4,4,4)|Equilateral      |    -          |
|2|(4,4,2)|Isosceles| - |
|3|(4,3,2)|Scalene| - |
|4|(0,2,2)|Not a triangle| - |
|5|(-1,2,2)|Not a triangle| - |
|6|(1,2,3)|Not a triangle| - |
|7|(3,2,1)|Not a triangle| - |
|8|(1,3,2)|Not a triangle| - |

## Prerequisites
- You need to have Java 1.8 installed
- You need to have Maven installed

## How to use
### As a commandline tool
1. Clone the project
2. Run `mvn install`
3. Run `mvn exec:java -Dexec.args="1 2 3"`. The numbers provided in the args is the numbers that sets the side of the triangle

### As a Maven library
1. Clone the project
2. Run `mvn install`
3. Create a new Maven project and include the library in the pom.xml file like shown below.
```xml
<dependency>
    <groupId>org.ziemer.test</groupId>
    <artifactId>triangle</artifactId>
    <version>0.1-SNAPSHOT</version>
</dependency>
```
4. You can now use the library like in the example below. The Triangle class has one static method called `determine`
```java
Triangle.determine(1, 2, 3);
```
