FROM openjdk:11
RUN apt-get update && apt-get install -y \
    zip \
    unzip \
    curl \
    sudo

RUN curl -s "https://get.sdkman.io" | bash
SHELL ["/bin/bash", "-c"]
RUN source "/root/.sdkman/bin/sdkman-init.sh" \
    yes | /bin/bash -l -c 'sdk install gradle 6.7.1'
 
WORKDIR /usr/local/src/demopro
