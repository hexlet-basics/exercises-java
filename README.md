# exercises-java

Содержит уроки по Java.     
Является плагином к основному модулю `hexlet-basics`, который занимается визуализацией.    
Все содержимое папки должно быть перенесено в docker image, в репозитарий, указанный в `spec.yml`, с которым впоследствии работает `hexlet-basics`    
Названия репозитария здесь и в `hexlet-basics` должны быть согласованы.    
Оба проекта используют репозитарий `ghcr.io/hexlet-basics`   

[![Github Actions Status](../../workflows/Docker/badge.svg)](../../actions)

## How to contribute

* Discuss the project on Telegram: https://t.me/hexletcommunity/12

Проект подразумевает OS типа Linux/MacOS

Перед началом работы на компьютере должны быть установлены
с указанными версиями или выше:

- Java 21
- docker-compose version v2.40.3
- docker version 28.5.2


```
## Develop
make
# run
make compose
# check
make ci-check

# run tests
make compose-test

# run linters and validators
make compose-code-lint
make compose-description-lint
make compose-schema-validate
```
При отладке можно использовать локальный репозитарий, например так

- поднять локальный репозитарий
```
docker run -d -p 5000:5000 --name local-registry registry:2
```
- выполнить команды
```
docker build -t exercises-java:latest .    
docker tag exercises-java:latest localhost:5000/exercises-java:latest    
docker push localhost:5000/exercises-java:latest    
```
и внести соответствующие изменения в `hexlet-basics`, которые потом не забыть откатить!!!    

##
[![Hexlet Ltd. logo](https://raw.githubusercontent.com/Hexlet/assets/master/images/hexlet_logo128.png)](https://hexlet.io/?utm_source=github&utm_medium=link&utm_campaign=exercises-java)

This repository is created and maintained by the team and the community of Hexlet, an educational project. [Read more about Hexlet](https://hexlet.io/?utm_source=github&utm_medium=link&utm_campaign=exercises-java).
##

See most active contributors on [hexlet-friends](https://friends.hexlet.io/).


