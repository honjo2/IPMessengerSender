IPMessengerSender
---------------

IPMessengerにメッセージを送信するプログラムです。

一度に複数人に送ることができます。

>$ java -jar IPMessengerSender.jar メッセージ host host host ...

例

    git clone https://github.com/honjo2/IPMessengerSender.git
    cd IPMessengerSender/src
    javac honjo2/ipmessenger_sender/Main.java
    java honjo2/ipmessenger_sender/Main hello 192.168.*.*

jarにして使う場合

    git clone https://github.com/honjo2/IPMessengerSender.git
    cd IPMessengerSender/src
    jar cvf IPMessengerSender.jar honjo2/ipmessenger_sender/Main.class
    jar xvf IPMessengerSender.jar
    vi META-INF/MANIFEST.MF
    Main-Class: honjo2.ipmessenger_sender.Main
    jar cvfm IPMessengerSender.jar META-INF/MANIFEST.MF honjo2/ipmessenger_sender/Main.class
    java -jar IPMessengerSender.jar hello 192.168.*.*
