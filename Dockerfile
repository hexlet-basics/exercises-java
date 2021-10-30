FROM hexletbasics/base-image:latest

ENV DOTNET_CLI_TELEMETRY_OPTOUT 1

RUN wget https://packages.microsoft.com/config/ubuntu/16.04/packages-microsoft-prod.deb -O packages-microsoft-prod.deb && \
    dpkg -i packages-microsoft-prod.deb && \
    rm packages-microsoft-prod.deb
RUN apt-get update && apt-get install -y dotnet-sdk-5.0

WORKDIR /exercises-csharp
ENV PATH=/exercises-csharp/bin:$PATH

RUN dotnet tool install -g dotnet-script
ENV PATH=/root/.dotnet/tools:$PATH
COPY warmup.csx .
RUN dotnet script warmup.csx

COPY . .

