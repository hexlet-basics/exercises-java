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
и внести соответствующие изменения в код `hexlet-basics`, которые потом не забыть откатить!!!    
Затем применить патч к базе данных
```
truncate table languages cascade;
truncate table language_lessons cascade;
truncate table language_categories cascade;
insert into languages(id, name, slug, exercise_filename, exercise_test_filename, updated_at, created_at, lessons_count, members_count, "order", learn_as, progress) values (1, 'Java', 'java', 'App.java', 'Test.java', now(), now(), 10, 0, 10, 'second_language', 'completed');
insert into language_categories(id, name_ru, name_en, slug, created_at, updated_at, name, locale, header, description) values (1, ' ', ' ', 'programming-ru', now(), now(), 'Программирование', 'ru', 'Курсы', 'Дают профессию');
insert into language_landing_pages(id, language_id, language_category_id, meta_title, locale, header, slug, "order", main, state, description, meta_description, created_at, updated_at, listed, used_in_header, used_in_description, outcomes_header, outcomes_description, footer, footer_name, name, landing_page_to_redirect_id) values (1, 1, 1, ' ', 'ru', ' ', 'java', null, true, 'published', ' ', ' ', now(), now(), true, ' ', ' ', ' ', ' ', true, ' ', ' ', null);
insert into language_versions(id, exercise_filename, exercise_test_filename, extension, name, language_id, created_at, updated_at, state) values (1, 'App.java', 'Test.java', 'java', 'Java 21', 1, now(), now(), 'created');
update languages set current_version_id = 1;
insert into language_lessons(id, slug, state, "order", language_id, updated_at, created_at) values (1, 'java', ' ', 1, 1, now(), now());
insert into language_modules(id, slug, language_id, updated_at, created_at) values (1, 'java', 1, now(), now());
insert into language_module_versions(id, language_id, language_version_id, module_id, created_at, updated_at, "order") values (1, 1, 1, 1, now(), now(), 10);
insert into language_lesson_versions(id, language_version_id, language_id, lesson_id, module_version_id, created_at, updated_at, "order", natural_order) values (1, 1, 1, 1, 1, now(), now(), 10, 10);
insert into language_lesson_version_infos(id, locale, name, description, theory, tips, definitions, instructions, language_id, language_version_id, version_id, created_at, updated_at, language_lesson_id) values (1, 'ru', 'name in language lesson version infos', 'description', 'theory', null, null, null, 1, 1, 1, now(), now(), 1);
insert into language_module_version_infos(id, name, description, locale, language_id, version_id, language_version_id, updated_at, created_at) values (1, 'name', 'desc', 'ru', 1, 1, 1, now(), now());
insert into language_category_items(id, language_category_id, language_landing_page_id, created_at, updated_at) values (1, 1, 1, now(), now()); 
```
Затем перейти в папку `hexlet-basics ` и загрузить новый код уроков    
```
make make language-load L=java
```
после стартовать приложение
```
make services-app-run
```
Доступ к урокам по адресу
```
http://localhost:3000/ru/languages/java
```


##
[![Hexlet Ltd. logo](https://raw.githubusercontent.com/Hexlet/assets/master/images/hexlet_logo128.png)](https://hexlet.io/?utm_source=github&utm_medium=link&utm_campaign=exercises-java)

This repository is created and maintained by the team and the community of Hexlet, an educational project. [Read more about Hexlet](https://hexlet.io/?utm_source=github&utm_medium=link&utm_campaign=exercises-java).
##

See most active contributors on [hexlet-friends](https://friends.hexlet.io/).


