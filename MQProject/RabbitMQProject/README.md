### *准备工作*


### *实战*
* *Demo0*
```mermaid
      flowchart LR;
           Producer-->    Queue    -->Consumer;
```
| <div style="width:2900px">描述</div>  | 代码      | 参考文档   |
|    :----:   |          :---: |  :---: |
| 实现一个生产者生产消息到rabbitmq，一个消费者消费消息       | [代码](https://github.com/zengjunhuai/Code/tree/master/MQProject/RabbitMQProject/Hellow%20World "悬停显示")  | [参考文档](https://www.yuque.com/yuqueyonghu7as8iq/ptfglx/tguuvso1rbti52by) |

* *Demo1*
```mermaid
      flowchart LR;
           Producer-->    Queue    -->Consumer1;
                          Queue    -->Consumer2;
```
| 描述  | 代码      | 参考文档   |
|    :----:   |          :---: |  :---: |
| 生产者发送4个消息，消费者1和消费者2分别分得两个消息，并且是按照有序的一个接收一次消息      | [代码](https://github.com/zengjunhuai/Code/tree/master/MQProject/RabbitMQProject/Demo1 "悬停显示")  | [参考文档](https://www.yuque.com/yuqueyonghu7as8iq/ptfglx/meu9rhvidncelqfc) |

* *Demo2*
```mermaid
      flowchart LR;
           Producer-->    Queue    -->Consumer1;
                          Queue    -->Consumer2;
```
| 描述  | 代码      | 参考文档   |
|    :----:   |          :---: |  :---: |
| 生产者发送4个消息，消费者1和消费者2分别分得两个消息，并且是按照有序的一个接收一次消息      | [代码](https://github.com/zengjunhuai/Code/tree/master/MQProject/RabbitMQProject/Demo1 "悬停显示")  | [参考文档](https://www.yuque.com/yuqueyonghu7as8iq/ptfglx/meu9rhvidncelqfc) |

### *面试相关*

```mermaid
flowchart TD;
     A-->B;
     A-->C;
     B-->D;
     C-->D;
```

<table width="">
    <thead style="display:inline-block; width: 100%; height: 20px">
        <tr>
            <th>名称</th>
            <th>值</th>
            <th>备注</th>
        </tr>
    </thead>
    <tbody style="width: 100%">
       <tr>
           <th>名称</th>
           <th>值</th>
           <th>备注</th>
       </tr>
    </tbody>
</table>


<table class=MsoTableGrid border=1 cellspacing=0 cellpadding=0 width=0
 style='width:680.0pt;border-collapse:collapse;border:none;mso-border-alt:solid windowtext .5pt;
 mso-yfti-tbllook:1184;mso-padding-alt:0cm 5.4pt 0cm 5.4pt'>
 <tr style='mso-yfti-irow:0;mso-yfti-firstrow:yes'>
  <td width=93 style='width:70.5pt;border:solid windowtext 1.0pt;mso-border-alt:
  solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'>描述</p>
  </td>
  <td width=127 style='width:99.2pt;border:solid windowtext 1.0pt;border-left:
  none;mso-border-left-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'>优化</p>
  </td>
  <td width=373 style='width:264.35pt;border:solid windowtext 1.0pt;border-left:
  none;mso-border-left-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'>流程图</p>
  </td>
  <td width=112 style='width:86.3pt;border:solid windowtext 1.0pt;border-left:
  none;mso-border-left-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'>代码</p>
  </td>
  <td width=202 style='width:159.65pt;border:solid windowtext 1.0pt;border-left:
  none;mso-border-left-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'>参考文档</p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:1'>
  <td width=93 style='width:70.5pt;border:solid windowtext 1.0pt;border-top:
  none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'>实现一个生产者生产消息到<span
  class=SpellE><span lang=EN-US>rabbitmq</span></span>，一个消费者消费消息</p>
  </td>
  <td width=127 style='width:99.2pt;border-top:none;border-left:none;
  border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>/</span></p>
  </td>
  <td width=373 style='width:264.35pt;border-top:none;border-left:none;
  border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US><!--[if gte vml 1]><v:shapetype
   id="_x0000_t75" coordsize="21600,21600" o:spt="75" o:preferrelative="t"
   path="m@4@5l@4@11@9@11@9@5xe" filled="f" stroked="f">
   <v:stroke joinstyle="miter"/>
   <v:formulas>
    <v:f eqn="if lineDrawn pixelLineWidth 0"/>
    <v:f eqn="sum @0 1 0"/>
    <v:f eqn="sum 0 0 @1"/>
    <v:f eqn="prod @2 1 2"/>
    <v:f eqn="prod @3 21600 pixelWidth"/>
    <v:f eqn="prod @3 21600 pixelHeight"/>
    <v:f eqn="sum @0 0 1"/>
    <v:f eqn="prod @6 1 2"/>
    <v:f eqn="prod @7 21600 pixelWidth"/>
    <v:f eqn="sum @8 21600 0"/>
    <v:f eqn="prod @7 21600 pixelHeight"/>
    <v:f eqn="sum @10 21600 0"/>
   </v:formulas>
   <v:path o:extrusionok="f" gradientshapeok="t" o:connecttype="rect"/>
   <o:lock v:ext="edit" aspectratio="t"/>
  </v:shapetype><v:shape id="_x0000_i1682" type="#_x0000_t75" style='width:261.75pt;
   height:48pt' o:ole="">
   <v:imagedata src="test.files/image001.emz" o:title=""/>
  </v:shape><![endif]--><![if !vml]><img width=349 height=64
  src="test.files/image002.png" v:shapes="_x0000_i1682"><![endif]><!--[if gte mso 9]><xml>
   <o:OLEObject Type="Embed" ProgID="Visio.Drawing.15" ShapeID="_x0000_i1682"
    DrawAspect="Content" ObjectID="_1747225016">
   </o:OLEObject>
  </xml><![endif]--></span></p>
  </td>
  <td width=112 style='width:86.3pt;border-top:none;border-left:none;
  border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>Hello
  World</span></p>
  </td>
  <td width=202 style='width:159.65pt;border-top:none;border-left:none;
  border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'>参考文档</p>
  <p class=MsoNormal align=center style='text-align:center'>知识点：</p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:2'>
  <td width=93 rowspan=2 style='width:70.5pt;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'>一个生产者发送<span
  lang=EN-US>4</span>个消息，两个消费者进行接收（考虑消费者挂掉情况出现问题）</p>
  </td>
  <td width=127 style='width:99.2pt;border-top:none;border-left:none;
  border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'>特点：（自动应答）消费者按序接收实时消息</p>
  <p class=MsoNormal align=center style='text-align:center'>缺点：消费者挂掉，消息丢失</p>
  </td>
  <td width=373 rowspan=2 style='width:264.35pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US><!--[if gte vml 1]><v:shape
   id="_x0000_i1683" type="#_x0000_t75" style='width:259.5pt;height:93pt'
   o:ole="">
   <v:imagedata src="test.files/image003.emz" o:title=""/>
  </v:shape><![endif]--><![if !vml]><img width=346 height=124
  src="test.files/image004.png" v:shapes="_x0000_i1683"><![endif]><!--[if gte mso 9]><xml>
   <o:OLEObject Type="Embed" ProgID="Visio.Drawing.15" ShapeID="_x0000_i1683"
    DrawAspect="Content" ObjectID="_1747225017">
   </o:OLEObject>
  </xml><![endif]--></span></p>
  </td>
  <td width=112 style='width:86.3pt;border-top:none;border-left:none;
  border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>Demo1</span></p>
  </td>
  <td width=202 style='width:159.65pt;border-top:none;border-left:none;
  border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'>参考文档</p>
  <p class=MsoNormal align=center style='text-align:center'>知识点：轮询分发消息</p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:3'>
  <td width=127 style='width:99.2pt;border-top:none;border-left:none;
  border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'>特点：（手动应答）消费者按序接收延时消息，消费者挂掉，消息分配给另一消费者</p>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US><o:p>&nbsp;</o:p></span></p>
  </td>
  <td width=112 style='width:86.3pt;border-top:none;border-left:none;
  border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>Demo2</span></p>
  </td>
  <td width=202 style='width:159.65pt;border-top:none;border-left:none;
  border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US><a
  href="https://www.yuque.com/yuqueyonghu7as8iq/ptfglx/yytzes8tb7487cvz"><span
  lang=EN-US><span lang=EN-US>参考文档</span></span></a><span class=MsoHyperlink><o:p></o:p></span></span></p>
  <p class=MsoNormal align=center style='text-align:center'>知识点：消息应答</p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:4'>
  <td width=93 style='width:70.5pt;border:solid windowtext 1.0pt;border-top:
  none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'>一个生产者与<span
  class=SpellE><span lang=EN-US>RabbitMQ</span></span>之间操作</p>
  </td>
  <td width=127 style='width:99.2pt;border-top:none;border-left:none;
  border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'>单个确认发布<span
  lang=EN-US>/</span>批量确认发布<span lang=EN-US>/</span>异步确认发布</p>
  </td>
  <td width=373 style='width:264.35pt;border-top:none;border-left:none;
  border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US><!--[if gte vml 1]><v:shape
   id="_x0000_i1684" type="#_x0000_t75" style='width:228.75pt;height:34.5pt'
   o:ole="">
   <v:imagedata src="test.files/image005.emz" o:title=""/>
  </v:shape><![endif]--><![if !vml]><img border=0 width=305 height=46
  src="test.files/image006.png" v:shapes="_x0000_i1684"><![endif]><!--[if gte mso 9]><xml>
   <o:OLEObject Type="Embed" ProgID="Visio.Drawing.15" ShapeID="_x0000_i1684"
    DrawAspect="Content" ObjectID="_1747225018">
   </o:OLEObject>
  </xml><![endif]--></span></p>
  </td>
  <td width=112 style='width:86.3pt;border-top:none;border-left:none;
  border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>Demo3</span></p>
  </td>
  <td width=202 style='width:159.65pt;border-top:none;border-left:none;
  border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'>参考文档</p>
  <p class=MsoNormal align=center style='text-align:center'>知识点：单个确认发布<span
  lang=EN-US>/</span>批量确认发布<span lang=EN-US>/</span>异步确认发布</p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:5;mso-yfti-lastrow:yes'>
  <td width=93 style='width:70.5pt;border:solid windowtext 1.0pt;border-top:
  none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US><o:p>&nbsp;</o:p></span></p>
  </td>
  <td width=127 style='width:99.2pt;border-top:none;border-left:none;
  border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US><o:p>&nbsp;</o:p></span></p>
  </td>
  <td width=373 style='width:264.35pt;border-top:none;border-left:none;
  border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US><!--[if gte vml 1]><v:shape
   id="_x0000_i1685" type="#_x0000_t75" style='width:268.5pt;height:63pt'
   o:ole="">
   <v:imagedata src="test.files/image007.emz" o:title=""/>
  </v:shape><![endif]--><![if !vml]><img border=0 width=358 height=84
  src="test.files/image008.png" v:shapes="_x0000_i1685"><![endif]><!--[if gte mso 9]><xml>
   <o:OLEObject Type="Embed" ProgID="Visio.Drawing.15" ShapeID="_x0000_i1685"
    DrawAspect="Content" ObjectID="_1747225019">
   </o:OLEObject>
  </xml><![endif]--></span></p>
  </td>
  <td width=112 style='width:86.3pt;border-top:none;border-left:none;
  border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US><o:p>&nbsp;</o:p></span></p>
  </td>
  <td width=202 style='width:159.65pt;border-top:none;border-left:none;
  border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US><o:p>&nbsp;</o:p></span></p>
  </td>
 </tr>
</table>




