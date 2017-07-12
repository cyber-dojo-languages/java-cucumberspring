FROM  cyberdojofoundation/java_cucumber_base
LABEL maintainer=jon@jaggersoft.com

COPY /jars/* /cucumber/
ENV CLASSPATH=/cucumber/

COPY red_amber_green.rb /usr/local/bin
