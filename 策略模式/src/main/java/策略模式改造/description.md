这个包干了什么？
取消工厂模式，创建context调用各种算法
修改了客户端

看一下升级后如何添加新的优惠方式，对比一下简单工厂模式
- 创建新的优惠方式类
- 客户端修改代码
```java
  CashSuper cashSuper = new 新的优惠方式;
  cashContext = new CashContext(cashSuper);
```
  
就结束了，不需要修改其他代码，如此具有拓展性。
但是有个问题需要处理，客户端这里使用了switch语句，希望将它隐藏起来。
如何做？
看策略模式_工厂模式


