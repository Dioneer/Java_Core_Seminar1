#базовый образ
FROM openjdk:latest
#директория внутри контейнера
WORKDIR /usr/src/app
#копируеm исходный код внутрь контейнера
COPY ./src/main/java .
#compil Java code where is sourece(.) copyto(out) where is enter point(./Pegas/task1/Program.java)
RUN javac -sourcepath . -d out ./Pegas/task1/Program.java
#switch to new workdir - dir with files .class
WORKDIR /usr/src/app/out
#start java app
CMD java -classpath . Pegas.task1.Program
