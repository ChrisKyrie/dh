FROM    centos7-dh:1.0.0
MAINTAINER      Chris "chriskyrie@fox.mail.com"

RUN     mkdir -p /home/dh
COPY    lib /home/dh/lib
COPY    bin /home/dh/bin

ENV JAVA_HOME /opt/jdk1.8.0_301
ENV PATH $JAVA_HOME/bin:$PATH
WORKDIR /home/dh/bin
ENTRYPOINT ["./start.sh"]
