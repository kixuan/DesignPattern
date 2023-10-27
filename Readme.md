[设计模式学习路线 (yuque.com)](https://bcdh.yuque.com/staff-wpxfif/resource/gemmvk)

## 学习顺序

根据使用频率、难易度、面试考察率等综合排序，仅供参考，并不绝对！

优先：

1. ~~单例模式~~
2. ~~工厂模式~~
3. 迭代器模式
4. ~~策略模式~~
5. 建造者模式
6. 模板方法模式
7. 代理模式
8. 责任链模式
9. ~~抽象工厂模式~~
10. 适配器模式
11. ~~观察者模式~~
12. 外观模式

一般：

1. 桥接模式
2. 组合模式
3. 装饰器模式
4. 状态模式
5. 访问者模式
6. 中介者模式
7. 命令模式
8. 备忘录模式

低优先：

1. 原型模式
2. 享元模式
3. 解释器模式

## 设计模式六大原则

**1、开闭原则（Open Close Principle）**

开闭原则的意思是：**对扩展开放，对修改关闭**
。在程序需要进行拓展的时候，不能去修改原有的代码，实现一个热插拔的效果。简言之，是为了使程序的扩展性好，易于维护和升级。想要达到这样的效果，我们需要使用接口和抽象类，后面的具体设计中我们会提到这点。

**2、里氏代换原则（Liskov Substitution Principle）**

里氏代换原则是面向对象设计的基本原则之一。 里氏代换原则中说，任何基类可以出现的地方，子类一定可以出现。LSP
是继承复用的基石，只有当派生类可以替换掉基类，且软件单位的功能不受到影响时，基类才能真正被复用，而派生类也能够在基类的基础上增加新的行为。里氏代换原则是对开闭原则的补充。实现开闭原则的关键步骤就是抽象化，而基类与子类的继承关系就是抽象化的具体实现，所以里氏代换原则是对实现抽象化的具体步骤的规范。

**3、依赖倒转原则（Dependence Inversion Principle）**

这个原则是开闭原则的基础，具体内容：针对接口编程，依赖于抽象而不依赖于具体。

**4、接口隔离原则（Interface Segregation Principle）**

这个原则的意思是：使用多个隔离的接口，比使用单个接口要好。它还有另外一个意思是：降低类之间的耦合度。由此可见，其实设计模式就是从大型软件架构出发、便于升级和维护的软件设计思想，它强调降低依赖，降低耦合。

**5、迪米特法则，又称最少知道原则（Demeter Principle）**

最少知道原则是指：一个实体应当尽量少地与其他实体之间发生相互作用，使得系统功能模块相对独立。

**6、合成复用原则（Composite Reuse Principle）**

合成复用原则是指：尽量使用合成/聚合的方式，而不是使用继承。

## 单例模式

**定义：**确保一个类只有一个实例，并提供了一个全局访问点来访问该实例。

**作用：**系统内存中该类只存在一个对象，节省了系统资源，对于一些需要频繁创建销毁的对象，使用单例模式可以提高系统性能。

**使用场景**

1. 需要频繁的进行创建和销毁的对象；
2. 创建对象时耗时过多或耗费资源过多，但又经常用到的对象；
3. Windows 是多进程多线程的，在操作一个文件的时候，就不可避免地出现多个进程或线程同时操作一个文件的现象，所以所有文件的处理必须通过唯一的实例来进行。
4. 一些设备管理器常常设计为单例模式，比如一个电脑有两台打印机，在输出的时候就要处理不能两台打印机打印同一个文件。

**实现**

![image-20231026232611850](https://cdn.jsdelivr.net/gh/kixuan/PicGo/images/image-20231026232611850.png)

1. 因为要确保只有一个对象，所以**构造函数必须是private**，那这个类的结构就是1私有构造函数 + 1获取实例(getInstance)函数 +
   1创建对象 + 其他
2. main方法就是调用getInstance()获取唯一可用对象，再通过这个对象进行其他方法的调用。

**分类：**

1. 饿汉式：因为饿，在类加载时就初始化（浪费内存），getInstance()直接返回这个初始化好的对象

2. 懒汉式：因为懒，就先判断是否为null，为null的时候再创建对象，但是如果在多线程的情况下，就需要在getInstance()上加锁(
   synchronized)确保线程安全

3. 双重校验锁（DCL，即 double-checked locking）：创建对象前后都判断是否为null，同时创建时加锁，提高安全性

4. 静态内部类：效果同3，就是所有方法加上static，可以明确实现 lazy loading 效果。

5. 枚举：不能通过反射调用私有构造方法进行再次实例化，安全性很高

**TIPS：**

1. 一般情况下，建议使用饿汉式
2. 只有在要明确实现 lazy loading 效果时，才会使用静态内部类
3. 如果涉及到反序列化创建对象时，可以尝试使用枚举。
4. 如果有其他特殊的需求，可以考虑使用双检锁式。

**典型用例**

1、JDK中的Runtime

Runtime类封装了Java运行时环境。每一个Java程序实际上都启动了一个JVM进程，那么每个JVM进程都对应一个Runtime实例，此实例由JVM为其实例化。每个Java应用程序都有一个Runtime实例，使应用程序能够与其运行的环境相连接。

由于Java是单进程的，所以，在一个JVM中，Runtime的实例应该只有一个。所以应该使用单例来实现。

![image-20231027002956959](https://cdn.jsdelivr.net/gh/kixuan/PicGo/images/image-20231027002956959.png)

2、java.awt.Toolkit

懒汉式单例。不需要事先创建好，只要在第一次真正用到的时候再创建就可以了。因为很多时候并不常用Java的GUI和其中的对象。如果使用饿汉单例的话会影响JVM的启动速度。

![image-20231027003328382](https://cdn.jsdelivr.net/gh/kixuan/PicGo/images/image-20231027003328382.png)

## 工厂模式

**定义**：定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。

**作用**：主要解决接口选择的问题。通过传入参数的不同返回不同的实例

**使用场景：**

1. 日志记录器：记录可能记录到本地硬盘、系统事件、远程服务器等，用户可以选择记录日志到什么地方。
2. 数据库访问，当用户不知道最后系统采用哪一类数据库，以及数据库可能有变化时。
3. 设计一个连接服务器的框架，需要三个协议，"POP3"、"IMAP"、"HTTP"，可以把这三个作为产品类共同实现一个接口。

**工厂模式包含以下几个核心角色：**

- 抽象产品（Abstract Product）：定义了产品的共同接口或抽象类。它可以是具体产品类的父类或接口，规定了产品对象的共同方法。
- 具体产品（Concrete Product）：实现了抽象产品接口，定义了具体产品的特定行为和属性。
- 抽象工厂（Abstract Factory）：声明了创建产品的抽象方法，可以是接口或抽象类。它可以有多个方法用于创建不同类型的产品。
- 具体工厂（Concrete Factory）：实现了抽象工厂接口，负责实际创建具体产品的对象。

**实现**：

![image-20231024155539139](https://cdn.jsdelivr.net/gh/kixuan/PicGo/images/image-20231024155539139.png)

1. 首先了解一下我们的需求：要创建三个几何图形，因为都是几何，所有我们先创建一个接口`Shape`
   （抽象产品），再建三个几何类实现接口`Shape`（具体产品）
2. 然后我们再建一个`ShapeFactory`（抽象工厂），在这里根据用户传入的type，进行判断需要创建哪个几何类
3. 在测试类创建（具体工厂），并创建不同的（具体产品），调用方法测试

**TIPS：**

**简单工厂模式**

该模式对对象创建管理方式最为简单，因为其仅仅简单的对不同类对象的创建进行了一层薄薄的封装。该模式通过向工厂传递类型来指定要创建的对象

![image-20231024162640426](https://cdn.jsdelivr.net/gh/kixuan/PicGo/images/image-20231024162640426.png)

- 优点：将对象的创建交给专门的工厂类负责，实现了对象的创建和对象的使用分离。

- 缺点：工厂类不够灵活，增加新的具体产品需要修改工厂类的判断逻辑代码，比如有人是绿皮肤，上面的工厂类显然满足不了，需要增加一个
  if 判断分支才能支持。而且当产品类型较多时，简单工厂的 if 判断将会非常多，不容易维护。

**工厂方法模式**

工厂方法模式将生成具体产品的任务分发给具体的产品工厂，也就是定义一个抽象工厂，其定义了产品的生产接口，但不负责具体的产品，将生产任务交给不同的派生类工厂。这样不用通过指定类型来创建对象了。

![image-20231024162705992](https://cdn.jsdelivr.net/gh/kixuan/PicGo/images/image-20231024162705992.png)

- 优点：遵循了开闭原则，扩展性极强。比如现在要增加一个绿皮肤的人类，我们只需要增加一个创建绿皮肤人类的工厂，这个工厂继承自抽象工厂即可，不需要改变原有代码，可维护性高。

- 缺点：增加了类的数量，当有成千上万个类型的产品时，就需要有成千上万个工厂类来生产这些产品。

**抽象工厂模式**

上面两种模式不管工厂怎么拆分抽象，都只是针对一类产品**Phone**（AbstractProduct），如果要生成另一种产品PC，应该怎么表示呢？

最简单的方式是把2中介绍的工厂方法模式完全复制一份，不过这次生产的是PC。但同时也就意味着我们要完全复制和修改Phone生产管理的所有代码，显然这是一个笨办法，并不利于扩展和维护。

抽象工厂模式通过在AbstarctFactory中增加创建产品的接口，并在具体子工厂中实现新加产品的创建，当然前提是子工厂支持生产该产品。否则继承的这个接口可以什么也不干。

![image-20231024162749829](https://cdn.jsdelivr.net/gh/kixuan/PicGo/images/image-20231024162749829.png)

- 优点：增加固定类型产品的不同具体工厂比较方便。例如现在女娲要创造一个绿皮肤的人，只需要再创建一个绿皮肤人的工厂继承抽象工厂就可以了。

- 缺点：类图优点复杂，可读性没有工厂方法模式那么好。

**总结：**

简单工厂：通过一个公共**工厂直接**创建具体类

工厂方法：通过**具体工厂实现抽象工厂**创建具体类

抽象工厂：通过具体工厂实现公共工厂创建**不同**具体类

**典型示例：**

- java.util.Calendar, ResourceBundle and NumberFormat getInstance() 使用了工厂方法模式；
- valueOf() 在包装类中，如Boolean, Integer 也使用了工厂方法模式；
- collection的迭代器也有用到

## 迭代器模式

**定义：**提供一种遍历集合元素的统一接口，用一致的方法遍历集合元素，不需要知道集合对象的底层表示，即 **不暴露其内部的结构**。

**作用：**把在元素之间游走的责任交给迭代器，而不是聚合对象。

**使用场景：**

1. 访问一个聚合对象的内容而无须暴露它的内部表示。
2. 需要为聚合对象提供多种遍历方式。 【重写Iterator】
3. 为遍历不同的聚合结构提供一个统一的接口。

**包含对象：**

1. Iterator ：迭代器接口，系统提供，含义 hasNext、next、remove
2. ConcreteIterator ：具体的迭代器类，管理迭代。
3. Aggregate ：一个统一的聚合接口，将客户端和具体聚合解耦
4. ConcreteAggreage ：具体的聚合持有对象集合，并提供一个方法，返回一个迭代器，该迭代器可以正确遍历集合
5. Client ：客户端，通过Iterator和Aggregate依赖子类。

**实现：**

![image-20231027121938753](https://cdn.jsdelivr.net/gh/kixuan/PicGo/images/image-20231027121938753.png)

1. 迭代器实现：首先明确需要，就是要遍历嘛，遍历需要实现迭代器接口(Iterator )，所以我们创建一个nameIterator实现Iterator的三个具体方法。
2. 在定义一个接口(ConcreteAggreage )，新增创建迭代器nameIterator的方法
3. 在demo里面中实现ConcreteAggreage，并实现创建迭代器方法，然后就new一个demo类，new一个构造器就可以遍历了

**TIPS：**

1. 为什么要迭代器捏？

for的话通常用于数组、列表或其他支持索引访问的集合。它不是一种通用的遍历方法，无法直接应用于所有集合类型。

适用于各种Java集合，包括列表、集合、映射等。因为它们是通过接口实现的，所以**可以轻松地在不同集合类型之间切换，而无需更改遍历代码
**。而且迭代器还允许你检查是否有下一个元素，并且可以避免在遍历过程中产生ConcurrentModificationException等异常。

总的来说，使用迭代器进行遍历通常更加安全、可读性更好，并且适用于各种集合类型。但对于简单的数组或列表遍历，直接使用for循环也是一种有效的方式。

**典型示例：**

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
