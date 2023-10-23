## 策略模式

**定义**：该模式定义了一系列算法，并将每个算法封装起来，使它们可以相互替换，且算法的变化不会影响使用算法的客户。

**作用**：在有多种算法相似的情况下，解决使用 if...else 所带来的复杂和难以维护的问题。/**解决继承不能实现的横向代码复用，有时候组合优于继承
**

**使用场景：**

1. 如果在一个系统里面有许多类，它们之间的区别仅在于它们的行为，那么使用策略模式可以动态地让一个对象在许多行为中选择一种行为。
2. 一个系统需要动态地在几种算法中选择一种。
3. 如果一个对象有很多的行为，如果不用恰当的模式，这些行为就只好使用多重的条件选择语句来实现。

**策略模式包含以下几个核心角色：**

- 环境（Context）：维护一个对策略对象的引用，负责将客户端请求委派给具体的策略对象执行。环境类可以通过依赖注入、简单工厂等方式来获取具体策略对象。
- 抽象策略（Abstract Strategy）：定义了策略对象的公共接口或抽象类，规定了具体策略类必须实现的方法。
- 具体策略（Concrete Strategy）：实现了抽象策略定义的接口或抽象类，包含了具体的算法实现。

**实现**：

![image-20231023153847429](https://cdn.jsdelivr.net/gh/kixuan/PicGo/images/image-20231023153847429.png)

1. 首先是先要有一个接口`Strategy`，这个类有一个方法`doOperation`
2. 这个`doOperation`方法有不同的类重写了，如`OperationAdd`、`OperationMultiply`等
3. 现在有个环境`Context`要定义这个接口，注意此环境代码

```java
public class Context {
   private final Strategy strategy;
 
   public Context(Strategy strategy){
      this.strategy = strategy;
   }
 
   public int executeStrategy(int num1, int num2){
      return strategy.doOperation(num1, num2);
   }
}
```

4. 在Demo里面实现这个接口，new的时候就直接传入具体类/对应的重写方法

```java
      Context context = new Context(new OperationAdd());
      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
 
      context = new Context(new OperationSubtract());
      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
```

**典型示例**

在JDK中最经典的使用策略模式的例子就是`Collections.sort(List<T> list, Comparator<? super T> c)`
方法，这个方法接受一个比较器`Compartor`参数，客户端在运行时可以传入一个比较器的实现，`sort()`方法中根据不同实现，按照不同的方式进行排序。

## 观察者模式

**定义**：当一个对象被修改时，则会自动通知依赖它的对象。观察者模式属于行为型模式。

**作用**：一个对象状态改变给其他对象通知的问题，而且要考虑到易用和低耦合，保证高度的协作。

**使用场景：**

- 一个抽象模型有两个方面，其中一个方面依赖于另一个方面。将这些方面封装在独立的对象中使它们可以各自独立地改变和复用。
- 一个对象的改变将导致其他一个或多个对象也发生改变，而不知道具体有多少对象将发生改变，可以降低对象之间的耦合度。
- 一个对象必须通知其他对象，而并不知道这些对象是谁。
- 需要在系统中创建一个触发链，A对象的行为将影响B对象，B对象的行为将影响C对象……，可以使用观察者模式创建一种链式触发机制。

**观察者模式包含以下几个核心角色：**

- 主题（Subject）：也称为被观察者或可观察者，它是具有状态的对象，并维护着一个观察者列表。主题提供了添加、删除和通知观察者的方法。
- 观察者（Observer）：观察者是接收主题通知的对象。观察者需要实现一个更新方法，当收到主题的通知时，调用该方法进行更新操作。
- 具体主题（Concrete Subject）：具体主题是主题的具体实现类。它维护着观察者列表，并在状态发生改变时通知观察者。
- 具体观察者（Concrete Observer）：具体观察者是观察者的具体实现类。它实现了更新方法，定义了在收到主题通知时需要执行的具体操作。

**实现**：【倒推】

![image-20231023164154002](https://cdn.jsdelivr.net/gh/kixuan/PicGo/images/image-20231023164154002.png)

1. 首先要有被观察者`Subject`类，这个类有观察者`observers`，和对应的add和remove方法；还有改变状态方法`setState`
   ，这个方法里面除了改变state还要有一个通知`observers`让他们`update`的方法
2. 对应的观察者`observers`类就应该有①被观察者`Subject`类，②`update`方法
3. 在demo里面，我们首先创建三个`observers`，然后调用`Subject`的`setState`方法，查看`observers`类`update`得怎么样

**典型示例**【待try】

Spring Event（Application Event）其实就是一个观察者设计模式，一个 Bean 处理完成任务后希望通知其它 Bean 或者说一个 Bean
想观察监听另一个Bean 的行为。
