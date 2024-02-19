FROM ubuntu:latest
LABEL authors="fox"

ENTRYPOINT ["top", "-b"]