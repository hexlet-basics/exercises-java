compose:
	docker-compose up

gcloud-builds-submit:
	gcloud builds submit --config cloudbuild.yaml .

compose-test:
	docker-compose run exercises make test

compose-install:
	docker-compose run exercises npm install

compose-bash:
	docker-compose run exercises bash

compose-build:
	docker-compose build

build:
	docker-compose build

SUBDIRS := $(wildcard modules/**/*/.)

lint:
	yamllint modules

compile:
	@(for i in $$(find . -type f -name Main.java); do javac $$(dirname $$i)/*.java ; done)

clean:
	@$$(find . -type f -name *.class -delete)

test: $(SUBDIRS)
$(SUBDIRS):
	@echo
	make test -s -C $@
	@echo

.PHONY: all test $(SUBDIRS)
