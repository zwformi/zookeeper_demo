单机环境下伪集群的搭建：
在 一台机器上通过伪集群运行时可以修改 zkServer.cmd 文件在里面加入
set ZOOCFG=..\conf\zoo1.cfg  这行，另存为  zkServer-1.cmd


# The number of milliseconds of each tick  心跳间隔 毫秒每次
tickTime=2000
# The number of ticks that the initial
# synchronization phase can take
initLimit=10
# The number of ticks that can pass between
# sending a request and getting anacknowledgement
syncLimit=5
# the directory where the snapshot isstored.  //镜像数据位置
dataDir=/tmp/zookeeper/1
#日志位置
# dataLogDir=/logs/zookeeper
# the port at which the clients willconnect  客户端连接的端口
clientPort=2181
server.1=192.168.1.100:2887:3887
server.2=192.168.1.100:2888:3888
server.3=192.168.1.100:2889:3889

如果有多个可以以此类推


注意一点：修改你的 zookeeper conf/zoo.cfg 配置：把 127.0.0.1 修改为内网端口
将
#原来的
server.1=127.0.0.1:2555:3555
server.2=127.0.0.1:2666:3666
server.3=127.0.0.1:2777:3777
或者
server.1=localhost:2555:3555
server.2=localhost:2666:3666
server.3=localhost:2777:3777
#修改为
server.1=192.168.100.15:2555:3555
server.2=192.168.100.15:2666:3666
server.3=192.168.100.15:2777:3777
 
 
还需要 在对应的
/tmp/zookeeper/1，
/tmp/zookeeper/2，
/tmp/zookeeper/3
 建立一个文本文件命名为myid，内容就为对应的zoo.cfg里server.后数字1,2,3...

  

