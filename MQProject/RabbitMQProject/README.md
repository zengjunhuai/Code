### *准备工作*



### *实战*
* *Demo0*
```mermaid
      flowchart LR;
           Producer-->    Queue    -->Consumer;
```
| 描述  | 优化  | 代码      | 参考文档   |
|    :----:   |    :----:   |          :---: |  :---: |
| 实现一个生产者生产消息到rabbitmq，一个消费者消费消息       |    /   | [代码](https://github.com/zengjunhuai/Code/tree/master/MQProject/RabbitMQProject/Hellow%20World "悬停显示")  | [参考文档](https://www.yuque.com/yuqueyonghu7as8iq/ptfglx/tguuvso1rbti52by) |

* *Demo1/Demo2*
```mermaid
      flowchart LR;
           Producer-->    Queue    -->Consumer1;
                          Queue    -->Consumer2;
```
| 描述  | 优化  | 代码      | 参考文档   |
|    :----:   |    :----:   |          :---: |  :---: |
| Demo1:生产者发送4个消息，消费者1和消费者2分别分得两个消息，并且是按照有序的一个接收一次消息      |   特点：（自动应答）消费者按序接收实时消息缺点：消费者挂掉，消息丢失|  [代码](https://github.com/zengjunhuai/Code/tree/master/MQProject/RabbitMQProject/Demo1 "悬停显示")  | [参考文档](https://www.yuque.com/yuqueyonghu7as8iq/ptfglx/meu9rhvidncelqfc) |
| Demo2:生产者发送4个消息，消费者1和消费者2分别分得两个消息，并且是按照有序的一个接收一次消息      |   特点：（手动应答）消费者按序接收延时消息，消费者挂掉，消息分配给另一消费者|  [代码](https://github.com/zengjunhuai/Code/tree/master/MQProject/RabbitMQProject/Demo1 "悬停显示")  | [参考文档](https://www.yuque.com/yuqueyonghu7as8iq/ptfglx/yytzes8tb7487cvz) |

* *Demo2*
```mermaid
      flowchart LR;
           Producer-->    Queue  -->Consumer1;
                          Queue  -->Consumer2;
```
| 描述  | 代码      | 参考文档   |
|    :----:   |          :---: |  :---: |
| 生产者发送4个消息，消费者1和消费者2分别分得两个消息，并且是按照有序的一个接收一次消息      | [代码](https://github.com/zengjunhuai/Code/tree/master/MQProject/RabbitMQProject/Demo1 "悬停显示")  | [参考文档](https://www.yuque.com/yuqueyonghu7as8iq/ptfglx/meu9rhvidncelqfc) |

* *Demo8*
```mermaid
      flowchart LR;
           Producer--> Exchange_X-- XA/type=direct -->Queue_QA/10s-- YD -->Exchange_Y-- type=direct/YD -->QD -->Consumer;
                       Exchange_X-- XB/type=direct -->Queue_QB/40s-- YD -->Exchange_Y 
```

* *Demo9*
```mermaid
      flowchart LR;
           Producer--> Exchange_X -- XA/type=direct -->Queue_QA/10s-- YD -->Exchange_Y-- type=direct/YD -->QD -->Consumer;
                       Exchange_X -- XB/type=direct -->Queue_QB/40s-- YD -->Exchange_Y 
                       Exchange_X -- XC/type=direct -->Queue_QC-- YD -->Exchange_Y 
```

* *Demo10*
```mermaid
      flowchart LR;
           Producer-- type=x-delayed-message -->delayed.exchange-- delayed.routingkey -->delayed.queue-->Consumer;                             
```

* *Demo11*
```mermaid
      flowchart LR;
           Producer-- type=x-delayed-message -->delayed.exchange-- delayed.routingkey -->delayed.queue-->Consumer;                             
```

* *Demo12*
```mermaid
      flowchart LR;
           Producer-- type=x-delayed-message -->delayed.exchange-- delayed.routingkey -->delayed.queue-->Consumer;                             
```

* *Demo13*
```mermaid
      flowchart LR;
           Producer-- type=x-delayed-message -->delayed.exchange-- delayed.routingkey -->delayed.queue-->Consumer;                             
```

* *Demo14*
```mermaid
      flowchart LR;
           Producer-- type=x-delayed-message -->delayed.exchange-- delayed.routingkey -->delayed.queue-->Consumer;                             
```




### *面试相关*






