# Spring_Core_InnerBean

Spring - Injecting Inner Beans------>

Java inner classes are defined within the scope of other classes, similarly, inner beans are beans that are defined within the scope of another bean.

Thus, a <bean/> element inside the <property/> or <constructor-arg/> elements is called inner bean.

********************************************************************
In Spring framework, whenever a bean is used for only one particular property, it’s advise to declare it as an inner bean. And the inner bean is supported both in setter injection ‘property‘ and constructor injection ‘constructor-arg‘. 
Like Inner classes are the classes which are defined inside the scope of another class. Similarly inner beans are the beans which are defined in the scope of another bean.

Injecting Inner Beans

<bean id=”outer_bean” class=”OuterBean”>
<property name=”innerbean”>
<bean class=”InnerBean”/>
</property>
</bean>

As you can see, instead of using ref attribute of property tag, beans are defined inside property tag. In this case an instance of InnerBean class will be created and wired in to innerbean property of OuterBean class.

We can use inner beans in constructor-arg tag as well like below

<bean id=”outer_bean” class=”OuterBean”>
<constructor-arg>
<bean class=”InnerBean”/>
</ constructor-arg>
</bean>
In this case an instance of InnerBean class will be created and will be passed as an constructor argument of OuterBean class.
*******************************************************************
