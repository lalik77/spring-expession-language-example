# This repo is a Simple example about The Spring Expression Language (SpEL)

## 1-Spring Expression Language 
According to the official docs, SpEL is quite a powerful expression language which basically supports querying and manipulating the full [object graph](https://en.wikipedia.org/wiki/Object_graph) at runtime.

## 2-Adding SpEL Support
SpEL support is provided by spring-expression library which is already present in our starter. In fact, if we inspect the dependency tree of our project, we may see that spring-expression is a part of spring-boot-starter-web. So, we have the nesessary dependency automatically.

![Picture](https://github.com/lalik77/spring-expession-language-example/blob/master/spel-dependency-springboot.jpg)


## 3-Resources
[Spring Expression Language Guide](https://www.baeldung.com/spring-expression-language)


### In this example , two Beans are created and we’ll explore all of our expressions by making good use of the @Value annotation .

![BeanA](https://github.com/lalik77/spring-expession-language-example/blob/master/Bean%20A.png)

![BeanB](https://github.com/lalik77/spring-expession-language-example/blob/master/Bean%20B.png)

<br/>
The value of expressions should naturally, evaluate to 5 ,  we can also add two strings etc 

### In order to check this, we’re going to create a JUnit test 
![Test](https://github.com/lalik77/spring-expession-language-example/blob/master/Test.png)

### We run the test in debug mode again (with the breakpoint still present), then inspecting the state of the been 

![Debug](https://github.com/lalik77/spring-expession-language-example/blob/master/Debug.png)

