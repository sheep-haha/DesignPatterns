
这个包干了什么？
将客户端的switch语句隐藏了起来

如何做？
将switch放入到CashContext中

有哪些变化（若添加新的优惠方式）
- 创建新的优惠方式类
- 修改客户端代码

之前的客户端
```java
  CashSuper cashSuper = new 新的优惠方式;
  cashContext = new CashContext(cashSuper);
```

现在的客户端
```java
CashContext cashContext = new CashContext(Type);
```
策略模式_工厂模式中，客户端只看到了CashContext
简单工厂模式中，客户端看到了CashSuper，CashFactory两个类

有一小点需要注意的是，在CashContext的switch语句中，现在的是内容写死了的，所以这里case需要手动的添加新的优惠方式
那就意味着每次需要重新修改CashContext文件。
实际上可以使用反射机制，这样就不用每次在CashContext添加case了。

最终实现了添加一个新的优惠方式，不动其他类，只添加子类的期望了

