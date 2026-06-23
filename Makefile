-include /opt/basics/common/common.mk

compose-setup: compose-build

compose:
	docker-compose up

compose-build:
	docker-compose build

compose-down:
	docker-compose down -v --remove-orphans

code-lint:
	gradle --no-daemon spotlessCheck

format:
	gradle --no-daemon spotlessApply

compose-format:
	docker-compose run --rm -v "$(PWD):/exercises-java" exercises make format

compile:
	@(for i in $$(find . -type f -name Main.java); do javac $$(dirname $$i)/*.java ; done)

clean:
	@$$(find . -type f -name *.class -delete)

compose-bash:
	docker-compose run --rm exercises bash

compose-test:
	docker-compose run --rm exercises make test

compose-code-lint:
	docker-compose run --rm exercises make code-lint

compose-description-lint:
	docker-compose run --rm exercises make description-lint

compose-schema-validate:
	docker-compose run --rm exercises make schema-validate

ci-check:
	docker-compose --file docker-compose.yml build
	docker-compose --file docker-compose.yml up --abort-on-container-exit
