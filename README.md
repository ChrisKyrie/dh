# dh
This is dental hospital website

swagger访问地址：http://localhost:8888/doc.html#/home

docker镜像制作命令
```shell
docker build -t dh:1.0.0 .
```

docker启动容器命令
```shell
docker run -p 8888:8888 --name dh -itd dh:1.0.0 /bin/bash
```

进入容器命令
```shell
docker exec -it dh /bin/bash
```

查看docker容器日志
```shell
docker logs dh
```

docker镜像制作参考
https://blog.csdn.net/weixin_45505313/article/details/125020076

maven编译参考
https://blog.csdn.net/qq_38279833/article/details/105513529
https://blog.csdn.net/V539413949/article/details/124446059
https://blog.csdn.net/zhishidi/article/details/119538973?spm=1001.2101.3001.6650.1&utm_medium=distribute.pc_relevant.none-task-blog-2%7Edefault%7ECTRLIST%7ERate-1-119538973-blog-105513529.235%5Ev27%5Epc_relevant_t0_download&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2%7Edefault%7ECTRLIST%7ERate-1-119538973-blog-105513529.235%5Ev27%5Epc_relevant_t0_download&utm_relevant_index=2