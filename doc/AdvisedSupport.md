## AdvisedSupport

#### targetSource:

被代理的目标类对象包装器

方法有:

* getTargetClass 获取被代理目标类的class

* getTarget 获取被代理目标类的对象

 #### advisors:
 
 代理顾问抽象实体,主要保存当前对象的aop的配置
 
#### proxiedInterfaces:
 
 被代理的类实现的接口列表
 
 注:在配置spring.aop.proxy-target-class=true的话,会强制cglib代理,保存interface将没有意义,interfalce列表会为空
 
 Jdk动态代理会通过接口列表生成代理