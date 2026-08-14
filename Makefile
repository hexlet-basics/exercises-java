-include /opt/basics/common/common.mk

compose-setup: compose-build

compose:
	docker-compose up

compose-build:
	docker-compose build

compose-down:
	docker-compose down -v --remove-orphans

code-lint:
	mvn -B spotless:check

# Форматтер правит найденное сам, поэтому у проверки есть парная цель.
code-lint-fix:
	mvn -B spotless:apply

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

compose-code-lint-fix:
	docker-compose run --rm exercises make code-lint-fix

compose-description-lint:
	docker-compose run --rm exercises make description-lint

compose-schema-validate:
	docker-compose run --rm exercises make schema-validate

ci-check:
	docker-compose --file docker-compose.yml build
	docker-compose --file docker-compose.yml up --abort-on-container-exit
